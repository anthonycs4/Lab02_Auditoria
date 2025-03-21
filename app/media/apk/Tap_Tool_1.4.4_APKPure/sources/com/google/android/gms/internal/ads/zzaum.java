package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaum implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzauo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaum(zzauo zzauoVar) {
        this.zza = zzauoVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzaur zzaurVar;
        zzaur zzaurVar2;
        obj = this.zza.zzb;
        synchronized (obj) {
            try {
                zzaurVar = this.zza.zzc;
                if (zzaurVar != null) {
                    zzauo zzauoVar = this.zza;
                    zzaurVar2 = zzauoVar.zzc;
                    zzauoVar.zze = zzaurVar2.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to obtain a cache service instance.", e);
                zzauo.zzf(this.zza);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
