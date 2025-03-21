package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzceh implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcei zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzceh(zzcei zzceiVar, boolean z) {
        this.zzb = zzceiVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
