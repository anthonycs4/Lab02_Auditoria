package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtz extends zzdub {
    public zzdtz(Context context) {
        this.zzf = new zzbwq(context, com.google.android.gms.ads.internal.zzs.zzq().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zze(this.zze, new zzdua(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzduo(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzduo(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdub, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.zze.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzduo(1));
    }
}
