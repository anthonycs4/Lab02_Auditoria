package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbtw extends zzbtk {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public zzbtw(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzs(zzazs zzazsVar) {
        Bundle bundle;
        Bundle bundle2 = zzazsVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzt(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzccn.zzi(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            throw new RemoteException();
        }
    }

    private static final boolean zzu(zzazs zzazsVar) {
        if (zzazsVar.zzf) {
            return true;
        }
        zzbay.zza();
        return zzccg.zzm();
    }

    private static final String zzv(String str, zzazs zzazsVar) {
        String str2 = zzazsVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzazx zzazxVar, zzbto zzbtoVar) throws RemoteException {
        char c;
        AdFormat adFormat;
        try {
            zzbtu zzbtuVar = new zzbtu(this, zzbtoVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            } else if (c == 4) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zza.zza(zzazxVar.zze, zzazxVar.zzb, zzazxVar.zza)), zzbtuVar);
        } catch (Throwable th) {
            zzccn.zzg("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbty zzf() throws RemoteException {
        return zzbty.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbty zzg() throws RemoteException {
        return zzbty.zza(this.zza.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbdj zzh() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzi(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbsz zzbszVar, zzbrk zzbrkVar, zzazx zzazxVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzazsVar), zzu(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzv(str2, zzazsVar), com.google.android.gms.ads.zza.zza(zzazxVar.zze, zzazxVar.zzb, zzazxVar.zza), this.zzd), new zzbtq(this, zzbszVar, zzbrkVar));
        } catch (Throwable th) {
            zzccn.zzg("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzj(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, zzbrk zzbrkVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzazsVar), zzu(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzv(str2, zzazsVar), this.zzd), new zzbts(this, zzbtcVar, zzbrkVar));
        } catch (Throwable th) {
            zzccn.zzg("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzl(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbti zzbtiVar, zzbrk zzbrkVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzazsVar), zzu(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzv(str2, zzazsVar), this.zzd), new zzbtv(this, zzbtiVar, zzbrkVar));
        } catch (Throwable th) {
            zzccn.zzg("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzn(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbtf zzbtfVar, zzbrk zzbrkVar) throws RemoteException {
        zzr(str, str2, zzazsVar, iObjectWrapper, zzbtfVar, zzbrkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzo(String str) {
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzp(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbti zzbtiVar, zzbrk zzbrkVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzazsVar), zzu(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzv(str2, zzazsVar), this.zzd), new zzbtv(this, zzbtiVar, zzbrkVar));
        } catch (Throwable th) {
            zzccn.zzg("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzq(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbsz zzbszVar, zzbrk zzbrkVar, zzazx zzazxVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzazsVar), zzu(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzv(str2, zzazsVar), com.google.android.gms.ads.zza.zza(zzazxVar.zze, zzazxVar.zzb, zzazxVar.zza), this.zzd), new zzbtr(this, zzbszVar, zzbrkVar));
        } catch (Throwable th) {
            zzccn.zzg("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzr(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbtf zzbtfVar, zzbrk zzbrkVar, zzbhy zzbhyVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzazsVar), zzu(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzv(str2, zzazsVar), this.zzd, zzbhyVar), new zzbtt(this, zzbtfVar, zzbrkVar));
        } catch (Throwable th) {
            zzccn.zzg("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }
}
