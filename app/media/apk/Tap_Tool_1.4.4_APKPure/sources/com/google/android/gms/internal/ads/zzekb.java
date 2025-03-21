package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekb implements zzelc<Bundle> {
    private final Bundle zza;

    public zzekb(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.zza;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
