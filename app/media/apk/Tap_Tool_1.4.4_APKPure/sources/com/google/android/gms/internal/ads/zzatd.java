package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzatd implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzath zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatd(zzath zzathVar, View view) {
        this.zzb = zzathVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
