package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzffx extends AbstractCollection {
    final /* synthetic */ zzffy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffx(zzffy zzffyVar) {
        this.zza = zzffyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zza.zzt(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzk();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzd();
    }
}
