package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsa {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzps zzpsVar) throws IOException {
        if (this.zzb) {
            return;
        }
        ((zzpo) zzpsVar).zzh(this.zza, 0, 10, false);
        zzpsVar.zzl();
        byte[] bArr = this.zza;
        int i = zzlx.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    @RequiresNonNull({"#1.output"})
    public final void zzc(zzrz zzrzVar, long j, int i, int i2, int i3) {
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zzd(zzrzVar);
            }
        }
    }

    @RequiresNonNull({"#1.output"})
    public final void zzd(zzrz zzrzVar) {
        if (this.zzc > 0) {
            zzrzVar.zzV.zzd(this.zzd, this.zze, this.zzf, this.zzg, zzrzVar.zzi);
            this.zzc = 0;
        }
    }
}
