package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeox implements zzeft<zzcqh> {
    final /* synthetic */ zzeoy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeox(zzeoy zzeoyVar) {
        this.zza = zzeoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final /* bridge */ /* synthetic */ void zzb(zzcqh zzcqhVar) {
        zzeoq zzeoqVar;
        zzeoq zzeoqVar2;
        zzcqh zzcqhVar2 = zzcqhVar;
        synchronized (this.zza) {
            zzcqh zzcqhVar3 = this.zza.zza;
            if (zzcqhVar3 != null) {
                zzcqhVar3.zzR();
            }
            zzeoy zzeoyVar = this.zza;
            zzeoyVar.zza = zzcqhVar2;
            zzcqhVar2.zza(zzeoyVar);
            zzeoqVar = this.zza.zzg;
            zzeoy zzeoyVar2 = this.zza;
            zzeoqVar2 = zzeoyVar2.zzg;
            zzeoqVar.zzm(new zzcqi(zzcqhVar2, zzeoyVar2, zzeoqVar2));
            zzcqhVar2.zzQ();
        }
    }
}
