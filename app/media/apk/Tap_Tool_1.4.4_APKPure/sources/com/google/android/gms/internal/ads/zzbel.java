package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbel extends zzbck {
    private zzbnq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbnq zzbnqVar = this.zza;
        if (zzbnqVar != null) {
            try {
                zzbnqVar.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                zzccn.zzj("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zze() throws RemoteException {
        zzccn.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzccg.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbek
            private final zzbel zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzf(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzg(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzh(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final float zzk() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final boolean zzl() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final String zzm() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzn(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzo(zzbre zzbreVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzp(zzbnq zzbnqVar) throws RemoteException {
        this.zza = zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final List<zzbnj> zzq() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzr(zzbes zzbesVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzt(zzbcx zzbcxVar) {
    }
}
