package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdka implements zzfei {
    static final zzfei zza = new zzdka();

    private zzdka() {
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdkc zzdkcVar : (List) obj) {
            if (zzdkcVar != null) {
                arrayList.add(zzdkcVar);
            }
        }
        return arrayList;
    }
}
