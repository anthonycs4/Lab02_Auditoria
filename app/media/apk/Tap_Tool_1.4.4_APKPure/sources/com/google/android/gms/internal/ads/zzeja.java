package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeja implements zzelc<Bundle> {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public zzeja(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!this.zza.isEmpty()) {
            bundle2.putString("inspector_extras", this.zza);
        }
        bundle2.putInt("test_mode", this.zzb ? 1 : 0);
        bundle2.putInt("linked_device", this.zzc ? 1 : 0);
    }
}
