package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfaq {
    private final BlockingQueue<Runnable> zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque<zzfap> zzc = new ArrayDeque<>();
    private zzfap zzd = null;

    public zzfaq() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfap poll = this.zzc.poll();
        this.zzd = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfap zzfapVar) {
        zzfapVar.zzb(this);
        this.zzc.add(zzfapVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfap zzfapVar) {
        this.zzd = null;
        zzc();
    }
}
