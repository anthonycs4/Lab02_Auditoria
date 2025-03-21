package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzxn {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zzxh, List<zzwx>> zzc = new HashMap<>();
    private static int zzd = -1;

    public static zzwx zza() throws zzxi {
        return zzb("audio/raw", false, false);
    }

    public static zzwx zzb(String str, boolean z, boolean z2) throws zzxi {
        List<zzwx> zzc2 = zzc(str, false, false);
        if (zzc2.isEmpty()) {
            return null;
        }
        return zzc2.get(0);
    }

    public static synchronized List<zzwx> zzc(String str, boolean z, boolean z2) throws zzxi {
        zzxj zzxkVar;
        synchronized (zzxn.class) {
            zzxh zzxhVar = new zzxh(str, z, z2);
            HashMap<zzxh, List<zzwx>> hashMap = zzc;
            List<zzwx> list = hashMap.get(zzxhVar);
            if (list != null) {
                return list;
            }
            if (zzaht.zza >= 21) {
                zzxkVar = new zzxl(z, z2);
            } else {
                zzxkVar = new zzxk(null);
            }
            ArrayList<zzwx> zzg = zzg(zzxhVar, zzxkVar);
            if (z && zzg.isEmpty() && zzaht.zza >= 21 && zzaht.zza <= 23) {
                zzg = zzg(zzxhVar, new zzxk(null));
                if (!zzg.isEmpty()) {
                    String str2 = zzg.get(0).zza;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzaht.zza < 26 && zzaht.zzb.equals("R9") && zzg.size() == 1 && zzg.get(0).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzwx.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzg, zzxd.zza);
            }
            if (zzaht.zza < 21 && zzg.size() > 1) {
                String str3 = zzg.get(0).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzg, zzxe.zza);
                }
            }
            if (zzaht.zza < 30 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(zzg.get(0).zza)) {
                zzg.add(zzg.remove(0));
            }
            List<zzwx> unmodifiableList = Collections.unmodifiableList(zzg);
            hashMap.put(zzxhVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List<zzwx> zzd(List<zzwx> list, final zzjq zzjqVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzxm(zzjqVar) { // from class: com.google.android.gms.internal.ads.zzxc
            private final zzjq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzjqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzxm
            public final int zza(Object obj) {
                zzjq zzjqVar2 = this.zza;
                zzwx zzwxVar = (zzwx) obj;
                int i = zzxn.zza;
                try {
                    return !zzwxVar.zzc(zzjqVar2) ? 0 : 1;
                } catch (zzxi unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static int zze() throws zzxi {
        int i;
        if (zzd == -1) {
            int i2 = 0;
            zzwx zzb2 = zzb("video/avc", false, false);
            if (zzb2 != null) {
                MediaCodecInfo.CodecProfileLevel[] zzb3 = zzb2.zzb();
                int length = zzb3.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = zzb3[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, zzaht.zza >= 21 ? 345600 : 172800);
            }
            zzd = i2;
        }
        return zzd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0301 A[Catch: NumberFormatException -> 0x0311, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0311, blocks: (B:168:0x02a6, B:170:0x02b8, B:181:0x02d4, B:197:0x0301), top: B:554:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> zzf(com.google.android.gms.internal.ads.zzjq r17) {
        /*
            Method dump skipped, instructions count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxn.zzf(com.google.android.gms.internal.ads.zzjq):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d4 A[Catch: Exception -> 0x0361, TryCatch #2 {Exception -> 0x0361, blocks: (B:161:0x02a3, B:167:0x02ba, B:173:0x02ce, B:175:0x02d4, B:180:0x02e3, B:182:0x02ed, B:192:0x0317, B:195:0x031d, B:183:0x02f2, B:185:0x0302, B:187:0x030a, B:176:0x02da), top: B:225:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02da A[Catch: Exception -> 0x0361, TryCatch #2 {Exception -> 0x0361, blocks: (B:161:0x02a3, B:167:0x02ba, B:173:0x02ce, B:175:0x02d4, B:180:0x02e3, B:182:0x02ed, B:192:0x0317, B:195:0x031d, B:183:0x02f2, B:185:0x0302, B:187:0x030a, B:176:0x02da), top: B:225:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ed A[Catch: Exception -> 0x0361, TryCatch #2 {Exception -> 0x0361, blocks: (B:161:0x02a3, B:167:0x02ba, B:173:0x02ce, B:175:0x02d4, B:180:0x02e3, B:182:0x02ed, B:192:0x0317, B:195:0x031d, B:183:0x02f2, B:185:0x0302, B:187:0x030a, B:176:0x02da), top: B:225:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f2 A[Catch: Exception -> 0x0361, TryCatch #2 {Exception -> 0x0361, blocks: (B:161:0x02a3, B:167:0x02ba, B:173:0x02ce, B:175:0x02d4, B:180:0x02e3, B:182:0x02ed, B:192:0x0317, B:195:0x031d, B:183:0x02f2, B:185:0x0302, B:187:0x030a, B:176:0x02da), top: B:225:0x02a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.google.android.gms.internal.ads.zzwx> zzg(com.google.android.gms.internal.ads.zzxh r23, com.google.android.gms.internal.ads.zzxj r24) throws com.google.android.gms.internal.ads.zzxi {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxn.zzg(com.google.android.gms.internal.ads.zzxh, com.google.android.gms.internal.ads.zzxj):java.util.ArrayList");
    }

    private static boolean zzh(MediaCodecInfo mediaCodecInfo) {
        if (zzaht.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String zzu = zzaht.zzu(mediaCodecInfo.getName());
        if (zzu.startsWith("arc.")) {
            return false;
        }
        return zzu.startsWith("omx.google.") || zzu.startsWith("omx.ffmpeg.") || (zzu.startsWith("omx.sec.") && zzu.contains(".sw.")) || zzu.equals("omx.qcom.video.decoder.hevcswvdec") || zzu.startsWith("c2.android.") || zzu.startsWith("c2.google.") || !(zzu.startsWith("omx.") || zzu.startsWith("c2."));
    }

    private static <T> void zzi(List<T> list, final zzxm<T> zzxmVar) {
        Collections.sort(list, new Comparator(zzxmVar) { // from class: com.google.android.gms.internal.ads.zzxf
            private final zzxm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzxmVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzxm zzxmVar2 = this.zza;
                int i = zzxn.zza;
                return zzxmVar2.zza(obj2) - zzxmVar2.zza(obj);
            }
        });
    }
}
