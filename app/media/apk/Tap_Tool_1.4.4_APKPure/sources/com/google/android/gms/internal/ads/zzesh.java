package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzesh extends zzfaw {
    final /* synthetic */ zzbda zza;
    final /* synthetic */ zzesj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesh(zzesj zzesjVar, zzbda zzbdaVar) {
        this.zzb = zzesjVar;
        this.zza = zzbdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final void zzl() {
        zzdmb zzdmbVar;
        zzdmbVar = this.zzb.zzf;
        if (zzdmbVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
