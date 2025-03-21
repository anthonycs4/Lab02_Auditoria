package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfjj<V, X extends Throwable> extends zzfjk<V, X, zzfei<? super X, ? extends V>, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjj(zzfla<? extends V> zzflaVar, Class<X> cls, zzfei<? super X, ? extends V> zzfeiVar) {
        super(zzflaVar, cls, zzfeiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    final void zza(@NullableDecl V v) {
        zzh(v);
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    @NullableDecl
    final /* bridge */ /* synthetic */ Object zzb(Object obj, Throwable th) throws Exception {
        return ((zzfei) obj).apply(th);
    }
}
