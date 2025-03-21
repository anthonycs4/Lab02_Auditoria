package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaad extends zzlq {
    private final zzkd zzc;

    public zzaad(zzkd zzkdVar) {
        this.zzc = zzkdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzlp zze(int i, zzlp zzlpVar, long j) {
        zzlpVar.zza(zzlp.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzlpVar.zzl = true;
        return zzlpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzln zzg(int i, zzln zzlnVar, boolean z) {
        zzlnVar.zza(z ? 0 : null, z ? zzaac.zzd : null, 0, -9223372036854775807L, 0L);
        zzlnVar.zzf = true;
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzh(Object obj) {
        return obj == zzaac.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final Object zzi(int i) {
        return zzaac.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzr() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzs() {
        return 1;
    }
}
