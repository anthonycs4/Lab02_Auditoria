package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbkm extends zzbjq {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbkm(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zze(zzbbu zzbbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbbuVar.zzw() instanceof zzazo) {
                zzazo zzazoVar = (zzazo) zzbbuVar.zzw();
                adManagerAdView.setAdListener(zzazoVar != null ? zzazoVar.zzj() : null);
            }
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
        try {
            if (zzbbuVar.zzv() instanceof zzasw) {
                zzasw zzaswVar = (zzasw) zzbbuVar.zzv();
                adManagerAdView.setAppEventListener(zzaswVar != null ? zzaswVar.zzc() : null);
            }
        } catch (RemoteException e2) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
        }
        zzccg.zza.post(new zzbkl(this, adManagerAdView, zzbbuVar));
    }
}
