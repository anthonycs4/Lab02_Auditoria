package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcdt implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcdz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdt(zzcdz zzcdzVar, String str, String str2) {
        this.zzc = zzcdzVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcea zzceaVar;
        zzcea zzceaVar2;
        zzceaVar = this.zzc.zzs;
        if (zzceaVar != null) {
            zzceaVar2 = this.zzc.zzs;
            zzceaVar2.zzf(this.zza, this.zzb);
        }
    }
}
