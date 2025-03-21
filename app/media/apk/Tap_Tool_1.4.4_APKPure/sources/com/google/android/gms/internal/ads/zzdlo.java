package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlo implements zzazi, zzbkq, com.google.android.gms.ads.internal.overlay.zzo, zzbks, com.google.android.gms.ads.internal.overlay.zzv {
    private zzazi zza;
    private zzbkq zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbks zzd;
    private com.google.android.gms.ads.internal.overlay.zzv zze;

    private zzdlo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdlo(zzdlj zzdljVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh(zzazi zzaziVar, zzbkq zzbkqVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbks zzbksVar, com.google.android.gms.ads.internal.overlay.zzv zzvVar) {
        this.zza = zzaziVar;
        this.zzb = zzbkqVar;
        this.zzc = zzoVar;
        this.zzd = zzbksVar;
        this.zze = zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final synchronized void onAdClicked() {
        zzazi zzaziVar = this.zza;
        if (zzaziVar != null) {
            zzaziVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final synchronized void zza(String str, Bundle bundle) {
        zzbkq zzbkqVar = this.zzb;
        if (zzbkqVar != null) {
            zzbkqVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbB() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbB();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbD(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbD(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final synchronized void zzbL(String str, String str2) {
        zzbks zzbksVar = this.zzd;
        if (zzbksVar != null) {
            zzbksVar.zzbL(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbT() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbT();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzv
    public final synchronized void zzf() {
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zze;
        if (zzvVar != null) {
            zzvVar.zzf();
        }
    }
}
