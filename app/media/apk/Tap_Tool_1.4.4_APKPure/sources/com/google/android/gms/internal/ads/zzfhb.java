package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfhb<K, V> extends zzfhh<K, V> implements zzfho<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhb(zzfhd<K, zzfgz<V>> zzfhdVar, int i) {
        super(zzfhdVar, i);
    }

    public final zzfgz<V> zza(@NullableDecl K k) {
        zzfgz<V> zzfgzVar = (zzfgz) this.zzb.get(k);
        return zzfgzVar == null ? zzfgz.zzi() : zzfgzVar;
    }
}
