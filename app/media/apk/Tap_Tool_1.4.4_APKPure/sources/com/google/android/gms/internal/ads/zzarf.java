package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzarf implements zzaqy {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzajx zzd = zzajx.zza;

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final long zzN() {
        long zza;
        long j = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzajx zzajxVar = this.zzd;
            if (zzajxVar.zzb == 1.0f) {
                zza = zzaje.zzb(elapsedRealtime);
            } else {
                zza = zzajxVar.zza(elapsedRealtime);
            }
            return j + zza;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final zzajx zzO(zzajx zzajxVar) {
        if (this.zza) {
            zzc(zzN());
        }
        this.zzd = zzajxVar;
        return zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final zzajx zzP() {
        throw null;
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzN());
            this.zza = false;
        }
    }

    public final void zzc(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzd(zzaqy zzaqyVar) {
        zzc(zzaqyVar.zzN());
        this.zzd = zzaqyVar.zzP();
    }
}
