package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzdsp extends Exception {
    private final int zza;

    public zzdsp(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdsp(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdsp(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
