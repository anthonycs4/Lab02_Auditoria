package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzazp<AdT> extends zzbbj {
    private final AdLoadCallback<AdT> zza;
    private final AdT zzb;

    public zzazp(AdLoadCallback<AdT> adLoadCallback, AdT adt) {
        this.zza = adLoadCallback;
        this.zzb = adt;
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final void zzb() {
        AdT adt;
        AdLoadCallback<AdT> adLoadCallback = this.zza;
        if (adLoadCallback == null || (adt = this.zzb) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(adt);
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final void zzc(zzazm zzazmVar) {
        AdLoadCallback<AdT> adLoadCallback = this.zza;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzazmVar.zzb());
        }
    }
}
