package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgam {
    private static final Class<?> zza;
    private static final zzgay<?, ?> zzb;
    private static final zzgay<?, ?> zzc;
    private static final zzgay<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgba();
    }

    public static zzgay<?, ?> zzA() {
        return zzb;
    }

    public static zzgay<?, ?> zzB() {
        return zzc;
    }

    public static zzgay<?, ?> zzC() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzD(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzfyc<FT>> void zzE(zzfxz<FT> zzfxzVar, T t, T t2) {
        zzfxzVar.zzb(t2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zzF(zzgay<UT, UB> zzgayVar, T t, T t2) {
        zzgayVar.zzi(t, zzgayVar.zzo(zzgayVar.zzj(t), zzgayVar.zzj(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zzG(int i, List<Integer> list, zzfyq zzfyqVar, UB ub, zzgay<UT, UB> zzgayVar) {
        if (zzfyqVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfyqVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zzH(i, intValue, ub, zzgayVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfyqVar.zza(intValue2)) {
                    ub = (UB) zzH(i, intValue2, ub, zzgayVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zzH(int i, int i2, UB ub, zzgay<UT, UB> zzgayVar) {
        if (ub == null) {
            ub = zzgayVar.zzg();
        }
        zzgayVar.zzb(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zzI(zzfzp zzfzpVar, T t, T t2, long j) {
        zzgbi.zzo(t, j, zzfzp.zzc(zzgbi.zzn(t, j), zzgbi.zzn(t2, j)));
    }

    public static void zzJ(int i, List<Double> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzB(i, list, z);
    }

    public static void zzK(int i, List<Float> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzA(i, list, z);
    }

    public static void zzL(int i, List<Long> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzx(i, list, z);
    }

    public static void zzM(int i, List<Long> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzy(i, list, z);
    }

    public static void zzN(int i, List<Long> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzK(i, list, z);
    }

    public static void zzO(int i, List<Long> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzz(i, list, z);
    }

    public static void zzP(int i, List<Long> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzI(i, list, z);
    }

    public static void zzQ(int i, List<Integer> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzv(i, list, z);
    }

    public static void zzR(int i, List<Integer> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzG(i, list, z);
    }

    public static void zzS(int i, List<Integer> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzJ(i, list, z);
    }

    public static void zzT(int i, List<Integer> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzw(i, list, z);
    }

    public static void zzU(int i, List<Integer> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzH(i, list, z);
    }

    public static void zzV(int i, List<Integer> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzC(i, list, z);
    }

    public static void zzW(int i, List<Boolean> list, zzfxu zzfxuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzD(i, list, z);
    }

    public static void zzX(int i, List<String> list, zzfxu zzfxuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzE(i, list);
    }

    public static void zzY(int i, List<zzfxj> list, zzfxu zzfxuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxuVar.zzF(i, list);
    }

    public static void zzZ(int i, List<?> list, zzfxu zzfxuVar, zzgak zzgakVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxuVar.zzr(i, list.get(i2), zzgakVar);
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzfym.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzaa(int i, List<?> list, zzfxu zzfxuVar, zzgak zzgakVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxuVar.zzs(i, list.get(i2), zzgakVar);
        }
    }

    private static zzgay<?, ?> zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgay) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzx(zzfzjVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzx(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzb(list) + (list.size() * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzx(zzfzjVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzx(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            i = 0;
            while (i2 < size) {
                long zzf = zzfzjVar.zzf(i2);
                i += zzfxt.zzx((zzf >> 63) ^ (zzf + zzf));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += zzfxt.zzx((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzv(zzfynVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzv(zzfynVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzw(zzfynVar.zzg(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzfxt.zzw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            i = 0;
            while (i2 < size) {
                int zzg = zzfynVar.zzg(i2);
                i += zzfxt.zzw((zzg >> 31) ^ (zzg + zzg));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += zzfxt.zzw((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzn(list) + (size * zzfxt.zzu(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfxt.zzw(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfxt.zzw(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfxt.zzw(i << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzu = zzfxt.zzu(i) * size;
        if (list instanceof zzfze) {
            zzfze zzfzeVar = (zzfze) list;
            while (i2 < size) {
                Object zzg = zzfzeVar.zzg(i2);
                if (zzg instanceof zzfxj) {
                    zzy2 = zzfxt.zzA((zzfxj) zzg);
                } else {
                    zzy2 = zzfxt.zzy((String) zzg);
                }
                zzu += zzy2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzfxj) {
                    zzy = zzfxt.zzA((zzfxj) obj);
                } else {
                    zzy = zzfxt.zzy((String) obj);
                }
                zzu += zzy;
                i2++;
            }
        }
        return zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, Object obj, zzgak zzgakVar) {
        if (obj instanceof zzfzc) {
            int zzw = zzfxt.zzw(i << 3);
            int zza2 = ((zzfzc) obj).zza();
            return zzw + zzfxt.zzw(zza2) + zza2;
        }
        return zzfxt.zzw(i << 3) + zzfxt.zzB((zzfzu) obj, zzgakVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, zzgak zzgakVar) {
        int zzB;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzfxt.zzu(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzfzc) {
                zzB = zzfxt.zzz((zzfzc) obj);
            } else {
                zzB = zzfxt.zzB((zzfzu) obj, zzgakVar);
            }
            zzu += zzB;
        }
        return zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(int i, List<zzfxj> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = size * zzfxt.zzu(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzu += zzfxt.zzA(list.get(i2));
        }
        return zzu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzz(int i, List<zzfzu> list, zzgak zzgakVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzfxt.zzE(i, list.get(i3), zzgakVar);
            }
            return i2;
        }
        return 0;
    }
}
