package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzw extends zzbrj implements zzcxp {
    private zzbrk zza;
    private zzcxo zzb;

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final synchronized void zza(zzcxo zzcxoVar) {
        this.zzb = zzcxoVar;
    }

    public final synchronized void zzc(zzbrk zzbrkVar) {
        this.zza = zzbrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zze() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzf() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzg(int i) throws RemoteException {
        zzcxo zzcxoVar = this.zzb;
        if (zzcxoVar != null) {
            zzcxoVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzh() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzi() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzj() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzj();
        }
        zzcxo zzcxoVar = this.zzb;
        if (zzcxoVar != null) {
            zzcxoVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzk() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzm(zzbja zzbjaVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzn() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzo() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzp(zzbyh zzbyhVar) throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzp(zzbyhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzq() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzr(zzbyl zzbylVar) throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzr(zzbylVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzs(int i) throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzt() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzu() throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzv(String str) throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzw(int i, String str) throws RemoteException {
        zzcxo zzcxoVar = this.zzb;
        if (zzcxoVar != null) {
            zzcxoVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzx(zzazm zzazmVar) throws RemoteException {
        zzcxo zzcxoVar = this.zzb;
        if (zzcxoVar != null) {
            zzcxoVar.zzd(zzazmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final synchronized void zzy(zzazm zzazmVar) throws RemoteException {
        zzbrk zzbrkVar = this.zza;
        if (zzbrkVar != null) {
            zzbrkVar.zzy(zzazmVar);
        }
    }
}
