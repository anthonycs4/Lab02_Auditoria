package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbri extends zzhq implements zzbrk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzf() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzh() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzi() throws RemoteException {
        zzbp(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzj() throws RemoteException {
        zzbp(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzk() throws RemoteException {
        zzbp(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbp(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzm(zzbja zzbjaVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbjaVar);
        zza.writeString(str);
        zzbp(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzn() throws RemoteException {
        zzbp(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzo() throws RemoteException {
        zzbp(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzp(zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzq() throws RemoteException {
        zzbp(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzr(zzbyl zzbylVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbylVar);
        zzbp(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzs(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzt() throws RemoteException {
        zzbp(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzu() throws RemoteException {
        zzbp(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzv(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbp(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzw(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzbp(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzx(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzy(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(24, zza);
    }
}
