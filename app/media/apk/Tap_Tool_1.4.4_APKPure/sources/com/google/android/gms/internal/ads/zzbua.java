package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbua implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbuc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbua(zzbuc zzbucVar) {
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzccn.zzd("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzccn.zzd("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.zza.zzb;
        mediationInterstitialListener.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
        zzccn.zzd("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        MediationInterstitialListener mediationInterstitialListener;
        zzccn.zzd("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.zza.zzb;
        mediationInterstitialListener.onAdOpened(this.zza);
    }
}
