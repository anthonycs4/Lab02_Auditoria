package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcdu implements Runnable {
    final /* synthetic */ zzcdz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdu(zzcdz zzcdzVar) {
        this.zza = zzcdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcea zzceaVar;
        zzcea zzceaVar2;
        zzceaVar = this.zza.zzs;
        if (zzceaVar != null) {
            zzceaVar2 = this.zza.zzs;
            zzceaVar2.zza();
        }
    }
}
