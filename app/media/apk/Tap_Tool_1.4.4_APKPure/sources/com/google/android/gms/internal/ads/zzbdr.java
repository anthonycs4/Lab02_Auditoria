package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdr extends zzbaz {
    final /* synthetic */ zzbds zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdr(zzbds zzbdsVar) {
        this.zza = zzbdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        videoController = this.zza.zze;
        videoController.zza(this.zza.zzw());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.internal.ads.zzbaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zza.zze;
        videoController.zza(this.zza.zzw());
        super.onAdLoaded();
    }
}
