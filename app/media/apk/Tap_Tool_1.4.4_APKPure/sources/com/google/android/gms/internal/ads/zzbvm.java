package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbvm extends zzhq implements zzbvo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zze() throws RemoteException {
        zzbp(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzf() throws RemoteException {
        zzbp(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final boolean zzg() throws RemoteException {
        Parcel zzbo = zzbo(11, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, bundle);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzi() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzj() throws RemoteException {
        zzbp(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzk() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzl() throws RemoteException {
        zzbp(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzhs.zzd(zza, intent);
        zzbp(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, bundle);
        Parcel zzbo = zzbo(6, zza);
        if (zzbo.readInt() != 0) {
            bundle.readFromParcel(zzbo);
        }
        zzbo.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzp() throws RemoteException {
        zzbp(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzq() throws RemoteException {
        zzbp(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzs() throws RemoteException {
        zzbp(9, zza());
    }
}
