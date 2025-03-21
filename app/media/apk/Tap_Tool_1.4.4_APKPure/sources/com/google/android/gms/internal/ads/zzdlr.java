package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlr implements Callable<zzdlt> {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcin zzb;
    private final Context zzc;
    private final zzdpn zzd;
    private final zzexv zze;
    private final zzdxo zzf;
    private final Executor zzg;
    private final zzfb zzh;
    private final zzcct zzi;
    private final zzeyn zzj;

    public zzdlr(Context context, Executor executor, zzfb zzfbVar, zzcct zzcctVar, com.google.android.gms.ads.internal.zza zzaVar, zzcin zzcinVar, zzdxo zzdxoVar, zzeyn zzeynVar, zzdpn zzdpnVar, zzexv zzexvVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzfbVar;
        this.zzi = zzcctVar;
        this.zza = zzaVar;
        this.zzb = zzcinVar;
        this.zzf = zzdxoVar;
        this.zzj = zzeynVar;
        this.zzd = zzdpnVar;
        this.zze = zzexvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzdlt call() throws Exception {
        zzdlt zzdltVar = new zzdlt(this);
        zzdltVar.zza();
        return zzdltVar;
    }
}
