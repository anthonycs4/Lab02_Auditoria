package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzt {
    private final Executor zza;

    public zzt(Handler handler) {
        this.zza = new zzr(this, handler);
    }

    public final void zza(zzac<?> zzacVar, zzai<?> zzaiVar, Runnable runnable) {
        zzacVar.zzp();
        zzacVar.zzc("post-response");
        Executor executor = this.zza;
        ((zzr) executor).zza.post(new zzs(zzacVar, zzaiVar, runnable));
    }

    public final void zzb(zzac<?> zzacVar, zzal zzalVar) {
        zzacVar.zzc("post-error");
        zzai zzb = zzai.zzb(zzalVar);
        Executor executor = this.zza;
        ((zzr) executor).zza.post(new zzs(zzacVar, zzb, null));
    }
}
