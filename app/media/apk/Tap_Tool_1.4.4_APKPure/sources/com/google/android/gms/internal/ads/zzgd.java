package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgd implements Runnable {
    final /* synthetic */ zzgf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgf zzgfVar) {
        this.zza = zzgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
