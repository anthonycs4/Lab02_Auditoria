package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzccs;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbz extends zzb {
    private final zzccs zza;
    private final String zzb;

    public zzbz(Context context, String str, String str2) {
        this.zza = new zzccs(com.google.android.gms.ads.internal.zzs.zzc().zze(context, str));
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
