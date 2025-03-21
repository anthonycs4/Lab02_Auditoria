package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcuz implements zzcyy {
    private final Context zza;
    private final zzetk zzb;
    private final zzcct zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdro zze;

    public zzcuz(Context context, zzetk zzetkVar, zzcct zzcctVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdro zzdroVar) {
        this.zza = context;
        this.zzb = zzetkVar;
        this.zzc = zzcctVar;
        this.zzd = zzgVar;
        this.zze = zzdroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzck)).booleanValue()) {
            com.google.android.gms.ads.internal.zzs.zzk().zzb(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzn());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
    }
}
