package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzvq {
    private final zzut zza;
    private final zzahq zzb;
    private final zzahc zzc = new zzahc(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzvq(zzut zzutVar, zzahq zzahqVar) {
        this.zza = zzutVar;
        this.zzb = zzahqVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzahd zzahdVar) throws zzkr {
        long j;
        zzahdVar.zzm(this.zzc.zza, 0, 3);
        this.zzc.zzd(0);
        this.zzc.zzf(8);
        this.zzd = this.zzc.zzg();
        this.zze = this.zzc.zzg();
        this.zzc.zzf(6);
        zzahdVar.zzm(this.zzc.zza, 0, this.zzc.zzh(8));
        this.zzc.zzd(0);
        if (this.zzd) {
            this.zzc.zzf(4);
            int zzh = this.zzc.zzh(3);
            this.zzc.zzf(1);
            int zzh2 = this.zzc.zzh(15);
            this.zzc.zzf(1);
            long zzh3 = (zzh << 30) | (zzh2 << 15) | this.zzc.zzh(15);
            this.zzc.zzf(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzf(4);
                int zzh4 = this.zzc.zzh(3);
                this.zzc.zzf(1);
                int zzh5 = this.zzc.zzh(15);
                this.zzc.zzf(1);
                int zzh6 = this.zzc.zzh(15);
                this.zzc.zzf(1);
                this.zzb.zze((zzh5 << 15) | (zzh4 << 30) | zzh6);
                this.zzf = true;
            }
            j = this.zzb.zze(zzh3);
        } else {
            j = 0;
        }
        this.zza.zzc(j, 4);
        this.zza.zzd(zzahdVar);
        this.zza.zze();
    }
}
