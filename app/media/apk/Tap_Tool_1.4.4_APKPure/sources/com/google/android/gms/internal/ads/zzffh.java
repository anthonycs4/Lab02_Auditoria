package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzffh implements Iterator<Map.Entry> {
    final Iterator<Map.Entry> zza;
    @NullableDecl
    Collection zzb;
    final /* synthetic */ zzffi zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffh(zzffi zzffiVar) {
        this.zzc = zzffiVar;
        this.zza = zzffiVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.zza.next();
        this.zzb = (Collection) next.getValue();
        return this.zzc.zzb(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfes.zzb(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzffv.zzr(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
