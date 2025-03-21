package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbex extends zzbdl {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzbex(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zze() {
        this.zza.onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzf() {
        this.zza.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzh() {
        this.zza.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzi(boolean z) {
        this.zza.onVideoMute(z);
    }
}
