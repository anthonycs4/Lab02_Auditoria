package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcdv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcdz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdv(zzcdz zzcdzVar, int i, int i2) {
        this.zzc = zzcdzVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcea zzceaVar;
        zzcea zzceaVar2;
        zzceaVar = this.zzc.zzs;
        if (zzceaVar != null) {
            zzceaVar2 = this.zzc.zzs;
            zzceaVar2.zzj(this.zza, this.zzb);
        }
    }
}
