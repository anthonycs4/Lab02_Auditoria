package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbrc extends zzhq implements zzbre {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final zzbrh zzb(String str) throws RemoteException {
        zzbrh zzbrfVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(1, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzbrh) {
                zzbrfVar = (zzbrh) queryLocalInterface;
            } else {
                zzbrfVar = new zzbrf(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbrfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final boolean zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(2, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(4, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final zzbtl zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(3, zza);
        zzbtl zzb = zzbtk.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }
}
