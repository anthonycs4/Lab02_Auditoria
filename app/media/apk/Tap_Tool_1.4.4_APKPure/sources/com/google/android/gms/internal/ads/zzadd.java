package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadd implements Comparable<zzadd> {
    public final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final boolean zzi;

    public zzadd(zzjq zzjqVar, zzacz zzaczVar, int i, String str) {
        zzfgz<String> zzfgzVar;
        int i2;
        boolean z = false;
        this.zzb = zzadf.zzd(i, false);
        int i3 = zzjqVar.zzd & (~zzaczVar.zzJ);
        this.zzc = 1 == (i3 & 1);
        this.zzd = (i3 & 2) != 0;
        if (zzaczVar.zzG.isEmpty()) {
            zzfgzVar = zzfgz.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            zzfgzVar = zzaczVar.zzG;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= zzfgzVar.size()) {
                i4 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = zzadf.zzf(zzjqVar, zzfgzVar.get(i4), zzaczVar.zzI);
            if (i2 > 0) {
                break;
            }
            i4++;
        }
        this.zze = i4;
        this.zzf = i2;
        int bitCount = Integer.bitCount(zzjqVar.zze & zzaczVar.zzH);
        this.zzg = bitCount;
        this.zzi = (zzjqVar.zze & 1088) != 0;
        int zzf = zzadf.zzf(zzjqVar, str, zzadf.zze(str) == null);
        this.zzh = zzf;
        if (i2 > 0 || ((zzaczVar.zzG.isEmpty() && bitCount > 0) || this.zzc || (this.zzd && zzf > 0))) {
            z = true;
        }
        this.zza = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzadd zzaddVar) {
        zzfgo zzb = zzfgo.zzg().zzd(this.zzb, zzaddVar.zzb).zza(Integer.valueOf(this.zze), Integer.valueOf(zzaddVar.zze), zzfil.zzb().zza()).zzb(this.zzf, zzaddVar.zzf).zzb(this.zzg, zzaddVar.zzg).zzd(this.zzc, zzaddVar.zzc).zza(Boolean.valueOf(this.zzd), Boolean.valueOf(zzaddVar.zzd), this.zzf == 0 ? zzfil.zzb() : zzfil.zzb().zza()).zzb(this.zzh, zzaddVar.zzh);
        if (this.zzg == 0) {
            zzb = zzb.zzc(this.zzi, zzaddVar.zzi);
        }
        return zzb.zze();
    }
}
