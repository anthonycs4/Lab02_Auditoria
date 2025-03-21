package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfjo<I, O> extends zzfjp<I, O, zzfei<? super I, ? extends O>, O> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjo(zzfla<? extends I> zzflaVar, zzfei<? super I, ? extends O> zzfeiVar) {
        super(zzflaVar, zzfeiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    final void zza(@NullableDecl O o) {
        zzh(o);
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    @NullableDecl
    final /* bridge */ /* synthetic */ Object zzb(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzfei) obj).apply(obj2);
    }
}
