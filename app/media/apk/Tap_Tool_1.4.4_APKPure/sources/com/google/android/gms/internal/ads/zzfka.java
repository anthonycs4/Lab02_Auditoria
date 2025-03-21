package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfka<V> extends zzfkc<V, List<V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfka(zzfgu<? extends zzfla<? extends V>> zzfguVar, boolean z) {
        super(zzfguVar, true);
        zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final /* bridge */ /* synthetic */ Object zzI(List list) {
        ArrayList zza = zzfhr.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfkb zzfkbVar = (zzfkb) it.next();
            zza.add(zzfkbVar != null ? zzfkbVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
