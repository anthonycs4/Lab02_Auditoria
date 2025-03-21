package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjl;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzflf extends zzfjl.zzi<Void> implements Runnable {
    private final Runnable zza;

    public zzflf(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzi(th);
            zzffc.zza(th);
            throw new RuntimeException(th);
        }
    }
}
