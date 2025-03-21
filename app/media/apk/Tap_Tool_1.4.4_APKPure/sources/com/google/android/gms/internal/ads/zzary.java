package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzary implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzasc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzary(zzasc zzascVar, int i, long j) {
        this.zzc = zzascVar;
        this.zza = i;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasd zzasdVar;
        zzasdVar = this.zzc.zzb;
        zzasdVar.zzm(this.zza, this.zzb);
    }
}
