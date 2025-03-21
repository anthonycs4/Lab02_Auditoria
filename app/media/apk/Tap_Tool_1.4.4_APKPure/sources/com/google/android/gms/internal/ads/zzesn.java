package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzesn implements zzeft<zzdmb> {
    final /* synthetic */ zzesp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesn(zzesp zzespVar) {
        this.zza = zzespVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final /* bridge */ /* synthetic */ void zzb(zzdmb zzdmbVar) {
        zzdmb zzdmbVar2;
        zzdmb zzdmbVar3 = zzdmbVar;
        synchronized (this.zza) {
            this.zza.zzd = zzdmbVar3;
            zzdmbVar2 = this.zza.zzd;
            zzdmbVar2.zzQ();
        }
    }
}
