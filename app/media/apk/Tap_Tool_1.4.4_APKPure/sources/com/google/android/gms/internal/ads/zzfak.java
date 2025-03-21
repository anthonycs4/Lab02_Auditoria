package com.google.android.gms.internal.ads;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfak implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfan.zzc;
        if (handler != null) {
            handler2 = zzfan.zzc;
            runnable = zzfan.zzj;
            handler2.post(runnable);
            handler3 = zzfan.zzc;
            runnable2 = zzfan.zzk;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
