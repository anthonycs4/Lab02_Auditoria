package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzdbe<ListenerT> {
    protected final Map<ListenerT, Executor> zza = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdbe(Set<zzdcx<ListenerT>> set) {
        zzi(set);
    }

    public final synchronized void zzg(zzdcx<ListenerT> zzdcxVar) {
        zzh(zzdcxVar.zza, zzdcxVar.zzb);
    }

    public final synchronized void zzh(ListenerT listenert, Executor executor) {
        this.zza.put(listenert, executor);
    }

    public final synchronized void zzi(Set<zzdcx<ListenerT>> set) {
        for (zzdcx<ListenerT> zzdcxVar : set) {
            zzg(zzdcxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzr(final zzdbd<ListenerT> zzdbdVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.zza.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzdbdVar, key) { // from class: com.google.android.gms.internal.ads.zzdbc
                private final zzdbd zza;
                private final Object zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzdbdVar;
                    this.zzb = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zza.zza(this.zzb);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzs.zzg().zzh(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
