package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdbg {
    private final Set<zzdcx<zzcxx>> zza = new HashSet();
    private final Set<zzdcx<zzcyy>> zzb = new HashSet();
    private final Set<zzdcx<zzazi>> zzc = new HashSet();
    private final Set<zzdcx<zzcwh>> zzd = new HashSet();
    private final Set<zzdcx<zzcwz>> zze = new HashSet();
    private final Set<zzdcx<zzcye>> zzf = new HashSet();
    private final Set<zzdcx<zzcxt>> zzg = new HashSet();
    private final Set<zzdcx<zzcwk>> zzh = new HashSet();
    private final Set<zzdcx<zzfaw>> zzi = new HashSet();
    private final Set<zzdcx<zzajc>> zzj = new HashSet();
    private final Set<zzdcx<zzcwv>> zzk = new HashSet();
    private final Set<zzdcx<zzcyp>> zzl = new HashSet();
    private final Set<zzdcx<com.google.android.gms.ads.internal.overlay.zzo>> zzm = new HashSet();
    private zzeqg zzn;

    public final zzdbg zza(zzcwh zzcwhVar, Executor executor) {
        this.zzd.add(new zzdcx<>(zzcwhVar, executor));
        return this;
    }

    public final zzdbg zzb(zzcxt zzcxtVar, Executor executor) {
        this.zzg.add(new zzdcx<>(zzcxtVar, executor));
        return this;
    }

    public final zzdbg zzc(zzcwk zzcwkVar, Executor executor) {
        this.zzh.add(new zzdcx<>(zzcwkVar, executor));
        return this;
    }

    public final zzdbg zzd(zzcwv zzcwvVar, Executor executor) {
        this.zzk.add(new zzdcx<>(zzcwvVar, executor));
        return this;
    }

    public final zzdbg zze(zzajc zzajcVar, Executor executor) {
        this.zzj.add(new zzdcx<>(zzajcVar, executor));
        return this;
    }

    public final zzdbg zzf(zzazi zzaziVar, Executor executor) {
        this.zzc.add(new zzdcx<>(zzaziVar, executor));
        return this;
    }

    public final zzdbg zzg(zzcwz zzcwzVar, Executor executor) {
        this.zze.add(new zzdcx<>(zzcwzVar, executor));
        return this;
    }

    public final zzdbg zzh(zzcye zzcyeVar, Executor executor) {
        this.zzf.add(new zzdcx<>(zzcyeVar, executor));
        return this;
    }

    public final zzdbg zzi(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzm.add(new zzdcx<>(zzoVar, executor));
        return this;
    }

    public final zzdbg zzj(zzcyp zzcypVar, Executor executor) {
        this.zzl.add(new zzdcx<>(zzcypVar, executor));
        return this;
    }

    public final zzdbg zzk(zzeqg zzeqgVar) {
        this.zzn = zzeqgVar;
        return this;
    }

    public final zzdbg zzl(zzcyy zzcyyVar, Executor executor) {
        this.zzb.add(new zzdcx<>(zzcyyVar, executor));
        return this;
    }

    public final zzdbh zzm() {
        return new zzdbh(this, null);
    }
}
