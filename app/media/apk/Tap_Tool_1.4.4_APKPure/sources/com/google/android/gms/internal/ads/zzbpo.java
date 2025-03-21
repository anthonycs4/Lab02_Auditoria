package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpo implements zzcdi<zzbol> {
    final /* synthetic */ zzbpp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpo(zzbpp zzbppVar) {
        this.zza = zzbppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final /* bridge */ /* synthetic */ void zza(zzbol zzbolVar) {
        final zzbol zzbolVar2 = zzbolVar;
        zzccz.zze.execute(new Runnable(this, zzbolVar2) { // from class: com.google.android.gms.internal.ads.zzbpn
            private final zzbpo zza;
            private final zzbol zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbolVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbol zzbolVar3 = this.zzb;
                zzbolVar3.zzm("/result", zzblo.zzp);
                zzbolVar3.zzi();
            }
        });
    }
}
