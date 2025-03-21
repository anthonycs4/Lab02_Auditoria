package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzckc {
    private final zzcct zza;
    private final Context zzb;
    private final WeakReference<Context> zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckc(zzckb zzckbVar, zzcka zzckaVar) {
        zzcct zzcctVar;
        Context context;
        WeakReference<Context> weakReference;
        zzcctVar = zzckbVar.zza;
        this.zza = zzcctVar;
        context = zzckbVar.zzb;
        this.zzb = context;
        weakReference = zzckbVar.zzc;
        this.zzc = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference<Context> zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcct zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return com.google.android.gms.ads.internal.zzs.zzc().zze(this.zzb, this.zza.zza);
    }

    public final zzfb zze() {
        return new zzfb(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }
}
