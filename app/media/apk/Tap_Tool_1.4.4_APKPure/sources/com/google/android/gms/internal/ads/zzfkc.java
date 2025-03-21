package com.google.android.gms.internal.ads;

import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfkc<V, C> extends zzfjs<V, C> {
    private List<zzfkb<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkc(zzfgu<? extends zzfla<? extends V>> zzfguVar, boolean z) {
        super(zzfguVar, true, true);
        List<zzfkb<V>> zza;
        if (zzfguVar.isEmpty()) {
            zza = zzfgz.zzi();
        } else {
            zza = zzfhr.zza(zzfguVar.size());
        }
        for (int i = 0; i < zzfguVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzB(int i) {
        super.zzB(i);
        this.zza = null;
    }

    abstract C zzI(List<zzfkb<V>> list);

    @Override // com.google.android.gms.internal.ads.zzfjs
    final void zzw(int i, @NullableDecl V v) {
        List<zzfkb<V>> list = this.zza;
        if (list != null) {
            list.set(i, new zzfkb<>(v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfjs
    final void zzx() {
        List<zzfkb<V>> list = this.zza;
        if (list != null) {
            zzh(zzI(list));
        }
    }
}
