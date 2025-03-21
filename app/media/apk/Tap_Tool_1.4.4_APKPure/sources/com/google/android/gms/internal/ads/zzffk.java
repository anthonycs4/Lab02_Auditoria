package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzffk implements Iterator {
    @NullableDecl
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzffl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffk(zzffl zzfflVar, Iterator it) {
        this.zzc = zzfflVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfes.zzb(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzffv.zzr(this.zzc.zza, collection.size());
        collection.clear();
        this.zza = null;
    }
}
