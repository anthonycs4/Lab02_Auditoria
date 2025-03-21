package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbqn {
    private final zzbpq zza;
    private zzfla<zzbpr> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqn(zzbpq zzbpqVar) {
        this.zza = zzbpqVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcde zzcdeVar = new zzcde();
            this.zzb = zzcdeVar;
            this.zza.zzb(null).zze(new zzcdi(zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzbqj
                private final zzcde zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzcdeVar;
                }

                @Override // com.google.android.gms.internal.ads.zzcdi
                public final void zza(Object obj) {
                    this.zza.zzc((zzbpr) obj);
                }
            }, new zzcdg(zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzbqk
                private final zzcde zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzcdeVar;
                }

                @Override // com.google.android.gms.internal.ads.zzcdg
                public final void zza() {
                    this.zza.zzd(new zzbpt("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> zzbqq<I, O> zza(String str, zzbpx<I> zzbpxVar, zzbpw<O> zzbpwVar) {
        zzd();
        return new zzbqq<>(this.zzb, "google.afma.activeView.handleUpdate", zzbpxVar, zzbpwVar);
    }

    public final void zzb(final String str, final zzblp<? super zzbpr> zzblpVar) {
        zzd();
        this.zzb = zzfks.zzi(this.zzb, new zzfjz(str, zzblpVar) { // from class: com.google.android.gms.internal.ads.zzbql
            private final String zza;
            private final zzblp zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = zzblpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                zzbpr zzbprVar = (zzbpr) obj;
                zzbprVar.zzl(this.zza, this.zzb);
                return zzfks.zza(zzbprVar);
            }
        }, zzccz.zzf);
    }

    public final void zzc(final String str, final zzblp<? super zzbpr> zzblpVar) {
        this.zzb = zzfks.zzj(this.zzb, new zzfei(str, zzblpVar) { // from class: com.google.android.gms.internal.ads.zzbqm
            private final String zza;
            private final zzblp zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = zzblpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                zzbpr zzbprVar = (zzbpr) obj;
                zzbprVar.zzm(this.zza, this.zzb);
                return zzbprVar;
            }
        }, zzccz.zzf);
    }
}
