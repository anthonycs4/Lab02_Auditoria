package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzceg implements Runnable {
    final /* synthetic */ zzcei zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzceg(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
