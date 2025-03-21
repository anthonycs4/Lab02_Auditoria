package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzerw extends zzfaw implements zzcxt, zzcwk, zzcwh, zzcwv, zzcyp, zzeqg {
    private final zzeur zza;
    private final AtomicReference<zzfaw> zzb = new AtomicReference<>();
    private final AtomicReference<zzbyv> zzc = new AtomicReference<>();
    private final AtomicReference<zzbyr> zzd = new AtomicReference<>();
    private final AtomicReference<zzbyb> zze = new AtomicReference<>();
    private final AtomicReference<zzbyw> zzf = new AtomicReference<>();
    private final AtomicReference<zzbxw> zzg = new AtomicReference<>();
    private final AtomicReference<zzbdd> zzh = new AtomicReference<>();
    private zzerw zzi = null;

    public zzerw(zzeur zzeurVar) {
        this.zza = zzeurVar;
    }

    public final void zzb(zzbyv zzbyvVar) {
        this.zzc.set(zzbyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar != null) {
            zzerwVar.zzd();
            return;
        }
        this.zza.zzb();
        zzepy.zza(this.zzd, zzeru.zza);
        zzepy.zza(this.zze, zzerv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwv
    public final void zzi(final zzazm zzazmVar) {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar != null) {
            zzerwVar.zzi(zzazmVar);
            return;
        }
        zzepy.zza(this.zzd, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzerj
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbyr) obj).zzi(this.zza);
            }
        });
        zzepy.zza(this.zzd, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzerk
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbyr) obj).zzh(this.zza.zza);
            }
        });
    }

    public final void zzj(zzbyr zzbyrVar) {
        this.zzd.set(zzbyrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzk(final zzazz zzazzVar) {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar != null) {
            zzerwVar.zzk(zzazzVar);
        } else {
            zzepy.zza(this.zzh, new zzepx(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzern
                private final zzazz zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzazzVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzbdd) obj).zze(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final void zzl() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar != null) {
            zzerwVar.zzl();
        } else {
            zzepy.zza(this.zzb, zzerl.zza);
        }
    }

    public final void zzm(zzfaw zzfawVar) {
        this.zzb.set(zzfawVar);
    }

    public final void zzn(zzbdd zzbddVar) {
        this.zzh.set(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqg
    public final void zzo(zzeqg zzeqgVar) {
        this.zzi = (zzerw) zzeqgVar;
    }

    @Deprecated
    public final void zzp(zzbyb zzbybVar) {
        this.zze.set(zzbybVar);
    }

    public final void zzq(zzbyw zzbywVar) {
        this.zzf.set(zzbywVar);
    }

    @Deprecated
    public final void zzr(zzbxw zzbxwVar) {
        this.zzg.set(zzbxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            zzepy.zza(this.zze, zzerc.zza);
        } else {
            zzerwVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            zzepy.zza(this.zze, zzerd.zza);
        } else {
            zzerwVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            zzepy.zza(this.zze, zzeri.zza);
        } else {
            zzerwVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            zzepy.zza(this.zzc, zzerb.zza);
            zzepy.zza(this.zze, zzerm.zza);
            return;
        }
        zzerwVar.zzbN();
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            zzepy.zza(this.zzd, zzerr.zza);
            zzepy.zza(this.zze, zzers.zza);
            zzepy.zza(this.zzd, zzert.zza);
            return;
        }
        zzerwVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(final zzazm zzazmVar) {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            final int i = zzazmVar.zza;
            zzepy.zza(this.zzc, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzero
                private final zzazm zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzazmVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzbyv) obj).zzg(this.zza);
                }
            });
            zzepy.zza(this.zzc, new zzepx(i) { // from class: com.google.android.gms.internal.ads.zzerp
                private final int zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = i;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzbyv) obj).zzf(this.zza);
                }
            });
            zzepy.zza(this.zze, new zzepx(i) { // from class: com.google.android.gms.internal.ads.zzerq
                private final int zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = i;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzbyb) obj).zzk(this.zza);
                }
            });
            return;
        }
        zzerwVar.zzbM(zzazmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzf(final zzbxv zzbxvVar, final String str, final String str2) {
        zzerw zzerwVar = this.zzi;
        if (zzerwVar == null) {
            zzepy.zza(this.zzd, new zzepx(zzbxvVar) { // from class: com.google.android.gms.internal.ads.zzere
                private final zzbxv zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzbxvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    zzbxv zzbxvVar2 = this.zza;
                    ((zzbyr) obj).zzg(new zzbzf(zzbxvVar2.zzb(), zzbxvVar2.zzc()));
                }
            });
            zzepy.zza(this.zzf, new zzepx(zzbxvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzerf
                private final zzbxv zza;
                private final String zzb;
                private final String zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzbxvVar;
                    this.zzb = str;
                    this.zzc = str2;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    zzbxv zzbxvVar2 = this.zza;
                    ((zzbyw) obj).zze(new zzbzf(zzbxvVar2.zzb(), zzbxvVar2.zzc()), this.zzb, this.zzc);
                }
            });
            zzepy.zza(this.zze, new zzepx(zzbxvVar) { // from class: com.google.android.gms.internal.ads.zzerg
                private final zzbxv zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzbxvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzbyb) obj).zzi(this.zza);
                }
            });
            zzepy.zza(this.zzg, new zzepx(zzbxvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzerh
                private final zzbxv zza;
                private final String zzb;
                private final String zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzbxvVar;
                    this.zzb = str;
                    this.zzc = str2;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzbxw) obj).zze(this.zza, this.zzb, this.zzc);
                }
            });
            return;
        }
        zzerwVar.zzf(zzbxvVar, str, str2);
    }
}
