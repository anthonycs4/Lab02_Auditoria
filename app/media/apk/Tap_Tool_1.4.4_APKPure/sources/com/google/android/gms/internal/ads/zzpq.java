package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzpq implements zzqq {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zza(zzjq zzjqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final int zzb(zzaec zzaecVar, int i, boolean z, int i2) throws IOException {
        int zza = zzaecVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzc(zzahd zzahdVar, int i, int i2) {
        zzahdVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzd(long j, int i, int i2, int i3, zzqp zzqpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final int zze(zzaec zzaecVar, int i, boolean z) throws IOException {
        return zzqo.zza(this, zzaecVar, i, true);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzf(zzahd zzahdVar, int i) {
        zzqo.zzb(this, zzahdVar, i);
    }
}
