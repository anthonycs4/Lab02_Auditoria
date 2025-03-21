package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzamu implements zzamr {
    private final zzarc zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzamu(zzamo zzamoVar) {
        zzarc zzarcVar = zzamoVar.zza;
        this.zza = zzarcVar;
        zzarcVar.zzi(12);
        this.zzc = zzarcVar.zzu() & 255;
        this.zzb = zzarcVar.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final int zzb() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzl();
        }
        if (i == 16) {
            return this.zza.zzm();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 == 0) {
            int zzl = this.zza.zzl();
            this.zze = zzl;
            return (zzl & 240) >> 4;
        }
        return this.zze & 15;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final boolean zzc() {
        return false;
    }
}
