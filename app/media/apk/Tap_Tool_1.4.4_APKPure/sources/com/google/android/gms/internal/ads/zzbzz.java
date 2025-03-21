package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzz {
    private final Clock zza;
    private final zzbzx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzz(Clock clock, zzbzx zzbzxVar) {
        this.zza = clock;
        this.zzb = zzbzxVar;
    }

    public static zzbzz zza(Context context) {
        return zzcax.zzd(context).zzb();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(zzbes zzbesVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i, long j) {
        this.zzb.zza(i, j);
    }

    public final void zze() {
        this.zzb.zzb();
    }
}
