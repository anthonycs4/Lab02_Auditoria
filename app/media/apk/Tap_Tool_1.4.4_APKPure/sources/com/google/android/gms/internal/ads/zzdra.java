package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdra extends zzbyq {
    final /* synthetic */ zzdrb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdra(zzdrb zzdrbVar) {
        this.zza = zzdrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze() throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf() throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(zzbyl zzbylVar) throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzp(j, zzbylVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(int i) throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzn(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(zzazm zzazmVar) throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzn(j, zzazmVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj() {
    }
}
