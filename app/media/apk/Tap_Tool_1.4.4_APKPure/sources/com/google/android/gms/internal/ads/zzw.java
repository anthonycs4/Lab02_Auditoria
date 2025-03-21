package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzw extends Thread {
    private final BlockingQueue<zzac<?>> zza;
    private final zzv zzb;
    private final zzm zzc;
    private volatile boolean zzd = false;
    private final zzt zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzw(BlockingQueue blockingQueue, BlockingQueue<zzac<?>> blockingQueue2, zzv zzvVar, zzm zzmVar, zzt zztVar) {
        this.zza = blockingQueue;
        this.zzb = blockingQueue2;
        this.zzc = zzvVar;
        this.zze = zzmVar;
    }

    private void zzb() throws InterruptedException {
        zzac<?> take = this.zza.take();
        SystemClock.elapsedRealtime();
        take.zze(3);
        try {
            take.zzc("network-queue-take");
            take.zzl();
            TrafficStats.setThreadStatsTag(take.zzb());
            zzy zza = this.zzb.zza(take);
            take.zzc("network-http-complete");
            if (zza.zze && take.zzq()) {
                take.zzd("not-modified");
                take.zzw();
                return;
            }
            zzai<?> zzr = take.zzr(zza);
            take.zzc("network-parse-complete");
            if (zzr.zzb != null) {
                this.zzc.zzb(take.zzi(), zzr.zzb);
                take.zzc("network-cache-written");
            }
            take.zzp();
            this.zze.zza(take, zzr, null);
            take.zzv(zzr);
        } catch (zzal e) {
            SystemClock.elapsedRealtime();
            this.zze.zzb(take, e);
            take.zzw();
        } catch (Exception e2) {
            zzao.zzd(e2, "Unhandled exception %s", e2.toString());
            zzal zzalVar = new zzal(e2);
            SystemClock.elapsedRealtime();
            this.zze.zzb(take, zzalVar);
            take.zzw();
        } finally {
            take.zze(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (!this.zzd) {
                    zzao.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
