package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbvn;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzu extends zzbvn {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbD(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zze() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzf() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final boolean zzg() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfS)).booleanValue()) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                zzazi zzaziVar = adOverlayInfoParcel.zzb;
                if (zzaziVar != null) {
                    zzaziVar.onAdClicked();
                }
                if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                    zzoVar.zzby();
                }
            }
            com.google.android.gms.ads.internal.zzs.zza();
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzj() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzk() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzl() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzp() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzq() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzs() throws RemoteException {
    }
}
