package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfhh<K, V> extends zzffz<K, V> implements Serializable {
    final transient zzfhd<K, ? extends zzfgu<V>> zzb;
    final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhh(zzfhd<K, ? extends zzfgu<V>> zzfhdVar, int i) {
        this.zzb = zzfhdVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzffy, com.google.android.gms.internal.ads.zzfhz
    @Deprecated
    public final boolean zze(K k, V v) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    final Set<K> zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    final /* bridge */ /* synthetic */ Collection zzj() {
        return new zzfhg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    final Map<K, Collection<V>> zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final boolean zzt(@NullableDecl Object obj) {
        return obj != null && super.zzt(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzffy, com.google.android.gms.internal.ads.zzfhz
    public final /* bridge */ /* synthetic */ Collection zzv() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzffy, com.google.android.gms.internal.ads.zzfhz
    public final /* bridge */ /* synthetic */ Map zzw() {
        return this.zzb;
    }
}
