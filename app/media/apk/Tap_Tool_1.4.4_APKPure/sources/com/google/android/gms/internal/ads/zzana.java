package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzana {
    public final zzanj zza = new zzanj();
    public final zzamd zzb;
    public zzanh zzc;
    public zzamx zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzamc zzh;
    public zzani zzi;

    public zzana(zzamd zzamdVar) {
        this.zzb = zzamdVar;
    }

    public final void zzb() {
        zzanj zzanjVar = this.zza;
        zzanjVar.zzd = 0;
        zzanjVar.zzr = 0L;
        zzanjVar.zzl = false;
        zzanjVar.zzq = false;
        zzanjVar.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }

    public final void zza(zzanh zzanhVar, zzamx zzamxVar) {
        Objects.requireNonNull(zzanhVar);
        this.zzc = zzanhVar;
        Objects.requireNonNull(zzamxVar);
        this.zzd = zzamxVar;
        this.zzb.zza(zzanhVar.zzf);
        zzb();
    }
}
