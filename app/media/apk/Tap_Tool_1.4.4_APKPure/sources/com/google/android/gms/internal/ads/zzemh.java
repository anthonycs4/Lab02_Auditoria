package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemh implements zzeld<zzemi> {
    private final Context zza;
    private final zzcby zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzcbr zze;

    public zzemh(zzcbr zzcbrVar, int i, Context context, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, Executor executor, byte[] bArr) {
        this.zze = zzcbrVar;
        this.zza = context;
        this.zzb = zzcbyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzemi> zza() {
        return zzfks.zzf((zzfkj) zzfks.zzh(zzfks.zzj(zzfkj.zzw(zzfks.zze(new zzfjy(this) { // from class: com.google.android.gms.internal.ads.zzeme
            private final zzemh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjy
            public final zzfla zza() {
                return zzfks.zza(null);
            }
        }, this.zzd)), zzemf.zza, this.zzd), ((Long) zzbba.zzc().zzb(zzbfq.zzaG)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfei(this) { // from class: com.google.android.gms.internal.ads.zzemg
            private final zzemh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                this.zza.zzb((Exception) obj);
                return null;
            }
        }, zzflh.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemi zzb(Exception exc) {
        this.zzb.zzg(exc, "AttestationTokenSignal");
        return null;
    }
}
