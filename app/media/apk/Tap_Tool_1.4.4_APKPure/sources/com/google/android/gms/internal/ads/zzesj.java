package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesj extends zzbyn {
    private final zzesf zza;
    private final zzerw zzb;
    private final String zzc;
    private final zzetf zzd;
    private final Context zze;
    private zzdmb zzf;
    private boolean zzg = ((Boolean) zzbba.zzc().zzb(zzbfq.zzat)).booleanValue();

    public zzesj(String str, zzesf zzesfVar, Context context, zzerw zzerwVar, zzetf zzetfVar) {
        this.zzc = str;
        this.zza = zzesfVar;
        this.zzb = zzerwVar;
        this.zzd = zzetfVar;
        this.zze = context;
    }

    private final synchronized void zzt(zzazs zzazsVar, zzbyv zzbyvVar, int i) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzb(zzbyvVar);
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzK(this.zze) && zzazsVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzbM(zzeuf.zzd(4, null, null));
            return;
        }
        if (this.zzf != null) {
            return;
        }
        zzery zzeryVar = new zzery(null);
        this.zza.zzi(i);
        this.zza.zza(zzazsVar, this.zzc, zzeryVar, new zzesi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzc(zzazs zzazsVar, zzbyv zzbyvVar) throws RemoteException {
        zzt(zzazsVar, zzbyvVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzd(zzazs zzazsVar, zzbyv zzbyvVar) throws RemoteException {
        zzt(zzazsVar, zzbyvVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zze(zzbyr zzbyrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbyrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzf(zzbda zzbdaVar) {
        if (zzbdaVar == null) {
            this.zzb.zzm(null);
        } else {
            this.zzb.zzm(new zzesh(this, zzbdaVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmb zzdmbVar = this.zzf;
        return zzdmbVar != null ? zzdmbVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzh(zzbzc zzbzcVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzetf zzetfVar = this.zzd;
        zzetfVar.zza = zzbzcVar.zza;
        zzetfVar.zzb = zzbzcVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmb zzdmbVar = this.zzf;
        return (zzdmbVar == null || zzdmbVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized String zzj() throws RemoteException {
        zzdmb zzdmbVar = this.zzf;
        if (zzdmbVar == null || zzdmbVar.zzm() == null) {
            return null;
        }
        return this.zzf.zzm().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzf == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzi(zzeuf.zzd(9, null, null));
            return;
        }
        this.zzf.zza(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbyl zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmb zzdmbVar = this.zzf;
        if (zzdmbVar != null) {
            return zzdmbVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbdg zzm() {
        zzdmb zzdmbVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeS)).booleanValue() && (zzdmbVar = this.zzf) != null) {
            return zzdmbVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzn(zzbdd zzbddVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzn(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzo(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzp(zzbyw zzbywVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzq(zzbywVar);
    }
}
