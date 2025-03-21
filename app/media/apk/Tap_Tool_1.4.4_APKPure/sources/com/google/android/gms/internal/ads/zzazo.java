package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzazo extends zzbbg {
    private final AdListener zza;

    public zzazo(AdListener adListener) {
        this.zza = adListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzb() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzc(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzd(zzazm zzazmVar) {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzazmVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzf() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzh() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzi() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final AdListener zzj() {
        return this.zza;
    }
}
