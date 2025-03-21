package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeem extends zzbbt implements zzcyu {
    private final Context zza;
    private final zzepe zzb;
    private final String zzc;
    private final zzefe zzd;
    private zzazx zze;
    private final zzetj zzf;
    private zzcqo zzg;

    public zzeem(Context context, zzazx zzazxVar, String str, zzepe zzepeVar, zzefe zzefeVar) {
        this.zza = context;
        this.zzb = zzepeVar;
        this.zze = zzazxVar;
        this.zzc = str;
        this.zzd = zzefeVar;
        this.zzf = zzepeVar.zzf();
        zzepeVar.zzh(this);
    }

    private final synchronized void zzM(zzazx zzazxVar) {
        this.zzf.zzc(zzazxVar);
        this.zzf.zzd(this.zze.zzn);
    }

    private final synchronized boolean zzN(zzazs zzazsVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzs.zzc();
        if (!com.google.android.gms.ads.internal.util.zzr.zzK(this.zza) || zzazsVar.zzs != null) {
            zzeua.zzb(this.zza, zzazsVar.zzf);
            return this.zzb.zza(zzazsVar, this.zzc, null, new zzeel(this));
        }
        com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
        zzefe zzefeVar = this.zzd;
        if (zzefeVar != null) {
            zzefeVar.zzbM(zzeuf.zzd(4, null, null));
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zzA() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzB(zzbyb zzbybVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzbdj zzE() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            return zzcqoVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzF(zzbey zzbeyVar) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzf.zzh(zzbeyVar);
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
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzO(zzbdd zzbddVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzd.zzp(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzP(zzazs zzazsVar, zzbbk zzbbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzR(zzbci zzbciVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zza() {
        if (this.zzb.zzg()) {
            zzazx zze = this.zzf.zze();
            zzcqo zzcqoVar = this.zzg;
            if (zzcqoVar != null && zzcqoVar.zzf() != null && this.zzf.zzv()) {
                zze = zzeto.zzb(this.zza, Collections.singletonList(this.zzg.zzf()));
            }
            zzM(zze);
            try {
                zzN(this.zzf.zzb());
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Failed to refresh the banner ad.");
                return;
            }
        }
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzab(zzbcf zzbcfVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzN(zzbcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzb.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzbS() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            zzcqoVar.zzR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zze(zzazs zzazsVar) throws RemoteException {
        zzM(this.zze);
        return zzN(zzazsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzf() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            zzcqoVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            zzcqoVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzh(zzbbh zzbbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzd.zzn(zzbbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzi(zzbcb zzbcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzd.zzo(zzbcbVar);
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
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzm() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            zzcqoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzazx zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            return zzeto.zzb(this.zza, Collections.singletonList(zzcqoVar.zze()));
        }
        return this.zzf.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzo(zzazx zzazxVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzazxVar);
        this.zze = zzazxVar;
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar != null) {
            zzcqoVar.zzb(this.zzb.zzc(), zzazxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzp(zzbvv zzbvvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzq(zzbvy zzbvyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzr() {
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar == null || zzcqoVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzs() {
        zzcqo zzcqoVar = this.zzg;
        if (zzcqoVar == null || zzcqoVar.zzm() == null) {
            return null;
        }
        return this.zzg.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzbdg zzt() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeS)).booleanValue()) {
            zzcqo zzcqoVar = this.zzg;
            if (zzcqoVar == null) {
                return null;
            }
            return zzcqoVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbcb zzv() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbbh zzw() {
        return this.zzd.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzx(zzbgl zzbglVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzd(zzbglVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzy(zzbbe zzbbeVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzb.zze(zzbbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzz(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzf.zzj(z);
    }
}
