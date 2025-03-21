package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbxn {
    private final WeakHashMap<Context, zzbxm> zza = new WeakHashMap<>();

    public final Future<zzbxk> zza(Context context) {
        return zzccz.zza.zzb(new zzbxl(this, context));
    }
}
