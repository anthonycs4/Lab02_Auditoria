package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzffj<T> implements Iterator<T> {
    final Iterator<Map.Entry> zza;
    @NullableDecl
    Object zzb;
    @NullableDecl
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzffv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffj(zzffv zzffvVar) {
        Map map;
        this.zze = zzffvVar;
        map = zzffvVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfhm.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.zzd.hasNext()) {
            Map.Entry next = this.zza.next();
            this.zzb = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return (T) this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzd.remove();
        if (this.zzc.isEmpty()) {
            this.zza.remove();
        }
        zzffv.zzo(this.zze);
    }
}
