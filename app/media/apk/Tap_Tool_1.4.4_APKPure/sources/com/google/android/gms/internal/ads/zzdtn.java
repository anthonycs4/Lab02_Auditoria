package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtn {
    private final ScheduledExecutorService zza;
    private final zzflb zzb;
    private final zzdud zzc;
    private final zzgdk<zzdvo> zzd;

    public zzdtn(ScheduledExecutorService scheduledExecutorService, zzflb zzflbVar, zzdud zzdudVar, zzgdk<zzdvo> zzgdkVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzflbVar;
        this.zzc = zzdudVar;
        this.zzd = zzgdkVar;
    }

    public final zzfla<InputStream> zza(final zzbxf zzbxfVar) {
        zzfla zzflaVar;
        String str = zzbxfVar.zzd;
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzF(str)) {
            zzflaVar = zzfks.zzc(new zzduo(1));
        } else {
            final zzdud zzdudVar = this.zzc;
            synchronized (zzdudVar.zzb) {
                if (zzdudVar.zzc) {
                    zzflaVar = zzdudVar.zza;
                } else {
                    zzdudVar.zzc = true;
                    zzdudVar.zze = zzbxfVar;
                    zzdudVar.zzf.checkAvailabilityAndConnect();
                    zzdudVar.zza.zze(new Runnable(zzdudVar) { // from class: com.google.android.gms.internal.ads.zzduc
                        private final zzdud zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzdudVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zza();
                        }
                    }, zzccz.zzf);
                    zzflaVar = zzdudVar.zza;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfks.zzg((zzfkj) zzfks.zzh(zzfkj.zzw(zzflaVar), ((Integer) zzbba.zzc().zzb(zzbfq.zzdJ)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfjz(this, zzbxfVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzdtm
            private final zzdtn zza;
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
                return this.zza.zzb(this.zzb, this.zzc, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(zzbxf zzbxfVar, int i, Throwable th) throws Exception {
        return this.zzd.zzb().zzi(zzbxfVar, i);
    }
}
