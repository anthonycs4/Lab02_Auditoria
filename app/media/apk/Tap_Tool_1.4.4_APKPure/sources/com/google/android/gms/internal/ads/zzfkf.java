package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfkf<V> extends zzfjs<Object, V> {
    private zzfke<?> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkf(zzfgu<? extends zzfla<?>> zzfguVar, boolean z, Executor executor, Callable<V> callable) {
        super(zzfguVar, z, false);
        this.zza = new zzfkd(this, callable, executor);
        zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfke zzI(zzfkf zzfkfVar, zzfke zzfkeVar) {
        zzfkfVar.zza = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzB(int i) {
        super.zzB(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    protected final void zzf() {
        zzfke<?> zzfkeVar = this.zza;
        if (zzfkeVar != null) {
            zzfkeVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    final void zzw(int i, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    final void zzx() {
        zzfke<?> zzfkeVar = this.zza;
        if (zzfkeVar != null) {
            zzfkeVar.zze();
        }
    }
}
