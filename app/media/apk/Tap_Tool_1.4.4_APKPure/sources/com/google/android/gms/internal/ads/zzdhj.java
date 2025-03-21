package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhj {
    zzbjh zza;
    zzbje zzb;
    zzbju zzc;
    zzbjr zzd;
    zzboe zze;
    final SimpleArrayMap<String, zzbjn> zzf = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzbjk> zzg = new SimpleArrayMap<>();

    public final zzdhj zza(zzbjh zzbjhVar) {
        this.zza = zzbjhVar;
        return this;
    }

    public final zzdhj zzb(zzbje zzbjeVar) {
        this.zzb = zzbjeVar;
        return this;
    }

    public final zzdhj zzc(zzbju zzbjuVar) {
        this.zzc = zzbjuVar;
        return this;
    }

    public final zzdhj zzd(zzbjr zzbjrVar) {
        this.zzd = zzbjrVar;
        return this;
    }

    public final zzdhj zze(zzboe zzboeVar) {
        this.zze = zzboeVar;
        return this;
    }

    public final zzdhj zzf(String str, zzbjn zzbjnVar, zzbjk zzbjkVar) {
        this.zzf.put(str, zzbjnVar);
        if (zzbjkVar != null) {
            this.zzg.put(str, zzbjkVar);
        }
        return this;
    }

    public final zzdhk zzg() {
        return new zzdhk(this);
    }
}
