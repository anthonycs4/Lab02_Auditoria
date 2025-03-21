package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzauo {
    private final Runnable zza = new zzauk(this);
    private final Object zzb = new Object();
    private zzaur zzc;
    private Context zzd;
    private zzauu zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzauo zzauoVar) {
        synchronized (zzauoVar.zzb) {
            zzaur zzaurVar = zzauoVar.zzc;
            if (zzaurVar == null) {
                return;
            }
            if (zzaurVar.isConnected() || zzauoVar.zzc.isConnecting()) {
                zzauoVar.zzc.disconnect();
            }
            zzauoVar.zzc = null;
            zzauoVar.zze = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzaur zzj(zzauo zzauoVar, zzaur zzaurVar) {
        zzauoVar.zzc = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd == null || this.zzc != null) {
                return;
            }
            zzaur zze = zze(new zzaum(this), new zzaun(this));
            this.zzc = zze;
            zze.checkAvailabilityAndConnect();
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd != null) {
                return;
            }
            this.zzd = context.getApplicationContext();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcv)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcu)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzs.zzf().zzb(new zzaul(this));
                }
            }
        }
    }

    public final void zzb() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcw)).booleanValue()) {
            synchronized (this.zzb) {
                zzl();
                com.google.android.gms.ads.internal.util.zzr.zza.removeCallbacks(this.zza);
                com.google.android.gms.ads.internal.util.zzr.zza.postDelayed(this.zza, ((Long) zzbba.zzc().zzb(zzbfq.zzcx)).longValue());
            }
        }
    }

    public final zzaup zzc(zzaus zzausVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return new zzaup();
            }
            try {
                if (this.zzc.zzp()) {
                    return this.zze.zzf(zzausVar);
                }
                return this.zze.zze(zzausVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to call into cache service.", e);
                return new zzaup();
            }
        }
    }

    public final long zzd(zzaus zzausVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return -2L;
            }
            if (this.zzc.zzp()) {
                try {
                    return this.zze.zzg(zzausVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    protected final synchronized zzaur zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzaur(this.zzd, com.google.android.gms.ads.internal.zzs.zzq().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }
}
