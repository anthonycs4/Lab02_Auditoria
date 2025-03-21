package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcqi extends zzaua {
    private final zzcqh zza;
    private final zzbbu zzb;
    private final zzeoq zzc;
    private boolean zzd = false;

    public zzcqi(zzcqh zzcqhVar, zzbbu zzbbuVar, zzeoq zzeoqVar) {
        this.zza = zzcqhVar;
        this.zzb = zzbbuVar;
        this.zzc = zzeoqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final zzbbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzf(IObjectWrapper iObjectWrapper, zzaui zzauiVar) {
        try {
            this.zzc.zzh(zzauiVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzauiVar, this.zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final zzbdg zzg() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeS)).booleanValue()) {
            return this.zza.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzh(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzi(zzbdd zzbddVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzeoq zzeoqVar = this.zzc;
        if (zzeoqVar != null) {
            zzeoqVar.zzl(zzbddVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzj(zzauf zzaufVar) {
    }
}
