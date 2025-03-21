package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdg {
    final /* synthetic */ zzfdh zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfdg(zzfdh zzfdhVar, byte[] bArr, zzfdf zzfdfVar) {
        this.zza = zzfdhVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfdh zzfdhVar = this.zza;
            if (zzfdhVar.zza) {
                zzfdhVar.zzb.zzg(this.zzb);
                this.zza.zzb.zzh(this.zzc);
                this.zza.zzb.zzi(this.zzd);
                this.zza.zzb.zzf(null);
                this.zza.zzb.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final zzfdg zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfdg zzc(int i) {
        this.zzd = i;
        return this;
    }
}
