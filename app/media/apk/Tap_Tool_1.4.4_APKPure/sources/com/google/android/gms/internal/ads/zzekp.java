package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekp implements zzelc<Bundle> {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzekp(String str, String str2, String str3, String str4, Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzetw.zze(bundle2, "gmp_app_id", this.zza);
        zzetw.zze(bundle2, "fbs_aiid", this.zzb);
        zzetw.zze(bundle2, "fbs_aeid", this.zzc);
        zzetw.zze(bundle2, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
