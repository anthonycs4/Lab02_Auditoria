package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbo extends zzhq implements zzbbq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final zzbbn zze() throws RemoteException {
        zzbbn zzbblVar;
        Parcel zzbo = zzbo(1, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzbbn) {
                zzbblVar = (zzbbn) queryLocalInterface;
            } else {
                zzbblVar = new zzbbl(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzf(zzbbh zzbbhVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbbhVar);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzg(zzbje zzbjeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzh(zzbjh zzbjhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzi(String str, zzbjn zzbjnVar, zzbjk zzbjkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzhs.zzf(zza, zzbjnVar);
        zzhs.zzf(zza, zzbjkVar);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzj(zzbhy zzbhyVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbhyVar);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzk(zzbjr zzbjrVar, zzazx zzazxVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbjrVar);
        zzhs.zzd(zza, zzazxVar);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzm(zzbju zzbjuVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbjuVar);
        zzbp(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzn(zzbnv zzbnvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzo(zzboe zzboeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, adManagerAdViewOptions);
        zzbp(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzq(zzbcf zzbcfVar) throws RemoteException {
        throw null;
    }
}
