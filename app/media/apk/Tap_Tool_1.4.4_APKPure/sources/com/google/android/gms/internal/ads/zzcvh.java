package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvh implements zzcwh, zzdcp, zzdap, zzcwv {
    private final zzcwx zza;
    private final zzess zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfli<Boolean> zze = zzfli.zza();
    private ScheduledFuture<?> zzf;

    public zzcvh(zzcwx zzcwxVar, zzess zzessVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzcwxVar;
        this.zzb = zzessVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zza() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzba)).booleanValue()) {
            zzess zzessVar = this.zzb;
            if (zzessVar.zzS == 2) {
                if (zzessVar.zzp == 0) {
                    this.zza.zza();
                    return;
                }
                zzfks.zzp(this.zze, new zzcvg(this), this.zzd);
                this.zzf = this.zzc.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcvf
                    private final zzcvh zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzl();
                    }
                }, this.zzb.zzp, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final synchronized void zzb() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
        int i = this.zzb.zzS;
        if (i == 0 || i == 1) {
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwv
    public final synchronized void zzi(zzazm zzazmVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzi(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzh(true);
        }
    }
}
