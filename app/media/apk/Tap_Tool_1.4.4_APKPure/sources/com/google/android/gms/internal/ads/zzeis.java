package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeis implements zzelc<Bundle> {
    public final String zza;
    public final boolean zzb;

    public zzeis(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.zza);
        if (this.zzb) {
            bundle2.putString("de", "1");
        }
    }
}
