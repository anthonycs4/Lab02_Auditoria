package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbsi<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzbrg {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zza;
    private final NETWORK_EXTRAS zzb;

    public zzbsi(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zza = mediationAdapter;
        this.zzb = network_extras;
    }

    private final SERVER_PARAMETERS zzb(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zza.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.load(hashMap);
                return newInstance;
            }
            return null;
        } catch (Throwable th) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    private static final boolean zzc(zzazs zzazsVar) {
        if (zzazsVar.zzf) {
            return true;
        }
        zzbay.zza();
        return zzccg.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzA(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbdj zzB() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrt zzC() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzD(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzF(IObjectWrapper iObjectWrapper, zzbnn zzbnnVar, List<zzbnt> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzG(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbty zzH() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbty zzI() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzJ(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrn zzK() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzL(IObjectWrapper iObjectWrapper) {
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
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (mediationAdapter instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
            } catch (Throwable th) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzccn.zzi(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        zzk(iObjectWrapper, zzazsVar, str, null, zzbrkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzh() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzccn.zzi(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
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
    public final void zzj(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzccn.zzi(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzccn.zzd("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zza;
            zzbsu zzbsuVar = new zzbsu(zzbrkVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zzb = zzb(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i >= 6) {
                    adSize = new AdSize(com.google.android.gms.ads.zza.zza(zzazxVar.zze, zzazxVar.zzb, zzazxVar.zza));
                    break;
                } else if (adSizeArr[i].getWidth() == zzazxVar.zze && adSizeArr[i].getHeight() == zzazxVar.zzb) {
                    adSize = adSizeArr[i];
                    break;
                } else {
                    i++;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzbsuVar, activity, zzb, adSize, zzbsv.zzb(zzazsVar, zzc(zzazsVar)), this.zzb);
        } catch (Throwable th) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzk(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzccn.zzi(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzccn.zzd("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zza).requestInterstitialAd(new zzbsu(zzbrkVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzb(str), zzbsv.zzb(zzazsVar, zzc(zzazsVar)), this.zzb);
        } catch (Throwable th) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzn(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbyg zzbygVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzo(zzazs zzazsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzr(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar, zzbhy zzbhyVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzv(zzazs zzazsVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzy(IObjectWrapper iObjectWrapper, zzbyg zzbygVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbja zzz() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzi() throws RemoteException {
        try {
            this.zza.destroy();
        } catch (Throwable th) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }
}
