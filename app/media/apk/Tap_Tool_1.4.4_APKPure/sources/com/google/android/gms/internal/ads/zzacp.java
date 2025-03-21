package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacp {
    private final zzaft zza = zzaft.zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzacq zza(zzacf zzacfVar, int[] iArr, int i, zzadx zzadxVar, zzfgz<zzaco> zzfgzVar) {
        return new zzacq(zzacfVar, iArr, i, zzadxVar, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, 0.7f, 0.75f, zzfgzVar, this.zza);
    }
}
