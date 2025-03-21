package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzgai implements Iterator<zzfxf> {
    private final ArrayDeque<zzgaj> zza;
    private zzfxf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgai(zzfxj zzfxjVar, zzgag zzgagVar) {
        zzfxj zzfxjVar2;
        if (zzfxjVar instanceof zzgaj) {
            zzgaj zzgajVar = (zzgaj) zzfxjVar;
            ArrayDeque<zzgaj> arrayDeque = new ArrayDeque<>(zzgajVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgajVar);
            zzfxjVar2 = zzgajVar.zzd;
            this.zzb = zzb(zzfxjVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzfxf) zzfxjVar;
    }

    private final zzfxf zzb(zzfxj zzfxjVar) {
        while (zzfxjVar instanceof zzgaj) {
            zzgaj zzgajVar = (zzgaj) zzfxjVar;
            this.zza.push(zzgajVar);
            zzfxjVar = zzgajVar.zzd;
        }
        return (zzfxf) zzfxjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzfxf next() {
        zzfxf zzfxfVar;
        zzfxj zzfxjVar;
        zzfxf zzfxfVar2 = this.zzb;
        if (zzfxfVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<zzgaj> arrayDeque = this.zza;
            zzfxfVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzfxjVar = this.zza.pop().zze;
            zzfxfVar = zzb(zzfxjVar);
        } while (zzfxfVar.zzr());
        this.zzb = zzfxfVar;
        return zzfxfVar2;
    }
}
