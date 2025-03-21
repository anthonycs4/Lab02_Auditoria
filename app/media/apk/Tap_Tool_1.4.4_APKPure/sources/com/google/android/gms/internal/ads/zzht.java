package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzht extends zzlq {
    private final int zzc;
    private final zzaca zzd;

    public zzht(boolean z, zzaca zzacaVar, byte[] bArr) {
        this.zzd = zzacaVar;
        this.zzc = zzacaVar.zza();
    }

    private final int zzq(int i, boolean z) {
        if (z) {
            return this.zzd.zzb(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zzc(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zza(int i, int i2, boolean z) {
        int zzk = zzk(i);
        int zzo = zzo(zzk);
        int zza = zzm(zzk).zza(i - zzo, i2 == 2 ? 0 : i2, z);
        if (zza != -1) {
            return zzo + zza;
        }
        int zzq = zzq(zzk, z);
        while (zzq != -1 && zzm(zzq).zzt()) {
            zzq = zzq(zzq, z);
        }
        if (zzq != -1) {
            return zzo(zzq) + zzm(zzq).zzd(z);
        }
        if (i2 == 2) {
            return zzd(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzb(int i, int i2, boolean z) {
        int zzk = zzk(i);
        int zzo = zzo(zzk);
        int zzb = zzm(zzk).zzb(i - zzo, 0, false);
        if (zzb != -1) {
            return zzo + zzb;
        }
        int zzx = zzx(zzk, false);
        while (zzx != -1 && zzm(zzx).zzt()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzo(zzx) + zzm(zzx).zzc(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzc(boolean z) {
        int i = this.zzc;
        if (i == 0) {
            return -1;
        }
        int zzd = z ? this.zzd.zzd() : i - 1;
        while (zzm(zzd).zzt()) {
            zzd = zzx(zzd, z);
            if (zzd == -1) {
                return -1;
            }
        }
        return zzo(zzd) + zzm(zzd).zzc(z);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzd(boolean z) {
        if (this.zzc == 0) {
            return -1;
        }
        int zze = z ? this.zzd.zze() : 0;
        while (zzm(zze).zzt()) {
            zze = zzq(zze, z);
            if (zze == -1) {
                return -1;
            }
        }
        return zzo(zze) + zzm(zze).zzd(z);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzlp zze(int i, zzlp zzlpVar, long j) {
        int zzk = zzk(i);
        int zzo = zzo(zzk);
        int zzn = zzn(zzk);
        zzm(zzk).zze(i - zzo, zzlpVar, j);
        Object zzp = zzp(zzk);
        if (!zzlp.zza.equals(zzlpVar.zzb)) {
            zzp = Pair.create(zzp, zzlpVar.zzb);
        }
        zzlpVar.zzb = zzp;
        zzlpVar.zzo += zzn;
        zzlpVar.zzp += zzn;
        return zzlpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzln zzf(Object obj, zzln zzlnVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzl = zzl(obj2);
        int zzo = zzo(zzl);
        zzm(zzl).zzf(obj3, zzlnVar);
        zzlnVar.zzc += zzo;
        zzlnVar.zzb = obj;
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzln zzg(int i, zzln zzlnVar, boolean z) {
        int zzj = zzj(i);
        int zzo = zzo(zzj);
        zzm(zzj).zzg(i - zzn(zzj), zzlnVar, z);
        zzlnVar.zzc += zzo;
        if (z) {
            Object zzp = zzp(zzj);
            Object obj = zzlnVar.zzb;
            Objects.requireNonNull(obj);
            zzlnVar.zzb = Pair.create(zzp, obj);
        }
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzh(Object obj) {
        int zzh;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzl = zzl(obj2);
            if (zzl == -1 || (zzh = zzm(zzl).zzh(obj3)) == -1) {
                return -1;
            }
            return zzn(zzl) + zzh;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final Object zzi(int i) {
        int zzj = zzj(i);
        return Pair.create(zzp(zzj), zzm(zzj).zzi(i - zzn(zzj)));
    }

    protected abstract int zzj(int i);

    protected abstract int zzk(int i);

    protected abstract int zzl(Object obj);

    protected abstract zzlq zzm(int i);

    protected abstract int zzn(int i);

    protected abstract int zzo(int i);

    protected abstract Object zzp(int i);
}
