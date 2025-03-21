package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzac zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzac zzacVar, String str, long j) {
        this.zzc = zzacVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzan zzanVar;
        zzan zzanVar2;
        zzanVar = this.zzc.zza;
        zzanVar.zza(this.zza, this.zzb);
        zzanVar2 = this.zzc.zza;
        zzanVar2.zzb(this.zzc.toString());
    }
}
