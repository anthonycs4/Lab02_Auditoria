package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgy extends zzbdi {
    private final Object zza = new Object();
    @Nullable
    private final zzbdj zzb;
    @Nullable
    private final zzbrt zzc;

    public zzdgy(@Nullable zzbdj zzbdjVar, @Nullable zzbrt zzbrtVar) {
        this.zzb = zzbdjVar;
        this.zzc = zzbrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzj() throws RemoteException {
        zzbrt zzbrtVar = this.zzc;
        if (zzbrtVar != null) {
            return zzbrtVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzk() throws RemoteException {
        zzbrt zzbrtVar = this.zzc;
        if (zzbrtVar != null) {
            return zzbrtVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzl(zzbdm zzbdmVar) throws RemoteException {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                zzbdjVar.zzl(zzbdmVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final zzbdm zzo() throws RemoteException {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                return zzbdjVar.zzo();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
