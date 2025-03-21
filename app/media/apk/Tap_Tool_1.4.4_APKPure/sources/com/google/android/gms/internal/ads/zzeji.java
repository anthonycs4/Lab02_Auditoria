package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeji implements zzelc<Bundle> {
    public final zzesr zza;

    public zzeji(zzesr zzesrVar) {
        this.zza = zzesrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzesr zzesrVar = this.zza;
        if (zzesrVar != null) {
            bundle2.putBoolean("render_in_browser", zzesrVar.zzb());
            bundle2.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
