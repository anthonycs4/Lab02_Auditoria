package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeoq implements zzcwk, zzcye, zzeqg, com.google.android.gms.ads.internal.overlay.zzo, zzcyp {
    private final zzeur zza;
    private final AtomicReference<zzaue> zzb = new AtomicReference<>();
    private final AtomicReference<zzauf> zzc = new AtomicReference<>();
    private final AtomicReference<zzaui> zzd = new AtomicReference<>();
    private final AtomicReference<zzcye> zze = new AtomicReference<>();
    private final AtomicReference<com.google.android.gms.ads.internal.overlay.zzo> zzf = new AtomicReference<>();
    private final AtomicReference<zzbdd> zzg = new AtomicReference<>();
    private zzeoq zzh = null;

    public zzeoq(zzeur zzeurVar) {
        this.zza = zzeurVar;
    }

    public static zzeoq zzf(zzeoq zzeoqVar) {
        zzeoq zzeoqVar2 = new zzeoq(zzeoqVar.zza);
        zzeoqVar2.zzh = zzeoqVar;
        return zzeoqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzK() {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar != null) {
            zzeoqVar.zzK();
        } else {
            zzepy.zza(this.zze, zzeom.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar != null) {
            zzeoqVar.zzbB();
        } else {
            zzepy.zza(this.zzf, zzeog.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(final int i) {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar != null) {
            zzeoqVar.zzbD(i);
        } else {
            zzepy.zza(this.zzf, new zzepx(i) { // from class: com.google.android.gms.internal.ads.zzeof
                private final int zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = i;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbD(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar != null) {
            zzeoqVar.zzby();
            return;
        }
        zzepy.zza(this.zzf, zzeon.zza);
        zzepy.zza(this.zzd, zzeoo.zza);
        zzepy.zza(this.zzd, zzeop.zza);
    }

    public final void zzg(zzaue zzaueVar) {
        this.zzb.set(zzaueVar);
    }

    public final void zzh(zzaui zzauiVar) {
        this.zzd.set(zzauiVar);
    }

    public final void zzi(zzcye zzcyeVar) {
        this.zze.set(zzcyeVar);
    }

    public final void zzj(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzk(final zzazz zzazzVar) {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar != null) {
            zzeoqVar.zzk(zzazzVar);
        } else {
            zzepy.zza(this.zzg, new zzepx(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzeoe
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

    public final void zzl(zzbdd zzbddVar) {
        this.zzg.set(zzbddVar);
    }

    public final void zzn() {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar != null) {
            zzeoqVar.zzn();
            return;
        }
        this.zza.zzb();
        zzepy.zza(this.zzc, zzeok.zza);
        zzepy.zza(this.zzd, zzeol.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeqg
    public final void zzo(zzeqg zzeqgVar) {
        this.zzh = (zzeoq) zzeqgVar;
    }

    public final void zzp(zzauf zzaufVar) {
        this.zzc.set(zzaufVar);
    }

    public final void zzm(final zzaub zzaubVar) {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar == null) {
            zzepy.zza(this.zzb, new zzepx(zzaubVar) { // from class: com.google.android.gms.internal.ads.zzeoh
                private final zzaub zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzaubVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzaue) obj).zzb(this.zza);
                }
            });
        } else {
            zzeoqVar.zzm(zzaubVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(final zzazm zzazmVar) {
        zzeoq zzeoqVar = this.zzh;
        if (zzeoqVar == null) {
            zzepy.zza(this.zzb, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzeoi
                private final zzazm zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzazmVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzaue) obj).zzd(this.zza);
                }
            });
            zzepy.zza(this.zzb, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzeoj
                private final zzazm zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzazmVar;
                }

                @Override // com.google.android.gms.internal.ads.zzepx
                public final void zza(Object obj) {
                    ((zzaue) obj).zzc(this.zza.zza);
                }
            });
            return;
        }
        zzeoqVar.zzbM(zzazmVar);
    }
}
