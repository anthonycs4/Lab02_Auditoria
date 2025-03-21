package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesi implements zzeft<zzdmb> {
    final /* synthetic */ zzesj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesi(zzesj zzesjVar) {
        this.zza = zzesjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final /* bridge */ /* synthetic */ void zzb(zzdmb zzdmbVar) {
        zzdmb zzdmbVar2;
        zzdmb zzdmbVar3 = zzdmbVar;
        synchronized (this.zza) {
            this.zza.zzf = zzdmbVar3;
            zzdmbVar2 = this.zza.zzf;
            zzdmbVar2.zzQ();
        }
    }
}
