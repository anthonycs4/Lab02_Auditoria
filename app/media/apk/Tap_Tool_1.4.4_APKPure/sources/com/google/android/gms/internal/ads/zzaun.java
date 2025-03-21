package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaun implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzauo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaun(zzauo zzauoVar) {
        this.zza = zzauoVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzaur zzaurVar;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            zzaurVar = this.zza.zzc;
            if (zzaurVar != null) {
                zzauo.zzj(this.zza, null);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
