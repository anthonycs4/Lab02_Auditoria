package com.google.android.gms.ads.mediation;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zza {
    private int zza;

    public final zza zza(int i) {
        this.zza = 1;
        return this;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", this.zza);
        return bundle;
    }
}
