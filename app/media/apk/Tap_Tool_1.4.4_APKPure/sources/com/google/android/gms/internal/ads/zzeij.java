package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeij implements zzelc<Bundle> {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeij(String str, String str2, Bundle bundle, zzeii zzeiiVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.zza);
        bundle2.putString("fc_consent", this.zzb);
        bundle2.putBundle("iab_consent_info", this.zzc);
    }
}
