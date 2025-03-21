package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzo extends Thread {
    private static final boolean zza = zzao.zzb;
    private final BlockingQueue<zzac<?>> zzb;
    private final BlockingQueue<zzac<?>> zzc;
    private final zzm zzd;
    private volatile boolean zze = false;
    private final zzap zzf;
    private final zzt zzg;

    /* JADX WARN: Multi-variable type inference failed */
    public zzo(BlockingQueue blockingQueue, BlockingQueue<zzac<?>> blockingQueue2, BlockingQueue<zzac<?>> blockingQueue3, zzm zzmVar, zzt zztVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = blockingQueue3;
        this.zzg = zzmVar;
        this.zzf = new zzap(this, blockingQueue2, zzmVar, null);
    }

    private void zzc() throws InterruptedException {
        zzac<?> take = this.zzb.take();
        take.zzc("cache-queue-take");
        take.zze(1);
        try {
            take.zzl();
            zzl zza2 = this.zzd.zza(take.zzi());
            if (zza2 == null) {
                take.zzc("cache-miss");
                if (!this.zzf.zzc(take)) {
                    this.zzc.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                take.zzc("cache-hit-expired");
                take.zzj(zza2);
                if (!this.zzf.zzc(take)) {
                    this.zzc.put(take);
                }
                return;
            }
            take.zzc("cache-hit");
            zzai<?> zzr = take.zzr(new zzy(zza2.zza, zza2.zzg));
            take.zzc("cache-hit-parsed");
            if (!zzr.zzc()) {
                take.zzc("cache-parsing-failed");
                this.zzd.zzd(take.zzi(), true);
                take.zzj(null);
                if (!this.zzf.zzc(take)) {
                    this.zzc.put(take);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                take.zzc("cache-hit-refresh-needed");
                take.zzj(zza2);
                zzr.zzd = true;
                if (this.zzf.zzc(take)) {
                    this.zzg.zza(take, zzr, null);
                } else {
                    this.zzg.zza(take, zzr, new zzn(this, take));
                }
            } else {
                this.zzg.zza(take, zzr, null);
            }
        } finally {
            take.zze(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzao.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (!this.zze) {
                    zzao.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }
}
