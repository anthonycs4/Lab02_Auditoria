package com.google.android.gms.internal.ads;

import android.view.Surface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzasa implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzasc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasa(zzasc zzascVar, Surface surface) {
        this.zzb = zzascVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasd zzasdVar;
        zzasdVar = this.zzb.zzb;
        zzasdVar.zzo(this.zza);
    }
}
