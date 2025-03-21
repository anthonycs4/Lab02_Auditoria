package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaqa {
    public final zzapl zza;
    public final zzapx zzb;
    public final Object zzc;
    public final zzaka[] zzd;

    public zzaqa(zzapl zzaplVar, zzapx zzapxVar, Object obj, zzaka[] zzakaVarArr) {
        this.zza = zzaplVar;
        this.zzb = zzapxVar;
        this.zzc = obj;
        this.zzd = zzakaVarArr;
    }

    public final boolean zza(zzaqa zzaqaVar, int i) {
        return zzaqaVar != null && zzarj.zza(this.zzb.zza(i), zzaqaVar.zzb.zza(i)) && zzarj.zza(this.zzd[i], zzaqaVar.zzd[i]);
    }
}
