package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbep extends zzbyn {
    private static void zzr(final zzbyv zzbyvVar) {
        zzccn.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzccg.zza.post(new Runnable(zzbyvVar) { // from class: com.google.android.gms.internal.ads.zzbeo
            private final zzbyv zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbyvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbyv zzbyvVar2 = this.zza;
                if (zzbyvVar2 != null) {
                    try {
                        zzbyvVar2.zzf(1);
                    } catch (RemoteException e) {
                        zzccn.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzc(zzazs zzazsVar, zzbyv zzbyvVar) throws RemoteException {
        zzr(zzbyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzd(zzazs zzazsVar, zzbyv zzbyvVar) throws RemoteException {
        zzr(zzbyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zze(zzbyr zzbyrVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzf(zzbda zzbdaVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final Bundle zzg() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzh(zzbzc zzbzcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final boolean zzi() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final String zzj() throws RemoteException {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbyl zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbdg zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzn(zzbdd zzbddVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzo(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzp(zzbyw zzbywVar) throws RemoteException {
    }
}
