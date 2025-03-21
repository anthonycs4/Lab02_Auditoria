package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcej {
    private final Context zza;
    private final zzceu zzb;
    private final ViewGroup zzc;
    private zzcei zzd;

    public zzcej(Context context, ViewGroup viewGroup, zzcib zzcibVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcibVar;
        this.zzd = null;
    }

    public final void zza(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            zzceiVar.zzm(i, i2, i3, i4);
        }
    }

    public final void zzb(int i, int i2, int i3, int i4, int i5, boolean z, zzcet zzcetVar) {
        if (this.zzd != null) {
            return;
        }
        zzbfx.zza(this.zzb.zzq().zzc(), this.zzb.zzi(), "vpr2");
        Context context = this.zza;
        zzceu zzceuVar = this.zzb;
        zzcei zzceiVar = new zzcei(context, zzceuVar, i5, z, zzceuVar.zzq().zzc(), zzcetVar);
        this.zzd = zzceiVar;
        this.zzc.addView(zzceiVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzm(i, i2, i3, i4);
        this.zzb.zzg(false);
    }

    public final zzcei zzc() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzd;
    }

    public final void zzd() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            zzceiVar.zzq();
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            zzceiVar.zzD();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf(int i) {
        Preconditions.checkMainThread("setPlayerBackgroundColor must be called from the UI thread.");
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            zzceiVar.zzl(i);
        }
    }
}
