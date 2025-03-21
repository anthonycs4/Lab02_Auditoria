package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbrf extends zzhq implements zzbrh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzA(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbdj zzB() throws RemoteException {
        Parcel zzbo = zzbo(26, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrt zzC() throws RemoteException {
        zzbrt zzbrrVar;
        Parcel zzbo = zzbo(27, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzbrt) {
                zzbrrVar = (zzbrt) queryLocalInterface;
            } else {
                zzbrrVar = new zzbrr(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzD(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzF(IObjectWrapper iObjectWrapper, zzbnn zzbnnVar, List<zzbnt> list) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbnnVar);
        zza.writeTypedList(list);
        zzbp(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzG(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbty zzH() throws RemoteException {
        Parcel zzbo = zzbo(33, zza());
        zzbty zzbtyVar = (zzbty) zzhs.zzc(zzbo, zzbty.CREATOR);
        zzbo.recycle();
        return zzbtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbty zzI() throws RemoteException {
        Parcel zzbo = zzbo(34, zza());
        zzbty zzbtyVar = (zzbty) zzhs.zzc(zzbo, zzbty.CREATOR);
        zzbo.recycle();
        return zzbtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzJ(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrn zzK() throws RemoteException {
        zzbrn zzbrlVar;
        Parcel zzbo = zzbo(36, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzbrn) {
                zzbrlVar = (zzbrn) queryLocalInterface;
            } else {
                zzbrlVar = new zzbrl(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrp zzM() throws RemoteException {
        zzbrp zzbrpVar;
        Parcel zzbo = zzbo(15, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzbrp) {
                zzbrpVar = (zzbrp) queryLocalInterface;
            } else {
                zzbrpVar = new zzbrp(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbrq zzN() throws RemoteException {
        zzbrq zzbrqVar;
        Parcel zzbo = zzbo(16, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbrq) {
                zzbrqVar = (zzbrq) queryLocalInterface;
            } else {
                zzbrqVar = new zzbrq(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zze(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbrk zzbrkVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzh() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzi() throws RemoteException {
        zzbp(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzj(IObjectWrapper iObjectWrapper, zzazx zzazxVar, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzk(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzl() throws RemoteException {
        zzbp(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzm() throws RemoteException {
        zzbp(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzn(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, zzbyg zzbygVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(null);
        zzhs.zzf(zza, zzbygVar);
        zza.writeString(str2);
        zzbp(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzo(zzazs zzazsVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zzbp(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzp() throws RemoteException {
        zzbp(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzq() throws RemoteException {
        Parcel zzbo = zzbo(13, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzr(IObjectWrapper iObjectWrapper, zzazs zzazsVar, String str, String str2, zzbrk zzbrkVar, zzbhy zzbhyVar, List<String> list) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazsVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzf(zza, zzbrkVar);
        zzhs.zzd(zza, zzbhyVar);
        zza.writeStringList(list);
        zzbp(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzv(zzazs zzazsVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzx() throws RemoteException {
        Parcel zzbo = zzbo(22, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzy(IObjectWrapper iObjectWrapper, zzbyg zzbygVar, List<String> list) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbygVar);
        zza.writeStringList(list);
        zzbp(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbja zzz() throws RemoteException {
        throw null;
    }
}
