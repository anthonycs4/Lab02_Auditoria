package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefp {
    private final zzefu<zzcsn> zza;
    private final String zzb;
    private zzbdg zzc;

    public zzefp(zzefu<zzcsn> zzefuVar, String str) {
        this.zza = zzefuVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(zzazs zzazsVar, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zza(zzazsVar, this.zzb, new zzefv(i), new zzefo(this));
    }

    public final synchronized String zzc() {
        zzbdg zzbdgVar;
        try {
            zzbdgVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzbdgVar != null ? zzbdgVar.zze() : null;
    }

    public final synchronized String zzd() {
        zzbdg zzbdgVar;
        try {
            zzbdgVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzbdgVar != null ? zzbdgVar.zze() : null;
    }
}
