package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqq {
    private final zzbmk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqq(zzbmk zzbmkVar) {
        this.zza = zzbmkVar;
    }

    private final void zzq(zzdqp zzdqpVar) throws RemoteException {
        String zza = zzdqp.zza(zzdqpVar);
        String valueOf = String.valueOf(zza);
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Dispatching AFMA event on publisher webview: ".concat(valueOf) : new String("Dispatching AFMA event on publisher webview: "));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzq(new zzdqp("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("creation", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "nativeObjectCreated";
        zzq(zzdqpVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("creation", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "nativeObjectNotCreated";
        zzq(zzdqpVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("interstitial", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onNativeAdObjectNotAvailable";
        zzq(zzdqpVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("interstitial", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onAdLoaded";
        zzq(zzdqpVar);
    }

    public final void zzf(long j, int i) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("interstitial", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onAdFailedToLoad";
        zzdqpVar.zzd = Integer.valueOf(i);
        zzq(zzdqpVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("interstitial", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onAdOpened";
        zzq(zzdqpVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("interstitial", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onAdClicked";
        this.zza.zzb(zzdqp.zza(zzdqpVar));
    }

    public final void zzi(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("interstitial", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onAdClosed";
        zzq(zzdqpVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onNativeAdObjectNotAvailable";
        zzq(zzdqpVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onRewardedAdLoaded";
        zzq(zzdqpVar);
    }

    public final void zzl(long j, int i) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onRewardedAdFailedToLoad";
        zzdqpVar.zzd = Integer.valueOf(i);
        zzq(zzdqpVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onRewardedAdOpened";
        zzq(zzdqpVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onRewardedAdFailedToShow";
        zzdqpVar.zzd = Integer.valueOf(i);
        zzq(zzdqpVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onRewardedAdClosed";
        zzq(zzdqpVar);
    }

    public final void zzp(long j, zzbyl zzbylVar) throws RemoteException {
        zzdqp zzdqpVar = new zzdqp("rewarded", null);
        zzdqpVar.zza = Long.valueOf(j);
        zzdqpVar.zzc = "onUserEarnedReward";
        zzdqpVar.zze = zzbylVar.zze();
        zzdqpVar.zzf = Integer.valueOf(zzbylVar.zzf());
        zzq(zzdqpVar);
    }
}
