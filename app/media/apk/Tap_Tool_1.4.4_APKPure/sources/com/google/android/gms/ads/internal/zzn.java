package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzfb;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzfb zzfbVar;
        zzfb zzfbVar2;
        zzfbVar = this.zza.zzh;
        if (zzfbVar != null) {
            zzfbVar2 = this.zza.zzh;
            zzfbVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
