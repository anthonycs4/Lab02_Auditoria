package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbsx extends zzhq implements zzbsz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh(zzbrn zzbrnVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbrnVar);
        zzbp(4, zza);
    }
}
