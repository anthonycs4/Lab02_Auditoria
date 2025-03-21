package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbds {
    final zzbaz zza;
    private final zzbrb zzb;
    private final zzazw zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zzazi zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbbu zzj;
    private VideoOptions zzk;
    private String zzl;
    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzbds(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzazw.zza, null, 0);
    }

    private static zzazx zzB(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzazx.zze();
            }
        }
        zzazx zzazxVar = new zzazx(context, adSizeArr);
        zzazxVar.zzj = zzC(i);
        return zzazxVar;
    }

    private static boolean zzC(int i) {
        return i == 1;
    }

    public final void zza() {
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzc();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final AdListener zzb() {
        return this.zzg;
    }

    public final AdSize zzc() {
        zzazx zzn;
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null && (zzn = zzbbuVar.zzn()) != null) {
                return com.google.android.gms.ads.zza.zza(zzn.zze, zzn.zzb, zzn.zza);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zzd() {
        return this.zzh;
    }

    public final String zze() {
        zzbbu zzbbuVar;
        if (this.zzl == null && (zzbbuVar = this.zzj) != null) {
            try {
                this.zzl = zzbbuVar.zzu();
            } catch (RemoteException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final AppEventListener zzf() {
        return this.zzi;
    }

    public final void zzg(zzbdq zzbdqVar) {
        zzbbu zzd;
        try {
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzm.getContext();
                zzazx zzB = zzB(context, this.zzh, this.zzn);
                if (!"search_v2".equals(zzB.zza)) {
                    zzd = new zzban(zzbay.zzb(), context, zzB, this.zzl, this.zzb).zzd(context, false);
                } else {
                    zzd = new zzbap(zzbay.zzb(), context, zzB, this.zzl).zzd(context, false);
                }
                this.zzj = zzd;
                zzd.zzh(new zzazo(this.zza));
                zzazi zzaziVar = this.zzf;
                if (zzaziVar != null) {
                    this.zzj.zzy(new zzazj(zzaziVar));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzi(new zzasw(appEventListener));
                }
                VideoOptions videoOptions = this.zzk;
                if (videoOptions != null) {
                    this.zzj.zzF(new zzbey(videoOptions));
                }
                this.zzj.zzO(new zzber(this.zzp));
                this.zzj.zzz(this.zzo);
                zzbbu zzbbuVar = this.zzj;
                if (zzbbuVar != null) {
                    try {
                        IObjectWrapper zzb = zzbbuVar.zzb();
                        if (zzb != null) {
                            this.zzm.addView((View) ObjectWrapper.unwrap(zzb));
                        }
                    } catch (RemoteException e) {
                        zzccn.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            zzbbu zzbbuVar2 = this.zzj;
            Objects.requireNonNull(zzbbuVar2);
            if (zzbbuVar2.zze(this.zzc.zza(this.zzm.getContext(), zzbdqVar))) {
                this.zzb.zze(zzbdqVar.zzn());
            }
        } catch (RemoteException e2) {
            zzccn.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzh() {
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzf();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzi() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzm();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj() {
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzg();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzk(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzl(zzazi zzaziVar) {
        try {
            this.zzf = zzaziVar;
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzy(zzaziVar != null ? new zzazj(zzaziVar) : null);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzn(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzo(zzB(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzo(String str) {
        if (this.zzl == null) {
            this.zzl = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void zzp(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzi(appEventListener != null ? new zzasw(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(boolean z) {
        this.zzo = z;
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzz(z);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzr() {
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                return zzbbuVar.zzA();
            }
            return false;
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final ResponseInfo zzs() {
        zzbdg zzbdgVar = null;
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbdgVar = zzbbuVar.zzt();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzbdgVar);
    }

    public final void zzt(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzO(new zzber(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#008 Must be called on the main UI thread.", e);
        }
    }

    public final OnPaidEventListener zzu() {
        return this.zzp;
    }

    public final VideoController zzv() {
        return this.zze;
    }

    public final zzbdj zzw() {
        zzbbu zzbbuVar = this.zzj;
        if (zzbbuVar != null) {
            try {
                return zzbbuVar.zzE();
            } catch (RemoteException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final void zzx(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzbbu zzbbuVar = this.zzj;
            if (zzbbuVar != null) {
                zzbbuVar.zzF(videoOptions == null ? null : new zzbey(videoOptions));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions zzy() {
        return this.zzk;
    }

    public final boolean zzz(zzbbu zzbbuVar) {
        try {
            IObjectWrapper zzb = zzbbuVar.zzb();
            if (zzb != null && ((View) ObjectWrapper.unwrap(zzb)).getParent() == null) {
                this.zzm.addView((View) ObjectWrapper.unwrap(zzb));
                this.zzj = zzbbuVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzbds(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzazw.zza, null, i);
    }

    public final void zzm(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzn(adSizeArr);
    }

    public zzbds(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzazw.zza, null, 0);
    }

    public zzbds(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzazw.zza, null, i);
    }

    zzbds(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzazw zzazwVar, zzbbu zzbbuVar, int i) {
        zzazx zzazxVar;
        this.zzb = new zzbrb();
        this.zze = new VideoController();
        this.zza = new zzbdr(this);
        this.zzm = viewGroup;
        this.zzc = zzazwVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzbaf zzbafVar = new zzbaf(context, attributeSet);
                this.zzh = zzbafVar.zza(z);
                this.zzl = zzbafVar.zzb();
                if (viewGroup.isInEditMode()) {
                    zzccg zza = zzbay.zza();
                    AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzazxVar = zzazx.zze();
                    } else {
                        zzazx zzazxVar2 = new zzazx(context, adSize);
                        zzazxVar2.zzj = zzC(i2);
                        zzazxVar = zzazxVar2;
                    }
                    zza.zzc(viewGroup, zzazxVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzbay.zza().zzb(viewGroup, new zzazx(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
