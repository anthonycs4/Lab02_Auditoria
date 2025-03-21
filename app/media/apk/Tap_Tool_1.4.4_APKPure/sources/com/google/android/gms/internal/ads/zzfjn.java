package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfjn<I, O> extends zzfjp<I, O, zzfjz<? super I, ? extends O>, zzfla<? extends O>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjn(zzfla<? extends I> zzflaVar, zzfjz<? super I, ? extends O> zzfjzVar) {
        super(zzflaVar, zzfjzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzj((zzfla) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    final /* bridge */ /* synthetic */ Object zzb(Object obj, @NullableDecl Object obj2) throws Exception {
        zzfjz zzfjzVar = (zzfjz) obj;
        zzfla<O> zza = zzfjzVar.zza(obj2);
        zzfes.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfjzVar);
        return zza;
    }
}
