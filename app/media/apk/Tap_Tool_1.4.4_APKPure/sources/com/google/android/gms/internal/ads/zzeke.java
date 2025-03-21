package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeke implements zzelc<Bundle> {
    private final String zza;
    private final String zzb;

    public zzeke(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeY)).booleanValue()) {
            bundle2.putString("request_id", this.zzb);
        } else {
            bundle2.putString("request_id", this.zza);
        }
    }
}
