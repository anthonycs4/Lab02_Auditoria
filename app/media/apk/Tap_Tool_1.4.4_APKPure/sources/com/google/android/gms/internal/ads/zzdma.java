package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdma implements Runnable {
    private final zzcib zza;

    private zzdma(zzcib zzcibVar) {
        this.zza = zzcibVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcib zzcibVar) {
        return new zzdma(zzcibVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
