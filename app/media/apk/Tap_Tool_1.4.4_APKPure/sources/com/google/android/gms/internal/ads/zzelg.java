package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzelg<T> {
    private final Set<zzeld<? extends zzelc<T>>> zza;
    private final Executor zzb;

    public zzelg(Executor executor, Set<zzeld<? extends zzelc<T>>> set) {
        this.zzb = executor;
        this.zza = set;
    }

    public final zzfla<T> zza(final T t) {
        final ArrayList arrayList = new ArrayList(this.zza.size());
        for (final zzeld<? extends zzelc<T>> zzeldVar : this.zza) {
            zzfla<? extends zzelc<T>> zza = zzeldVar.zza();
            if (zzbhe.zza.zze().booleanValue()) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
                zza.zze(new Runnable(zzeldVar, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzele
                    private final zzeld zza;
                    private final long zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzeldVar;
                        this.zzb = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeld zzeldVar2 = this.zza;
                        long j = this.zzb;
                        String canonicalName = zzeldVar2.getClass().getCanonicalName();
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(elapsedRealtime2 - j);
                        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    }
                }, zzccz.zzf);
            }
            arrayList.add(zza);
        }
        return zzfks.zzo(arrayList).zza(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.zzelf
            private final List zza;
            private final Object zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
                this.zzb = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfla> list = this.zza;
                Object obj = this.zzb;
                for (zzfla zzflaVar : list) {
                    zzelc zzelcVar = (zzelc) zzflaVar.get();
                    if (zzelcVar != null) {
                        zzelcVar.zzd(obj);
                    }
                }
                return obj;
            }
        }, this.zzb);
    }
}
