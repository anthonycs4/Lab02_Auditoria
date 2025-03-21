package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkd {
    public static final zzhw<zzkd> zzf = zzjt.zza;
    public final String zza;
    public final zzkc zzb;
    public final zzkb zzc;
    public final zzkg zzd;
    public final zzjy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkd(String str, zzjy zzjyVar, zzkc zzkcVar, zzkb zzkbVar, zzkg zzkgVar, zzju zzjuVar) {
        this.zza = str;
        this.zzb = zzkcVar;
        this.zzc = zzkbVar;
        this.zzd = zzkgVar;
        this.zze = zzjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkd) {
            zzkd zzkdVar = (zzkd) obj;
            return zzaht.zzc(this.zza, zzkdVar.zza) && this.zze.equals(zzkdVar.zze) && zzaht.zzc(this.zzb, zzkdVar.zzb) && zzaht.zzc(this.zzc, zzkdVar.zzc) && zzaht.zzc(this.zzd, zzkdVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        zzkc zzkcVar = this.zzb;
        return (((((hashCode + (zzkcVar != null ? zzkcVar.hashCode() : 0)) * 31) + this.zzc.hashCode()) * 31) + this.zze.hashCode()) * 31;
    }
}
