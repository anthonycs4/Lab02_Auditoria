package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzflk<V> implements Runnable {
    @NullableDecl
    zzflm<V> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflk(zzflm<V> zzflmVar) {
        this.zza = zzflmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r1 = ((com.google.android.gms.internal.ads.zzflm) r0).zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzflm<V> r0 = r10.zza
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzflm.zzb(r0)
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r10.zza = r2
            boolean r3 = r1.isDone()
            if (r3 == 0) goto L19
            r0.zzj(r1)
            return
        L19:
            r3 = 1
            java.util.concurrent.ScheduledFuture r4 = com.google.android.gms.internal.ads.zzflm.zzx(r0)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.ads.zzflm.zzy(r0, r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "Timed out"
            if (r4 == 0) goto L54
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L52
            long r6 = r4.getDelay(r6)     // Catch: java.lang.Throwable -> L52
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L52
            r8 = 10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r8 = 75
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L52
            r4.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = " (timeout delayed by "
            r4.append(r8)     // Catch: java.lang.Throwable -> L52
            r4.append(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = " ms after scheduled time)"
            r4.append(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L52
            r5 = r4
            goto L54
        L52:
            r4 = move-exception
            goto L8f
        L54:
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L52
            int r7 = r7 + 2
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L52
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L52
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L52
            r8.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = ": "
            r8.append(r4)     // Catch: java.lang.Throwable -> L52
            r8.append(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.internal.ads.zzfll r5 = new com.google.android.gms.internal.ads.zzfll     // Catch: java.lang.Throwable -> L98
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L98
            r0.zzi(r5)     // Catch: java.lang.Throwable -> L98
            r1.cancel(r3)
            return
        L8f:
            com.google.android.gms.internal.ads.zzfll r6 = new com.google.android.gms.internal.ads.zzfll     // Catch: java.lang.Throwable -> L98
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L98
            r0.zzi(r6)     // Catch: java.lang.Throwable -> L98
            throw r4     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            r1.cancel(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflk.run():void");
    }
}
