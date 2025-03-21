package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgac {
    private static final zzgac zza = new zzgac();
    private final ConcurrentMap<Class<?>, zzgak<?>> zzc = new ConcurrentHashMap();
    private final zzgal zzb = new zzfzm();

    private zzgac() {
    }

    public static zzgac zza() {
        return zza;
    }

    public final <T> zzgak<T> zzb(Class<T> cls) {
        zzfyw.zzb(cls, "messageType");
        zzgak<T> zzgakVar = (zzgak<T>) this.zzc.get(cls);
        if (zzgakVar == null) {
            zzgakVar = this.zzb.zza(cls);
            zzfyw.zzb(cls, "messageType");
            zzfyw.zzb(zzgakVar, "schema");
            zzgak putIfAbsent = this.zzc.putIfAbsent(cls, zzgakVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return zzgakVar;
    }
}
