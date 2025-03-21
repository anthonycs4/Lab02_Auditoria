package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeuc<T> {
    private final Deque<zzfla<T>> zza = new LinkedBlockingDeque();
    private final Callable<T> zzb;
    private final zzflb zzc;

    public zzeuc(Callable<T> callable, zzflb zzflbVar) {
        this.zzb = callable;
        this.zzc = zzflbVar;
    }

    public final synchronized void zza(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }

    public final synchronized zzfla<T> zzb() {
        zza(1);
        return this.zza.poll();
    }

    public final synchronized void zzc(zzfla<T> zzflaVar) {
        this.zza.addFirst(zzflaVar);
    }
}
