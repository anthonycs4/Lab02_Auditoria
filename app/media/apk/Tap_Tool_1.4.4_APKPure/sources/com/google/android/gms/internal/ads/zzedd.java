package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzedd extends zzbrj {
    private final zzcwf zza;
    private final zzcwx zzb;
    private final zzcxm zzc;
    private final zzcxr zzd;
    private final zzdar zze;
    private final zzcyk zzf;
    private final zzddr zzg;
    private final zzdan zzh;
    private final zzcws zzi;

    public zzedd(zzcwf zzcwfVar, zzcwx zzcwxVar, zzcxm zzcxmVar, zzcxr zzcxrVar, zzdar zzdarVar, zzcyk zzcykVar, zzddr zzddrVar, zzdan zzdanVar, zzcws zzcwsVar) {
        this.zza = zzcwfVar;
        this.zzb = zzcwxVar;
        this.zzc = zzcxmVar;
        this.zzd = zzcxrVar;
        this.zze = zzdarVar;
        this.zzf = zzcykVar;
        this.zzg = zzddrVar;
        this.zzh = zzdanVar;
        this.zzi = zzcwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zze() {
        this.zza.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzf() {
        this.zzf.zzbD(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzh() {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzi() {
        this.zzf.zzby();
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzj() {
        this.zzd.zzbN();
    }

    public void zzk() {
        this.zzb.zza();
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzl(String str, String str2) {
        this.zze.zzbL(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzm(zzbja zzbjaVar, String str) {
    }

    public void zzn() {
        this.zzg.zzb();
    }

    public void zzo() {
        this.zzg.zzc();
    }

    public void zzp(zzbyh zzbyhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzq() {
        this.zzg.zza();
    }

    public void zzr(zzbyl zzbylVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    @Deprecated
    public final void zzs(int i) throws RemoteException {
        zzy(new zzazm(i, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzu() throws RemoteException {
        this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzv(String str) {
        zzy(new zzazm(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzw(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzx(zzazm zzazmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzy(zzazm zzazmVar) {
        this.zzi.zza(zzeuf.zzc(8, zzazmVar));
    }
}
