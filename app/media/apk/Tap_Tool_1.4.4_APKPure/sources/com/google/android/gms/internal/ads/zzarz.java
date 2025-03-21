package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzarz implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzasc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarz(zzasc zzascVar, int i, int i2, int i3, float f) {
        this.zze = zzascVar;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasd zzasdVar;
        zzasdVar = this.zze.zzb;
        zzasdVar.zzn(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
