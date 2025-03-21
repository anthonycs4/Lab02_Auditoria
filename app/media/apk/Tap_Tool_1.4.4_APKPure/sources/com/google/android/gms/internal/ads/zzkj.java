package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import kotlin.jvm.internal.LongCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkj {
    private final zzln zza = new zzln();
    private final zzlp zzb = new zzlp();
    private final Handler zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzkh zzg;
    private zzkh zzh;
    private zzkh zzi;
    private int zzj;
    private Object zzk;
    private long zzl;

    public zzkj(zzlr zzlrVar, Handler handler) {
        this.zzc = handler;
    }

    private static zzaaj zzr(zzlq zzlqVar, Object obj, long j, long j2, zzln zzlnVar) {
        zzlqVar.zzf(obj, zzlnVar);
        int zzd = zzlnVar.zzd(j);
        if (zzd == -1) {
            return new zzaaj(obj, j2, zzlnVar.zze(j));
        }
        return new zzaaj(obj, zzd, zzlnVar.zzc(zzd), j2);
    }

    private final boolean zzs(zzlq zzlqVar) {
        zzkh zzkhVar = this.zzg;
        if (zzkhVar == null) {
            return true;
        }
        int zzh = zzlqVar.zzh(zzkhVar.zzb);
        while (true) {
            zzh = zzlqVar.zzu(zzh, this.zza, this.zzb, this.zze, this.zzf);
            while (zzkhVar.zzo() != null && !zzkhVar.zzf.zzf) {
                zzkhVar = zzkhVar.zzo();
            }
            zzkh zzo = zzkhVar.zzo();
            if (zzh == -1 || zzo == null || zzlqVar.zzh(zzo.zzb) != zzh) {
                break;
            }
            zzkhVar = zzo;
        }
        boolean zzl = zzl(zzkhVar);
        zzkhVar.zzf = zzo(zzlqVar, zzkhVar.zzf);
        return !zzl;
    }

    private final zzki zzt(zzlq zzlqVar, zzkh zzkhVar, long j) {
        long j2;
        long j3;
        zzki zzkiVar = zzkhVar.zzf;
        long zza = (zzkhVar.zza() + zzkiVar.zze) - j;
        if (zzkiVar.zzf) {
            int zzu = zzlqVar.zzu(zzlqVar.zzh(zzkiVar.zza.zza), this.zza, this.zzb, this.zze, this.zzf);
            if (zzu == -1) {
                return null;
            }
            int i = zzlqVar.zzg(zzu, this.zza, true).zzc;
            Object obj = this.zza.zzb;
            long j4 = zzkiVar.zza.zzd;
            if (zzlqVar.zze(i, this.zzb, 0L).zzo == zzu) {
                Pair<Object, Long> zzw = zzlqVar.zzw(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zza));
                if (zzw == null) {
                    return null;
                }
                obj = zzw.first;
                long longValue = ((Long) zzw.second).longValue();
                zzkh zzo = zzkhVar.zzo();
                if (zzo != null && zzo.zzb.equals(obj)) {
                    j4 = zzo.zzf.zza.zzd;
                } else {
                    j4 = this.zzd;
                    this.zzd = 1 + j4;
                }
                j3 = longValue;
                j2 = -9223372036854775807L;
            } else {
                j2 = 0;
                j3 = 0;
            }
            return zzu(zzlqVar, zzr(zzlqVar, obj, j3, j4, this.zza), j2, j3);
        }
        zzaaj zzaajVar = zzkiVar.zza;
        zzlqVar.zzf(zzaajVar.zza, this.zza);
        if (zzaajVar.zzb()) {
            this.zza.zzf(zzaajVar.zzb);
            return null;
        }
        int zzd = this.zza.zzd(zzkiVar.zzd);
        if (zzd == -1) {
            Object obj2 = zzaajVar.zza;
            long j5 = zzkiVar.zze;
            return zzw(zzlqVar, obj2, j5, j5, zzaajVar.zzd);
        }
        return zzv(zzlqVar, zzaajVar.zza, zzd, this.zza.zzc(zzd), zzkiVar.zze, zzaajVar.zzd);
    }

    private final zzki zzu(zzlq zzlqVar, zzaaj zzaajVar, long j, long j2) {
        zzlqVar.zzf(zzaajVar.zza, this.zza);
        if (zzaajVar.zzb()) {
            return zzv(zzlqVar, zzaajVar.zza, zzaajVar.zzb, zzaajVar.zzc, j, zzaajVar.zzd);
        }
        return zzw(zzlqVar, zzaajVar.zza, j2, j, zzaajVar.zzd);
    }

    private final zzki zzv(zzlq zzlqVar, Object obj, int i, int i2, long j, long j2) {
        zzaaj zzaajVar = new zzaaj(obj, i, i2, j2);
        zzlqVar.zzf(zzaajVar.zza, this.zza).zzg(zzaajVar.zzb, zzaajVar.zzc);
        if (i2 == this.zza.zzc(i)) {
            this.zza.zzh();
        }
        return new zzki(zzaajVar, 0L, j, -9223372036854775807L, -9223372036854775807L, false, false, false);
    }

    private final zzki zzw(zzlq zzlqVar, Object obj, long j, long j2, long j3) {
        long j4 = j;
        zzlqVar.zzf(obj, this.zza);
        int zze = this.zza.zze(j4);
        zzaaj zzaajVar = new zzaaj(obj, j3, zze);
        boolean zzz = zzz(zzaajVar);
        boolean zzx = zzx(zzlqVar, zzaajVar);
        boolean zzy = zzy(zzlqVar, zzaajVar, zzz);
        long zzb = zze != -1 ? this.zza.zzb(zze) : -9223372036854775807L;
        long j5 = (zzb == -9223372036854775807L || zzb == Long.MIN_VALUE) ? this.zza.zzd : zzb;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, (-1) + j5);
        }
        return new zzki(zzaajVar, j4, j2, zzb, j5, zzz, zzx, zzy);
    }

    private final boolean zzx(zzlq zzlqVar, zzaaj zzaajVar) {
        if (zzz(zzaajVar)) {
            return zzlqVar.zze(zzlqVar.zzf(zzaajVar.zza, this.zza).zzc, this.zzb, 0L).zzp == zzlqVar.zzh(zzaajVar.zza);
        }
        return false;
    }

    private final boolean zzy(zzlq zzlqVar, zzaaj zzaajVar, boolean z) {
        int zzh = zzlqVar.zzh(zzaajVar.zza);
        return !zzlqVar.zze(zzlqVar.zzg(zzh, this.zza, false).zzc, this.zzb, 0L).zzi && zzlqVar.zzu(zzh, this.zza, this.zzb, this.zze, this.zzf) == -1 && z;
    }

    private static final boolean zzz(zzaaj zzaajVar) {
        return !zzaajVar.zzb() && zzaajVar.zze == -1;
    }

    public final boolean zza(zzlq zzlqVar, int i) {
        this.zze = i;
        return zzs(zzlqVar);
    }

    public final boolean zzb(zzlq zzlqVar, boolean z) {
        this.zzf = z;
        return zzs(zzlqVar);
    }

    public final boolean zzc(zzaah zzaahVar) {
        zzkh zzkhVar = this.zzi;
        return zzkhVar != null && zzkhVar.zza == zzaahVar;
    }

    public final void zzd(long j) {
        zzkh zzkhVar = this.zzi;
        if (zzkhVar != null) {
            zzkhVar.zzh(j);
        }
    }

    public final boolean zze() {
        zzkh zzkhVar = this.zzi;
        if (zzkhVar != null) {
            return !zzkhVar.zzf.zzh && zzkhVar.zzd() && this.zzi.zzf.zze != -9223372036854775807L && this.zzj < 100;
        }
        return true;
    }

    public final zzki zzf(long j, zzks zzksVar) {
        zzkh zzkhVar = this.zzi;
        if (zzkhVar == null) {
            return zzu(zzksVar.zza, zzksVar.zzb, zzksVar.zzc, zzksVar.zzs);
        }
        return zzt(zzksVar.zza, zzkhVar, j);
    }

    public final zzkh zzg() {
        return this.zzi;
    }

    public final zzkh zzh() {
        return this.zzg;
    }

    public final zzkh zzi() {
        return this.zzh;
    }

    public final zzkh zzj() {
        zzkh zzkhVar = this.zzh;
        boolean z = false;
        if (zzkhVar != null && zzkhVar.zzo() != null) {
            z = true;
        }
        zzafs.zzd(z);
        zzkh zzo = this.zzh.zzo();
        this.zzh = zzo;
        return zzo;
    }

    public final zzkh zzk() {
        zzkh zzkhVar = this.zzg;
        if (zzkhVar == null) {
            return null;
        }
        if (zzkhVar == this.zzh) {
            this.zzh = zzkhVar.zzo();
        }
        this.zzg.zzm();
        int i = this.zzj - 1;
        this.zzj = i;
        if (i == 0) {
            this.zzi = null;
            zzkh zzkhVar2 = this.zzg;
            this.zzk = zzkhVar2.zzb;
            this.zzl = zzkhVar2.zzf.zza.zzd;
        }
        zzkh zzo = this.zzg.zzo();
        this.zzg = zzo;
        return zzo;
    }

    public final boolean zzl(zzkh zzkhVar) {
        boolean z = false;
        zzafs.zzd(zzkhVar != null);
        if (zzkhVar.equals(this.zzi)) {
            return false;
        }
        this.zzi = zzkhVar;
        while (zzkhVar.zzo() != null) {
            zzkhVar = zzkhVar.zzo();
            if (zzkhVar == this.zzh) {
                this.zzh = this.zzg;
                z = true;
            }
            zzkhVar.zzm();
            this.zzj--;
        }
        this.zzi.zzn(null);
        return z;
    }

    public final void zzm() {
        if (this.zzj == 0) {
            return;
        }
        zzkh zzkhVar = this.zzg;
        zzafs.zzf(zzkhVar);
        this.zzk = zzkhVar.zzb;
        this.zzl = zzkhVar.zzf.zza.zzd;
        while (zzkhVar != null) {
            zzkhVar.zzm();
            zzkhVar = zzkhVar.zzo();
        }
        this.zzg = null;
        this.zzi = null;
        this.zzh = null;
        this.zzj = 0;
    }

    public final boolean zzn(zzlq zzlqVar, long j, long j2) {
        zzki zzkiVar;
        zzkh zzkhVar = this.zzg;
        zzkh zzkhVar2 = null;
        while (zzkhVar != null) {
            zzki zzkiVar2 = zzkhVar.zzf;
            if (zzkhVar2 == null) {
                zzkiVar = zzo(zzlqVar, zzkiVar2);
            } else {
                zzki zzt = zzt(zzlqVar, zzkhVar2, j);
                if (zzt == null) {
                    return !zzl(zzkhVar2);
                } else if (zzkiVar2.zzb != zzt.zzb || !zzkiVar2.zza.equals(zzt.zza)) {
                    return !zzl(zzkhVar2);
                } else {
                    zzkiVar = zzt;
                }
            }
            zzkhVar.zzf = zzkiVar.zzb(zzkiVar2.zzc);
            long j3 = zzkiVar2.zze;
            long j4 = zzkiVar.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                return (zzl(zzkhVar) || (zzkhVar == this.zzh && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : zzkhVar.zza() + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : zzkhVar.zza() + j4) ? 0 : -1)) >= 0))) ? false : true;
            }
            zzkhVar2 = zzkhVar;
            zzkhVar = zzkhVar.zzo();
        }
        return true;
    }

    public final zzki zzo(zzlq zzlqVar, zzki zzkiVar) {
        long j;
        zzaaj zzaajVar = zzkiVar.zza;
        boolean zzz = zzz(zzaajVar);
        boolean zzx = zzx(zzlqVar, zzaajVar);
        boolean zzy = zzy(zzlqVar, zzaajVar, zzz);
        zzlqVar.zzf(zzkiVar.zza.zza, this.zza);
        long j2 = -9223372036854775807L;
        if (zzaajVar.zzb()) {
            this.zza.zzg(zzaajVar.zzb, zzaajVar.zzc);
        } else {
            long j3 = zzkiVar.zzd;
            if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
                j = j3;
                return new zzki(zzaajVar, zzkiVar.zzb, zzkiVar.zzc, zzkiVar.zzd, j, zzz, zzx, zzy);
            }
            j2 = this.zza.zzd;
        }
        j = j2;
        return new zzki(zzaajVar, zzkiVar.zzb, zzkiVar.zzc, zzkiVar.zzd, j, zzz, zzx, zzy);
    }

    public final zzaaj zzp(zzlq zzlqVar, Object obj, long j) {
        long j2;
        int zzh;
        int i = zzlqVar.zzf(obj, this.zza).zzc;
        Object obj2 = this.zzk;
        if (obj2 == null || (zzh = zzlqVar.zzh(obj2)) == -1 || zzlqVar.zzg(zzh, this.zza, false).zzc != i) {
            zzkh zzkhVar = this.zzg;
            while (true) {
                if (zzkhVar == null) {
                    zzkh zzkhVar2 = this.zzg;
                    while (true) {
                        if (zzkhVar2 != null) {
                            int zzh2 = zzlqVar.zzh(zzkhVar2.zzb);
                            if (zzh2 != -1 && zzlqVar.zzg(zzh2, this.zza, false).zzc == i) {
                                j2 = zzkhVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkhVar2 = zzkhVar2.zzo();
                        } else {
                            j2 = this.zzd;
                            this.zzd = 1 + j2;
                            if (this.zzg == null) {
                                this.zzk = obj;
                                this.zzl = j2;
                            }
                        }
                    }
                } else if (zzkhVar.zzb.equals(obj)) {
                    j2 = zzkhVar.zzf.zza.zzd;
                    break;
                } else {
                    zzkhVar = zzkhVar.zzo();
                }
            }
        } else {
            j2 = this.zzl;
        }
        return zzr(zzlqVar, obj, j, j2, this.zza);
    }

    public final zzkh zzq(zzlh[] zzlhVarArr, zzadp zzadpVar, zzaek zzaekVar, zzkq zzkqVar, zzki zzkiVar, zzadq zzadqVar) {
        long zza;
        zzkh zzkhVar = this.zzi;
        if (zzkhVar == null) {
            if (zzkiVar.zza.zzb()) {
                long j = zzkiVar.zzc;
                if (j != -9223372036854775807L) {
                    zza = j;
                }
            }
            zza = 0;
        } else {
            zza = (zzkhVar.zza() + this.zzi.zzf.zze) - zzkiVar.zzb;
        }
        zzkh zzkhVar2 = new zzkh(zzlhVarArr, zza, zzadpVar, zzaekVar, zzkqVar, zzkiVar, zzadqVar, null);
        zzkh zzkhVar3 = this.zzi;
        if (zzkhVar3 != null) {
            zzkhVar3.zzn(zzkhVar2);
        } else {
            this.zzg = zzkhVar2;
            this.zzh = zzkhVar2;
        }
        this.zzk = null;
        this.zzi = zzkhVar2;
        this.zzj++;
        return zzkhVar2;
    }
}
