package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavb implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcde zza;
    final /* synthetic */ zzavc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavb(zzavc zzavcVar, zzcde zzcdeVar) {
        this.zzb = zzavcVar;
        this.zza = zzcdeVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
