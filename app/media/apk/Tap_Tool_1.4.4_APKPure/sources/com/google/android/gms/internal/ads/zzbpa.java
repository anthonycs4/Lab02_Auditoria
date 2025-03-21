package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbpa implements Runnable {
    private final zzbol zza;

    private zzbpa(zzbol zzbolVar) {
        this.zza = zzbolVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbol zzbolVar) {
        return new zzbpa(zzbolVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzi();
    }
}
