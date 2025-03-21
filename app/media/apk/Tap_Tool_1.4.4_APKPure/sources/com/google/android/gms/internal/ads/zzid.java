package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzid extends Exception {
    public static final zzhw<zzid> zzi = zzic.zza;
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final zzjq zzd;
    public final int zze;
    public final long zzf;
    public final zzaai zzg;
    final boolean zzh;
    private final Throwable zzj;

    private zzid(int i, Throwable th) {
        this(i, th, null, null, -1, null, 4, false);
    }

    public static zzid zza(IOException iOException) {
        return new zzid(0, iOException);
    }

    public static zzid zzb(Exception exc) {
        return new zzid(1, exc, null, null, -1, null, 4, false);
    }

    public static zzid zzc(Throwable th, String str, int i, zzjq zzjqVar, int i2, boolean z) {
        return new zzid(1, th, null, str, i, zzjqVar, zzjqVar == null ? 4 : i2, z);
    }

    public static zzid zzd(RuntimeException runtimeException) {
        return new zzid(2, runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzid zze(zzaai zzaaiVar) {
        String message = getMessage();
        int i = zzaht.zza;
        return new zzid(message, this.zzj, this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzaaiVar, this.zzf, this.zzh);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzid(int r13, java.lang.Throwable r14, java.lang.String r15, java.lang.String r16, int r17, com.google.android.gms.internal.ads.zzjq r18, int r19, boolean r20) {
        /*
            r12 = this;
            r3 = r13
            if (r3 == 0) goto L56
            r0 = 1
            if (r3 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r4 = r16
            r5 = r17
            goto L5c
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzhx.zzc(r19)
            java.lang.String r2 = java.lang.String.valueOf(r16)
            int r2 = r2.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r4
            int r2 = r2 + r5
            r6.<init>(r2)
            r4 = r16
            r6.append(r4)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r5 = r17
            r6.append(r5)
            java.lang.String r2 = ", format="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = ", format_supported="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            goto L5c
        L56:
            r4 = r16
            r5 = r17
            java.lang.String r0 = "Source error"
        L5c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L89
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = "null"
            int r2 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r1 = r1 + 2
            int r1 = r1 + r2
            r6.<init>(r1)
            r6.append(r0)
            java.lang.String r0 = ": null"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L89:
            r1 = r0
            r8 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = r12
            r2 = r14
            r3 = r13
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzid.<init>(int, java.lang.Throwable, java.lang.String, java.lang.String, int, com.google.android.gms.internal.ads.zzjq, int, boolean):void");
    }

    private zzid(String str, Throwable th, int i, String str2, int i2, zzjq zzjqVar, int i3, zzaai zzaaiVar, long j, boolean z) {
        super(str, th);
        boolean z2 = true;
        if (z) {
            if (i == 1) {
                i = 1;
            } else {
                z2 = false;
            }
        }
        zzafs.zza(z2);
        this.zza = i;
        this.zzj = th;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = zzjqVar;
        this.zze = i3;
        this.zzg = zzaaiVar;
        this.zzf = j;
        this.zzh = z;
    }
}
