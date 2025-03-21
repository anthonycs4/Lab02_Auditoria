package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcif implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbzu zza;
    final /* synthetic */ zzcii zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcif(zzcii zzciiVar, zzbzu zzbzuVar) {
        this.zzb = zzciiVar;
        this.zza = zzbzuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzN(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
