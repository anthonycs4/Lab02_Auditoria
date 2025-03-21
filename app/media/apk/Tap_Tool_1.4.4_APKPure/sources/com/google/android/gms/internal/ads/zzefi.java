package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefi implements zzazi {
    private zzbbe zza;

    @Override // com.google.android.gms.internal.ads.zzazi
    public final synchronized void onAdClicked() {
        zzbbe zzbbeVar = this.zza;
        if (zzbbeVar != null) {
            try {
                zzbbeVar.zzb();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(zzbbe zzbbeVar) {
        this.zza = zzbbeVar;
    }
}
