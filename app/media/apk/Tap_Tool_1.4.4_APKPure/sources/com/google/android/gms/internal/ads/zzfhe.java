package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfhe extends zzfja {
    final Iterator<? extends zzfgu> zza;
    Iterator zzb = zzfhl.zza;
    final /* synthetic */ zzfhh zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhe(zzfhh zzfhhVar) {
        this.zzc = zzfhhVar;
        this.zza = ((zzfgz) zzfhhVar.zzb.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = this.zza.next().iterator();
        }
        return this.zzb.next();
    }
}
