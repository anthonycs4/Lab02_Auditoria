package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzpl {
    public static void zza(long j, zzahd zzahdVar, zzqq[] zzqqVarArr) {
        int i;
        while (true) {
            if (zzahdVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzahdVar);
            int zzc2 = zzc(zzahdVar);
            int zzg = zzahdVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzahdVar.zzd()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzahdVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzn = zzahdVar.zzn();
                int zzo = zzahdVar.zzo();
                if (zzo == 49) {
                    i = zzahdVar.zzv();
                    zzo = 49;
                } else {
                    i = 0;
                }
                int zzn2 = zzahdVar.zzn();
                if (zzo == 47) {
                    zzahdVar.zzk(1);
                    zzo = 47;
                }
                boolean z = zzn == 181 && (zzo == 49 || zzo == 47) && zzn2 == 3;
                if (zzo == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzahdVar, zzqqVarArr);
                }
            }
            zzahdVar.zzh(zzg);
        }
    }

    public static void zzb(long j, zzahd zzahdVar, zzqq[] zzqqVarArr) {
        int zzn = zzahdVar.zzn();
        if ((zzn & 64) != 0) {
            zzahdVar.zzk(1);
            int i = (zzn & 31) * 3;
            int zzg = zzahdVar.zzg();
            for (zzqq zzqqVar : zzqqVarArr) {
                zzahdVar.zzh(zzg);
                zzqqVar.zzf(zzahdVar, i);
                zzqqVar.zzd(j, 1, i, 0, null);
            }
        }
    }

    private static int zzc(zzahd zzahdVar) {
        int i = 0;
        while (zzahdVar.zzd() != 0) {
            int zzn = zzahdVar.zzn();
            i += zzn;
            if (zzn != 255) {
                return i;
            }
        }
        return -1;
    }
}
