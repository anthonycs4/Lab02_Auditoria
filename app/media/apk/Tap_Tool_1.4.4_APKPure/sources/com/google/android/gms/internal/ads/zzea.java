package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzea implements Runnable {
    private zzea() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzea(zzdz zzdzVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzeb.zzf(MessageDigest.getInstance("MD5"));
            countDownLatch = zzeb.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzeb.zzb;
        } catch (Throwable th) {
            zzeb.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
