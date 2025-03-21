package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavl {
    final /* synthetic */ zzavm zza;
    private final byte[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzavl(zzavm zzavmVar, byte[] bArr, zzavk zzavkVar) {
        this.zza = zzavmVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzavm zzavmVar = this.zza;
            if (zzavmVar.zzb) {
                zzavmVar.zza.zzh(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzj(this.zzc);
                this.zza.zza.zzg(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzccn.zze("Clearcut log failed", e);
        }
    }

    public final zzavl zzb(int i) {
        this.zzc = i;
        return this;
    }
}
