package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzln {
    public static final zzhw<zzln> zzg = zzlm.zza;
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    private zzacm zzh = zzacm.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzln zzlnVar = (zzln) obj;
            if (zzaht.zzc(this.zza, zzlnVar.zza) && zzaht.zzc(this.zzb, zzlnVar.zzb) && this.zzc == zzlnVar.zzc && this.zzd == zzlnVar.zzd && this.zzf == zzlnVar.zzf && zzaht.zzc(this.zzh, zzlnVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzb;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.zzc;
        long j = this.zzd;
        return ((((((((hashCode + hashCode2) * 31) + i) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzh.hashCode();
    }

    public final zzln zza(Object obj, Object obj2, int i, long j, long j2) {
        zzacm zzacmVar = zzacm.zza;
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = 0;
        this.zzd = j;
        this.zze = 0L;
        this.zzh = zzacmVar;
        this.zzf = false;
        return this;
    }

    public final long zzb(int i) {
        return this.zzh.zzc[i];
    }

    public final int zzc(int i) {
        int[] iArr = this.zzh.zzd[i].zzc;
        return 0;
    }

    public final int zze(long j) {
        int length;
        zzacm zzacmVar = this.zzh;
        long j2 = this.zzd;
        if (j != Long.MIN_VALUE) {
            int i = 0;
            if (j2 == -9223372036854775807L || j < j2) {
                while (true) {
                    long[] jArr = zzacmVar.zzc;
                    length = jArr.length;
                    if (i >= length) {
                        break;
                    }
                    long j3 = jArr[i];
                    if (j3 == Long.MIN_VALUE) {
                        break;
                    } else if (j < j3) {
                        zzacl zzaclVar = zzacmVar.zzd[i];
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < length) {
                    return i;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final int zzf(int i) {
        int i2 = this.zzh.zzd[i].zza;
        return -1;
    }

    public final long zzg(int i, int i2) {
        int i3 = this.zzh.zzd[i].zza;
        return -9223372036854775807L;
    }

    public final long zzh() {
        long j = this.zzh.zze;
        return 0L;
    }

    public final int zzd(long j) {
        zzacm zzacmVar = this.zzh;
        long j2 = this.zzd;
        int length = zzacmVar.zzc.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j3 = zzacmVar.zzc[length];
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                length--;
            } else {
                if (j2 != -9223372036854775807L && j >= j2) {
                    break;
                }
                length--;
            }
        }
        if (length >= 0) {
            zzacl zzaclVar = zzacmVar.zzd[length];
            return length;
        }
        return -1;
    }
}
