package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcef implements Runnable {
    final /* synthetic */ zzcei zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcef(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
