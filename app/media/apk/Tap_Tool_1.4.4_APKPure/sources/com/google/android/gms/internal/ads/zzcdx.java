package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcdx implements Runnable {
    final /* synthetic */ zzcdz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdx(zzcdz zzcdzVar) {
        this.zza = zzcdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcea zzceaVar;
        boolean z;
        zzcea zzceaVar2;
        zzcea zzceaVar3;
        zzceaVar = this.zza.zzs;
        if (zzceaVar != null) {
            z = this.zza.zzt;
            if (!z) {
                zzceaVar3 = this.zza.zzs;
                zzceaVar3.zzk();
                zzcdz.zzv(this.zza, true);
            }
            zzceaVar2 = this.zza.zzs;
            zzceaVar2.zzc();
        }
    }
}
