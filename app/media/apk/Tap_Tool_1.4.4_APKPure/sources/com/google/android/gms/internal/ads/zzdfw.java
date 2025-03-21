package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdfw implements zzblp<Object> {
    private final WeakReference<zzdfz> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdfw(zzdfz zzdfzVar, zzdfv zzdfvVar) {
        this.zza = new WeakReference<>(zzdfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        zzcwf zzcwfVar;
        zzdfz zzdfzVar = this.zza.get();
        if (zzdfzVar != null && "_ac".equals(map.get("eventName"))) {
            zzcwfVar = zzdfzVar.zzh;
            zzcwfVar.onAdClicked();
        }
    }
}
