package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqa {
    public static final Set<zzdcx<zzcwh>> zza(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzcwk>> zzb(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzcxa>> zzc(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzcxt>> zzd(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzcyy>> zze(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzajc>> zzf(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzazi>> zzg(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzcwz>> zzh(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    public static final Set<zzdcx<zzexm>> zzi(zzdqj zzdqjVar, Executor executor) {
        return zzj(zzdqjVar, executor);
    }

    private static final <T> Set<zzdcx<T>> zzj(T t, Executor executor) {
        if (zzbhe.zza.zze().booleanValue()) {
            return Collections.singleton(new zzdcx(t, executor));
        }
        return Collections.emptySet();
    }
}
