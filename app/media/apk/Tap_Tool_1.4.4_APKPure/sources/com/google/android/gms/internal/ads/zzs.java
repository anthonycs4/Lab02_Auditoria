package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzs implements Runnable {
    private final zzac zza;
    private final zzai zzb;
    private final Runnable zzc;

    public zzs(zzac zzacVar, zzai zzaiVar, Runnable runnable) {
        this.zza = zzacVar;
        this.zzb = zzaiVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzl();
        if (this.zzb.zzc()) {
            this.zza.zzs(this.zzb.zza);
        } else {
            this.zza.zzt(this.zzb.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzc("intermediate-response");
        } else {
            this.zza.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
