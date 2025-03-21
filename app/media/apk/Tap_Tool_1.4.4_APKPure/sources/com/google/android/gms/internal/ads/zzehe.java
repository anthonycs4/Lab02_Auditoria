package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehe implements zzelc<Bundle> {
    private final zzbad zza;
    private final zzcct zzb;
    private final boolean zzc;

    public zzehe(zzbad zzbadVar, zzcct zzcctVar, boolean z) {
        this.zza = zzbadVar;
        this.zzb = zzcctVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zzb.zzc >= ((Integer) zzbba.zzc().zzb(zzbfq.zzdw)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdx)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.zzc);
        }
        zzbad zzbadVar = this.zza;
        if (zzbadVar != null) {
            int i = zzbadVar.zza;
            if (i == 1) {
                bundle2.putString("avo", "p");
            } else if (i == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
