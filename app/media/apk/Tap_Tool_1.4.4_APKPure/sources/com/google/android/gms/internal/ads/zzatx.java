package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatx extends AppOpenAd {
    FullScreenContentCallback zza;
    private final zzaub zzb;
    private final String zzc;
    private final zzaty zzd = new zzaty();
    private OnPaidEventListener zze;

    public zzatx(zzaub zzaubVar, String str) {
        this.zzb = zzaubVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzbdg zzbdgVar;
        try {
            zzbdgVar = this.zzb.zzg();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            zzbdgVar = null;
        }
        return ResponseInfo.zzc(zzbdgVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzh(z);
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzi(new zzber(onPaidEventListener));
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.zzb.zzf(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}
