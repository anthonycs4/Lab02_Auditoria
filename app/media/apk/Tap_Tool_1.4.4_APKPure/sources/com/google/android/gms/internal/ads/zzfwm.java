package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads-base@@20.2.0 */
/* loaded from: classes.dex */
final class zzfwm {
    private final ConcurrentHashMap<zzfwl, List<Throwable>> zza = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzb = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.zzb;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.zza.remove(poll);
            referenceQueue = this.zzb;
        }
        List<Throwable> list = this.zza.get(new zzfwl(th, null));
        if (z && list == null) {
            Vector vector = new Vector(2);
            List<Throwable> putIfAbsent = this.zza.putIfAbsent(new zzfwl(th, this.zzb), vector);
            return putIfAbsent == null ? vector : putIfAbsent;
        }
        return list;
    }
}
