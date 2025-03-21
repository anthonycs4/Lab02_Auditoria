package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeek extends zzbbm {
    private final zzefp zza;

    public zzeek(Context context, zzcjz zzcjzVar, zzetj zzetjVar, zzdhk zzdhkVar, zzbbh zzbbhVar) {
        zzefr zzefrVar = new zzefr(zzdhkVar, zzcjzVar.zzd());
        zzefrVar.zza(zzbbhVar);
        this.zza = new zzefp(new zzegb(zzcjzVar, context, zzefrVar, zzetjVar), zzetjVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zze(zzazs zzazsVar) throws RemoteException {
        this.zza.zzb(zzazsVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final synchronized void zzi(zzazs zzazsVar, int i) throws RemoteException {
        this.zza.zzb(zzazsVar, i);
    }
}
