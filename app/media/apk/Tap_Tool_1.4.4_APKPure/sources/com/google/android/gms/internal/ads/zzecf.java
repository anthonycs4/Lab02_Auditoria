package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzecf implements Runnable {
    private final zzdnc zza;

    private zzecf(zzdnc zzdncVar) {
        this.zza = zzdncVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzdnc zzdncVar) {
        return new zzecf(zzdncVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
