package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzauk implements Runnable {
    final /* synthetic */ zzauo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauk(zzauo zzauoVar) {
        this.zza = zzauoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzauo.zzf(this.zza);
    }
}
