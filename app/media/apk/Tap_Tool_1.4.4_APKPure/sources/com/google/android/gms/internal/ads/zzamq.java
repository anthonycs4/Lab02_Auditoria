package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzamq {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzarc zzf;
    private final zzarc zzg;
    private int zzh;
    private int zzi;

    public zzamq(zzarc zzarcVar, zzarc zzarcVar2, boolean z) {
        this.zzg = zzarcVar;
        this.zzf = zzarcVar2;
        this.zze = z;
        zzarcVar2.zzi(12);
        this.zza = zzarcVar2.zzu();
        zzarcVar.zzi(12);
        this.zzi = zzarcVar.zzu();
        zzaqu.zze(zzarcVar.zzr() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzp;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            zzp = this.zzf.zzv();
        } else {
            zzp = this.zzf.zzp();
        }
        this.zzd = zzp;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzu();
            this.zzg.zzj(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzu() : -1;
        }
        return true;
    }
}
