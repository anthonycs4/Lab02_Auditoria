package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzake {
    public static final zzake zza = new zzakb();

    public abstract int zza();

    public abstract zzakd zzb(int i, zzakd zzakdVar, boolean z, long j);

    public abstract int zzc();

    public abstract zzakc zzd(int i, zzakc zzakcVar, boolean z);

    public abstract int zze(Object obj);

    public final boolean zzf() {
        return zza() == 0;
    }

    public final zzakd zzg(int i, zzakd zzakdVar, boolean z) {
        return zzb(i, zzakdVar, false, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((zza() - 1) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzh(int r3, com.google.android.gms.internal.ads.zzakc r4, com.google.android.gms.internal.ads.zzakd r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.zzd(r3, r4, r0)
            r2.zzg(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.zza()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.zza()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.zzg(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzake.zzh(int, com.google.android.gms.internal.ads.zzakc, com.google.android.gms.internal.ads.zzakd, int):int");
    }
}
