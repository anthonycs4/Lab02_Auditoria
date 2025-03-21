package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzels implements zzeld<zzelt> {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final zzcbr zze;

    public zzels(zzcbr zzcbrVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.zze = zzcbrVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelt> zza() {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzaF)).booleanValue()) {
            return zzfks.zzc(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfks.zzf((zzfkj) zzfks.zzh(zzfks.zzj(zzfkj.zzw((zzfla) this.zze.zza(this.zza, this.zzd)), zzelq.zza, this.zzc), ((Long) zzbba.zzc().zzb(zzbfq.zzaG)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfei(this) { // from class: com.google.android.gms.internal.ads.zzelr
            private final zzels zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                return this.zza.zzb((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzelt zzb(Throwable th) {
        zzbay.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzelt(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }
}
