package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbhq {
    private static final AtomicReference<zzbhp> zzb = new AtomicReference<>();
    static final AtomicBoolean zza = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbhp zza() {
        return zzb.get();
    }

    public static void zzb(zzbhp zzbhpVar) {
        zzb.set(zzbhpVar);
    }
}
