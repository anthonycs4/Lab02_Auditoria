package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztx {
    private final zzty zza = new zzty();
    private final zzahd zzb = new zzahd(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzty zztyVar = this.zza;
            if (i5 >= zztyVar.zzc) {
                break;
            }
            int[] iArr = zztyVar.zzf;
            this.zzd = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzty zzc() {
        return this.zza;
    }

    public final zzahd zzd() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zzb.zzi().length == 65025) {
            return;
        }
        zzahd zzahdVar = this.zzb;
        zzahdVar.zzb(Arrays.copyOf(zzahdVar.zzi(), Math.max(65025, this.zzb.zze())), this.zzb.zze());
    }

    public final boolean zzb(zzps zzpsVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzb(zzpsVar, -1L) || !this.zza.zzc(zzpsVar, true)) {
                    break;
                }
                zzty zztyVar = this.zza;
                int i2 = zztyVar.zzd;
                if ((zztyVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                ((zzpo) zzpsVar).zze(i2, false);
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzahd zzahdVar = this.zzb;
                zzahdVar.zzc(zzahdVar.zze() + zzf);
                ((zzpo) zzpsVar).zzb(this.zzb.zzi(), this.zzb.zze(), zzf, false);
                zzahd zzahdVar2 = this.zzb;
                zzahdVar2.zzf(zzahdVar2.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
        return false;
    }
}
