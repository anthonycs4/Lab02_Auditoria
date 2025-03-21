package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcta implements zzfko<zzcsn> {
    final /* synthetic */ zzfko zza;
    final /* synthetic */ zzctb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcta(zzctb zzctbVar, zzfko zzfkoVar) {
        this.zzb = zzctbVar;
        this.zza = zzfkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
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
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzcsn zzcsnVar) {
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
        this.zza.zzb(zzcsnVar);
    }
}
