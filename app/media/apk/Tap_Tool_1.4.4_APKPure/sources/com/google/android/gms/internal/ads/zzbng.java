package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbng implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcde zza;
    final /* synthetic */ zzbni zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbng(zzbni zzbniVar, zzcde zzcdeVar) {
        this.zzb = zzbniVar;
        this.zza = zzcdeVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbmv zzbmvVar;
        try {
            zzcde zzcdeVar = this.zza;
            zzbmvVar = this.zzb.zza;
            zzcdeVar.zzc(zzbmvVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzcde zzcdeVar = this.zza;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzcdeVar.zzd(new RuntimeException(sb.toString()));
    }
}
