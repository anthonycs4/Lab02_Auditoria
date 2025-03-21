package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefl implements zzeft<zzddu> {
    final /* synthetic */ zzefm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefl(zzefm zzefmVar) {
        this.zza = zzefmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final /* bridge */ /* synthetic */ void zzb(zzddu zzdduVar) {
        zzddu zzdduVar2;
        zzddu zzdduVar3 = zzdduVar;
        synchronized (this.zza) {
            this.zza.zzg = zzdduVar3;
            zzdduVar2 = this.zza.zzg;
            zzdduVar2.zzQ();
        }
    }
}
