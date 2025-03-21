package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzakl implements Runnable {
    final /* synthetic */ zzajt zza;
    final /* synthetic */ zzakp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakl(zzakp zzakpVar, zzajt zzajtVar) {
        this.zzb = zzakpVar;
        this.zza = zzajtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakq zzakqVar;
        zzakqVar = this.zzb.zzb;
        zzakqVar.zzh(this.zza);
    }
}
