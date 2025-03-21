package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacw implements Comparable<zzacw> {
    public final boolean zza;
    private final String zzb;
    private final zzacz zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final boolean zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;

    public zzacw(zzjq zzjqVar, zzacz zzaczVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.zzc = zzaczVar;
        this.zzb = zzadf.zze(zzjqVar.zzc);
        int i6 = 0;
        this.zzd = zzadf.zzd(i, false);
        int i7 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i7 >= zzaczVar.zzE.size()) {
                i7 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = zzadf.zzf(zzjqVar, zzaczVar.zzE.get(i7), false);
            if (i3 > 0) {
                break;
            }
            i7++;
        }
        this.zzf = i7;
        this.zze = i3;
        this.zzg = Integer.bitCount(zzjqVar.zze & zzaczVar.zzF);
        boolean z = true;
        this.zzj = 1 == (zzjqVar.zzd & 1);
        this.zzk = zzjqVar.zzy;
        this.zzl = zzjqVar.zzz;
        this.zzm = zzjqVar.zzh;
        int i8 = zzjqVar.zzh;
        if ((i8 != -1 && i8 > zzaczVar.zzr) || ((i4 = zzjqVar.zzy) != -1 && i4 > zzaczVar.zzq)) {
            z = false;
        }
        this.zza = z;
        String[] zzV = zzaht.zzV();
        int i9 = 0;
        while (true) {
            if (i9 >= zzV.length) {
                i9 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = zzadf.zzf(zzjqVar, zzV[i9], false);
            if (i5 > 0) {
                break;
            }
            i9++;
        }
        this.zzh = i9;
        this.zzi = i5;
        while (true) {
            if (i6 < zzaczVar.zzw.size()) {
                String str = zzjqVar.zzl;
                if (str != null && str.equals(zzaczVar.zzw.get(i6))) {
                    i2 = i6;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        this.zzn = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzacw zzacwVar) {
        zzfil zzfilVar;
        zzfil zza;
        zzfil zzfilVar2;
        zzfil zzfilVar3;
        if (!this.zza || !this.zzd) {
            zzfilVar = zzadf.zzc;
            zza = zzfilVar.zza();
        } else {
            zza = zzadf.zzc;
        }
        zzfgo zza2 = zzfgo.zzg().zzd(this.zzd, zzacwVar.zzd).zza(Integer.valueOf(this.zzf), Integer.valueOf(zzacwVar.zzf), zzfil.zzb().zza()).zzb(this.zze, zzacwVar.zze).zzb(this.zzg, zzacwVar.zzg).zzd(this.zza, zzacwVar.zza).zza(Integer.valueOf(this.zzn), Integer.valueOf(zzacwVar.zzn), zzfil.zzb().zza());
        Integer valueOf = Integer.valueOf(this.zzm);
        Integer valueOf2 = Integer.valueOf(zzacwVar.zzm);
        if (this.zzc.zzx) {
            zzfilVar3 = zzadf.zzc;
            zzfilVar2 = zzfilVar3.zza();
        } else {
            zzfilVar2 = zzadf.zzd;
        }
        zzfgo zza3 = zza2.zza(valueOf, valueOf2, zzfilVar2).zzd(this.zzj, zzacwVar.zzj).zza(Integer.valueOf(this.zzh), Integer.valueOf(zzacwVar.zzh), zzfil.zzb().zza()).zzb(this.zzi, zzacwVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzacwVar.zzk), zza).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzacwVar.zzl), zza);
        Integer valueOf3 = Integer.valueOf(this.zzm);
        Integer valueOf4 = Integer.valueOf(zzacwVar.zzm);
        if (!zzaht.zzc(this.zzb, zzacwVar.zzb)) {
            zza = zzadf.zzd;
        }
        return zza3.zza(valueOf3, valueOf4, zza).zze();
    }
}
