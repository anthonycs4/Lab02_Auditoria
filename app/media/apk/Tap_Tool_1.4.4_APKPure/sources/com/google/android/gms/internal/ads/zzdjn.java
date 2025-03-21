package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdjn implements zzfei {
    static final zzfei zza = new zzdjn();

    private zzdjn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbhu zzbhuVar : (List) obj) {
            if (zzbhuVar != null) {
                arrayList.add(zzbhuVar);
            }
        }
        return arrayList;
    }
}
