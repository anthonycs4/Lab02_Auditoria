package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzckb {
    private zzcct zza;
    private Context zzb;
    private WeakReference<Context> zzc;

    public final zzckb zza(zzcct zzcctVar) {
        this.zza = zzcctVar;
        return this;
    }

    public final zzckb zzb(Context context) {
        this.zzc = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }
}
