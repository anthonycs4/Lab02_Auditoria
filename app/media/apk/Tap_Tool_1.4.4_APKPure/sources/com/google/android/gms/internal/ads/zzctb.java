package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzctb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfla<zzcsu> zzc;
    private volatile boolean zzd = true;

    public zzctb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfla<zzcsu> zzflaVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzflaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(final zzctb zzctbVar, List list, final zzfko zzfkoVar) {
        if (list == null || list.isEmpty()) {
            zzctbVar.zza.execute(new Runnable(zzfkoVar) { // from class: com.google.android.gms.internal.ads.zzcsv
                private final zzfko zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzfkoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(new zzdsp(3));
                }
            });
            return;
        }
        zzfla zza = zzfks.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final zzfla zzflaVar = (zzfla) it.next();
            zza = zzfks.zzi(zzfks.zzg(zza, Throwable.class, new zzfjz(zzfkoVar) { // from class: com.google.android.gms.internal.ads.zzcsw
                private final zzfko zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzfkoVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    this.zza.zza((Throwable) obj);
                    return zzfks.zza(null);
                }
            }, zzctbVar.zza), new zzfjz(zzctbVar, zzfkoVar, zzflaVar) { // from class: com.google.android.gms.internal.ads.zzcsx
                private final zzctb zza;
                private final zzfko zzb;
                private final zzfla zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzctbVar;
                    this.zzb = zzfkoVar;
                    this.zzc = zzflaVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    return this.zza.zzd(this.zzb, this.zzc, (zzcsn) obj);
                }
            }, zzctbVar.zza);
        }
        zzfks.zzp(zza, new zzcta(zzctbVar, zzfkoVar), zzctbVar.zza);
    }

    public final void zza(zzfko<zzcsn> zzfkoVar) {
        zzfks.zzp(this.zzc, new zzcsz(this, zzfkoVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zzd = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzfko zzfkoVar, zzfla zzflaVar, zzcsn zzcsnVar) throws Exception {
        if (zzcsnVar != null) {
            zzfkoVar.zzb(zzcsnVar);
        }
        return zzfks.zzh(zzflaVar, zzbhn.zzb.zze().longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }
}
