package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbeg extends zzbbm {
    final /* synthetic */ zzbeh zza;

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zze(zzazs zzazsVar) throws RemoteException {
        zzi(zzazsVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final boolean zzg() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final String zzh() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zzi(zzazs zzazsVar, int i) throws RemoteException {
        zzccn.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzccg.zza.post(new zzbef(this));
    }
}
