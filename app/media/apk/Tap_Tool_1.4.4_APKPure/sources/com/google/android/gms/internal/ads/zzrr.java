package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzrr {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzrn zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzahu.zzb(newPullParser, "x:xmpmeta")) {
                zzfgz<zzrm> zzi = zzfgz.zzi();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzahu.zzb(newPullParser, "rdf:Description")) {
                        String[] strArr = zza;
                        int i = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String zzc2 = zzahu.zzc(newPullParser, strArr[i2]);
                            if (zzc2 != null) {
                                if (Integer.parseInt(zzc2) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = zzb;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        String zzc3 = zzahu.zzc(newPullParser, strArr2[i3]);
                                        if (zzc3 != null) {
                                            j = Long.parseLong(zzc3);
                                            if (j == -1) {
                                            }
                                        } else {
                                            i3++;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                    String[] strArr3 = zzc;
                                    while (true) {
                                        if (i < 2) {
                                            String zzc4 = zzahu.zzc(newPullParser, strArr3[i]);
                                            if (zzc4 != null) {
                                                zzi = zzfgz.zzk(new zzrm("image/jpeg", "Primary", 0L, 0L), new zzrm("video/mp4", "MotionPhoto", Long.parseLong(zzc4), 0L));
                                                break;
                                            }
                                            i++;
                                        } else {
                                            zzi = zzfgz.zzi();
                                            break;
                                        }
                                    }
                                    j2 = j;
                                }
                            }
                        }
                        return null;
                    } else if (zzahu.zzb(newPullParser, "Container:Directory")) {
                        zzi = zzb(newPullParser, "Container", "Item");
                    } else if (zzahu.zzb(newPullParser, "GContainer:Directory")) {
                        zzi = zzb(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!zzahu.zza(newPullParser, "x:xmpmeta"));
                if (zzi.isEmpty()) {
                    return null;
                }
                return new zzrn(j2, zzi);
            }
            throw new zzkr("Couldn't find xmp metadata");
        } catch (zzkr | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfgz<zzrm> zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfgw zzu = zzfgz.zzu();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (zzahu.zzb(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String zzc2 = zzahu.zzc(xmlPullParser, concat3);
                String zzc3 = zzahu.zzc(xmlPullParser, concat4);
                String zzc4 = zzahu.zzc(xmlPullParser, concat5);
                String zzc5 = zzahu.zzc(xmlPullParser, concat6);
                if (zzc2 != null && zzc3 != null) {
                    zzu.zze((zzfgw) new zzrm(zzc2, zzc3, zzc4 != null ? Long.parseLong(zzc4) : 0L, zzc5 != null ? Long.parseLong(zzc5) : 0L));
                } else {
                    return zzfgz.zzi();
                }
            }
        } while (!zzahu.zza(xmlPullParser, concat2));
        return zzu.zzf();
    }
}
