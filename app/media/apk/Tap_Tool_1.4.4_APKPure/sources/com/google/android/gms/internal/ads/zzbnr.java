package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbnr implements AdapterStatus {
    private final AdapterStatus.State zza;
    private final String zzb;
    private final int zzc;

    public zzbnr(AdapterStatus.State state, String str, int i) {
        this.zza = state;
        this.zzb = str;
        this.zzc = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzc;
    }
}
