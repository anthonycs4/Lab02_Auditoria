package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvt implements zzwg {
    private final zzvs zza;
    private final zzahd zzb = new zzahd(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzvt(zzvs zzvsVar) {
        this.zza = zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zza(zzahq zzahqVar, zzpu zzpuVar, zzwf zzwfVar) {
        this.zza.zza(zzahqVar, zzpuVar, zzwfVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzc(zzahd zzahdVar, int i) {
        int i2 = i & 1;
        int zzg = i2 != 0 ? zzahdVar.zzg() + zzahdVar.zzn() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzahdVar.zzh(zzg);
            this.zzd = 0;
        }
        while (zzahdVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzn = zzahdVar.zzn();
                    zzahdVar.zzh(zzahdVar.zzg() - 1);
                    if (zzn == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzahdVar.zzd(), 3 - this.zzd);
                zzahdVar.zzm(this.zzb.zzi(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzh(0);
                    this.zzb.zzf(3);
                    this.zzb.zzk(1);
                    int zzn2 = this.zzb.zzn();
                    int zzn3 = this.zzb.zzn();
                    this.zze = (zzn2 & 128) != 0;
                    this.zzc = (((zzn2 & 15) << 8) | zzn3) + 3;
                    int zzj = this.zzb.zzj();
                    int i5 = this.zzc;
                    if (zzj < i5) {
                        int zzj2 = this.zzb.zzj();
                        this.zzb.zzc(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, zzj2 + zzj2)));
                    }
                }
            } else {
                int min2 = Math.min(zzahdVar.zzd(), this.zzc - this.zzd);
                zzahdVar.zzm(this.zzb.zzi(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzaht.zzS(this.zzb.zzi(), 0, this.zzc, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzf(this.zzc - 4);
                    } else {
                        this.zzb.zzf(i7);
                    }
                    this.zzb.zzh(0);
                    this.zza.zzb(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }
}
