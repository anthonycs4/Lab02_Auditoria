package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
class zzffr implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzffs zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffr(zzffs zzffsVar) {
        Iterator it;
        this.zzc = zzffsVar;
        this.zzb = zzffsVar.zzb;
        Collection collection = zzffsVar.zzb;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffr(zzffs zzffsVar, Iterator it) {
        this.zzc = zzffsVar;
        this.zzb = zzffsVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzffv.zzo(this.zzc.zze);
        this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zza();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
