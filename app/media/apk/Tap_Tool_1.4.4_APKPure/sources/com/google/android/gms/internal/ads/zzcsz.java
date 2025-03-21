package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsz implements zzfko<zzcsu> {
    final /* synthetic */ zzfko zza;
    final /* synthetic */ zzctb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsz(zzctb zzctbVar, zzfko zzfkoVar) {
        this.zzb = zzctbVar;
        this.zza = zzfkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzccz.zze.execute(new Runnable(this.zzb) { // from class: com.google.android.gms.internal.ads.zzcsy
            private final zzctb zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzcsu zzcsuVar) {
        zzctb.zze(this.zzb, zzcsuVar.zza, this.zza);
    }
}
