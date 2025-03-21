package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfge extends AbstractSet<Map.Entry> {
    final /* synthetic */ zzfgj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfge(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        int zzr;
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzr = this.zza.zzr(entry.getKey());
            if (zzr != -1 && zzfeo.zza(this.zza.zzc[zzr], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        zzfgj zzfgjVar = this.zza;
        Map zzc = zzfgjVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().iterator();
        }
        return new zzfgc(zzfgjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        int zzp;
        Object obj2;
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.zza.zzb()) {
                return false;
            }
            zzp = this.zza.zzp();
            Object key = entry.getKey();
            Object value = entry.getValue();
            obj2 = this.zza.zze;
            zzfgj zzfgjVar = this.zza;
            int zze = zzfgk.zze(key, value, zzp, obj2, zzfgjVar.zza, zzfgjVar.zzb, zzfgjVar.zzc);
            if (zze == -1) {
                return false;
            }
            this.zza.zze(zze, zzp);
            zzfgj.zzn(this.zza);
            this.zza.zzd();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
