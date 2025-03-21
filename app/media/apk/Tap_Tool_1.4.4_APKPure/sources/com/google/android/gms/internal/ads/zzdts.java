package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdts implements zzdun {
    private static final Pattern zzf = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdst zza;
    private final zzflb zzb;
    private final zzetk zzc;
    private final ScheduledExecutorService zzd;
    private final zzdws zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdts(zzetk zzetkVar, zzdst zzdstVar, zzflb zzflbVar, ScheduledExecutorService scheduledExecutorService, zzdws zzdwsVar) {
        this.zzc = zzetkVar;
        this.zza = zzdstVar;
        this.zzb = zzflbVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdun
    public final zzfla<zzete> zza(zzbxf zzbxfVar) {
        zzfla<zzete> zzi = zzfks.zzi(this.zza.zza(zzbxfVar), new zzfjz(this) { // from class: com.google.android.gms.internal.ads.zzdtp
            private final zzdts zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzb((InputStream) obj);
            }
        }, this.zzb);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdI)).booleanValue()) {
            zzi = zzfks.zzg(zzfks.zzh(zzi, ((Integer) zzbba.zzc().zzb(zzbfq.zzdJ)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzdtq.zza, zzccz.zzf);
        }
        zzfks.zzp(zzi, new zzdtr(this), zzccz.zzf);
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(InputStream inputStream) throws Exception {
        return zzfks.zza(new zzete(new zzetb(this.zzc), zzetd.zza(new InputStreamReader(inputStream))));
    }
}
