package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeoy extends zzbbt implements com.google.android.gms.ads.internal.overlay.zzo, zzatv {
    protected zzcqh zza;
    private final zzcjz zzb;
    private final Context zzc;
    private final String zze;
    private final zzeos zzf;
    private final zzeoq zzg;
    private zzcpj zzi;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzh = -1;

    public zzeoy(zzcjz zzcjzVar, Context context, String str, zzeos zzeosVar, zzeoq zzeoqVar) {
        this.zzb = zzcjzVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzeosVar;
        this.zzg = zzeoqVar;
        zzeoqVar.zzj(this);
    }

    private final synchronized void zzN(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzn();
            zzcpj zzcpjVar = this.zzi;
            if (zzcpjVar != null) {
                com.google.android.gms.ads.internal.zzs.zzf().zzc(zzcpjVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzh != -1) {
                    j = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zzh;
                }
                this.zza.zze(j, i);
            }
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zzA() {
        return this.zzf.zzb();
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
        this.zzf.zzd(zzbadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzI(zzaue zzaueVar) {
        this.zzg.zzg(zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzJ(boolean z) {
    }

    public final void zzK() {
        this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeou
            private final zzeoy zza;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzN(5);
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
        zzN(3);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzab(zzbcf zzbcfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbB() {
        zzcqh zzcqhVar = this.zza;
        if (zzcqhVar != null) {
            zzcqhVar.zze(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zzh, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzbS() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        if (this.zza == null) {
            return;
        }
        this.zzh = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
        int zzc = this.zza.zzc();
        if (zzc <= 0) {
            return;
        }
        zzcpj zzcpjVar = new zzcpj(this.zzb.zzf(), com.google.android.gms.ads.internal.zzs.zzj());
        this.zzi = zzcpjVar;
        zzcpjVar.zzb(zzc, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeov
            private final zzeoy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcqh zzcqhVar = this.zza;
        if (zzcqhVar != null) {
            zzcqhVar.zzR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized boolean zze(zzazs zzazsVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzK(this.zzc) && zzazsVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzg.zzbM(zzeuf.zzd(4, null, null));
            return false;
        }
        if (zzA()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zza(zzazsVar, this.zze, new zzeow(this), new zzeox(this));
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
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final synchronized zzazx zzn() {
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
        return this.zze;
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

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            zzN(2);
        } else if (i2 == 1) {
            zzN(4);
        } else if (i2 == 2) {
            zzN(3);
        } else if (i2 != 3) {
        } else {
            zzN(6);
        }
    }
}
