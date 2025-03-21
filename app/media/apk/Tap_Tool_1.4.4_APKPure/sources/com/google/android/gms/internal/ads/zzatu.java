package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatu {
    private final zzatj zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzatu(int i, int i2, int i3) {
        this.zzb = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : 64;
        if (i3 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i3;
        }
        this.zza = new zzats(i2);
    }

    public final String zza(ArrayList<String> arrayList, ArrayList<zzati> arrayList2) {
        Collections.sort(arrayList2, new zzatt(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList2.get(i).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.indexOf("'") != -1) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z = true;
                            }
                            i2++;
                        }
                        String sb2 = z ? sb.toString() : null;
                        if (sb2 != null) {
                            this.zzc = sb2;
                            str = sb2;
                        }
                    }
                    String[] zzb = zzatn.zzb(str, true);
                    if (zzb.length >= this.zzd) {
                        for (int i5 = 0; i5 < zzb.length; i5++) {
                            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            for (int i6 = 0; i6 < this.zzd; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= zzb.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    str2 = String.valueOf(str2).concat(" ");
                                }
                                String valueOf = String.valueOf(str2);
                                String valueOf2 = String.valueOf(zzb[i7]);
                                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzatl zzatlVar = new zzatl();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzatlVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzatlVar.toString();
    }
}
