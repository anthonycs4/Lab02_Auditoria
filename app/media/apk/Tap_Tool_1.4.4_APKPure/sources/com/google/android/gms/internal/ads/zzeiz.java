package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeiz implements zzeld<zzeja> {
    private final zzflb zza;
    private final zzdsf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeiz(zzflb zzflbVar, zzdsf zzdsfVar) {
        this.zza = zzflbVar;
        this.zzb = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzeja> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeiy
            private final zzeiz zza;

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
    public final /* synthetic */ zzeja zzb() throws Exception {
        return new zzeja(this.zzb.zzg(), this.zzb.zzd(), com.google.android.gms.ads.internal.zzs.zzm().zzk());
    }
}
