package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpc implements zzblp<zzbpr> {
    final /* synthetic */ zzbol zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcb zzb;
    final /* synthetic */ zzbpq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpc(zzbpq zzbpqVar, zzfb zzfbVar, zzbol zzbolVar, com.google.android.gms.ads.internal.util.zzcb zzcbVar) {
        this.zzc = zzbpqVar;
        this.zza = zzbolVar;
        this.zzb = zzcbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzblp, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzbpr zzbprVar, Map map) {
        Object obj;
        int i;
        obj = this.zzc.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zzh("JS Engine is requesting an update");
            i = this.zzc.zzh;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zzh("Starting reload.");
                this.zzc.zzh = 2;
                this.zzc.zza(null);
            }
            this.zza.zzm("/requestReload", this.zzb.zza());
        }
    }
}
