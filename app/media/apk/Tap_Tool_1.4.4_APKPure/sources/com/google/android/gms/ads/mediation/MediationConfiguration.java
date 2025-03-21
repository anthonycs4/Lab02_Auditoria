package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public class MediationConfiguration {
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    public AdFormat getFormat() {
        return this.zza;
    }

    public Bundle getServerParameters() {
        return this.zzb;
    }
}
