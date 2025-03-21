package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfgi extends AbstractCollection {
    final /* synthetic */ zzfgj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgi(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfgj zzfgjVar = this.zza;
        Map zzc = zzfgjVar.zzc();
        if (zzc != null) {
            return zzc.values().iterator();
        }
        return new zzfgd(zzfgjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
