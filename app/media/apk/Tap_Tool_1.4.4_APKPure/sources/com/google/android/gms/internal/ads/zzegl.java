package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegl implements zzeld {
    private final zzfla<String> zza;
    private final Executor zzb;

    public zzegl(zzfla<String> zzflaVar, Executor executor) {
        this.zza = zzflaVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla zza() {
        return zzfks.zzi(this.zza, zzegj.zza, this.zzb);
    }
}
