package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfzg extends zzfzi {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfzg() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfzg(zzfzf zzfzfVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zzf(Object obj, long j, int i) {
        zzfzd zzfzdVar;
        List<L> arrayList;
        List<L> list = (List) zzgbi.zzn(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzfze) {
                arrayList = new zzfzd(i);
            } else if (!(list instanceof zzgab) || !(list instanceof zzfyv)) {
                arrayList = new ArrayList<>(i);
            } else {
                arrayList = ((zzfyv) list).zze(i);
            }
            zzgbi.zzo(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzgbi.zzo(obj, j, arrayList2);
            zzfzdVar = arrayList2;
        } else if (list instanceof zzgbd) {
            zzfzd zzfzdVar2 = new zzfzd(list.size() + i);
            zzfzdVar2.addAll(zzfzdVar2.size(), (zzgbd) list);
            zzgbi.zzo(obj, j, zzfzdVar2);
            zzfzdVar = zzfzdVar2;
        } else if ((list instanceof zzgab) && (list instanceof zzfyv)) {
            zzfyv zzfyvVar = (zzfyv) list;
            if (zzfyvVar.zza()) {
                return list;
            }
            zzfyv zze = zzfyvVar.zze(list.size() + i);
            zzgbi.zzo(obj, j, zze);
            return zze;
        } else {
            return list;
        }
        return zzfzdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzi
    public final <L> List<L> zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzi
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgbi.zzn(obj, j);
        if (list instanceof zzfze) {
            unmodifiableList = ((zzfze) list).zzi();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzgab) || !(list instanceof zzfyv)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzfyv zzfyvVar = (zzfyv) list;
                if (zzfyvVar.zza()) {
                    zzfyvVar.zzb();
                    return;
                }
                return;
            }
        }
        zzgbi.zzo(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzi
    public final <E> void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgbi.zzn(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgbi.zzo(obj, j, list);
    }
}
