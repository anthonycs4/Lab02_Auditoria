package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpb implements zzblp<zzbpr> {
    final /* synthetic */ zzbpp zza;
    final /* synthetic */ zzbol zzb;
    final /* synthetic */ zzbpq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpb(zzbpq zzbpqVar, zzbpp zzbppVar, zzbol zzbolVar) {
        this.zzc = zzbpqVar;
        this.zza = zzbppVar;
        this.zzb = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzbpr zzbprVar, Map map) {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zzh() != -1 && this.zza.zzh() != 1) {
                this.zzc.zzh = 0;
                zzbol zzbolVar = this.zzb;
                zzbolVar.zzl("/log", zzblo.zzh);
                zzbolVar.zzl("/result", zzblo.zzp);
                this.zza.zzf(this.zzb);
                this.zzc.zzg = this.zza;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
