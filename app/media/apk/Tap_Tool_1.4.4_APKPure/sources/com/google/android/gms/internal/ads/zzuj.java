package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzuj implements zzut {
    private final zzahc zza;
    private final zzahd zzb;
    private final String zzc;
    private String zzd;
    private zzqq zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzjq zzj;
    private int zzk;
    private long zzl;

    public zzuj() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzd = zzwfVar.zzc();
        this.zze = zzpuVar.zzbi(zzwfVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzd(zzahd zzahdVar) {
        zzafs.zzf(this.zze);
        while (zzahdVar.zzd() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzahdVar.zzd() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzahdVar.zzn() == 11;
                    } else {
                        int zzn = zzahdVar.zzn();
                        if (zzn == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            this.zzb.zzi()[0] = 11;
                            this.zzb.zzi()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzn == 11;
                    }
                }
            } else if (i == 1) {
                byte[] zzi = this.zzb.zzi();
                int min = Math.min(zzahdVar.zzd(), 128 - this.zzg);
                zzahdVar.zzm(zzi, this.zzg, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                if (i2 == 128) {
                    this.zza.zzd(0);
                    zzlw zzc = zzlx.zzc(this.zza);
                    zzjq zzjqVar = this.zzj;
                    if (zzjqVar == null || zzc.zzc != zzjqVar.zzy || zzc.zzb != zzjqVar.zzz || !zzaht.zzc(zzc.zza, zzjqVar.zzl)) {
                        zzjp zzjpVar = new zzjp();
                        zzjpVar.zza(this.zzd);
                        zzjpVar.zzj(zzc.zza);
                        zzjpVar.zzw(zzc.zzc);
                        zzjpVar.zzx(zzc.zzb);
                        zzjpVar.zzd(this.zzc);
                        zzjq zzD = zzjpVar.zzD();
                        this.zzj = zzD;
                        this.zze.zza(zzD);
                    }
                    this.zzk = zzc.zzd;
                    this.zzi = (zzc.zze * 1000000) / this.zzj.zzz;
                    this.zzb.zzh(0);
                    zzqo.zzb(this.zze, this.zzb, 128);
                    this.zzf = 2;
                }
            } else {
                int min2 = Math.min(zzahdVar.zzd(), this.zzk - this.zzg);
                zzqo.zzb(this.zze, zzahdVar, min2);
                int i3 = this.zzg + min2;
                this.zzg = i3;
                int i4 = this.zzk;
                if (i3 == i4) {
                    this.zze.zzd(this.zzl, 1, i4, 0, null);
                    this.zzl += this.zzi;
                    this.zzf = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }

    public zzuj(String str) {
        zzahc zzahcVar = new zzahc(new byte[128], 128);
        this.zza = zzahcVar;
        this.zzb = new zzahd(zzahcVar.zza);
        this.zzf = 0;
        this.zzc = str;
    }
}
