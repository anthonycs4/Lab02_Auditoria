package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.Exception;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznl<T extends Exception> {
    private T zza;
    private long zzb;

    public zznl(long j) {
    }

    public final void zza(T t) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = t;
            this.zzb = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.zzb) {
            T t2 = this.zza;
            if (t2 != t) {
                zzfwq.zza(t2, t);
            }
            T t3 = this.zza;
            this.zza = null;
            throw t3;
        }
    }

    public final void zzb() {
        this.zza = null;
    }
}
