package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcq extends zzbco {
    private final MuteThisAdListener zza;

    public zzbcq(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zze() {
        this.zza.onAdMuted();
    }
}
