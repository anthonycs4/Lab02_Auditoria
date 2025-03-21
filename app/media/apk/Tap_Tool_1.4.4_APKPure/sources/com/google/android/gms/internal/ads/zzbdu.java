package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbdu implements InitializationStatus {
    private final zzbdy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdu(zzbdy zzbdyVar) {
        this.zza = zzbdyVar;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        zzbdy zzbdyVar = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzbdv(zzbdyVar));
        return hashMap;
    }
}
