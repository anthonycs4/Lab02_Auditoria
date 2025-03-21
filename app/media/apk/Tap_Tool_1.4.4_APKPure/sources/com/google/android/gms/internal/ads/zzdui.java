package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdui implements zzcyy {
    private final Context zza;
    private final zzcaw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdui(Context context, zzcaw zzcawVar) {
        this.zza = context;
        this.zzb = zzcawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
        if (TextUtils.isEmpty(zzeteVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzd(this.zza, zzeteVar.zza.zza.zzd);
        this.zzb.zzp(this.zza, zzeteVar.zzb.zzb.zzd);
    }
}
