package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzced implements Runnable {
    private final zzceb zza;

    private zzced(zzceb zzcebVar) {
        this.zza = zzcebVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzceb zzcebVar) {
        return new zzced(zzcebVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
