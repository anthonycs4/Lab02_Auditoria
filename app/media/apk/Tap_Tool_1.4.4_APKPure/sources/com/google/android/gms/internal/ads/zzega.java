package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzega implements zzfko<zzcsn> {
    final /* synthetic */ zzeft zza;
    final /* synthetic */ zzdfn zzb;
    final /* synthetic */ zzegb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzega(zzegb zzegbVar, zzeft zzeftVar, zzdfn zzdfnVar) {
        this.zzc = zzegbVar;
        this.zza = zzeftVar;
        this.zzb = zzdfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzcjz zzcjzVar;
        final zzazm zzg = this.zzb.zza().zzg(th);
        this.zzb.zzb().zzbM(zzg);
        zzcjzVar = this.zzc.zzb;
        zzcjzVar.zze().execute(new Runnable(this, zzg) { // from class: com.google.android.gms.internal.ads.zzefz
            private final zzega zza;
            private final zzazm zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzg;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzefr zzefrVar;
                zzega zzegaVar = this.zza;
                zzazm zzazmVar = this.zzb;
                zzefrVar = zzegaVar.zzc.zzd;
                zzefrVar.zze().zzbM(zzazmVar);
            }
        });
        zzeua.zza(zzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzcsn zzcsnVar) {
        zzefr zzefrVar;
        zzcjz zzcjzVar;
        zzcsn zzcsnVar2 = zzcsnVar;
        synchronized (this.zzc) {
            zzdac zzo = zzcsnVar2.zzo();
            zzefrVar = this.zzc.zzd;
            zzo.zza(zzefrVar.zzc());
            this.zza.zzb(zzcsnVar2);
            zzcjzVar = this.zzc.zzb;
            zzcjzVar.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzefy
                private final zzega zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzefr zzefrVar2;
                    zzefrVar2 = this.zza.zzc.zzd;
                    zzefrVar2.zzd().zzbN();
                }
            });
        }
    }
}
