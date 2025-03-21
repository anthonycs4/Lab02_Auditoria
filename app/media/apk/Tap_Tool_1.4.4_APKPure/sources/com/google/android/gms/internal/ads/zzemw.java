package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemw implements zzeld<zzemx> {
    final zzflb zza;
    final List<String> zzb;
    final zzbfc zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzemw(zzbfc zzbfcVar, zzbfc zzbfcVar2, zzflb zzflbVar, List<String> list) {
        this.zzc = zzbfcVar;
        this.zza = zzbfcVar2;
        this.zzb = zzflbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzemx> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzemv
            private final zzemw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemx(this.zza.zzb);
            }
        });
    }
}
