package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdlb implements zzbhw {
    final /* synthetic */ zzdlc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlb(zzdlc zzdlcVar) {
        this.zza = zzdlcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zza() {
        zzdgu zzdguVar;
        zzdgu zzdguVar2;
        zzdguVar = this.zza.zzd;
        if (zzdguVar != null) {
            zzdguVar2 = this.zza.zzd;
            zzdguVar2.zza("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final JSONObject zzc() {
        return null;
    }
}
