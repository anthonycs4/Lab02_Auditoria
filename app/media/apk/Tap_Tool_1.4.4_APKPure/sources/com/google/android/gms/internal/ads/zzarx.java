package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzarx implements Runnable {
    final /* synthetic */ zzajt zza;
    final /* synthetic */ zzasc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarx(zzasc zzascVar, zzajt zzajtVar) {
        this.zzb = zzascVar;
        this.zza = zzajtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasd zzasdVar;
        zzasdVar = this.zzb.zzb;
        zzasdVar.zzl(this.zza);
    }
}
