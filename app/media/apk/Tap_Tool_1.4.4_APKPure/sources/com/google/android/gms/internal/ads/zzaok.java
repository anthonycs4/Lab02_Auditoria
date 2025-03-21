package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaok implements Runnable {
    final /* synthetic */ zzaoq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaok(zzaoq zzaoqVar) {
        this.zza = zzaoqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzaot zzaotVar;
        z = this.zza.zzF;
        if (z) {
            return;
        }
        zzaotVar = this.zza.zzo;
        zzaotVar.zzn(this.zza);
    }
}
