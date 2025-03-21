package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzan {
    public static final boolean zza = zzao.zzb;
    private final List<zzam> zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzao.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzam(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        List<zzam> list;
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = this.zzb.get(list.size() - 1).zzc - this.zzb.get(0).zzc;
        }
        if (j <= 0) {
            return;
        }
        long j2 = this.zzb.get(0).zzc;
        zzao.zzb("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzam zzamVar : this.zzb) {
            long j3 = zzamVar.zzc;
            zzao.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzamVar.zzb), zzamVar.zza);
            j2 = j3;
        }
    }
}
