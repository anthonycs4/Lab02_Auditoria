package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzepp<R> implements zzevq {
    public final zzeqi<R> zza;
    public final zzeqk zzb;
    public final zzazs zzc;
    public final String zzd;
    public final Executor zze;
    public final zzbad zzf;
    public final zzevf zzg;

    public zzepp(zzeqi<R> zzeqiVar, zzeqk zzeqkVar, zzazs zzazsVar, String str, Executor executor, zzbad zzbadVar, zzevf zzevfVar) {
        this.zza = zzeqiVar;
        this.zzb = zzeqkVar;
        this.zzc = zzazsVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzbadVar;
        this.zzg = zzevfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevq
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzevq
    public final zzevf zzb() {
        return this.zzg;
    }
}
