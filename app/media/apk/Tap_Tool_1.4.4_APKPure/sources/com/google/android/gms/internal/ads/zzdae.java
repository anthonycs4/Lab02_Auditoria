package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdae extends zzfaw implements zzcwh, zzazi, zzajc, zzcyp, zzcwz, zzcye, com.google.android.gms.ads.internal.overlay.zzo, zzcwv {
    private final zzdac zza = new zzdac(this, null);
    @Nullable
    private zzefe zzb;
    @Nullable
    private zzefi zzc;
    @Nullable
    private zzeoq zzd;
    @Nullable
    private zzerw zze;

    public static /* synthetic */ zzefe zzm(zzdae zzdaeVar, zzefe zzefeVar) {
        zzdaeVar.zzb = zzefeVar;
        return zzefeVar;
    }

    public static /* synthetic */ zzefi zzn(zzdae zzdaeVar, zzefi zzefiVar) {
        zzdaeVar.zzc = zzefiVar;
        return zzefiVar;
    }

    public static /* synthetic */ zzeoq zzo(zzdae zzdaeVar, zzeoq zzeoqVar) {
        zzdaeVar.zzd = zzeoqVar;
        return zzeoqVar;
    }

    public static /* synthetic */ zzerw zzp(zzdae zzdaeVar, zzerw zzerwVar) {
        zzdaeVar.zze = zzerwVar;
        return zzerwVar;
    }

    private static <T> void zzq(T t, zzdad<T> zzdadVar) {
        if (t != null) {
            zzdadVar.zza(t);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        zzq(this.zzb, zzczc.zza);
        zzq(this.zzc, zzczd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzK() {
        zzq(this.zzd, zzczj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, String str2) {
        zzq(this.zzb, new zzdad(str, str2) { // from class: com.google.android.gms.internal.ads.zzcze
            private final String zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzefe) obj).zza(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
        zzq(this.zzd, zzczq.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzq(this.zzd, zzczr.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        zzq(this.zzd, new zzdad(i) { // from class: com.google.android.gms.internal.ads.zzczp
            private final int zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = i;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzeoq) obj).zzbD(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
        zzq(this.zzd, zzczs.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzq(this.zzd, zzczo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        zzq(this.zzb, zzczi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
        zzq(this.zzb, zzcyz.zza);
        zzq(this.zze, zzczk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
        zzq(this.zzb, zzczt.zza);
        zzq(this.zze, zzczu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
        zzq(this.zzb, zzczv.zza);
        zzq(this.zze, zzczw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
        zzq(this.zzb, new zzdad(zzbxvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczz
            private final zzbxv zza;
            private final String zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbxvVar;
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                zzefe zzefeVar = (zzefe) obj;
            }
        });
        zzq(this.zze, new zzdad(zzbxvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdaa
            private final zzbxv zza;
            private final String zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbxvVar;
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzerw) obj).zzf(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
        zzq(this.zzb, zzczx.zza);
        zzq(this.zze, zzczy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
        zzq(this.zzb, zzcza.zza);
        zzq(this.zze, zzczb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwv
    public final void zzi(zzazm zzazmVar) {
        zzq(this.zze, new zzdad(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzczm
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzerw) obj).zzi(this.zza);
            }
        });
        zzq(this.zzb, new zzdad(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzczn
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzefe) obj).zzi(this.zza);
            }
        });
    }

    public final zzdac zzj() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzk(zzazz zzazzVar) {
        zzq(this.zzb, new zzdad(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzczf
            private final zzazz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzefe) obj).zzk(this.zza);
            }
        });
        zzq(this.zze, new zzdad(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzczg
            private final zzazz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzerw) obj).zzk(this.zza);
            }
        });
        zzq(this.zzd, new zzdad(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzczh
            private final zzazz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzeoq) obj).zzk(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final void zzl() {
        zzq(this.zze, zzczl.zza);
    }
}
