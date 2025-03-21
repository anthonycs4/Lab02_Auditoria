package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdkv extends zzbnx implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbht {
    private View zza;
    private zzbdj zzb;
    private zzdgu zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdkv(zzdgu zzdguVar, zzdgz zzdgzVar) {
        this.zza = zzdgzVar.zzH();
        this.zzb = zzdgzVar.zzw();
        this.zzc = zzdguVar;
        if (zzdgzVar.zzR() != null) {
            zzdgzVar.zzR().zzaw(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdgu zzdguVar = this.zzc;
        if (zzdguVar == null || (view = this.zza) == null) {
            return;
        }
        zzdguVar.zzp(view, Collections.emptyMap(), Collections.emptyMap(), zzdgu.zzz(this.zza));
    }

    private static final void zzi(zzbob zzbobVar, int i) {
        try {
            zzbobVar.zzf(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zza() {
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdkt
            private final zzdkv zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.zza.zzc();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final zzbdj zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzg();
        zzdgu zzdguVar = this.zzc;
        if (zzdguVar != null) {
            zzdguVar.zzR();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final void zzd(IObjectWrapper iObjectWrapper, zzbob zzbobVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzf("Instream ad can not be shown after destroy().");
            zzi(zzbobVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                com.google.android.gms.ads.internal.util.zze.zzf("Instream ad should not be used again.");
                zzi(zzbobVar, 1);
                return;
            }
            this.zze = true;
            zzg();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzs.zzz();
            zzcdm.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzs.zzz();
            zzcdm.zzb(this.zza, this);
            zzh();
            try {
                zzbobVar.zze();
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        String str = view == null ? "can not get video view." : "can not get video controller.";
        com.google.android.gms.ads.internal.util.zze.zzf(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
        zzi(zzbobVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzd(iObjectWrapper, new zzdku(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final zzbih zzf() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdgu zzdguVar = this.zzc;
        if (zzdguVar == null || zzdguVar.zzF() == null) {
            return null;
        }
        return this.zzc.zzF().zza();
    }
}
