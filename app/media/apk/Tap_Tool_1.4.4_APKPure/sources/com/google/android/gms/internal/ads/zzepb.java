package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzepb implements Runnable {
    private final zzefe zza;

    private zzepb(zzefe zzefeVar) {
        this.zza = zzefeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzefe zzefeVar) {
        return new zzepb(zzefeVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzbN();
    }
}
