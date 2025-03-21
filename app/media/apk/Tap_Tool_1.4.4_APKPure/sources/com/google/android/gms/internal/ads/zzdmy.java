package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdmy {
    private final zzcin zza;
    private final Context zzb;
    private final zzfb zzc;
    private final zzbgp zzd;
    private final zzcct zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzavg zzg;
    private final zzcyt zzh;

    public zzdmy(zzcin zzcinVar, Context context, zzfb zzfbVar, zzbgp zzbgpVar, zzcct zzcctVar, com.google.android.gms.ads.internal.zza zzaVar, zzavg zzavgVar, zzcyt zzcytVar) {
        this.zza = zzcinVar;
        this.zzb = context;
        this.zzc = zzfbVar;
        this.zzd = zzbgpVar;
        this.zze = zzcctVar;
        this.zzf = zzaVar;
        this.zzg = zzavgVar;
        this.zzh = zzcytVar;
    }

    public final zzcib zza(zzazx zzazxVar, zzess zzessVar, zzesv zzesvVar) throws zzcim {
        return zzcin.zza(this.zzb, zzcjr.zza(zzazxVar), zzazxVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdmn(this), this.zzf, this.zzg, zzessVar, zzesvVar);
    }
}
