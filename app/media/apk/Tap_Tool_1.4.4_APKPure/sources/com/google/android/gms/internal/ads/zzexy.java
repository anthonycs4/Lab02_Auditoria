package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzexy implements zzexv {
    private final zzexv zza;
    private final Queue<zzexu> zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) zzbba.zzc().zzb(zzbfq.zzfQ)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzexy(zzexv zzexvVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzexvVar;
        long intValue = ((Integer) zzbba.zzc().zzb(zzbfq.zzfP)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzexx
            private final zzexy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final void zza(zzexu zzexuVar) {
        if (this.zzb.size() >= this.zzc) {
            if (this.zzd.getAndSet(true)) {
                return;
            }
            Queue<zzexu> queue = this.zzb;
            zzexu zza = zzexu.zza("dropped_event");
            Map<String, String> zzj = zzexuVar.zzj();
            if (zzj.containsKey("action")) {
                zza.zzc("dropped_action", zzj.get("action"));
            }
            queue.offer(zza);
            return;
        }
        this.zzb.offer(zzexuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final String zzb(zzexu zzexuVar) {
        return this.zza.zzb(zzexuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzc() {
        while (!this.zzb.isEmpty()) {
            this.zza.zza(this.zzb.remove());
        }
    }
}
