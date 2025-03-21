package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatw extends zzaud {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzatw(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzb(zzaub zzaubVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzatx(zzaubVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzc(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzd(zzazm zzazmVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzazmVar.zzb());
        }
    }
}
