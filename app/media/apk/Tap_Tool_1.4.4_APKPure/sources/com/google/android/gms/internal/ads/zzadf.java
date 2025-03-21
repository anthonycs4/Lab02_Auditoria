package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadf extends zzadj {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = new int[0];
    private static final zzfil<Integer> zzc = zzfil.zzc(zzact.zza);
    private static final zzfil<Integer> zzd = zzfil.zzc(zzacu.zza);
    private final AtomicReference<zzacz> zze;
    private final zzacp zzf;

    @Deprecated
    public zzadf() {
        zzacz zzaczVar = zzacz.zza;
        this.zzf = new zzacp();
        this.zze = new AtomicReference<>(zzaczVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzd(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String zze(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int zzf(zzjq zzjqVar, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzjqVar.zzc)) {
            String zze = zze(str);
            String zze2 = zze(zzjqVar.zzc);
            if (zze2 == null || zze == null) {
                return (z && zze2 == null) ? 1 : 0;
            } else if (zze2.startsWith(zze) || zze.startsWith(zze2)) {
                return 3;
            } else {
                return zzaht.zzt(zze2, "-")[0].equals(zzaht.zzt(zze, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    private static boolean zzn(zzjq zzjqVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if ((zzjqVar.zze & 16384) == 0 && zzd(i, false) && (i & i2) != 0 && ((str == null || zzaht.zzc(zzjqVar.zzl, str)) && (((i11 = zzjqVar.zzq) == -1 || (i7 <= i11 && i11 <= i3)) && ((i12 = zzjqVar.zzr) == -1 || (i8 <= i12 && i12 <= i4))))) {
            float f = zzjqVar.zzs;
            if ((f == -1.0f || (i9 <= f && f <= i5)) && (i13 = zzjqVar.zzh) != -1 && i10 <= i13 && i13 <= i6) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.Integer> zzo(com.google.android.gms.internal.ads.zzacf r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.zza
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.zza
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La5
            if (r14 == r2) goto La5
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L22:
            int r5 = r12.zza
            if (r3 >= r5) goto L7f
            com.google.android.gms.internal.ads.zzjq r5 = r12.zza(r3)
            int r6 = r5.zzq
            if (r6 <= 0) goto L7c
            int r7 = r5.zzr
            if (r7 <= 0) goto L7c
            if (r15 == 0) goto L42
            r8 = 1
            if (r6 > r7) goto L39
            r9 = 0
            goto L3a
        L39:
            r9 = 1
        L3a:
            if (r13 > r14) goto L3d
            r8 = 0
        L3d:
            if (r9 == r8) goto L42
            r8 = r13
            r9 = r14
            goto L44
        L42:
            r9 = r13
            r8 = r14
        L44:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 < r11) goto L54
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = com.google.android.gms.internal.ads.zzaht.zzx(r11, r6)
            r7.<init>(r9, r6)
            goto L5e
        L54:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.google.android.gms.internal.ads.zzaht.zzx(r10, r7)
            r6.<init>(r7, r8)
            r7 = r6
        L5e:
            int r6 = r5.zzq
            int r8 = r5.zzr
            int r8 = r8 * r6
            int r9 = r7.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r6 < r9) goto L7c
            int r5 = r5.zzr
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7c
            if (r8 >= r4) goto L7c
            r4 = r8
        L7c:
            int r3 = r3 + 1
            goto L22
        L7f:
            if (r4 == r2) goto La5
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L87:
            if (r13 < 0) goto La5
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            com.google.android.gms.internal.ads.zzjq r15 = r12.zza(r15)
            int r15 = r15.zzc()
            if (r15 == r14) goto L9f
            if (r15 <= r4) goto La2
        L9f:
            r0.remove(r13)
        La2:
            int r13 = r13 + (-1)
            goto L87
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadf.zzo(com.google.android.gms.internal.ads.zzacf, int, int, boolean):java.util.List");
    }

    public final void zza(zzacz zzaczVar) {
        if (this.zze.getAndSet(zzaczVar).equals(zzaczVar)) {
            return;
        }
        zzl();
    }

    public final zzacz zzb() {
        return this.zze.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179 A[LOOP:1: B:23:0x004a->B:67:0x0179, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzadj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.util.Pair<com.google.android.gms.internal.ads.zzli[], com.google.android.gms.internal.ads.zzacs[]> zzc(com.google.android.gms.internal.ads.zzadi r44, int[][][] r45, int[] r46, com.google.android.gms.internal.ads.zzaaj r47, com.google.android.gms.internal.ads.zzlq r48) throws com.google.android.gms.internal.ads.zzid {
        /*
            Method dump skipped, instructions count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadf.zzc(com.google.android.gms.internal.ads.zzadi, int[][][], int[], com.google.android.gms.internal.ads.zzaaj, com.google.android.gms.internal.ads.zzlq):android.util.Pair");
    }
}
