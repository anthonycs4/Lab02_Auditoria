package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzgdg implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgdh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdg(zzgdh zzgdhVar) {
        this.zzb = zzgdhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List<E> list = this.zzb.zza;
            int i = this.zza;
            this.zza = i + 1;
            return list.get(i);
        }
        zzgdh zzgdhVar = this.zzb;
        zzgdhVar.zza.add(zzgdhVar.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
