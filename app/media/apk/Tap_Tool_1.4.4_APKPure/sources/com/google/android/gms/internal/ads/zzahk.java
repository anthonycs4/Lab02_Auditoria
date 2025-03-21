package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahk implements zzago {
    private final zzaft zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzku zze = zzku.zza;

    public zzahk(zzaft zzaftVar) {
        this.zza = zzaftVar;
    }

    public final void zza() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zzb() {
        if (this.zzb) {
            zzc(zzg());
            this.zzb = false;
        }
    }

    public final void zzc(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final long zzg() {
        long zza;
        long j = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzku zzkuVar = this.zze;
            if (zzkuVar.zzb == 1.0f) {
                zza = zzhx.zzb(elapsedRealtime);
            } else {
                zza = zzkuVar.zza(elapsedRealtime);
            }
            return j + zza;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzh(zzku zzkuVar) {
        if (this.zzb) {
            zzc(zzg());
        }
        this.zze = zzkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final zzku zzi() {
        return this.zze;
    }
}
