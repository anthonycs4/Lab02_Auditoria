package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdyk implements Runnable {
    private final zzdnc zza;

    private zzdyk(zzdnc zzdncVar) {
        this.zza = zzdncVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzdnc zzdncVar) {
        return new zzdyk(zzdncVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
