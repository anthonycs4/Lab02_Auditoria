package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaiz extends zzhq implements zzajb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzf() throws RemoteException {
        zzbp(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbp(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(7, zza);
    }
}
