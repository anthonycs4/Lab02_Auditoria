package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzajf extends Exception {
    private zzajf(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static zzajf zza(Exception exc, int i) {
        return new zzajf(1, null, exc, i);
    }

    public static zzajf zzb(IOException iOException) {
        return new zzajf(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajf zzc(RuntimeException runtimeException) {
        return new zzajf(2, null, runtimeException, -1);
    }
}
