package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefm extends zzbbt {
    private final zzazx zza;
    private final Context zzb;
    private final zzeqx zzc;
    private final String zzd;
    private final zzefe zze;
    private final zzerw zzf;
    private zzddu zzg;
    private boolean zzh = ((Boolean) zzbba.zzc().zzb(zzbfq.zzat)).booleanValue();

    public zzefm(Context context, zzazx zzazxVar, String str, zzeqx zzeqxVar, zzefe zzefeVar, zzerw zzerwVar) {
        this.zza = zzazxVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzeqxVar;
        this.zze = zzefeVar;
        this.zzf = zzerwVar;
    }

    private final synchronized boolean zzM() {
        boolean z;
        zzddu zzdduVar = this.zzg;
        if (zzdduVar != null) {
            z = zzdduVar.zzb() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zzA() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzB(zzbyb zzbybVar) {
        this.zzf.zzp(zzbybVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdj zzE() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzF(zzbey zzbeyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzG(zzbdn zzbdnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzH(zzbad zzbadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzI(zzaue zzaueVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzJ(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzO(zzbdd zzbddVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zze.zzp(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzP(zzazs zzazsVar, zzbbk zzbbkVar) {
        this.zze.zzr(zzbbkVar);
        zze(zzazsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzQ(IObjectWrapper iObjectWrapper) {
        if (this.zzg == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Interstitial can not be shown before loaded.");
            this.zze.zzi(zzeuf.zzd(9, null, null));
            return;
        }
        this.zzg.zza(this.zzh, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzR(zzbci zzbciVar) {
        this.zze.zzs(zzbciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzab(zzbcf zzbcfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zzbS() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzddu zzdduVar = this.zzg;
        if (zzdduVar != null) {
            zzdduVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zze(zzazs zzazsVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzs.zzc();
        if (!com.google.android.gms.ads.internal.util.zzr.zzK(this.zzb) || zzazsVar.zzs != null) {
            if (zzM()) {
                return false;
            }
            zzeua.zzb(this.zzb, zzazsVar.zzf);
            this.zzg = null;
            return this.zzc.zza(zzazsVar, this.zzd, new zzeqq(this.zza), new zzefl(this));
        }
        com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
        zzefe zzefeVar = this.zze;
        if (zzefeVar != null) {
            zzefeVar.zzbM(zzeuf.zzd(4, null, null));
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzf() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzddu zzdduVar = this.zzg;
        if (zzdduVar != null) {
            zzdduVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzddu zzdduVar = this.zzg;
        if (zzdduVar != null) {
            zzdduVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzh(zzbbh zzbbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zze.zzn(zzbbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzi(zzbcb zzbcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zze.zzo(zzbcbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzj(zzbby zzbbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final Bundle zzk() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzl() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        zzddu zzdduVar = this.zzg;
        if (zzdduVar == null) {
            return;
        }
        zzdduVar.zza(this.zzh, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzazx zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzo(zzazx zzazxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzp(zzbvv zzbvvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzq(zzbvy zzbvyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzr() {
        zzddu zzdduVar = this.zzg;
        if (zzdduVar == null || zzdduVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzs() {
        zzddu zzdduVar = this.zzg;
        if (zzdduVar == null || zzdduVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzbdg zzt() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeS)).booleanValue()) {
            zzddu zzdduVar = this.zzg;
            if (zzdduVar == null) {
                return null;
            }
            return zzdduVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzu() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbcb zzv() {
        return this.zze.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbbh zzw() {
        return this.zze.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzx(zzbgl zzbglVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbglVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzy(zzbbe zzbbeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzz(boolean z) {
    }
}
