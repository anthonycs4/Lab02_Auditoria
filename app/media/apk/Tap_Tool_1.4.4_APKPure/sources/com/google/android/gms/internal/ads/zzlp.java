package com.google.android.gms.internal.ads;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzlp {
    public static final zzhw<zzlp> zzq;
    private static final zzkd zzs;
    public Object zzb = zza;
    public zzkd zzc = zzs;
    public Object zzd;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    public zzkb zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();

    static {
        zzjw zzjwVar = new zzjw();
        zzjwVar.zza("com.google.android.exoplayer2.Timeline");
        zzjwVar.zzb(Uri.EMPTY);
        zzs = zzjwVar.zzc();
        zzq = zzlo.zza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzlp zzlpVar = (zzlp) obj;
            if (zzaht.zzc(this.zzb, zzlpVar.zzb) && zzaht.zzc(this.zzc, zzlpVar.zzc) && zzaht.zzc(null, null) && zzaht.zzc(this.zzk, zzlpVar.zzk) && this.zze == zzlpVar.zze && this.zzf == zzlpVar.zzf && this.zzg == zzlpVar.zzg && this.zzh == zzlpVar.zzh && this.zzi == zzlpVar.zzi && this.zzl == zzlpVar.zzl && this.zzn == zzlpVar.zzn && this.zzo == zzlpVar.zzo && this.zzp == zzlpVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.zzb.hashCode() + 217) * 31) + this.zzc.hashCode()) * 961;
        zzkb zzkbVar = this.zzk;
        int hashCode2 = zzkbVar == null ? 0 : zzkbVar.hashCode();
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        boolean z3 = this.zzl;
        long j4 = this.zzn;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzlp zza(Object obj, zzkd zzkdVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzkb zzkbVar, long j4, long j5, int i, int i2, long j6) {
        this.zzb = obj;
        this.zzc = zzkdVar != null ? zzkdVar : zzs;
        this.zzd = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzkbVar != null;
        this.zzk = zzkbVar;
        this.zzm = 0L;
        this.zzn = j5;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzafs.zzd(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
