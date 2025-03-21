package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzesb implements Runnable {
    private final zzerw zza;

    private zzesb(zzerw zzerwVar) {
        this.zza = zzerwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzerw zzerwVar) {
        return new zzesb(zzerwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzbN();
    }
}
