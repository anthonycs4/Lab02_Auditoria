package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehd implements zzeld<zzehe> {
    private final zzflb zza;
    private final zzetk zzb;
    private final zzcct zzc;
    private final zzccc zzd;

    public zzehd(zzflb zzflbVar, zzetk zzetkVar, zzcct zzcctVar, zzccc zzcccVar) {
        this.zza = zzflbVar;
        this.zzb = zzetkVar;
        this.zzc = zzcctVar;
        this.zzd = zzcccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzehe> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzehc
            private final zzehd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzehe zzb() throws Exception {
        return new zzehe(this.zzb.zzj, this.zzc, this.zzd.zzi());
    }
}
