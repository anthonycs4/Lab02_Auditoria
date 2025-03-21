package com.google.android.gms.internal.ads;

import java.lang.Throwable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfji<V, X extends Throwable> extends zzfjk<V, X, zzfjz<? super X, ? extends V>, zzfla<? extends V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfji(zzfla<? extends V> zzflaVar, Class<X> cls, zzfjz<? super X, ? extends V> zzfjzVar) {
        super(zzflaVar, cls, zzfjzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzj((zzfla) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    final /* bridge */ /* synthetic */ Object zzb(Object obj, Throwable th) throws Exception {
        zzfjz zzfjzVar = (zzfjz) obj;
        zzfla zza = zzfjzVar.zza(th);
        zzfes.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfjzVar);
        return zza;
    }
}
