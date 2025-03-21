package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzbkl implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbbu zzb;
    final /* synthetic */ zzbkm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkl(zzbkm zzbkmVar, AdManagerAdView adManagerAdView, zzbbu zzbbuVar) {
        this.zzc = zzbkmVar;
        this.zza = adManagerAdView;
        this.zzb = zzbbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zza(this.zzb)) {
            onAdManagerAdViewLoadedListener = this.zzc.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzccn.zzi("Could not bind.");
    }
}
