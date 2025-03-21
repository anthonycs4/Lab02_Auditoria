package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzduh extends zzdub {
    private String zzg;
    private int zzh = 1;

    public zzduh(Context context) {
        this.zzf = new zzbwq(context, com.google.android.gms.ads.internal.zzs.zzq().zza(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdub, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.zze.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzduo(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zzg(this.zze, new zzdua(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzdua(this));
                    } else {
                        this.zza.zzd(new zzduo(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzduo(1));
                }
            }
        }
    }

    public final zzfla<InputStream> zzb(zzbxf zzbxfVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzfks.zzc(new zzduo(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbxfVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzduf
                    private final zzduh zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza();
                    }
                }, zzccz.zzf);
                return this.zza;
            }
        }
    }

    public final zzfla<InputStream> zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzfks.zzc(new zzduo(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdug
                    private final zzduh zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza();
                    }
                }, zzccz.zzf);
                return this.zza;
            }
        }
    }
}
