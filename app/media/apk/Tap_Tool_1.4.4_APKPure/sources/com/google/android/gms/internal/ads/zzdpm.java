package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpm {
    final /* synthetic */ zzdpn zza;
    private final Map<String, String> zzb = new ConcurrentHashMap();

    public zzdpm(zzdpn zzdpnVar) {
        this.zza = zzdpnVar;
    }

    public static /* synthetic */ zzdpm zzg(zzdpm zzdpmVar) {
        Map<? extends String, ? extends String> map;
        Map<String, String> map2 = zzdpmVar.zzb;
        map = zzdpmVar.zza.zzc;
        map2.putAll(map);
        return zzdpmVar;
    }

    public final zzdpm zza(zzesv zzesvVar) {
        this.zzb.put("gqi", zzesvVar.zzb);
        return this;
    }

    public final zzdpm zzb(zzess zzessVar) {
        this.zzb.put("aai", zzessVar.zzv);
        return this;
    }

    public final zzdpm zzc(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final void zzd() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdpl
            private final zzdpm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    public final String zze() {
        zzdps zzdpsVar;
        zzdpsVar = this.zza.zza;
        return zzdpsVar.zzc(this.zzb);
    }

    public final /* synthetic */ void zzf() {
        zzdps zzdpsVar;
        zzdpsVar = this.zza.zza;
        zzdpsVar.zzb(this.zzb);
    }
}
