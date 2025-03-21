package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejh implements zzeld<zzeji> {
    private final zzflb zza;
    private final zzesr zzb;

    public zzejh(zzflb zzflbVar, zzesr zzesrVar) {
        this.zza = zzflbVar;
        this.zzb = zzesrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzeji> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzejg
            private final zzejh zza;

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
    public final /* synthetic */ zzeji zzb() throws Exception {
        return new zzeji(this.zzb);
    }
}
