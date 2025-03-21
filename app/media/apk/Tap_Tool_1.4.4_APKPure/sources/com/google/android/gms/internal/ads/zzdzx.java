package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzx extends zzbyf implements zzcxp {
    private zzbyg zza;
    private zzcxo zzb;
    private zzddl zzc;

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final synchronized void zza(zzcxo zzcxoVar) {
        this.zzb = zzcxoVar;
    }

    public final synchronized void zzc(zzbyg zzbygVar) {
        this.zza = zzbygVar;
    }

    public final synchronized void zzd(zzddl zzddlVar) {
        this.zzc = zzddlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Executor executor;
        zzddl zzddlVar = this.zzc;
        if (zzddlVar != null) {
            executor = ((zzecq) zzddlVar).zzd.zzb;
            final zzete zzeteVar = ((zzecq) zzddlVar).zza;
            final zzess zzessVar = ((zzecq) zzddlVar).zzb;
            final zzdyd zzdydVar = ((zzecq) zzddlVar).zzc;
            final zzecq zzecqVar = (zzecq) zzddlVar;
            executor.execute(new Runnable(zzecqVar, zzeteVar, zzessVar, zzdydVar) { // from class: com.google.android.gms.internal.ads.zzecp
                private final zzecq zza;
                private final zzete zzb;
                private final zzess zzc;
                private final zzdyd zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzecqVar;
                    this.zzb = zzeteVar;
                    this.zzc = zzessVar;
                    this.zzd = zzdydVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzecq zzecqVar2 = this.zza;
                    zzete zzeteVar2 = this.zzb;
                    zzess zzessVar2 = this.zzc;
                    zzdyd zzdydVar2 = this.zzd;
                    zzecs zzecsVar = zzecqVar2.zzd;
                    zzecs.zze(zzeteVar2, zzessVar2, zzdydVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzddl zzddlVar = this.zzc;
        if (zzddlVar != null) {
            String valueOf = String.valueOf(((zzecq) zzddlVar).zzc.zza);
            com.google.android.gms.ads.internal.util.zze.zzi(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxo zzcxoVar = this.zzb;
        if (zzcxoVar != null) {
            zzcxoVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzecr) zzbygVar).zza.zzby();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzecr) zzbygVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            zzbygVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzecr) zzbygVar).zzd.zzb(zzbyhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzecr) zzbygVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxo zzcxoVar = this.zzb;
        if (zzcxoVar != null) {
            zzcxoVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzecr) zzbygVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzecr) zzbygVar).zzc.zzf();
        }
    }
}
