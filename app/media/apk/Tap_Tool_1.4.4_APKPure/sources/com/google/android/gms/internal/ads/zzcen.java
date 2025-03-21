package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcen implements Runnable {
    final /* synthetic */ zzcea zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcen(zzceo zzceoVar, zzcea zzceaVar) {
        this.zza = zzceaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzi();
    }
}
