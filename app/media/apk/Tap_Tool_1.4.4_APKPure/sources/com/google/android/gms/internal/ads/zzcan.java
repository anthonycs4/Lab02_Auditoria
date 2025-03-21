package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcan implements zzcau {
    static final zzcau zza = new zzcan();

    private zzcan() {
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final Object zza(zzcjt zzcjtVar) {
        String zzr = zzcjtVar.zzr();
        return (zzr == null && (zzr = zzcjtVar.zzs()) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzr;
    }
}
