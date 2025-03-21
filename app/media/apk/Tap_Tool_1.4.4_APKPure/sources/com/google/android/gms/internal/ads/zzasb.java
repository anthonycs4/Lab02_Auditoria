package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzasb implements Runnable {
    final /* synthetic */ zzall zza;
    final /* synthetic */ zzasc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasb(zzasc zzascVar, zzall zzallVar) {
        this.zzb = zzascVar;
        this.zza = zzallVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
