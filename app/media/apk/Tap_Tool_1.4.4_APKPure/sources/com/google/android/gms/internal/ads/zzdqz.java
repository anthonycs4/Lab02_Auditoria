package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdqz extends zzbyu {
    final /* synthetic */ zzdrb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqz(zzdrb zzdrbVar) {
        this.zza = zzdrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i) throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzl(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        zzdqq zzdqqVar;
        long j;
        zzdqqVar = this.zza.zzc;
        j = this.zza.zza;
        zzdqqVar.zzl(j, zzazmVar.zza);
    }
}
