package com.google.android.gms.internal.ads;

import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvh implements zzut {
    private final zzahd zza;
    private final zznw zzb;
    private final String zzc;
    private zzqq zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzvh() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zze = zzwfVar.zzc();
        this.zzd = zzpuVar.zzbi(zzwfVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzd(zzahd zzahdVar) {
        zznw zznwVar;
        zzafs.zzf(this.zzd);
        while (zzahdVar.zzd() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] zzi = zzahdVar.zzi();
                int zzg = zzahdVar.zzg();
                int zze = zzahdVar.zze();
                while (true) {
                    if (zzg < zze) {
                        byte b = zzi[zzg];
                        boolean z = (b & UByte.MAX_VALUE) == 255;
                        boolean z2 = this.zzi && (b & 224) == 224;
                        this.zzi = z;
                        if (z2) {
                            zzahdVar.zzh(zzg + 1);
                            this.zzi = false;
                            this.zza.zzi()[1] = zzi[zzg];
                            this.zzg = 2;
                            this.zzf = 1;
                            break;
                        }
                        zzg++;
                    } else {
                        zzahdVar.zzh(zze);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(zzahdVar.zzd(), 4 - this.zzg);
                zzahdVar.zzm(this.zza.zzi(), this.zzg, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                if (i2 >= 4) {
                    this.zza.zzh(0);
                    if (this.zzb.zza(this.zza.zzv())) {
                        this.zzk = this.zzb.zzc;
                        if (!this.zzh) {
                            this.zzj = (zznwVar.zzg * 1000000) / zznwVar.zzd;
                            zzjp zzjpVar = new zzjp();
                            zzjpVar.zza(this.zze);
                            zzjpVar.zzj(this.zzb.zzb);
                            zzjpVar.zzk(4096);
                            zzjpVar.zzw(this.zzb.zze);
                            zzjpVar.zzx(this.zzb.zzd);
                            zzjpVar.zzd(this.zzc);
                            this.zzd.zza(zzjpVar.zzD());
                            this.zzh = true;
                        }
                        this.zza.zzh(0);
                        zzqo.zzb(this.zzd, this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            } else {
                int min2 = Math.min(zzahdVar.zzd(), this.zzk - this.zzg);
                zzqo.zzb(this.zzd, zzahdVar, min2);
                int i3 = this.zzg + min2;
                this.zzg = i3;
                int i4 = this.zzk;
                if (i3 >= i4) {
                    this.zzd.zzd(this.zzl, 1, i4, 0, null);
                    this.zzl += this.zzj;
                    this.zzg = 0;
                    this.zzf = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }

    public zzvh(String str) {
        this.zzf = 0;
        zzahd zzahdVar = new zzahd(4);
        this.zza = zzahdVar;
        zzahdVar.zzi()[0] = -1;
        this.zzb = new zznw();
        this.zzc = str;
    }
}
