package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdc extends Exception {
    private final int zza;

    public zzfdc(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfdc(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
