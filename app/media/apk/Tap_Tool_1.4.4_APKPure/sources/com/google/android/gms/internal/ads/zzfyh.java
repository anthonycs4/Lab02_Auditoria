package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfyh implements zzfzs {
    private static final zzfyh zza = new zzfyh();

    private zzfyh() {
    }

    public static zzfyh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final boolean zzb(Class<?> cls) {
        return zzfym.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final zzfzr zzc(Class<?> cls) {
        if (!zzfym.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzfzr) zzfym.zzax(cls.asSubclass(zzfym.class)).zzb(3, null, null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
