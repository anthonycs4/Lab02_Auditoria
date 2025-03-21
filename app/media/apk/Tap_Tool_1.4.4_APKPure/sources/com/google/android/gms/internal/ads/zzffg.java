package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzffg extends zzfhu {
    final /* synthetic */ zzffi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffg(zzffi zzffiVar) {
        this.zza = zzffiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new zzffh(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfhu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            zzffv.zzs(this.zza.zzb, ((Map.Entry) obj).getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfhu
    final Map zza() {
        return this.zza;
    }
}
