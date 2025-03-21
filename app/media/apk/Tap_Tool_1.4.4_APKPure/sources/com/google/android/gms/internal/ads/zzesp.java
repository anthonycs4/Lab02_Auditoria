package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesp extends zzbxx {
    private final zzesf zza;
    private final zzerw zzb;
    private final zzetf zzc;
    private zzdmb zzd;
    private boolean zze = false;

    public zzesp(zzesf zzesfVar, zzerw zzerwVar, zzetf zzetfVar) {
        this.zza = zzesfVar;
        this.zzb = zzerwVar;
        this.zzc = zzetfVar;
    }

    private final synchronized boolean zzx() {
        boolean z;
        zzdmb zzdmbVar = this.zzd;
        if (zzdmbVar != null) {
            z = zzdmbVar.zze() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzb(zzbyc zzbycVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbycVar.zzb;
        String str2 = (String) zzbba.zzc().zzb(zzbfq.zzdD);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzx()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdF)).booleanValue()) {
                return;
            }
        }
        zzery zzeryVar = new zzery(null);
        this.zzd = null;
        this.zza.zzi(1);
        this.zza.zza(zzbycVar.zza, zzbycVar.zzb, zzeryVar, new zzesn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzd(zzbyb zzbybVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzp(zzbybVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzm(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized String zzl() throws RemoteException {
        zzdmb zzdmbVar = this.zzd;
        if (zzdmbVar == null || zzdmbVar.zzm() == null) {
            return null;
        }
        return this.zzd.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzn(zzbby zzbbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbbyVar == null) {
            this.zzb.zzm(null);
        } else {
            this.zzb.zzm(new zzeso(this, zzbbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdmb zzdmbVar = this.zzd;
        return zzdmbVar != null ? zzdmbVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzr(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final boolean zzs() {
        zzdmb zzdmbVar = this.zzd;
        return zzdmbVar != null && zzdmbVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized zzbdg zzt() throws RemoteException {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeS)).booleanValue()) {
            zzdmb zzdmbVar = this.zzd;
            if (zzdmbVar != null) {
                return zzdmbVar.zzm();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzu(zzbxw zzbxwVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzr(zzbxwVar);
    }
}
