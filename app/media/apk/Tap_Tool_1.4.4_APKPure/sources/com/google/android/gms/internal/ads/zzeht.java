package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeht implements zzelc<Bundle> {
    public final double zza;
    public final boolean zzb;

    public zzeht(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzetw.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzetw.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
