package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfm implements zzfn {
    final /* synthetic */ Activity zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfm(zzfo zzfoVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
