package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzamt implements zzamr {
    private final int zza;
    private final int zzb;
    private final zzarc zzc;

    public zzamt(zzamo zzamoVar) {
        zzarc zzarcVar = zzamoVar.zza;
        this.zzc = zzarcVar;
        zzarcVar.zzi(12);
        this.zza = zzarcVar.zzu();
        this.zzb = zzarcVar.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final int zzb() {
        int i = this.zza;
        return i == 0 ? this.zzc.zzu() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final boolean zzc() {
        return this.zza != 0;
    }
}
