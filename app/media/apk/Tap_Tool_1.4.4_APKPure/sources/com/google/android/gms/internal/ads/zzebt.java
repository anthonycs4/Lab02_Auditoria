package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebt<AdT> implements zzfjz<zzete, AdT> {
    private final zzexl zza;
    private final zzcwj zzb;
    private final zzeyk zzc;
    private final zzeyn zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcsq<AdT> zzg;
    private final zzebo zzh;
    private final zzdyf zzi;

    public zzebt(zzexl zzexlVar, zzebo zzeboVar, zzcwj zzcwjVar, zzeyk zzeykVar, zzeyn zzeynVar, zzcsq<AdT> zzcsqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzdyf zzdyfVar) {
        this.zza = zzexlVar;
        this.zzh = zzeboVar;
        this.zzb = zzcwjVar;
        this.zzc = zzeykVar;
        this.zzd = zzeynVar;
        this.zzg = zzcsqVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzdyfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    @Override // com.google.android.gms.internal.ads.zzfjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfla zza(com.google.android.gms.internal.ads.zzete r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebt.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfla");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(zzete zzeteVar, zzess zzessVar, zzdya zzdyaVar, Throwable th) throws Exception {
        zzebo zzeboVar = this.zzh;
        zzesv zzesvVar = zzeteVar.zzb.zzb;
        zzfla zzh = zzfks.zzh(zzdyaVar.zzb(zzeteVar, zzessVar), zzessVar.zzM, TimeUnit.MILLISECONDS, this.zzf);
        zzeboVar.zza(zzesvVar, zzessVar, zzh);
        return zzh;
    }
}
