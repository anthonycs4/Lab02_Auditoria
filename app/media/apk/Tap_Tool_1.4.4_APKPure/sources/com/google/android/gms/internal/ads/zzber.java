package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzber extends zzbdc {
    private final OnPaidEventListener zza;

    public zzber(OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbdd
    public final void zze(zzazz zzazzVar) {
        if (this.zza != null) {
            this.zza.onPaidEvent(AdValue.zza(zzazzVar.zzb, zzazzVar.zzc, zzazzVar.zzd));
        }
    }
}
