package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzap implements zzab {
    private final Map<String, List<zzac<?>>> zza = new HashMap();
    private final zzo zzb;
    private final BlockingQueue<zzac<?>> zzc;
    private final zzt zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzap(zzo zzoVar, zzo zzoVar2, BlockingQueue<zzac<?>> blockingQueue, zzt zztVar) {
        this.zzd = blockingQueue;
        this.zzb = zzoVar;
        this.zzc = zzoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzab
    public final void zza(zzac<?> zzacVar, zzai<?> zzaiVar) {
        List<zzac<?>> remove;
        zzl zzlVar = zzaiVar.zzb;
        if (zzlVar == null || zzlVar.zza(System.currentTimeMillis())) {
            zzb(zzacVar);
            return;
        }
        String zzi = zzacVar.zzi();
        synchronized (this) {
            remove = this.zza.remove(zzi);
        }
        if (remove != null) {
            if (zzao.zzb) {
                zzao.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), zzi);
            }
            for (zzac<?> zzacVar2 : remove) {
                this.zzd.zza(zzacVar2, zzaiVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzab
    public final synchronized void zzb(zzac<?> zzacVar) {
        String zzi = zzacVar.zzi();
        List<zzac<?>> remove = this.zza.remove(zzi);
        if (remove == null || remove.isEmpty()) {
            return;
        }
        if (zzao.zzb) {
            zzao.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), zzi);
        }
        zzac<?> remove2 = remove.remove(0);
        this.zza.put(zzi, remove);
        remove2.zzu(this);
        try {
            this.zzc.put(remove2);
        } catch (InterruptedException e) {
            zzao.zzc("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzc(zzac<?> zzacVar) {
        String zzi = zzacVar.zzi();
        if (this.zza.containsKey(zzi)) {
            List<zzac<?>> list = this.zza.get(zzi);
            if (list == null) {
                list = new ArrayList<>();
            }
            zzacVar.zzc("waiting-for-response");
            list.add(zzacVar);
            this.zza.put(zzi, list);
            if (zzao.zzb) {
                zzao.zzb("Request for cacheKey=%s is in flight, putting on hold.", zzi);
            }
            return true;
        }
        this.zza.put(zzi, null);
        zzacVar.zzu(this);
        if (zzao.zzb) {
            zzao.zzb("new request, sending to network %s", zzi);
        }
        return false;
    }
}
