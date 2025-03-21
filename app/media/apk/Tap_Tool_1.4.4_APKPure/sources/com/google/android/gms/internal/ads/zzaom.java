package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaom implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzaoq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaom(zzaoq zzaoqVar, IOException iOException) {
        this.zzb = zzaoqVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaor zzaorVar;
        zzaorVar = this.zzb.zze;
        zzaorVar.zzi(this.zza);
    }
}
