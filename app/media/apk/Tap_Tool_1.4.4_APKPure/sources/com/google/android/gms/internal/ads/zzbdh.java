package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdh extends zzhq implements zzbdj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzf() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzh() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final int zzi() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        int readInt = zzbo.readInt();
        zzbo.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzl(zzbdm zzbdmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbdmVar);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzm() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzn() throws RemoteException {
        Parcel zzbo = zzbo(10, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final zzbdm zzo() throws RemoteException {
        zzbdm zzbdkVar;
        Parcel zzbo = zzbo(11, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbdkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof zzbdm) {
                zzbdkVar = (zzbdm) queryLocalInterface;
            } else {
                zzbdkVar = new zzbdk(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzp() throws RemoteException {
        Parcel zzbo = zzbo(12, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzq() throws RemoteException {
        zzbp(13, zza());
    }
}
