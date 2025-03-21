package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdy {
    private static zzbdy zzc;
    private zzbcl zzd;
    private InitializationStatus zzi;
    private final Object zzb = new Object();
    private boolean zze = false;
    private boolean zzf = false;
    @Nullable
    private OnAdInspectorClosedListener zzg = null;
    private RequestConfiguration zzh = new RequestConfiguration.Builder().build();
    private final ArrayList<OnInitializationCompleteListener> zza = new ArrayList<>();

    private zzbdy() {
    }

    public static zzbdy zza() {
        zzbdy zzbdyVar;
        synchronized (zzbdy.class) {
            if (zzc == null) {
                zzc = new zzbdy();
            }
            zzbdyVar = zzc;
        }
        return zzbdyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzq(zzbdy zzbdyVar, boolean z) {
        zzbdyVar.zze = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzr(zzbdy zzbdyVar, boolean z) {
        zzbdyVar.zzf = true;
        return true;
    }

    private final void zzv(RequestConfiguration requestConfiguration) {
        try {
            this.zzd.zzr(new zzbes(requestConfiguration));
        } catch (RemoteException e) {
            zzccn.zzg("Unable to set request configuration parcel.", e);
        }
    }

    private final void zzw(Context context) {
        if (this.zzd == null) {
            this.zzd = new zzbas(zzbay.zzb(), context).zzd(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializationStatus zzx(List<zzbnj> list) {
        HashMap hashMap = new HashMap();
        for (zzbnj zzbnjVar : list) {
            hashMap.put(zzbnjVar.zza, new zzbnr(zzbnjVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbnjVar.zzd, zzbnjVar.zzc));
        }
        return new zzbns(hashMap);
    }

    public final void zzb(Context context, @Nullable String str, @Nullable final OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    zza().zza.add(onInitializationCompleteListener);
                }
            } else if (this.zzf) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zzj());
                }
            } else {
                this.zze = true;
                if (onInitializationCompleteListener != null) {
                    zza().zza.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                try {
                    zzbqx.zza().zzb(context, null);
                    zzw(context);
                    if (onInitializationCompleteListener != null) {
                        this.zzd.zzp(new zzbdx(this, null));
                    }
                    this.zzd.zzo(new zzbrb());
                    this.zzd.zze();
                    this.zzd.zzj(null, ObjectWrapper.wrap(null));
                    if (this.zzh.getTagForChildDirectedTreatment() != -1 || this.zzh.getTagForUnderAgeOfConsent() != -1) {
                        zzv(this.zzh);
                    }
                    zzbfq.zza(context);
                    if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdC)).booleanValue() && !zzh().endsWith("0")) {
                        zzccn.zzf("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                        this.zzi = new zzbdu(this);
                        if (onInitializationCompleteListener != null) {
                            zzccg.zza.post(new Runnable(this, onInitializationCompleteListener) { // from class: com.google.android.gms.internal.ads.zzbdt
                                private final zzbdy zza;
                                private final OnInitializationCompleteListener zzb;

                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    this.zza = this;
                                    this.zzb = onInitializationCompleteListener;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(this.zzb);
                                }
                            });
                        }
                    }
                } catch (RemoteException e) {
                    zzccn.zzj("MobileAdsSettingManager initialization failed", e);
                }
            }
        }
    }

    public final void zzc(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzb) {
            if (this.zzd == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzd.zzf(f);
            } catch (RemoteException e) {
                zzccn.zzg("Unable to set app volume.", e);
            }
        }
    }

    public final void zze(boolean z) {
        synchronized (this.zzb) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzd.zzh(z);
            } catch (RemoteException e) {
                zzccn.zzg("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzg(Context context, String str) {
        synchronized (this.zzb) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzd.zzi(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzccn.zzg("Unable to open debug menu.", e);
            }
        }
    }

    public final String zzh() {
        String zza;
        synchronized (this.zzb) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zza = zzffa.zza(this.zzd.zzm());
            } catch (RemoteException e) {
                zzccn.zzg("Unable to get version string.", e);
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        }
        return zza;
    }

    public final void zzi(Class<? extends RtbAdapter> cls) {
        synchronized (this.zzb) {
            try {
                this.zzd.zzn(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzccn.zzg("Unable to register RtbAdapter", e);
            }
        }
    }

    public final InitializationStatus zzj() {
        synchronized (this.zzb) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                InitializationStatus initializationStatus = this.zzi;
                if (initializationStatus != null) {
                    return initializationStatus;
                }
                return zzx(this.zzd.zzq());
            } catch (RemoteException unused) {
                zzccn.zzf("Unable to get Initialization status.");
                return new zzbdu(this);
            }
        }
    }

    public final void zzk(Context context) {
        synchronized (this.zzb) {
            zzw(context);
            try {
                this.zzd.zzs();
            } catch (RemoteException unused) {
                zzccn.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzl(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzb) {
            zzw(context);
            zza().zzg = onAdInspectorClosedListener;
            try {
                this.zzd.zzt(new zzbdw(null));
            } catch (RemoteException unused) {
                zzccn.zzf("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final RequestConfiguration zzm() {
        return this.zzh;
    }

    public final void zzn(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzb) {
            RequestConfiguration requestConfiguration2 = this.zzh;
            this.zzh = requestConfiguration;
            if (this.zzd == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzv(requestConfiguration);
            }
        }
    }

    public final void zzo(WebView webView) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        synchronized (this.zzb) {
            if (webView == null) {
                zzccn.zzf("The webview to be registered cannot be null.");
                return;
            }
            zzcbj zza = zzbwd.zza(webView.getContext());
            if (zza != null) {
                try {
                    zza.zzj(ObjectWrapper.wrap(webView));
                } catch (RemoteException e) {
                    zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                }
                return;
            }
            zzccn.zzi("Internal error, query info generator is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzi);
    }

    public final float zzd() {
        synchronized (this.zzb) {
            zzbcl zzbclVar = this.zzd;
            float f = 1.0f;
            if (zzbclVar == null) {
                return 1.0f;
            }
            try {
                f = zzbclVar.zzk();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final boolean zzf() {
        synchronized (this.zzb) {
            zzbcl zzbclVar = this.zzd;
            boolean z = false;
            if (zzbclVar == null) {
                return false;
            }
            try {
                z = zzbclVar.zzl();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
