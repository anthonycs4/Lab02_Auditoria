package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public class zzbgs<T> {
    private final String zza;
    private final T zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbgs(String str, T t, int i) {
        this.zza = str;
        this.zzb = t;
        this.zzc = i;
    }

    public static zzbgs<Boolean> zza(String str, boolean z) {
        return new zzbgs<>(str, Boolean.valueOf(z), 1);
    }

    public static zzbgs<Long> zzb(String str, long j) {
        return new zzbgs<>(str, Long.valueOf(j), 2);
    }

    public static zzbgs<Double> zzc(String str, double d) {
        return new zzbgs<>(str, Double.valueOf(d), 3);
    }

    public static zzbgs<String> zzd(String str, String str2) {
        return new zzbgs<>(str, str2, 4);
    }

    public final T zze() {
        zzbhp zza = zzbhq.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return (T) zza.zzd(this.zza, (String) this.zzb);
                    }
                    return (T) zza.zzc(this.zza, ((Double) this.zzb).doubleValue());
                }
                return (T) zza.zzb(this.zza, ((Long) this.zzb).longValue());
            }
            return (T) zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
