package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbmh extends zzbmj {
    private final OnH5AdsEventListener zza;

    public zzbmh(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
