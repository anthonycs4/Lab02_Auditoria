package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfgg extends AbstractSet {
    final /* synthetic */ zzfgj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgg(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfgj zzfgjVar = this.zza;
        Map zzc = zzfgjVar.zzc();
        if (zzc != null) {
            return zzc.keySet().iterator();
        }
        return new zzfgb(zzfgjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        Object zzs;
        Object obj2;
        Map zzc = this.zza.zzc();
        if (zzc == null) {
            zzs = this.zza.zzs(obj);
            obj2 = zzfgj.zzd;
            return zzs != obj2;
        }
        return zzc.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
