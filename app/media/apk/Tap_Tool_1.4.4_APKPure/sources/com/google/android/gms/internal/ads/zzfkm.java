package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfkm<V> extends zzfkn<V> {
    private final zzfla<V> zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfkm(zzfla<V> zzflaVar) {
        Objects.requireNonNull(zzflaVar);
        this.zza = zzflaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkl, com.google.android.gms.internal.ads.zzfgq
    protected final /* bridge */ /* synthetic */ Object zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkn, com.google.android.gms.internal.ads.zzfkl
    public final /* bridge */ /* synthetic */ Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfkn
    protected final zzfla<V> zzc() {
        return this.zza;
    }
}
