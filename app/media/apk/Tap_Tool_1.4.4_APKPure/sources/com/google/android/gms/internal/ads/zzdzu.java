package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzu implements zzdya<zzcqo> {
    private final zzcrl zza;
    private final zzdzb zzb;
    private final zzflb zzc;
    private final zzcwj zzd;
    private final ScheduledExecutorService zze;

    public zzdzu(zzcrl zzcrlVar, zzdzb zzdzbVar, zzcwj zzcwjVar, ScheduledExecutorService scheduledExecutorService, zzflb zzflbVar) {
        this.zza = zzcrlVar;
        this.zzb = zzdzbVar;
        this.zzd = zzcwjVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzflbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        return zzeteVar.zza.zza.zza() != null && this.zzb.zza(zzeteVar, zzessVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzcqo> zzb(final zzete zzeteVar, final zzess zzessVar) {
        return this.zzc.zzb(new Callable(this, zzeteVar, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdzr
            private final zzdzu zza;
            private final zzete zzb;
            private final zzess zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(this.zzb, this.zzc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcqo zzc(final zzete zzeteVar, final zzess zzessVar) throws Exception {
        return this.zza.zze(new zzctc(zzeteVar, zzessVar, null), new zzcry(zzeteVar.zza.zza.zza(), new Runnable(this, zzeteVar, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdzs
            private final zzdzu zza;
            private final zzete zzb;
            private final zzess zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(this.zzb, this.zzc);
            }
        })).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzete zzeteVar, zzess zzessVar) {
        zzfks.zzp(zzfks.zzh(this.zzb.zzb(zzeteVar, zzessVar), zzessVar.zzM, TimeUnit.SECONDS, this.zze), new zzdzt(this), this.zzc);
    }
}
