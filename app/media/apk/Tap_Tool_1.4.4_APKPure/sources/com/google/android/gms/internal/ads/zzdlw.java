package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlw extends VideoController.VideoLifecycleCallbacks {
    private final zzdgz zza;

    public zzdlw(zzdgz zzdgzVar) {
        this.zza = zzdgzVar;
    }

    private static zzbdm zza(zzdgz zzdgzVar) {
        zzbdj zzw = zzdgzVar.zzw();
        if (zzw == null) {
            return null;
        }
        try {
            return zzw.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzbdm zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzbdm zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzbdm zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }
}
