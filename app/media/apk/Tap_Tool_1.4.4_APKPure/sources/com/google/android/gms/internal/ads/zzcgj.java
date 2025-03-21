package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcgj implements Runnable {
    final /* synthetic */ zzcgk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgj(zzcgk zzcgkVar) {
        this.zza = zzcgkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzs.zzy().zzb(this.zza);
    }
}
