package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfzx<T> implements zzgak<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgbi.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfzu zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzfzi zzn;
    private final zzgay<?, ?> zzo;
    private final zzfxz<?> zzp;
    private final zzfzz zzq;
    private final zzfzp zzr;

    /* JADX WARN: Multi-variable type inference failed */
    private zzfzx(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zzfzu zzfzuVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, zzfzz zzfzzVar, zzfzi zzfziVar, zzgay<?, ?> zzgayVar, zzfxz<?> zzfxzVar, zzfzp zzfzpVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = i2 instanceof zzfym;
        this.zzj = zzfzuVar;
        boolean z3 = false;
        if (zzgayVar != 0 && zzgayVar.zza((zzfzu) i2)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = z2;
        this.zzl = iArr3;
        this.zzm = i3;
        this.zzq = i4;
        this.zzn = zzfzzVar;
        this.zzo = zzfziVar;
        this.zzp = zzgayVar;
        this.zzg = i2;
        this.zzr = zzfxzVar;
    }

    private final <UT, UB> UB zzA(Object obj, int i, UB ub, zzgay<UT, UB> zzgayVar) {
        int i2 = this.zzc[i];
        Object zzn = zzgbi.zzn(obj, zzD(i) & 1048575);
        if (zzn == null || zzy(i) == null) {
            return ub;
        }
        zzfzo zzfzoVar = (zzfzo) zzn;
        zzfzn zzfznVar = (zzfzn) zzx(i);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzB(Object obj, int i, zzgak zzgakVar) {
        return zzgakVar.zzk(zzgbi.zzn(obj, i & 1048575));
    }

    private final void zzC(Object obj, int i, zzgaf zzgafVar) throws IOException {
        if (zzG(i)) {
            zzgbi.zzo(obj, i & 1048575, zzgafVar.zzn());
        } else if (!this.zzi) {
            zzgbi.zzo(obj, i & 1048575, zzgafVar.zzq());
        } else {
            zzgbi.zzo(obj, i & 1048575, zzgafVar.zzm());
        }
    }

    private final int zzD(int i) {
        return this.zzc[i + 1];
    }

    private final int zzE(int i) {
        return this.zzc[i + 2];
    }

    private static int zzF(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzG(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> double zzH(T t, long j) {
        return ((Double) zzgbi.zzn(t, j)).doubleValue();
    }

    private static <T> float zzI(T t, long j) {
        return ((Float) zzgbi.zzn(t, j)).floatValue();
    }

    private static <T> int zzJ(T t, long j) {
        return ((Integer) zzgbi.zzn(t, j)).intValue();
    }

    private static <T> long zzK(T t, long j) {
        return ((Long) zzgbi.zzn(t, j)).longValue();
    }

    private static <T> boolean zzL(T t, long j) {
        return ((Boolean) zzgbi.zzn(t, j)).booleanValue();
    }

    private final boolean zzM(T t, T t2, int i) {
        return zzO(t, i) == zzO(t2, i);
    }

    private final boolean zzN(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzO(T t, int i) {
        int zzE = zzE(i);
        long j = zzE & 1048575;
        if (j != 1048575) {
            return (zzgbi.zzd(t, j) & (1 << (zzE >>> 20))) != 0;
        }
        int zzD = zzD(i);
        long j2 = zzD & 1048575;
        switch (zzF(zzD)) {
            case 0:
                return zzgbi.zzl(t, j2) != 0.0d;
            case 1:
                return zzgbi.zzj(t, j2) != 0.0f;
            case 2:
                return zzgbi.zzf(t, j2) != 0;
            case 3:
                return zzgbi.zzf(t, j2) != 0;
            case 4:
                return zzgbi.zzd(t, j2) != 0;
            case 5:
                return zzgbi.zzf(t, j2) != 0;
            case 6:
                return zzgbi.zzd(t, j2) != 0;
            case 7:
                return zzgbi.zzh(t, j2);
            case 8:
                Object zzn = zzgbi.zzn(t, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                } else if (zzn instanceof zzfxj) {
                    return !zzfxj.zzb.equals(zzn);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgbi.zzn(t, j2) != null;
            case 10:
                return !zzfxj.zzb.equals(zzgbi.zzn(t, j2));
            case 11:
                return zzgbi.zzd(t, j2) != 0;
            case 12:
                return zzgbi.zzd(t, j2) != 0;
            case 13:
                return zzgbi.zzd(t, j2) != 0;
            case 14:
                return zzgbi.zzf(t, j2) != 0;
            case 15:
                return zzgbi.zzd(t, j2) != 0;
            case 16:
                return zzgbi.zzf(t, j2) != 0;
            case 17:
                return zzgbi.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzP(T t, int i) {
        int zzE = zzE(i);
        long j = 1048575 & zzE;
        if (j == 1048575) {
            return;
        }
        zzgbi.zze(t, j, (1 << (zzE >>> 20)) | zzgbi.zzd(t, j));
    }

    private final boolean zzQ(T t, int i, int i2) {
        return zzgbi.zzd(t, (long) (zzE(i2) & 1048575)) == i;
    }

    private final void zzR(T t, int i, int i2) {
        zzgbi.zze(t, zzE(i2) & 1048575, i);
    }

    private final int zzS(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, 0);
    }

    private final int zzT(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, i2);
    }

    private final int zzU(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final void zzV(T t, zzfxu zzfxuVar) throws IOException {
        int i;
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int zzD = zzD(i3);
            int i6 = this.zzc[i3];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
                int i7 = this.zzc[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = unsafe.getInt(t, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzD & i2;
            switch (zzF) {
                case 0:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzf(i6, zzgbi.zzl(t, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zze(i6, zzgbi.zzj(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzc(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzh(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzi(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzj(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzk(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzl(i6, zzgbi.zzh(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i4 & i) != 0) {
                        zzX(i6, unsafe.getObject(t, j), zzfxuVar);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzr(i6, unsafe.getObject(t, j), zzw(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzn(i6, (zzfxj) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzo(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzg(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzb(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzd(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzp(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzq(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i4 & i) != 0) {
                        zzfxuVar.zzs(i6, unsafe.getObject(t, j), zzw(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    zzgam.zzJ(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    zzgam.zzK(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    zzgam.zzL(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    zzgam.zzM(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    zzgam.zzQ(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    zzgam.zzO(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    zzgam.zzT(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    zzgam.zzW(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    zzgam.zzX(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar);
                    break;
                case 27:
                    zzgam.zzZ(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, zzw(i3));
                    break;
                case 28:
                    zzgam.zzY(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar);
                    break;
                case 29:
                    zzgam.zzR(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    break;
                case 30:
                    zzgam.zzV(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    break;
                case 31:
                    zzgam.zzU(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    break;
                case 32:
                    zzgam.zzP(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    break;
                case 33:
                    zzgam.zzS(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    break;
                case 34:
                    zzgam.zzN(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, false);
                    break;
                case 35:
                    zzgam.zzJ(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 36:
                    zzgam.zzK(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 37:
                    zzgam.zzL(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 38:
                    zzgam.zzM(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 39:
                    zzgam.zzQ(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 40:
                    zzgam.zzO(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 41:
                    zzgam.zzT(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 42:
                    zzgam.zzW(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 43:
                    zzgam.zzR(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 44:
                    zzgam.zzV(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 45:
                    zzgam.zzU(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 46:
                    zzgam.zzP(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 47:
                    zzgam.zzS(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 48:
                    zzgam.zzN(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, true);
                    break;
                case 49:
                    zzgam.zzaa(this.zzc[i3], (List) unsafe.getObject(t, j), zzfxuVar, zzw(i3));
                    break;
                case 50:
                    zzW(zzfxuVar, i6, unsafe.getObject(t, j), i3);
                    break;
                case 51:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzf(i6, zzH(t, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zze(i6, zzI(t, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzc(i6, zzK(t, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzh(i6, zzK(t, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzi(i6, zzJ(t, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzj(i6, zzK(t, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzk(i6, zzJ(t, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzl(i6, zzL(t, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzQ(t, i6, i3)) {
                        zzX(i6, unsafe.getObject(t, j), zzfxuVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzr(i6, unsafe.getObject(t, j), zzw(i3));
                        break;
                    }
                    break;
                case 61:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzn(i6, (zzfxj) unsafe.getObject(t, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzo(i6, zzJ(t, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzg(i6, zzJ(t, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzb(i6, zzJ(t, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzd(i6, zzK(t, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzp(i6, zzJ(t, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzq(i6, zzK(t, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzQ(t, i6, i3)) {
                        zzfxuVar.zzs(i6, unsafe.getObject(t, j), zzw(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzgay<?, ?> zzgayVar = this.zzo;
        zzgayVar.zzr(zzgayVar.zzj(t), zzfxuVar);
    }

    private final <K, V> void zzW(zzfxu zzfxuVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzfzn zzfznVar = (zzfzn) zzx(i2);
        throw null;
    }

    private static final void zzX(int i, Object obj, zzfxu zzfxuVar) throws IOException {
        if (obj instanceof String) {
            zzfxuVar.zzm(i, (String) obj);
        } else {
            zzfxuVar.zzn(i, (zzfxj) obj);
        }
    }

    static zzgaz zzg(Object obj) {
        zzfym zzfymVar = (zzfym) obj;
        zzgaz zzgazVar = zzfymVar.zzc;
        if (zzgazVar == zzgaz.zza()) {
            zzgaz zzb2 = zzgaz.zzb();
            zzfymVar.zzc = zzb2;
            return zzb2;
        }
        return zzgazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzfzx<T> zzl(Class<T> cls, zzfzr zzfzrVar, zzfzz zzfzzVar, zzfzi zzfziVar, zzgay<?, ?> zzgayVar, zzfxz<?> zzfxzVar, zzfzp zzfzpVar) {
        if (zzfzrVar instanceof zzgae) {
            return zzm((zzgae) zzfzrVar, zzfzzVar, zzfziVar, zzgayVar, zzfxzVar, zzfzpVar);
        }
        zzgav zzgavVar = (zzgav) zzfzrVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.ads.zzfzx<T> zzm(com.google.android.gms.internal.ads.zzgae r34, com.google.android.gms.internal.ads.zzfzz r35, com.google.android.gms.internal.ads.zzfzi r36, com.google.android.gms.internal.ads.zzgay<?, ?> r37, com.google.android.gms.internal.ads.zzfxz<?> r38, com.google.android.gms.internal.ads.zzfzp r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzx.zzm(com.google.android.gms.internal.ads.zzgae, com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzfzi, com.google.android.gms.internal.ads.zzgay, com.google.android.gms.internal.ads.zzfxz, com.google.android.gms.internal.ads.zzfzp):com.google.android.gms.internal.ads.zzfzx");
    }

    private static Field zzo(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzp(T t, T t2, int i) {
        long zzD = zzD(i) & 1048575;
        if (zzO(t2, i)) {
            Object zzn = zzgbi.zzn(t, zzD);
            Object zzn2 = zzgbi.zzn(t2, zzD);
            if (zzn != null && zzn2 != null) {
                zzgbi.zzo(t, zzD, zzfyw.zzi(zzn, zzn2));
                zzP(t, i);
            } else if (zzn2 != null) {
                zzgbi.zzo(t, zzD, zzn2);
                zzP(t, i);
            }
        }
    }

    private final void zzq(T t, T t2, int i) {
        int zzD = zzD(i);
        int i2 = this.zzc[i];
        long j = zzD & 1048575;
        if (zzQ(t2, i2, i)) {
            Object zzn = zzQ(t, i2, i) ? zzgbi.zzn(t, j) : null;
            Object zzn2 = zzgbi.zzn(t2, j);
            if (zzn != null && zzn2 != null) {
                zzgbi.zzo(t, j, zzfyw.zzi(zzn, zzn2));
                zzR(t, i2, i);
            } else if (zzn2 != null) {
                zzgbi.zzo(t, j, zzn2);
                zzR(t, i2, i);
            }
        }
    }

    private final int zzr(T t) {
        int i;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzv;
        int zzw5;
        int zzw6;
        int zzc;
        int zzw7;
        int zzw8;
        int zzu;
        int zzw9;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzD = zzD(i6);
            int i7 = this.zzc[i6];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
                int i8 = this.zzc[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = zzD & 1048575;
            switch (zzF) {
                case 0:
                    if ((i4 & i) != 0) {
                        zzw = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        zzw2 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        zzw3 = zzfxt.zzw(i7 << 3);
                        zzx = zzfxt.zzx(j2);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        zzw3 = zzfxt.zzw(i7 << 3);
                        zzx = zzfxt.zzx(j3);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzv(i10);
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        zzw = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        zzw2 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        zzw5 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzfxj) {
                            zzw6 = zzfxt.zzw(i7 << 3);
                            zzc = ((zzfxj) object).zzc();
                            zzw7 = zzfxt.zzw(zzc);
                            i2 = zzw6 + zzw7 + zzc;
                            i3 += i2;
                        } else {
                            zzw4 = zzfxt.zzw(i7 << 3);
                            zzv = zzfxt.zzy((String) object);
                            i2 = zzw4 + zzv;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        zzw8 = zzgam.zzw(i7, unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        zzw6 = zzfxt.zzw(i7 << 3);
                        zzc = ((zzfxj) unsafe.getObject(t, j)).zzc();
                        zzw7 = zzfxt.zzw(zzc);
                        i2 = zzw6 + zzw7 + zzc;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzw(i11);
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzv(i12);
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        zzw2 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        zzw = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzw((i13 >> 31) ^ (i13 + i13));
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzx((j4 >> 63) ^ (j4 + j4));
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        zzw8 = zzfxt.zzE(i7, (zzfzu) unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzw8 = zzgam.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    zzw8 = zzgam.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    zzw8 = zzgam.zzc(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    zzw8 = zzgam.zze(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    zzw8 = zzgam.zzk(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    zzw8 = zzgam.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    zzw8 = zzgam.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    zzw8 = zzgam.zzu(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    zzw8 = zzgam.zzv(i7, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    zzw8 = zzgam.zzx(i7, (List) unsafe.getObject(t, j), zzw(i6));
                    break;
                case 28:
                    zzw8 = zzgam.zzy(i7, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    zzw8 = zzgam.zzm(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    zzw8 = zzgam.zzi(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    zzw8 = zzgam.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    zzw8 = zzgam.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    zzw8 = zzgam.zzo(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    zzw8 = zzgam.zzg(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    zzv = zzgam.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzv = zzgam.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzv = zzgam.zzb((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzv = zzgam.zzd((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzv = zzgam.zzj((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzv = zzgam.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzv = zzgam.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzv = zzgam.zzt((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzv = zzgam.zzl((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzv = zzgam.zzh((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzv = zzgam.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzv = zzgam.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzv = zzgam.zzn((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    zzv = zzgam.zzf((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i7);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzw8 = zzgam.zzz(i7, (List) unsafe.getObject(t, j), zzw(i6));
                    break;
                case 50:
                    zzfzp.zza(i7, unsafe.getObject(t, j), zzx(i6));
                    continue;
                case 51:
                    if (zzQ(t, i7, i6)) {
                        zzw = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzQ(t, i7, i6)) {
                        zzw2 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzQ(t, i7, i6)) {
                        long zzK = zzK(t, j);
                        zzw3 = zzfxt.zzw(i7 << 3);
                        zzx = zzfxt.zzx(zzK);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzQ(t, i7, i6)) {
                        long zzK2 = zzK(t, j);
                        zzw3 = zzfxt.zzw(i7 << 3);
                        zzx = zzfxt.zzx(zzK2);
                        zzw8 = zzw3 + zzx;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzQ(t, i7, i6)) {
                        int zzJ = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzv(zzJ);
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzQ(t, i7, i6)) {
                        zzw = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzQ(t, i7, i6)) {
                        zzw2 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzQ(t, i7, i6)) {
                        zzw5 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzQ(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzfxj) {
                            zzw6 = zzfxt.zzw(i7 << 3);
                            zzc = ((zzfxj) object2).zzc();
                            zzw7 = zzfxt.zzw(zzc);
                            i2 = zzw6 + zzw7 + zzc;
                            i3 += i2;
                        } else {
                            zzw4 = zzfxt.zzw(i7 << 3);
                            zzv = zzfxt.zzy((String) object2);
                            i2 = zzw4 + zzv;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzQ(t, i7, i6)) {
                        zzw8 = zzgam.zzw(i7, unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzQ(t, i7, i6)) {
                        zzw6 = zzfxt.zzw(i7 << 3);
                        zzc = ((zzfxj) unsafe.getObject(t, j)).zzc();
                        zzw7 = zzfxt.zzw(zzc);
                        i2 = zzw6 + zzw7 + zzc;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzQ(t, i7, i6)) {
                        int zzJ2 = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzw(zzJ2);
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzQ(t, i7, i6)) {
                        int zzJ3 = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzv(zzJ3);
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzQ(t, i7, i6)) {
                        zzw2 = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzQ(t, i7, i6)) {
                        zzw = zzfxt.zzw(i7 << 3);
                        zzw8 = zzw + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzQ(t, i7, i6)) {
                        int zzJ4 = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzw((zzJ4 >> 31) ^ (zzJ4 + zzJ4));
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzQ(t, i7, i6)) {
                        long zzK3 = zzK(t, j);
                        zzw4 = zzfxt.zzw(i7 << 3);
                        zzv = zzfxt.zzx((zzK3 >> 63) ^ (zzK3 + zzK3));
                        i2 = zzw4 + zzv;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzQ(t, i7, i6)) {
                        zzw8 = zzfxt.zzE(i7, (zzfzu) unsafe.getObject(t, j), zzw(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += zzw8;
        }
        zzgay<?, ?> zzgayVar = this.zzo;
        int zzq = i3 + zzgayVar.zzq(zzgayVar.zzj(t));
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return zzq;
    }

    private final int zzs(T t) {
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzv;
        int zzw5;
        int zzw6;
        int zzc;
        int zzw7;
        int zzw8;
        int zzu;
        int zzw9;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzD = zzD(i3);
            int zzF = zzF(zzD);
            int i4 = this.zzc[i3];
            long j = zzD & 1048575;
            if (zzF >= zzfye.DOUBLE_LIST_PACKED.zza() && zzF <= zzfye.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzF) {
                case 0:
                    if (zzO(t, i3)) {
                        zzw = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(t, i3)) {
                        zzw2 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(t, i3)) {
                        long zzf = zzgbi.zzf(t, j);
                        zzw3 = zzfxt.zzw(i4 << 3);
                        zzx = zzfxt.zzx(zzf);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(t, i3)) {
                        long zzf2 = zzgbi.zzf(t, j);
                        zzw3 = zzfxt.zzw(i4 << 3);
                        zzx = zzfxt.zzx(zzf2);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(t, i3)) {
                        int zzd = zzgbi.zzd(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzv(zzd);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(t, i3)) {
                        zzw = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(t, i3)) {
                        zzw2 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(t, i3)) {
                        zzw5 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw5 + 1;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(t, i3)) {
                        break;
                    } else {
                        Object zzn = zzgbi.zzn(t, j);
                        if (zzn instanceof zzfxj) {
                            zzw6 = zzfxt.zzw(i4 << 3);
                            zzc = ((zzfxj) zzn).zzc();
                            zzw7 = zzfxt.zzw(zzc);
                            i = zzw6 + zzw7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzw4 = zzfxt.zzw(i4 << 3);
                            zzv = zzfxt.zzy((String) zzn);
                            i = zzw4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzO(t, i3)) {
                        zzw8 = zzgam.zzw(i4, zzgbi.zzn(t, j), zzw(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(t, i3)) {
                        zzw6 = zzfxt.zzw(i4 << 3);
                        zzc = ((zzfxj) zzgbi.zzn(t, j)).zzc();
                        zzw7 = zzfxt.zzw(zzc);
                        i = zzw6 + zzw7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(t, i3)) {
                        int zzd2 = zzgbi.zzd(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzw(zzd2);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(t, i3)) {
                        int zzd3 = zzgbi.zzd(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzv(zzd3);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(t, i3)) {
                        zzw2 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(t, i3)) {
                        zzw = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(t, i3)) {
                        int zzd4 = zzgbi.zzd(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzw((zzd4 >> 31) ^ (zzd4 + zzd4));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(t, i3)) {
                        long zzf3 = zzgbi.zzf(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzx((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(t, i3)) {
                        zzw8 = zzfxt.zzE(i4, (zzfzu) zzgbi.zzn(t, j), zzw(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzw8 = zzgam.zzs(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 19:
                    zzw8 = zzgam.zzq(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 20:
                    zzw8 = zzgam.zzc(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 21:
                    zzw8 = zzgam.zze(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 22:
                    zzw8 = zzgam.zzk(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 23:
                    zzw8 = zzgam.zzs(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 24:
                    zzw8 = zzgam.zzq(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 25:
                    zzw8 = zzgam.zzu(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 26:
                    zzw8 = zzgam.zzv(i4, (List) zzgbi.zzn(t, j));
                    i2 += zzw8;
                    break;
                case 27:
                    zzw8 = zzgam.zzx(i4, (List) zzgbi.zzn(t, j), zzw(i3));
                    i2 += zzw8;
                    break;
                case 28:
                    zzw8 = zzgam.zzy(i4, (List) zzgbi.zzn(t, j));
                    i2 += zzw8;
                    break;
                case 29:
                    zzw8 = zzgam.zzm(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 30:
                    zzw8 = zzgam.zzi(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 31:
                    zzw8 = zzgam.zzq(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 32:
                    zzw8 = zzgam.zzs(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 33:
                    zzw8 = zzgam.zzo(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 34:
                    zzw8 = zzgam.zzg(i4, (List) zzgbi.zzn(t, j), false);
                    i2 += zzw8;
                    break;
                case 35:
                    zzv = zzgam.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzgam.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzgam.zzb((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzgam.zzd((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzgam.zzj((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzgam.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzgam.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzgam.zzt((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzgam.zzl((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzgam.zzh((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzgam.zzp((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzgam.zzr((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzgam.zzn((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzgam.zzf((List) unsafe.getObject(t, j));
                    if (zzv > 0) {
                        zzu = zzfxt.zzu(i4);
                        zzw9 = zzfxt.zzw(zzv);
                        zzw4 = zzu + zzw9;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw8 = zzgam.zzz(i4, (List) zzgbi.zzn(t, j), zzw(i3));
                    i2 += zzw8;
                    break;
                case 50:
                    zzfzp.zza(i4, zzgbi.zzn(t, j), zzx(i3));
                    break;
                case 51:
                    if (zzQ(t, i4, i3)) {
                        zzw = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzQ(t, i4, i3)) {
                        zzw2 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzQ(t, i4, i3)) {
                        long zzK = zzK(t, j);
                        zzw3 = zzfxt.zzw(i4 << 3);
                        zzx = zzfxt.zzx(zzK);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzQ(t, i4, i3)) {
                        long zzK2 = zzK(t, j);
                        zzw3 = zzfxt.zzw(i4 << 3);
                        zzx = zzfxt.zzx(zzK2);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzQ(t, i4, i3)) {
                        int zzJ = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzv(zzJ);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzQ(t, i4, i3)) {
                        zzw = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzQ(t, i4, i3)) {
                        zzw2 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzQ(t, i4, i3)) {
                        zzw5 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw5 + 1;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzQ(t, i4, i3)) {
                        break;
                    } else {
                        Object zzn2 = zzgbi.zzn(t, j);
                        if (zzn2 instanceof zzfxj) {
                            zzw6 = zzfxt.zzw(i4 << 3);
                            zzc = ((zzfxj) zzn2).zzc();
                            zzw7 = zzfxt.zzw(zzc);
                            i = zzw6 + zzw7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzw4 = zzfxt.zzw(i4 << 3);
                            zzv = zzfxt.zzy((String) zzn2);
                            i = zzw4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzQ(t, i4, i3)) {
                        zzw8 = zzgam.zzw(i4, zzgbi.zzn(t, j), zzw(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzQ(t, i4, i3)) {
                        zzw6 = zzfxt.zzw(i4 << 3);
                        zzc = ((zzfxj) zzgbi.zzn(t, j)).zzc();
                        zzw7 = zzfxt.zzw(zzc);
                        i = zzw6 + zzw7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzQ(t, i4, i3)) {
                        int zzJ2 = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzw(zzJ2);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzQ(t, i4, i3)) {
                        int zzJ3 = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzv(zzJ3);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzQ(t, i4, i3)) {
                        zzw2 = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw2 + 4;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzQ(t, i4, i3)) {
                        zzw = zzfxt.zzw(i4 << 3);
                        zzw8 = zzw + 8;
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzQ(t, i4, i3)) {
                        int zzJ4 = zzJ(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzw((zzJ4 >> 31) ^ (zzJ4 + zzJ4));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzQ(t, i4, i3)) {
                        long zzK3 = zzK(t, j);
                        zzw4 = zzfxt.zzw(i4 << 3);
                        zzv = zzfxt.zzx((zzK3 >> 63) ^ (zzK3 + zzK3));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzQ(t, i4, i3)) {
                        zzw8 = zzfxt.zzE(i4, (zzfzu) zzgbi.zzn(t, j), zzw(i3));
                        i2 += zzw8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgay<?, ?> zzgayVar = this.zzo;
        return i2 + zzgayVar.zzq(zzgayVar.zzj(t));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzt(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzfww r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzx.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzfww):int");
    }

    private final <K, V> int zzu(T t, byte[] bArr, int i, int i2, int i3, long j, zzfww zzfwwVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzx = zzx(i3);
        Object object = unsafe.getObject(t, j);
        if (zzfzp.zzb(object)) {
            zzfzo<K, V> zzc = zzfzo.zza().zzc();
            zzfzp.zzc(zzc, object);
            unsafe.putObject(t, j, zzc);
        }
        zzfzn zzfznVar = (zzfzn) zzx;
        throw null;
    }

    private final int zzv(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzfww zzfwwVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zzfwx.zze(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zzfwx.zzd(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzc = zzfwx.zzc(bArr, i, zzfwwVar);
                    unsafe.putObject(t, j, Long.valueOf(zzfwwVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzc;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zza2 = zzfwx.zza(bArr, i, zzfwwVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzfwwVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzfwx.zze(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzfwx.zzd(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzc2 = zzfwx.zzc(bArr, i, zzfwwVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzfwwVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzc2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zza3 = zzfwx.zza(bArr, i, zzfwwVar);
                    int i9 = zzfwwVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    } else if ((i6 & 536870912) == 0 || zzgbn.zzb(bArr, zza3, zza3 + i9)) {
                        unsafe.putObject(t, j, new String(bArr, zza3, i9, zzfyw.zza));
                        zza3 += i9;
                    } else {
                        throw zzfyy.zzl();
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzi = zzfwx.zzi(zzw(i8), bArr, i, i2, zzfwwVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzfwwVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzfyw.zzi(object, zzfwwVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzi;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zzh = zzfwx.zzh(bArr, i, zzfwwVar);
                    unsafe.putObject(t, j, zzfwwVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzh;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzfwx.zza(bArr, i, zzfwwVar);
                    int i10 = zzfwwVar.zza;
                    zzfyq zzy = zzy(i8);
                    if (zzy == null || zzy.zza(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    } else {
                        zzg(t).zzh(i3, Long.valueOf(i10));
                    }
                    return zza4;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zza5 = zzfwx.zza(bArr, i, zzfwwVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzfxo.zzG(zzfwwVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zza5;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzc3 = zzfwx.zzc(bArr, i, zzfwwVar);
                    unsafe.putObject(t, j, Long.valueOf(zzfxo.zzH(zzfwwVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzc3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzj = zzfwx.zzj(zzw(i8), bArr, i, i2, (i3 & (-8)) | 4, zzfwwVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzfwwVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzfyw.zzi(object2, zzfwwVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzj;
                }
                break;
        }
        return i;
    }

    private final zzgak zzw(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgak zzgakVar = (zzgak) this.zzd[i3];
        if (zzgakVar != null) {
            return zzgakVar;
        }
        zzgak<T> zzb2 = zzgac.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzx(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzfyq zzy(int i) {
        int i2 = i / 3;
        return (zzfyq) this.zzd[i2 + i2 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a8, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02aa, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f1, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0314, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzz(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzfww r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzx.zzz(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzfww):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final T zza() {
        return (T) ((zzfym) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final boolean zzb(T t, T t2) {
        boolean zzD;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzD2 = zzD(i);
            long j = zzD2 & 1048575;
            switch (zzF(zzD2)) {
                case 0:
                    if (zzM(t, t2, i) && Double.doubleToLongBits(zzgbi.zzl(t, j)) == Double.doubleToLongBits(zzgbi.zzl(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzM(t, t2, i) && Float.floatToIntBits(zzgbi.zzj(t, j)) == Float.floatToIntBits(zzgbi.zzj(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzM(t, t2, i) && zzgbi.zzf(t, j) == zzgbi.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzM(t, t2, i) && zzgbi.zzf(t, j) == zzgbi.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzM(t, t2, i) && zzgbi.zzd(t, j) == zzgbi.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzM(t, t2, i) && zzgbi.zzf(t, j) == zzgbi.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzM(t, t2, i) && zzgbi.zzd(t, j) == zzgbi.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzM(t, t2, i) && zzgbi.zzh(t, j) == zzgbi.zzh(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzM(t, t2, i) && zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzM(t, t2, i) && zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzM(t, t2, i) && zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzM(t, t2, i) && zzgbi.zzd(t, j) == zzgbi.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzM(t, t2, i) && zzgbi.zzd(t, j) == zzgbi.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzM(t, t2, i) && zzgbi.zzd(t, j) == zzgbi.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzM(t, t2, i) && zzgbi.zzf(t, j) == zzgbi.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzM(t, t2, i) && zzgbi.zzd(t, j) == zzgbi.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzM(t, t2, i) && zzgbi.zzf(t, j) == zzgbi.zzf(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzM(t, t2, i) && zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzD = zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j));
                    break;
                case 50:
                    zzD = zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzE = zzE(i) & 1048575;
                    if (zzgbi.zzd(t, zzE) == zzgbi.zzd(t2, zzE) && zzgam.zzD(zzgbi.zzn(t, j), zzgbi.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzD) {
                return false;
            }
        }
        if (this.zzo.zzj(t).equals(this.zzo.zzj(t2))) {
            if (this.zzh) {
                this.zzp.zzb(t);
                this.zzp.zzb(t2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final int zzc(T t) {
        int i;
        int zze;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzD = zzD(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzD;
            int i5 = 37;
            switch (zzF(zzD)) {
                case 0:
                    i = i2 * 53;
                    zze = zzfyw.zze(Double.doubleToLongBits(zzgbi.zzl(t, j)));
                    i2 = i + zze;
                    break;
                case 1:
                    i = i2 * 53;
                    zze = Float.floatToIntBits(zzgbi.zzj(t, j));
                    i2 = i + zze;
                    break;
                case 2:
                    i = i2 * 53;
                    zze = zzfyw.zze(zzgbi.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 3:
                    i = i2 * 53;
                    zze = zzfyw.zze(zzgbi.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 4:
                    i = i2 * 53;
                    zze = zzgbi.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 5:
                    i = i2 * 53;
                    zze = zzfyw.zze(zzgbi.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 6:
                    i = i2 * 53;
                    zze = zzgbi.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 7:
                    i = i2 * 53;
                    zze = zzfyw.zzf(zzgbi.zzh(t, j));
                    i2 = i + zze;
                    break;
                case 8:
                    i = i2 * 53;
                    zze = ((String) zzgbi.zzn(t, j)).hashCode();
                    i2 = i + zze;
                    break;
                case 9:
                    Object zzn = zzgbi.zzn(t, j);
                    if (zzn != null) {
                        i5 = zzn.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zze = zzgbi.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 11:
                    i = i2 * 53;
                    zze = zzgbi.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 12:
                    i = i2 * 53;
                    zze = zzgbi.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 13:
                    i = i2 * 53;
                    zze = zzgbi.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 14:
                    i = i2 * 53;
                    zze = zzfyw.zze(zzgbi.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 15:
                    i = i2 * 53;
                    zze = zzgbi.zzd(t, j);
                    i2 = i + zze;
                    break;
                case 16:
                    i = i2 * 53;
                    zze = zzfyw.zze(zzgbi.zzf(t, j));
                    i2 = i + zze;
                    break;
                case 17:
                    Object zzn2 = zzgbi.zzn(t, j);
                    if (zzn2 != null) {
                        i5 = zzn2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zze = zzgbi.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 50:
                    i = i2 * 53;
                    zze = zzgbi.zzn(t, j).hashCode();
                    i2 = i + zze;
                    break;
                case 51:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zze(Double.doubleToLongBits(zzH(t, j)));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = Float.floatToIntBits(zzI(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zzf(zzL(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = ((String) zzgbi.zzn(t, j)).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzgbi.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzgbi.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzJ(t, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzfyw.zze(zzK(t, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        zze = zzgbi.zzn(t, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzo.zzj(t).hashCode();
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final int zze(T t) {
        return this.zzj ? zzs(t) : zzr(t);
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzf(T t, zzgaf zzgafVar, zzfxy zzfxyVar) throws IOException {
        Objects.requireNonNull(zzfxyVar);
        zzgay zzgayVar = this.zzo;
        zzfxz<?> zzfxzVar = this.zzp;
        zzfyd<?> zzfydVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzb2 = zzgafVar.zzb();
                int zzS = zzS(zzb2);
                if (zzS >= 0) {
                    int zzD = zzD(zzS);
                    try {
                        switch (zzF(zzD)) {
                            case 0:
                                zzgbi.zzm(t, zzD & 1048575, zzgafVar.zze());
                                zzP(t, zzS);
                                break;
                            case 1:
                                zzgbi.zzk(t, zzD & 1048575, zzgafVar.zzf());
                                zzP(t, zzS);
                                break;
                            case 2:
                                zzgbi.zzg(t, zzD & 1048575, zzgafVar.zzh());
                                zzP(t, zzS);
                                break;
                            case 3:
                                zzgbi.zzg(t, zzD & 1048575, zzgafVar.zzg());
                                zzP(t, zzS);
                                break;
                            case 4:
                                zzgbi.zze(t, zzD & 1048575, zzgafVar.zzi());
                                zzP(t, zzS);
                                break;
                            case 5:
                                zzgbi.zzg(t, zzD & 1048575, zzgafVar.zzj());
                                zzP(t, zzS);
                                break;
                            case 6:
                                zzgbi.zze(t, zzD & 1048575, zzgafVar.zzk());
                                zzP(t, zzS);
                                break;
                            case 7:
                                zzgbi.zzi(t, zzD & 1048575, zzgafVar.zzl());
                                zzP(t, zzS);
                                break;
                            case 8:
                                zzC(t, zzD, zzgafVar);
                                zzP(t, zzS);
                                break;
                            case 9:
                                if (zzO(t, zzS)) {
                                    long j = zzD & 1048575;
                                    zzgbi.zzo(t, j, zzfyw.zzi(zzgbi.zzn(t, j), zzgafVar.zzo(zzw(zzS), zzfxyVar)));
                                    break;
                                } else {
                                    zzgbi.zzo(t, zzD & 1048575, zzgafVar.zzo(zzw(zzS), zzfxyVar));
                                    zzP(t, zzS);
                                    break;
                                }
                            case 10:
                                zzgbi.zzo(t, zzD & 1048575, zzgafVar.zzq());
                                zzP(t, zzS);
                                break;
                            case 11:
                                zzgbi.zze(t, zzD & 1048575, zzgafVar.zzr());
                                zzP(t, zzS);
                                break;
                            case 12:
                                int zzs = zzgafVar.zzs();
                                zzfyq zzy = zzy(zzS);
                                if (zzy != null && !zzy.zza(zzs)) {
                                    obj = zzgam.zzH(zzb2, zzs, obj, zzgayVar);
                                    break;
                                }
                                zzgbi.zze(t, zzD & 1048575, zzs);
                                zzP(t, zzS);
                                break;
                            case 13:
                                zzgbi.zze(t, zzD & 1048575, zzgafVar.zzt());
                                zzP(t, zzS);
                                break;
                            case 14:
                                zzgbi.zzg(t, zzD & 1048575, zzgafVar.zzu());
                                zzP(t, zzS);
                                break;
                            case 15:
                                zzgbi.zze(t, zzD & 1048575, zzgafVar.zzv());
                                zzP(t, zzS);
                                break;
                            case 16:
                                zzgbi.zzg(t, zzD & 1048575, zzgafVar.zzw());
                                zzP(t, zzS);
                                break;
                            case 17:
                                if (zzO(t, zzS)) {
                                    long j2 = zzD & 1048575;
                                    zzgbi.zzo(t, j2, zzfyw.zzi(zzgbi.zzn(t, j2), zzgafVar.zzp(zzw(zzS), zzfxyVar)));
                                    break;
                                } else {
                                    zzgbi.zzo(t, zzD & 1048575, zzgafVar.zzp(zzw(zzS), zzfxyVar));
                                    zzP(t, zzS);
                                    break;
                                }
                            case 18:
                                zzgafVar.zzx(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 19:
                                zzgafVar.zzy(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 20:
                                zzgafVar.zzA(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 21:
                                zzgafVar.zzz(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 22:
                                zzgafVar.zzB(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 23:
                                zzgafVar.zzC(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 24:
                                zzgafVar.zzD(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 25:
                                zzgafVar.zzE(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 26:
                                if (zzG(zzD)) {
                                    ((zzfxp) zzgafVar).zzF(this.zzn.zza(t, zzD & 1048575), true);
                                    break;
                                } else {
                                    ((zzfxp) zzgafVar).zzF(this.zzn.zza(t, zzD & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzgafVar.zzG(this.zzn.zza(t, zzD & 1048575), zzw(zzS), zzfxyVar);
                                break;
                            case 28:
                                zzgafVar.zzI(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 29:
                                zzgafVar.zzJ(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 30:
                                List<Integer> zza2 = this.zzn.zza(t, zzD & 1048575);
                                zzgafVar.zzK(zza2);
                                obj = zzgam.zzG(zzb2, zza2, zzy(zzS), obj, zzgayVar);
                                break;
                            case 31:
                                zzgafVar.zzL(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 32:
                                zzgafVar.zzM(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 33:
                                zzgafVar.zzN(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 34:
                                zzgafVar.zzO(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 35:
                                zzgafVar.zzx(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 36:
                                zzgafVar.zzy(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 37:
                                zzgafVar.zzA(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 38:
                                zzgafVar.zzz(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 39:
                                zzgafVar.zzB(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 40:
                                zzgafVar.zzC(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 41:
                                zzgafVar.zzD(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 42:
                                zzgafVar.zzE(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 43:
                                zzgafVar.zzJ(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 44:
                                List<Integer> zza3 = this.zzn.zza(t, zzD & 1048575);
                                zzgafVar.zzK(zza3);
                                obj = zzgam.zzG(zzb2, zza3, zzy(zzS), obj, zzgayVar);
                                break;
                            case 45:
                                zzgafVar.zzL(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 46:
                                zzgafVar.zzM(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 47:
                                zzgafVar.zzN(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 48:
                                zzgafVar.zzO(this.zzn.zza(t, zzD & 1048575));
                                break;
                            case 49:
                                zzgafVar.zzH(this.zzn.zza(t, zzD & 1048575), zzw(zzS), zzfxyVar);
                                break;
                            case 50:
                                Object zzx = zzx(zzS);
                                long zzD2 = zzD(zzS) & 1048575;
                                Object zzn = zzgbi.zzn(t, zzD2);
                                if (zzn == null) {
                                    zzn = zzfzo.zza().zzc();
                                    zzgbi.zzo(t, zzD2, zzn);
                                } else if (zzfzp.zzb(zzn)) {
                                    Object zzc = zzfzo.zza().zzc();
                                    zzfzp.zzc(zzc, zzn);
                                    zzgbi.zzo(t, zzD2, zzc);
                                    zzn = zzc;
                                }
                                zzfzo zzfzoVar = (zzfzo) zzn;
                                zzfzn zzfznVar = (zzfzn) zzx;
                                throw null;
                                break;
                            case 51:
                                zzgbi.zzo(t, zzD & 1048575, Double.valueOf(zzgafVar.zze()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 52:
                                zzgbi.zzo(t, zzD & 1048575, Float.valueOf(zzgafVar.zzf()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 53:
                                zzgbi.zzo(t, zzD & 1048575, Long.valueOf(zzgafVar.zzh()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 54:
                                zzgbi.zzo(t, zzD & 1048575, Long.valueOf(zzgafVar.zzg()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 55:
                                zzgbi.zzo(t, zzD & 1048575, Integer.valueOf(zzgafVar.zzi()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 56:
                                zzgbi.zzo(t, zzD & 1048575, Long.valueOf(zzgafVar.zzj()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 57:
                                zzgbi.zzo(t, zzD & 1048575, Integer.valueOf(zzgafVar.zzk()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 58:
                                zzgbi.zzo(t, zzD & 1048575, Boolean.valueOf(zzgafVar.zzl()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 59:
                                zzC(t, zzD, zzgafVar);
                                zzR(t, zzb2, zzS);
                                break;
                            case 60:
                                if (zzQ(t, zzb2, zzS)) {
                                    long j3 = zzD & 1048575;
                                    zzgbi.zzo(t, j3, zzfyw.zzi(zzgbi.zzn(t, j3), zzgafVar.zzo(zzw(zzS), zzfxyVar)));
                                } else {
                                    zzgbi.zzo(t, zzD & 1048575, zzgafVar.zzo(zzw(zzS), zzfxyVar));
                                    zzP(t, zzS);
                                }
                                zzR(t, zzb2, zzS);
                                break;
                            case 61:
                                zzgbi.zzo(t, zzD & 1048575, zzgafVar.zzq());
                                zzR(t, zzb2, zzS);
                                break;
                            case 62:
                                zzgbi.zzo(t, zzD & 1048575, Integer.valueOf(zzgafVar.zzr()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 63:
                                int zzs2 = zzgafVar.zzs();
                                zzfyq zzy2 = zzy(zzS);
                                if (zzy2 != null && !zzy2.zza(zzs2)) {
                                    obj = zzgam.zzH(zzb2, zzs2, obj, zzgayVar);
                                    break;
                                }
                                zzgbi.zzo(t, zzD & 1048575, Integer.valueOf(zzs2));
                                zzR(t, zzb2, zzS);
                                break;
                            case 64:
                                zzgbi.zzo(t, zzD & 1048575, Integer.valueOf(zzgafVar.zzt()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 65:
                                zzgbi.zzo(t, zzD & 1048575, Long.valueOf(zzgafVar.zzu()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 66:
                                zzgbi.zzo(t, zzD & 1048575, Integer.valueOf(zzgafVar.zzv()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 67:
                                zzgbi.zzo(t, zzD & 1048575, Long.valueOf(zzgafVar.zzw()));
                                zzR(t, zzb2, zzS);
                                break;
                            case 68:
                                zzgbi.zzo(t, zzD & 1048575, zzgafVar.zzp(zzw(zzS), zzfxyVar));
                                zzR(t, zzb2, zzS);
                                break;
                            default:
                                if (obj == null) {
                                    obj = zzgayVar.zzg();
                                }
                                if (!zzgayVar.zzn(obj, zzgafVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        obj = zzA(t, this.zzk[i], obj, zzgayVar);
                                    }
                                    if (obj != null) {
                                        zzgayVar.zzl(t, obj);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzfyx unused) {
                        zzgayVar.zza(zzgafVar);
                        if (obj == null) {
                            obj = zzgayVar.zzk(t);
                        }
                        if (!zzgayVar.zzn(obj, zzgafVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                obj = zzA(t, this.zzk[i2], obj, zzgayVar);
                            }
                            if (obj != null) {
                                zzgayVar.zzl(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                        obj = zzA(t, this.zzk[i3], obj, zzgayVar);
                    }
                    if (obj != null) {
                        zzgayVar.zzl(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zzf = !this.zzh ? null : zzfxzVar.zzf(zzfxyVar, this.zzg, zzb2);
                    if (zzf != null) {
                        if (zzfydVar == null) {
                            zzfydVar = zzfxzVar.zzc(t);
                        }
                        zzfyd<?> zzfydVar2 = zzfydVar;
                        obj = zzfxzVar.zze(zzgafVar, zzf, zzfxyVar, zzfydVar2, obj, zzgayVar);
                        zzfydVar = zzfydVar2;
                    } else {
                        zzgayVar.zza(zzgafVar);
                        if (obj == null) {
                            obj = zzgayVar.zzk(t);
                        }
                        if (!zzgayVar.zzn(obj, zzgafVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                obj = zzA(t, this.zzk[i4], obj, zzgayVar);
                            }
                            if (obj != null) {
                                zzgayVar.zzl(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    obj = zzA(t, this.zzk[i5], obj, zzgayVar);
                }
                if (obj != null) {
                    zzgayVar.zzl(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x042b, code lost:
        if (r6 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042d, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0433, code lost:
        r3 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0437, code lost:
        if (r3 >= r9.zzm) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0439, code lost:
        r9.zzA(r12, r9.zzk[r3], r2, r9.zzo);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0445, code lost:
        if (r7 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0449, code lost:
        if (r0 != r32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0450, code lost:
        throw com.google.android.gms.internal.ads.zzfyy.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0453, code lost:
        if (r0 > r32) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0455, code lost:
        if (r1 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0457, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x045c, code lost:
        throw com.google.android.gms.internal.ads.zzfyy.zzk();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzh(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.zzfww r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzx.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzfww):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzi(T t, byte[] bArr, int i, int i2, zzfww zzfwwVar) throws IOException {
        if (this.zzj) {
            zzz(t, bArr, i, i2, zzfwwVar);
        } else {
            zzh(t, bArr, i, i2, 0, zzfwwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzj(T t) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzD = zzD(this.zzk[i2]) & 1048575;
            Object zzn = zzgbi.zzn(t, zzD);
            if (zzn != null) {
                ((zzfzo) zzn).zzd();
                zzgbi.zzo(t, zzD, zzn);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzd(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgak
    public final boolean zzk(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzD = zzD(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzD) != 0 && !zzN(t, i6, i, i2, i10)) {
                return false;
            }
            int zzF = zzF(zzD);
            if (zzF != 9 && zzF != 17) {
                if (zzF != 27) {
                    if (zzF == 60 || zzF == 68) {
                        if (zzQ(t, i7, i6) && !zzB(t, zzD, zzw(i6))) {
                            return false;
                        }
                    } else if (zzF != 49) {
                        if (zzF == 50 && !((zzfzo) zzgbi.zzn(t, zzD & 1048575)).isEmpty()) {
                            zzfzn zzfznVar = (zzfzn) zzx(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgbi.zzn(t, zzD & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgak zzw = zzw(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzw.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzN(t, i6, i, i2, i10) && !zzB(t, zzD, zzw(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzn(T t, zzfxu zzfxuVar) throws IOException {
        if (!this.zzj) {
            zzV(t, zzfxuVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzD = zzD(i);
                int i2 = this.zzc[i];
                switch (zzF(zzD)) {
                    case 0:
                        if (zzO(t, i)) {
                            zzfxuVar.zzf(i2, zzgbi.zzl(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(t, i)) {
                            zzfxuVar.zze(i2, zzgbi.zzj(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(t, i)) {
                            zzfxuVar.zzc(i2, zzgbi.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(t, i)) {
                            zzfxuVar.zzh(i2, zzgbi.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(t, i)) {
                            zzfxuVar.zzi(i2, zzgbi.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(t, i)) {
                            zzfxuVar.zzj(i2, zzgbi.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(t, i)) {
                            zzfxuVar.zzk(i2, zzgbi.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(t, i)) {
                            zzfxuVar.zzl(i2, zzgbi.zzh(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(t, i)) {
                            zzX(i2, zzgbi.zzn(t, zzD & 1048575), zzfxuVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(t, i)) {
                            zzfxuVar.zzr(i2, zzgbi.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(t, i)) {
                            zzfxuVar.zzn(i2, (zzfxj) zzgbi.zzn(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(t, i)) {
                            zzfxuVar.zzo(i2, zzgbi.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(t, i)) {
                            zzfxuVar.zzg(i2, zzgbi.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(t, i)) {
                            zzfxuVar.zzb(i2, zzgbi.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(t, i)) {
                            zzfxuVar.zzd(i2, zzgbi.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(t, i)) {
                            zzfxuVar.zzp(i2, zzgbi.zzd(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(t, i)) {
                            zzfxuVar.zzq(i2, zzgbi.zzf(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(t, i)) {
                            zzfxuVar.zzs(i2, zzgbi.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgam.zzJ(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 19:
                        zzgam.zzK(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 20:
                        zzgam.zzL(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 21:
                        zzgam.zzM(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 22:
                        zzgam.zzQ(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 23:
                        zzgam.zzO(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 24:
                        zzgam.zzT(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 25:
                        zzgam.zzW(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 26:
                        zzgam.zzX(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar);
                        break;
                    case 27:
                        zzgam.zzZ(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, zzw(i));
                        break;
                    case 28:
                        zzgam.zzY(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar);
                        break;
                    case 29:
                        zzgam.zzR(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 30:
                        zzgam.zzV(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 31:
                        zzgam.zzU(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 32:
                        zzgam.zzP(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 33:
                        zzgam.zzS(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 34:
                        zzgam.zzN(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, false);
                        break;
                    case 35:
                        zzgam.zzJ(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 36:
                        zzgam.zzK(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 37:
                        zzgam.zzL(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 38:
                        zzgam.zzM(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 39:
                        zzgam.zzQ(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 40:
                        zzgam.zzO(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 41:
                        zzgam.zzT(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 42:
                        zzgam.zzW(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 43:
                        zzgam.zzR(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 44:
                        zzgam.zzV(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 45:
                        zzgam.zzU(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 46:
                        zzgam.zzP(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 47:
                        zzgam.zzS(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 48:
                        zzgam.zzN(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, true);
                        break;
                    case 49:
                        zzgam.zzaa(this.zzc[i], (List) zzgbi.zzn(t, zzD & 1048575), zzfxuVar, zzw(i));
                        break;
                    case 50:
                        zzW(zzfxuVar, i2, zzgbi.zzn(t, zzD & 1048575), i);
                        break;
                    case 51:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzf(i2, zzH(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zze(i2, zzI(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzc(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzh(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzi(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzj(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzk(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzl(i2, zzL(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzQ(t, i2, i)) {
                            zzX(i2, zzgbi.zzn(t, zzD & 1048575), zzfxuVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzr(i2, zzgbi.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzn(i2, (zzfxj) zzgbi.zzn(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzo(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzg(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzb(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzd(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzp(i2, zzJ(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzq(i2, zzK(t, zzD & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzQ(t, i2, i)) {
                            zzfxuVar.zzs(i2, zzgbi.zzn(t, zzD & 1048575), zzw(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgay<?, ?> zzgayVar = this.zzo;
            zzgayVar.zzr(zzgayVar.zzj(t), zzfxuVar);
        } else {
            this.zzp.zzb(t);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzd(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzD = zzD(i);
            long j = 1048575 & zzD;
            int i2 = this.zzc[i];
            switch (zzF(zzD)) {
                case 0:
                    if (zzO(t2, i)) {
                        zzgbi.zzm(t, j, zzgbi.zzl(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(t2, i)) {
                        zzgbi.zzk(t, j, zzgbi.zzj(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(t2, i)) {
                        zzgbi.zzg(t, j, zzgbi.zzf(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(t2, i)) {
                        zzgbi.zzg(t, j, zzgbi.zzf(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(t2, i)) {
                        zzgbi.zze(t, j, zzgbi.zzd(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(t2, i)) {
                        zzgbi.zzg(t, j, zzgbi.zzf(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(t2, i)) {
                        zzgbi.zze(t, j, zzgbi.zzd(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(t2, i)) {
                        zzgbi.zzi(t, j, zzgbi.zzh(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(t2, i)) {
                        zzgbi.zzo(t, j, zzgbi.zzn(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzp(t, t2, i);
                    break;
                case 10:
                    if (zzO(t2, i)) {
                        zzgbi.zzo(t, j, zzgbi.zzn(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(t2, i)) {
                        zzgbi.zze(t, j, zzgbi.zzd(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(t2, i)) {
                        zzgbi.zze(t, j, zzgbi.zzd(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(t2, i)) {
                        zzgbi.zze(t, j, zzgbi.zzd(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(t2, i)) {
                        zzgbi.zzg(t, j, zzgbi.zzf(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(t2, i)) {
                        zzgbi.zze(t, j, zzgbi.zzd(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(t2, i)) {
                        zzgbi.zzg(t, j, zzgbi.zzf(t2, j));
                        zzP(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzp(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(t, t2, j);
                    break;
                case 50:
                    zzgam.zzI(this.zzr, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzQ(t2, i2, i)) {
                        zzgbi.zzo(t, j, zzgbi.zzn(t2, j));
                        zzR(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzq(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzQ(t2, i2, i)) {
                        zzgbi.zzo(t, j, zzgbi.zzn(t2, j));
                        zzR(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzq(t, t2, i);
                    break;
            }
        }
        zzgam.zzF(this.zzo, t, t2);
        if (this.zzh) {
            zzgam.zzE(this.zzp, t, t2);
        }
    }
}
