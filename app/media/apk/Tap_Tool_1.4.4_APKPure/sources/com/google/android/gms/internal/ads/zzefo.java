package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefo implements zzeft<zzcsn> {
    final /* synthetic */ zzefp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefo(zzefp zzefpVar) {
        this.zza = zzefpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeft
    public final /* bridge */ /* synthetic */ void zzb(zzcsn zzcsnVar) {
        synchronized (this.zza) {
            this.zza.zzc = zzcsnVar.zzm();
            zzcsnVar.zzQ();
        }
    }
}
