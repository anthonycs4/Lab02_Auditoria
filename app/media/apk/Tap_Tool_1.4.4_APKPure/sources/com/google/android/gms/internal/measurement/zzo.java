package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class zzo implements zzn {
    @Override // com.google.android.gms.internal.measurement.zzn
    public final Runnable zza(Runnable runnable) {
        return runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzn
    public final <V> Callable<V> zza(Callable<V> callable) {
        return callable;
    }
}
