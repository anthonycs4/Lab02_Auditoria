package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsr {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzahd zzf;
    private final zzahd zzg;
    private int zzh;
    private int zzi;

    public zzsr(zzahd zzahdVar, zzahd zzahdVar2, boolean z) {
        this.zzg = zzahdVar;
        this.zzf = zzahdVar2;
        this.zze = z;
        zzahdVar2.zzh(12);
        this.zza = zzahdVar2.zzB();
        zzahdVar.zzh(12);
        this.zzi = zzahdVar.zzB();
        zzafs.zze(zzahdVar.zzv() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzt;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            zzt = this.zzf.zzD();
        } else {
            zzt = this.zzf.zzt();
        }
        this.zzd = zzt;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzB();
            this.zzg.zzk(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzB() : -1;
        }
        return true;
    }
}
