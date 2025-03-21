package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzgbc implements Iterator<String> {
    final Iterator<String> zza;
    final /* synthetic */ zzgbd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbc(zzgbd zzgbdVar) {
        zzfze zzfzeVar;
        this.zzb = zzgbdVar;
        zzfzeVar = zzgbdVar.zza;
        this.zza = zzfzeVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
