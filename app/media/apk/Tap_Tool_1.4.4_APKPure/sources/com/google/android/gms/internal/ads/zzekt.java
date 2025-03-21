package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekt implements zzelc<Bundle> {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    public zzekt(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.zzc);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) zzbba.zzc().zzb(zzbfq.zzbX));
        bundle2.putInt("target_api", this.zze);
        bundle2.putInt("dv", this.zzf);
        bundle2.putInt("lv", this.zzg);
        Bundle zza = zzetw.zza(bundle2, "sdk_env");
        zza.putBoolean("mf", zzbhd.zza.zze().booleanValue());
        zza.putBoolean("instant_app", this.zza);
        zza.putBoolean("lite", this.zzb);
        zza.putBoolean("is_privileged_process", this.zzd);
        bundle2.putBundle("sdk_env", zza);
        Bundle zza2 = zzetw.zza(zza, "build_meta");
        zza2.putString("cl", "374971692");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
