package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeel implements zzeft<zzcqo> {
    final /* synthetic */ zzeem zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeel(zzeem zzeemVar) {
        this.zza = zzeemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final /* bridge */ /* synthetic */ void zzb(zzcqo zzcqoVar) {
        zzcqo zzcqoVar2;
        zzcqo zzcqoVar3;
        zzcqo zzcqoVar4;
        zzcqo zzcqoVar5 = zzcqoVar;
        synchronized (this.zza) {
            zzcqoVar2 = this.zza.zzg;
            if (zzcqoVar2 != null) {
                zzcqoVar4 = this.zza.zzg;
                zzcqoVar4.zzR();
            }
            this.zza.zzg = zzcqoVar5;
            zzcqoVar3 = this.zza.zzg;
            zzcqoVar3.zzQ();
        }
    }
}
