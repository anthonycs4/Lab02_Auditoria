package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeeh extends zzbbt {
    private final Context zza;
    private final zzbbh zzb;
    private final zzetk zzc;
    private final zzcqo zzd;
    private final ViewGroup zze;

    public zzeeh(Context context, zzbbh zzbbhVar, zzetk zzetkVar, zzcqo zzcqoVar) {
        this.zza = context;
        this.zzb = zzbbhVar;
        this.zzc = zzetkVar;
        this.zzd = zzcqoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(zzcqoVar.zza(), com.google.android.gms.ads.internal.zzs.zze().zzj());
        frameLayout.setMinimumHeight(zzn().zzc);
        frameLayout.setMinimumWidth(zzn().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzA() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzB(zzbyb zzbybVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzC(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzD(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdj zzE() throws RemoteException {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzF(zzbey zzbeyVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzG(zzbdn zzbdnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzH(zzbad zzbadVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzI(zzaue zzaueVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzJ(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzO(zzbdd zzbddVar) {
        com.google.android.gms.ads.internal.util.zze.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
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

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzab(zzbcf zzbcfVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzbS() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zze(zzazs zzazsVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzf() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzg() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzh(zzbbh zzbbhVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzi(zzbcb zzbcbVar) throws RemoteException {
        zzefe zzefeVar = this.zzc.zzc;
        if (zzefeVar != null) {
            zzefeVar.zzo(zzbcbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzj(zzbby zzbbyVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final Bundle zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzl() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzm() throws RemoteException {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzazx zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzeto.zzb(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzo(zzazx zzazxVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcqo zzcqoVar = this.zzd;
        if (zzcqoVar != null) {
            zzcqoVar.zzb(this.zze, zzazxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzp(zzbvv zzbvvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzq(zzbvy zzbvyVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzr() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzs() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdg zzt() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzu() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbcb zzv() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbbh zzw() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzx(zzbgl zzbglVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzy(zzbbe zzbbeVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzz(boolean z) throws RemoteException {
        com.google.android.gms.ads.internal.util.zze.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
