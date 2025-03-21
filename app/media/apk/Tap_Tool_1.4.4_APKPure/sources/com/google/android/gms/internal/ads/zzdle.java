package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdle extends zzbkc {
    private final String zza;
    private final zzdgu zzb;
    private final zzdgz zzc;

    public zzdle(String str, zzdgu zzdguVar, zzdgz zzdgzVar) {
        this.zza = str;
        this.zzb = zzdguVar;
        this.zzc = zzdgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final boolean zzA() throws RemoteException {
        return (this.zzc.zzC().isEmpty() || this.zzc.zzD() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzB(zzbct zzbctVar) throws RemoteException {
        this.zzb.zzu(zzbctVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzC(zzbcp zzbcpVar) throws RemoteException {
        this.zzb.zzv(zzbcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzD() {
        this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzE() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbih zzF() throws RemoteException {
        return this.zzb.zzF().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final boolean zzG() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbdg zzH() throws RemoteException {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeS)).booleanValue()) {
            return this.zzb.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzI(zzbdd zzbddVar) throws RemoteException {
        this.zzb.zzG(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zze() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final List<?> zzf() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzg() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbik zzh() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzi() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzj() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final double zzk() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzl() throws RemoteException {
        return this.zzc.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzm() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbdj zzn() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzp() throws RemoteException {
        this.zzb.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbic zzq() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final IObjectWrapper zzu() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final IObjectWrapper zzv() throws RemoteException {
        return this.zzc.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzx(zzbka zzbkaVar) throws RemoteException {
        this.zzb.zzs(zzbkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzy() throws RemoteException {
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final List<?> zzz() throws RemoteException {
        if (zzA()) {
            return this.zzc.zzC();
        }
        return Collections.emptyList();
    }
}
