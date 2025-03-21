package com.google.android.gms.internal.ads;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfgv<K, V> extends zzffw<K, V> implements Serializable {
    @NullableDecl
    final K zza;
    @NullableDecl
    final V zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgv(@NullableDecl K k, @NullableDecl V v) {
        this.zza = k;
        this.zzb = v;
    }

    @Override // com.google.android.gms.internal.ads.zzffw, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzffw, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzffw, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
