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
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzenu extends zzbbt implements com.google.android.gms.ads.internal.overlay.zzz, zzatv, zzcye {
    protected zzcpx zza;
    private final zzcjz zzb;
    private final Context zzc;
    private final ViewGroup zzd;
    private final String zzf;
    private final zzeno zzg;
    private final zzeoq zzh;
    private final zzcct zzi;
    private zzcpj zzk;
    private AtomicBoolean zze = new AtomicBoolean();
    private long zzj = -1;

    public zzenu(zzcjz zzcjzVar, Context context, String str, zzeno zzenoVar, zzeoq zzeoqVar, zzcct zzcctVar) {
        this.zzd = new FrameLayout(context);
        this.zzb = zzcjzVar;
        this.zzc = context;
        this.zzf = str;
        this.zzg = zzenoVar;
        this.zzh = zzeoqVar;
        zzeoqVar.zzi(this);
        this.zzi = zzcctVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.ads.internal.overlay.zzq zzT(zzenu zzenuVar, zzcpx zzcpxVar) {
        boolean zzf = zzcpxVar.zzf();
        int intValue = ((Integer) zzbba.zzc().zzb(zzbfq.zzdd)).intValue();
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = new com.google.android.gms.ads.internal.overlay.zzp();
        zzpVar.zzd = 50;
        zzpVar.zza = true != zzf ? 0 : intValue;
        zzpVar.zzb = true != zzf ? intValue : 0;
        zzpVar.zzc = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzq(zzenuVar.zzc, zzpVar, zzenuVar);
    }

    private final synchronized void zzW(int i) {
        if (this.zze.compareAndSet(false, true)) {
            zzcpx zzcpxVar = this.zza;
            if (zzcpxVar != null && zzcpxVar.zzk() != null) {
                this.zzh.zzp(this.zza.zzk());
            }
            this.zzh.zzn();
            this.zzd.removeAllViews();
            zzcpj zzcpjVar = this.zzk;
            if (zzcpjVar != null) {
                com.google.android.gms.ads.internal.zzs.zzf().zzc(zzcpjVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zzj;
                }
                this.zza.zzi(j, i);
            }
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zzA() {
        return this.zzg.zzb();
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
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzF(zzbey zzbeyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzG(zzbdn zzbdnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzH(zzbad zzbadVar) {
        this.zzg.zzd(zzbadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzI(zzaue zzaueVar) {
        this.zzh.zzg(zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzK() {
        if (this.zza == null) {
            return;
        }
        this.zzj = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
        int zzc = this.zza.zzc();
        if (zzc <= 0) {
            return;
        }
        zzcpj zzcpjVar = new zzcpj(this.zzb.zzf(), com.google.android.gms.ads.internal.zzs.zzj());
        this.zzk = zzcpjVar;
        zzcpjVar.zzb(zzc, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzenr
            private final zzenu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    public final void zzL() {
        zzbay.zza();
        if (zzccg.zzp()) {
            zzW(5);
        } else {
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzenq
                private final zzenu zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzM();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzW(5);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzO(zzbdd zzbddVar) {
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

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza() {
        zzW(3);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzab(zzbcf zzbcfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzbS() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcpx zzcpxVar = this.zza;
        if (zzcpxVar != null) {
            zzcpxVar.zzR();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzd() {
        zzW(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zze(zzazs zzazsVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzK(this.zzc) && zzazsVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzh.zzbM(zzeuf.zzd(4, null, null));
            return false;
        }
        if (zzA()) {
            return false;
        }
        this.zze = new AtomicBoolean();
        return this.zzg.zza(zzazsVar, this.zzf, new zzens(this), new zzent(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzf() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzh(zzbbh zzbbhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzi(zzbcb zzbcbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzj(zzbby zzbbyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzazx zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcpx zzcpxVar = this.zza;
        if (zzcpxVar != null) {
            return zzeto.zzb(this.zzc, Collections.singletonList(zzcpxVar.zza()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzo(zzazx zzazxVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzp(zzbvv zzbvvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzq(zzbvy zzbvyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzbdg zzt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized String zzu() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbcb zzv() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbbh zzw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzx(zzbgl zzbglVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzy(zzbbe zzbbeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzz(boolean z) {
    }
}
