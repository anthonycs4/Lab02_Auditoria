package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgl extends zzbig {
    private final zzdgz zza;
    private IObjectWrapper zzb;

    public zzdgl(zzdgz zzdgzVar) {
        this.zza = zzdgzVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final float zze() throws RemoteException {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeu)).booleanValue()) {
            if (this.zza.zzW() != 0.0f) {
                return this.zza.zzW();
            }
            if (this.zza.zzw() != null) {
                try {
                    return this.zza.zzw().zzm();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Remote exception getting video controller aspect ratio.", e);
                    return 0.0f;
                }
            }
            IObjectWrapper iObjectWrapper = this.zzb;
            if (iObjectWrapper != null) {
                return zzb(iObjectWrapper);
            }
            zzbik zzB = this.zza.zzB();
            if (zzB == null) {
                return 0.0f;
            }
            float zze = (zzB.zze() == -1 || zzB.zzf() == -1) ? 0.0f : zzB.zze() / zzB.zzf();
            return zze == 0.0f ? zzb(zzB.zzb()) : zze;
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbik zzB = this.zza.zzB();
        if (zzB == null) {
            return null;
        }
        return zzB.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final float zzh() throws RemoteException {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzev)).booleanValue() && this.zza.zzw() != null) {
            return this.zza.zzw().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final float zzi() throws RemoteException {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzev)).booleanValue() && this.zza.zzw() != null) {
            return this.zza.zzw().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbdj zzj() throws RemoteException {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzev)).booleanValue()) {
            return this.zza.zzw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzk() throws RemoteException {
        return ((Boolean) zzbba.zzc().zzb(zzbfq.zzev)).booleanValue() && this.zza.zzw() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzl(zzbjo zzbjoVar) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzev)).booleanValue() && (this.zza.zzw() instanceof zzcix)) {
            ((zzcix) this.zza.zzw()).zzv(zzbjoVar);
        }
    }
}
