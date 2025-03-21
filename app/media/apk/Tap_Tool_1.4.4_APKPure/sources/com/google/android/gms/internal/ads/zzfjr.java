package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfjr implements Runnable {
    final /* synthetic */ zzfgu zza;
    final /* synthetic */ zzfjs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjr(zzfjs zzfjsVar, zzfgu zzfguVar) {
        this.zzb = zzfjsVar;
        this.zza = zzfguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfjs.zzA(this.zzb, this.zza);
    }
}
