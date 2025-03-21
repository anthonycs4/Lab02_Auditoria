package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbsg extends zzbrj {
    private final Adapter zza;
    private final zzbyg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsg(Adapter adapter, zzbyg zzbygVar) {
        this.zza = adapter;
        this.zzb = zzbygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zze() throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzf() throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzg(int i) throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzm(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzi() throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzj() throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzm(zzbja zzbjaVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzo() throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzp(zzbyh zzbyhVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzr(zzbyl zzbylVar) throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzk(ObjectWrapper.wrap(this.zza), new zzbyh(zzbylVar.zze(), zzbylVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzs(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzt() throws RemoteException {
        zzbyg zzbygVar = this.zzb;
        if (zzbygVar != null) {
            zzbygVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzw(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzx(zzazm zzazmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzy(zzazm zzazmVar) {
    }
}
