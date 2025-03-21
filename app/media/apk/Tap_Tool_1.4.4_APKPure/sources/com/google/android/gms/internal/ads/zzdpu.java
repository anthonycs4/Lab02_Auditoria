package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzdpu {
    protected final String zza = zzbgy.zzb.zze();
    protected final Map<String, String> zzb = new HashMap();
    protected final Executor zzc;
    protected final zzccs zzd;
    protected final boolean zze;
    private final zzeyf zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdpu(Executor executor, zzccs zzccsVar, zzeyf zzeyfVar) {
        this.zzc = executor;
        this.zzd = zzccsVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue()) {
            this.zze = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbl)).booleanValue();
        } else {
            this.zze = ((double) zzbay.zze().nextFloat()) <= zzbgy.zza.zze().doubleValue();
        }
        this.zzf = zzeyfVar;
    }

    public final void zzb(Map<String, String> map) {
        final String zza = this.zzf.zza(map);
        if (this.zze) {
            this.zzc.execute(new Runnable(this, zza) { // from class: com.google.android.gms.internal.ads.zzdpt
                private final zzdpu zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zza;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdpu zzdpuVar = this.zza;
                    zzdpuVar.zzd.zza(this.zzb);
                }
            });
        }
        com.google.android.gms.ads.internal.util.zze.zza(zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(Map<String, String> map) {
        return this.zzf.zza(map);
    }
}
