package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekl implements zzelc<Bundle> {
    private final String zza;

    public zzekl(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        bundle.putString("rtb", this.zza);
    }
}
