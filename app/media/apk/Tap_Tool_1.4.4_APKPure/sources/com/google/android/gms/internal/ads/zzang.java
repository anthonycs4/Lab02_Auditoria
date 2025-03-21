package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzang {
    private static final int[] zza = {zzarj.zzl("isom"), zzarj.zzl("iso2"), zzarj.zzl("iso3"), zzarj.zzl("iso4"), zzarj.zzl("iso5"), zzarj.zzl("iso6"), zzarj.zzl("avc1"), zzarj.zzl("hvc1"), zzarj.zzl("hev1"), zzarj.zzl("mp41"), zzarj.zzl("mp42"), zzarj.zzl("3g2a"), zzarj.zzl("3g2b"), zzarj.zzl("3gr6"), zzarj.zzl("3gs6"), zzarj.zzl("3ge6"), zzarj.zzl("3gg6"), zzarj.zzl("M4V "), zzarj.zzl("M4A "), zzarj.zzl("f4v "), zzarj.zzl("kddi"), zzarj.zzl("M4VP"), zzarj.zzl("qt  "), zzarj.zzl("MSNV")};

    public static boolean zza(zzalt zzaltVar) throws IOException, InterruptedException {
        return zzc(zzaltVar, true);
    }

    public static boolean zzb(zzalt zzaltVar) throws IOException, InterruptedException {
        return zzc(zzaltVar, false);
    }

    private static boolean zzc(zzalt zzaltVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        long zzi = zzaltVar.zzi();
        int i = (int) ((zzi == -1 || zzi > 4096) ? 4096L : 4096L);
        zzarc zzarcVar = new zzarc(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            zzarcVar.zza(8);
            zzaltVar.zze(zzarcVar.zza, 0, 8, false);
            long zzp = zzarcVar.zzp();
            int zzr = zzarcVar.zzr();
            int i3 = 16;
            if (zzp == 1) {
                zzaltVar.zze(zzarcVar.zza, 8, 8, false);
                zzarcVar.zzf(16);
                zzp = zzarcVar.zzv();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (zzp < j) {
                return false;
            }
            i2 += i3;
            if (zzr != zzamp.zzE) {
                if (zzr == zzamp.zzN || zzr == zzamp.zzP) {
                    z2 = true;
                    break;
                } else if ((i2 + zzp) - j >= i) {
                    break;
                } else {
                    int i4 = (int) (zzp - j);
                    i2 += i4;
                    if (zzr == zzamp.zzd) {
                        if (i4 < 8) {
                            return false;
                        }
                        zzarcVar.zza(i4);
                        zzaltVar.zze(zzarcVar.zza, 0, i4, false);
                        int i5 = i4 >> 2;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 == 1) {
                                zzarcVar.zzj(4);
                            } else {
                                int zzr2 = zzarcVar.zzr();
                                if ((zzr2 >>> 8) != zzarj.zzl("3gp")) {
                                    int[] iArr = zza;
                                    int length = iArr.length;
                                    for (int i7 = 0; i7 < 24; i7++) {
                                        if (iArr[i7] != zzr2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        zzaltVar.zzf(i4, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
