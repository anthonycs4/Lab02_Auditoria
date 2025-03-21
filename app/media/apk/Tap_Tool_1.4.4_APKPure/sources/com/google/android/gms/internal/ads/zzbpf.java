package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpf implements zzcdi<zzbol> {
    final /* synthetic */ zzbpp zza;
    final /* synthetic */ zzbpq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpf(zzbpq zzbpqVar, zzbpp zzbppVar) {
        this.zzb = zzbpqVar;
        this.zza = zzbppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final /* bridge */ /* synthetic */ void zza(zzbol zzbolVar) {
        Object obj;
        zzbpp zzbppVar;
        zzbpp zzbppVar2;
        zzbpp zzbppVar3;
        obj = this.zzb.zza;
        synchronized (obj) {
            this.zzb.zzh = 0;
            zzbppVar = this.zzb.zzg;
            if (zzbppVar != null) {
                zzbpp zzbppVar4 = this.zza;
                zzbppVar2 = this.zzb.zzg;
                if (zzbppVar4 != zzbppVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbppVar3 = this.zzb.zzg;
                    zzbppVar3.zzc();
                }
            }
            this.zzb.zzg = this.zza;
        }
    }
}
