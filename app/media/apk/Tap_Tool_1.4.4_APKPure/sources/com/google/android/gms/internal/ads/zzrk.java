package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzrk extends zzrj {
    private final zzahd zzb;
    private final zzahd zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzrk(zzqq zzqqVar) {
        super(zzqqVar);
        this.zzb = new zzahd(zzagv.zza);
        this.zzc = new zzahd(4);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final boolean zza(zzahd zzahdVar) throws zzri {
        int zzn = zzahdVar.zzn();
        int i = zzn >> 4;
        int i2 = zzn & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzri(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final boolean zzb(zzahd zzahdVar, long j) throws zzkr {
        int zzn = zzahdVar.zzn();
        long zzs = j + (zzahdVar.zzs() * 1000);
        if (zzn == 0) {
            if (!this.zze) {
                zzahd zzahdVar2 = new zzahd(new byte[zzahdVar.zzd()]);
                zzahdVar.zzm(zzahdVar2.zzi(), 0, zzahdVar.zzd());
                zzahv zza = zzahv.zza(zzahdVar2);
                this.zzd = zza.zzb;
                zzjp zzjpVar = new zzjp();
                zzjpVar.zzj("video/avc");
                zzjpVar.zzh(zza.zzf);
                zzjpVar.zzo(zza.zzc);
                zzjpVar.zzp(zza.zzd);
                zzjpVar.zzs(zza.zze);
                zzjpVar.zzl(zza.zza);
                this.zza.zza(zzjpVar.zzD());
                this.zze = true;
                return false;
            }
        } else if (zzn == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (this.zzf || i != 0) {
                byte[] zzi = this.zzc.zzi();
                zzi[0] = 0;
                zzi[1] = 0;
                zzi[2] = 0;
                int i2 = 4 - this.zzd;
                int i3 = 0;
                while (zzahdVar.zzd() > 0) {
                    zzahdVar.zzm(this.zzc.zzi(), i2, this.zzd);
                    this.zzc.zzh(0);
                    int zzB = this.zzc.zzB();
                    this.zzb.zzh(0);
                    this.zza.zzf(this.zzb, 4);
                    this.zza.zzf(zzahdVar, zzB);
                    i3 = i3 + 4 + zzB;
                }
                this.zza.zzd(zzs, i, i3, 0, null);
                this.zzf = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
