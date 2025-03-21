package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzgdi {
    public static zzgdi zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgdd(cls.getSimpleName());
        }
        return new zzgdf(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
