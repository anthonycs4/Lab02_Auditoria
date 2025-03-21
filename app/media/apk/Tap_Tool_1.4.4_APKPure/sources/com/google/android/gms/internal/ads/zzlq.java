package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzlq {
    public static final zzlq zza = new zzll();
    public static final zzhw<zzlq> zzb = zzlk.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlq) {
            zzlq zzlqVar = (zzlq) obj;
            if (zzlqVar.zzr() == zzr() && zzlqVar.zzs() == zzs()) {
                zzlp zzlpVar = new zzlp();
                zzln zzlnVar = new zzln();
                zzlp zzlpVar2 = new zzlp();
                zzln zzlnVar2 = new zzln();
                for (int i = 0; i < zzr(); i++) {
                    if (!zze(i, zzlpVar, 0L).equals(zzlqVar.zze(i, zzlpVar2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < zzs(); i2++) {
                    if (!zzg(i2, zzlnVar, true).equals(zzlqVar.zzg(i2, zzlnVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zzlp zzlpVar = new zzlp();
        zzln zzlnVar = new zzln();
        int zzr = zzr() + 217;
        for (int i = 0; i < zzr(); i++) {
            zzr = (zzr * 31) + zze(i, zzlpVar, 0L).hashCode();
        }
        int zzs = (zzr * 31) + zzs();
        for (int i2 = 0; i2 < zzs(); i2++) {
            zzs = (zzs * 31) + zzg(i2, zzlnVar, true).hashCode();
        }
        return zzs;
    }

    public int zza(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzc(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == zzc(z) ? zzd(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public int zzb(int i, int i2, boolean z) {
        if (i == zzd(false)) {
            return -1;
        }
        return i - 1;
    }

    public int zzc(boolean z) {
        if (zzt()) {
            return -1;
        }
        return zzr() - 1;
    }

    public int zzd(boolean z) {
        return zzt() ? -1 : 0;
    }

    public abstract zzlp zze(int i, zzlp zzlpVar, long j);

    public zzln zzf(Object obj, zzln zzlnVar) {
        return zzg(zzh(obj), zzlnVar, true);
    }

    public abstract zzln zzg(int i, zzln zzlnVar, boolean z);

    public abstract int zzh(Object obj);

    public abstract Object zzi(int i);

    public abstract int zzr();

    public abstract int zzs();

    public final boolean zzt() {
        return zzr() == 0;
    }

    public final int zzu(int i, zzln zzlnVar, zzlp zzlpVar, int i2, boolean z) {
        int i3 = zzg(i, zzlnVar, false).zzc;
        if (zze(i3, zzlpVar, 0L).zzp == i) {
            int zza2 = zza(i3, i2, z);
            if (zza2 == -1) {
                return -1;
            }
            return zze(zza2, zzlpVar, 0L).zzo;
        }
        return i + 1;
    }

    public final Pair<Object, Long> zzv(zzlp zzlpVar, zzln zzlnVar, int i, long j) {
        Pair<Object, Long> zzw = zzw(zzlpVar, zzlnVar, i, j, 0L);
        Objects.requireNonNull(zzw);
        return zzw;
    }

    public final Pair<Object, Long> zzw(zzlp zzlpVar, zzln zzlnVar, int i, long j, long j2) {
        zzafs.zzc(i, 0, zzr());
        zze(i, zzlpVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzlpVar.zzm;
            j = 0;
        }
        int i2 = zzlpVar.zzo;
        zzg(i2, zzlnVar, false);
        while (i2 < zzlpVar.zzp) {
            long j4 = zzlnVar.zze;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzg(i4, zzlnVar, false).zze;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzg(i2, zzlnVar, true);
        long j6 = zzlnVar.zze;
        Object obj = zzlnVar.zzb;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(j));
    }
}
