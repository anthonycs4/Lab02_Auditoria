package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdst {
    private final zzflb zza;
    private final zzflb zzb;
    private final zzdtz zzc;
    private final zzgdk<zzdvo> zzd;

    public zzdst(zzflb zzflbVar, zzflb zzflbVar2, zzdtz zzdtzVar, zzgdk<zzdvo> zzgdkVar) {
        this.zza = zzflbVar;
        this.zzb = zzflbVar2;
        this.zzc = zzdtzVar;
        this.zzd = zzgdkVar;
    }

    public final zzfla<InputStream> zza(final zzbxf zzbxfVar) {
        zzfla zzg;
        String str = zzbxfVar.zzd;
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzF(str)) {
            zzg = zzfks.zzc(new zzduo(1));
        } else {
            zzg = zzfks.zzg(this.zza.zzb(new Callable(this, zzbxfVar) { // from class: com.google.android.gms.internal.ads.zzdsq
                private final zzdst zza;
                private final zzbxf zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzbxfVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc(this.zzb);
                }
            }), ExecutionException.class, zzdsr.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfks.zzg(zzg, zzduo.class, new zzfjz(this, zzbxfVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzdss
            private final zzdst zza;
            private final zzbxf zzb;
            private final int zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbxfVar;
                this.zzc = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzb(this.zzb, this.zzc, (zzduo) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(zzbxf zzbxfVar, int i, zzduo zzduoVar) throws Exception {
        return this.zzd.zzb().zzb(zzbxfVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbxf zzbxfVar) throws Exception {
        zzcde<InputStream> zzcdeVar;
        final zzdtz zzdtzVar = this.zzc;
        synchronized (zzdtzVar.zzb) {
            if (zzdtzVar.zzc) {
                zzcdeVar = zzdtzVar.zza;
            } else {
                zzdtzVar.zzc = true;
                zzdtzVar.zze = zzbxfVar;
                zzdtzVar.zzf.checkAvailabilityAndConnect();
                zzdtzVar.zza.zze(new Runnable(zzdtzVar) { // from class: com.google.android.gms.internal.ads.zzdty
                    private final zzdtz zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzdtzVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza();
                    }
                }, zzccz.zzf);
                zzcdeVar = zzdtzVar.zza;
            }
        }
        return zzcdeVar.get(((Integer) zzbba.zzc().zzb(zzbfq.zzdJ)).intValue(), TimeUnit.SECONDS);
    }
}
