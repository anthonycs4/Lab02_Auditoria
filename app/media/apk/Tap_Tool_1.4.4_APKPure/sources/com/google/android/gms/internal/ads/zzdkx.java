package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdkx extends zzbiu {
    private final String zza;
    private final zzdgu zzb;
    private final zzdgz zzc;

    public zzdkx(String str, zzdgu zzdguVar, zzdgz zzdgzVar) {
        this.zza = str;
        this.zzb = zzdguVar;
        this.zzc = zzdgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final String zzc() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final List<?> zzd() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final String zze() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final zzbik zzf() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final double zzh() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final String zzi() throws RemoteException {
        return this.zzc.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final String zzj() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final Bundle zzk() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zzl() throws RemoteException {
        this.zzb.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final zzbdj zzm() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zzn(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final boolean zzo(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final zzbic zzq() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final IObjectWrapper zzr() throws RemoteException {
        return this.zzc.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final String zzs() throws RemoteException {
        return this.zza;
    }
}
