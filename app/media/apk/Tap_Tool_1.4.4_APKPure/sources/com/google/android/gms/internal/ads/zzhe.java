package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhe implements Runnable {
    final /* synthetic */ zzhf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhe(zzhf zzhfVar) {
        this.zza = zzhfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhf.zzb(this.zza);
    }
}
