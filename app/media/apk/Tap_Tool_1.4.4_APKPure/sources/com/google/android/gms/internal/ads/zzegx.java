package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegx implements zzelc<Bundle> {
    private final Bundle zza;

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zza.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.zza);
    }
}
