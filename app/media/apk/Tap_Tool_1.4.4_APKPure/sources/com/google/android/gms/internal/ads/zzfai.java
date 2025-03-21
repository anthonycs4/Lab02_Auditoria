package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfai implements Runnable {
    final /* synthetic */ zzfan zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfai(zzfan zzfanVar) {
        this.zza = zzfanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfah zzfahVar;
        zzfahVar = this.zza.zzh;
        zzfahVar.zzc();
    }
}
