package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbsd extends zzbrg {
    private final Object zza;
    private zzbsf zzb;
    private zzbyg zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private final String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public zzbsd(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzR(String str, zzazs zzazsVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzccn.zzd(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
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
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzazsVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzazsVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    private final Bundle zzS(zzazs zzazsVar) {
        Bundle bundle;
        Bundle bundle2 = zzazsVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzT(zzazs zzazsVar) {
        if (zzazsVar.zzf) {
            return true;
        }
        zzbay.zza();
        return zzccg.zzm();
    }

    private static final String zzU(String str, zzazs zzazsVar) {
        String str2 = zzazsVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzA(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzccn.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbdj zzB() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) obj).getVideoController();
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrt zzC() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzd;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
                return null;
            }
            return new zzbsw(unifiedNativeAdMapper);
        }
        zzbsf zzbsfVar = this.zzb;
        if (zzbsfVar == null || (zzd = zzbsfVar.zzd()) == null) {
            return null;
        }
        return new zzbsw(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzD(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        zzccn.zzd("Requesting rewarded ad from adapter.");
        try {
            ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzR(str, zzazsVar, null), zzS(zzazsVar), zzT(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzU(str, zzazsVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzbsc(this, zzbrkVar));
        } catch (Exception e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        zzccn.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzh;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzccn.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzF(IObjectWrapper iObjectWrapper, zzbnn zzbnnVar, List<zzbnt> list) throws RemoteException {
        char c;
        AdFormat adFormat;
        if (!(this.zza instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbry zzbryVar = new zzbry(this, zzbnnVar);
        ArrayList arrayList = new ArrayList();
        for (zzbnt zzbntVar : list) {
            String str = zzbntVar.zza;
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
            } else if (c != 3) {
                adFormat = c != 4 ? null : AdFormat.NATIVE;
            } else {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbntVar.zzb));
            }
        }
        ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbryVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzG(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        zzccn.zzd("Requesting rewarded interstitial ad from adapter.");
        try {
            ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzR(str, zzazsVar, null), zzS(zzazsVar), zzT(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzU(str, zzazsVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzbsc(this, zzbrkVar));
        } catch (Exception e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbty zzH() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbty.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbty zzI() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbty.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzJ(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        zzccn.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) this.zza;
            adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzR(str, zzazsVar, str2), zzS(zzazsVar), zzT(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzU(str, zzazsVar), com.google.android.gms.ads.zza.zzc(zzazxVar.zze, zzazxVar.zzb), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzbrx(this, zzbrkVar, adapter));
        } catch (Exception e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrn zzK() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbse(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            }
            zzccn.zzd("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzccn.zzf("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzccn.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrp zzM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrq zzN() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zze(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        zzj(iObjectWrapper, zzazxVar, zzazsVar, str, null, zzbrkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final IObjectWrapper zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        zzk(iObjectWrapper, zzazsVar, str, null, zzbrkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzh() throws RemoteException {
        if (!(this.zza instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        zzccn.zzd("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zza).showInterstitial();
        } catch (Throwable th) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzj(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        AdSize zza;
        RemoteException remoteException;
        Object obj = this.zza;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            zzccn.zzd("Requesting banner ad from adapter.");
            if (zzazxVar.zzn) {
                zza = com.google.android.gms.ads.zza.zzb(zzazxVar.zze, zzazxVar.zzb);
            } else {
                zza = com.google.android.gms.ads.zza.zza(zzazxVar.zze, zzazxVar.zzb, zzazxVar.zza);
            }
            AdSize adSize = zza;
            Object obj2 = this.zza;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List<String> list = zzazsVar.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzazsVar.zzb;
                    zzbrw zzbrwVar = new zzbrw(j == -1 ? null : new Date(j), zzazsVar.zzd, hashSet, zzazsVar.zzk, zzT(zzazsVar), zzazsVar.zzg, zzazsVar.zzr, zzazsVar.zzt, zzU(str, zzazsVar));
                    Bundle bundle = zzazsVar.zzm;
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbsf(zzbrkVar), zzR(str, zzazsVar, str2), adSize, zzbrwVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                    return;
                } finally {
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzR(str, zzazsVar, str2), zzS(zzazsVar), zzT(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzU(str, zzazsVar), adSize, this.zzj), new zzbrz(this, zzbrkVar));
                    return;
                } finally {
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzccn.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzk(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            zzccn.zzd("Requesting interstitial ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List<String> list = zzazsVar.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzazsVar.zzb;
                    zzbrw zzbrwVar = new zzbrw(j == -1 ? null : new Date(j), zzazsVar.zzd, hashSet, zzazsVar.zzk, zzT(zzazsVar), zzazsVar.zzg, zzazsVar.zzr, zzazsVar.zzt, zzU(str, zzazsVar));
                    Bundle bundle = zzazsVar.zzm;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbsf(zzbrkVar), zzR(str, zzazsVar, str2), zzbrwVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                    return;
                } finally {
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzR(str, zzazsVar, str2), zzS(zzazsVar), zzT(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzU(str, zzazsVar), this.zzj), new zzbsa(this, zzbrkVar));
                    return;
                } finally {
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzccn.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzn(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbyg zzbygVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbygVar;
        zzbygVar.zze(ObjectWrapper.wrap(obj));
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzo(zzazs zzazsVar, String str) throws RemoteException {
        zzv(zzazsVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzp() throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.zzh;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
        } else {
            zzccn.zzf("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzq() throws RemoteException {
        if (this.zza instanceof Adapter) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzccn.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzr(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar, zzbhy zzbhyVar, List<String> list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            zzccn.zzd("Requesting native ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List<String> list2 = zzazsVar.zze;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzazsVar.zzb;
                    zzbsh zzbshVar = new zzbsh(j == -1 ? null : new Date(j), zzazsVar.zzd, hashSet, zzazsVar.zzk, zzT(zzazsVar), zzazsVar.zzg, zzbhyVar, list, zzazsVar.zzr, zzazsVar.zzt, zzU(str, zzazsVar));
                    Bundle bundle = zzazsVar.zzm;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzbsf(zzbrkVar);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzR(str, zzazsVar, str2), zzbshVar, bundle2);
                    return;
                } finally {
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzR(str, zzazsVar, str2), zzS(zzazsVar), zzT(zzazsVar), zzazsVar.zzk, zzazsVar.zzg, zzazsVar.zzt, zzU(str, zzazsVar), this.zzj, zzbhyVar), new zzbsb(this, zzbrkVar));
                    return;
                } finally {
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationNativeAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzccn.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzs() {
        Object obj = this.zza;
        if (!(obj instanceof zzcjx)) {
            String canonicalName = zzcjx.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            return new Bundle();
        }
        return ((zzcjx) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzt() {
        Object obj = this.zza;
        if (!(obj instanceof zzcjy)) {
            String canonicalName = zzcjy.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            return new Bundle();
        }
        return ((zzcjy) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzv(zzazs zzazsVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzccn.zzi(sb.toString());
            throw new RemoteException();
        }
        zzD(this.zzd, zzazsVar, str, new zzbsg((Adapter) obj, this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzy(IObjectWrapper iObjectWrapper, zzbyg zzbygVar, List<String> list) throws RemoteException {
        zzccn.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbja zzz() {
        zzbsf zzbsfVar = this.zzb;
        if (zzbsfVar != null) {
            NativeCustomTemplateAd zze = zzbsfVar.zze();
            if (zze instanceof zzbjb) {
                return ((zzbjb) zze).zza();
            }
            return null;
        }
        return null;
    }

    public zzbsd(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
