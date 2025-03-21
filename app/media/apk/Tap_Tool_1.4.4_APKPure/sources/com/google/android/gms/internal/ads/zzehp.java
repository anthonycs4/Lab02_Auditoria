package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehp implements zzelc<Bundle> {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final float zzg;
    public final boolean zzh;

    public zzehp(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = f;
        this.zzh = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.zza);
        bundle2.putBoolean("ma", this.zzb);
        bundle2.putBoolean("sp", this.zzc);
        bundle2.putInt("muv", this.zzd);
        bundle2.putInt("rm", this.zze);
        bundle2.putInt("riv", this.zzf);
        bundle2.putFloat("android_app_volume", this.zzg);
        bundle2.putBoolean("android_app_muted", this.zzh);
    }
}
