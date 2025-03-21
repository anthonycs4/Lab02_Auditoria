package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqw extends zzbbg {
    final /* synthetic */ zzdqq zza;
    final /* synthetic */ zzdqx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqw(zzdqx zzdqxVar, zzdqq zzdqqVar) {
        this.zzb = zzdqxVar;
        this.zza = zzdqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzb() throws RemoteException {
        long j;
        zzdqq zzdqqVar = this.zza;
        j = this.zzb.zza;
        zzdqqVar.zzi(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzc(int i) throws RemoteException {
        long j;
        zzdqq zzdqqVar = this.zza;
        j = this.zzb.zza;
        zzdqqVar.zzf(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzd(zzazm zzazmVar) throws RemoteException {
        long j;
        zzdqq zzdqqVar = this.zza;
        j = this.zzb.zza;
        zzdqqVar.zzf(j, zzazmVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzf() throws RemoteException {
        long j;
        zzdqq zzdqqVar = this.zza;
        j = this.zzb.zza;
        zzdqqVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzg() throws RemoteException {
        long j;
        zzdqq zzdqqVar = this.zza;
        j = this.zzb.zza;
        zzdqqVar.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzh() throws RemoteException {
        long j;
        zzdqq zzdqqVar = this.zza;
        j = this.zzb.zza;
        zzdqqVar.zzh(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzi() {
    }
}
