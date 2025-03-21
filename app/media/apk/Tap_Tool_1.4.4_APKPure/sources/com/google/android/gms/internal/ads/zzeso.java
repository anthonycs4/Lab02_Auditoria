package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeso extends zzfaw {
    final /* synthetic */ zzbby zza;
    final /* synthetic */ zzesp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeso(zzesp zzespVar, zzbby zzbbyVar) {
        this.zzb = zzespVar;
        this.zza = zzbbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final void zzl() {
        zzdmb zzdmbVar;
        zzdmbVar = this.zzb.zzd;
        if (zzdmbVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
