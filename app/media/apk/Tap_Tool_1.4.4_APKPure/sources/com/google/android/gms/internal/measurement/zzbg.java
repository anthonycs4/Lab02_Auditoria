package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class zzbg extends zzag.zzb {
    private final /* synthetic */ zzt zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzag zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbg(zzag zzagVar, zzt zztVar, int i) {
        super(zzagVar);
        this.zze = zzagVar;
        this.zzc = zztVar;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        zzv zzvVar;
        zzvVar = this.zze.zzm;
        zzvVar.getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    protected final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
