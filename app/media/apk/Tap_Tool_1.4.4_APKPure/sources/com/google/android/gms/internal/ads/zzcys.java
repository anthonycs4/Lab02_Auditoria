package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcys implements Runnable {
    private final WeakReference<zzcyt> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcys(zzcyt zzcytVar, zzcyr zzcyrVar) {
        this.zza = new WeakReference<>(zzcytVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcyt zzcytVar = this.zza.get();
        if (zzcytVar != null) {
            zzcytVar.zzr(zzcyq.zza);
        }
    }
}
