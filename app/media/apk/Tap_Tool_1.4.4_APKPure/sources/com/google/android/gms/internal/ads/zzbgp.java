package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbgp {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzbgr zze;

    public zzbgp(Context context, ScheduledExecutorService scheduledExecutorService, zzbgr zzbgrVar, byte[] bArr) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zze = zzbgrVar;
    }

    public final void zza(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || motionEvent.getEventTime() <= this.zza.getEventTime()) {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = MotionEvent.obtain(motionEvent);
            return;
        }
        this.zza = MotionEvent.obtain(motionEvent);
    }

    public final zzfla<String> zzb() {
        return (zzfkj) zzfks.zzh(zzfkj.zzw(zzfks.zza(null)), zzbhc.zzc.zze().longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }
}
