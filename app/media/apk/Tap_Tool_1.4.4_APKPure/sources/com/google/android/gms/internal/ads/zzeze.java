package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeze {
    private final String zza;
    private final String zzb;

    private zzeze(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzeze zza(String str, String str2) {
        zzfad.zzb(str, "Name is null or empty");
        zzfad.zzb(str2, "Version is null or empty");
        return new zzeze(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
