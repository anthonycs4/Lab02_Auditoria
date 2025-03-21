package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgct extends zzfym<zzgct, zzgcs> implements zzfzv {
    private static final zzgct zzo;
    private int zzb;
    private int zze;
    private zzgcc zzg;
    private zzgcg zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyr zzj = zzaB();
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<String> zzm = zzfym.zzaE();

    static {
        zzgct zzgctVar = new zzgct();
        zzo = zzgctVar;
        zzfym.zzay(zzgct.class, zzgctVar);
    }

    private zzgct() {
    }

    public static zzgcs zzd() {
        return zzo.zzas();
    }

    public static /* synthetic */ void zzf(zzgct zzgctVar, int i) {
        zzgctVar.zzb |= 1;
        zzgctVar.zze = i;
    }

    public static /* synthetic */ void zzg(zzgct zzgctVar, String str) {
        str.getClass();
        zzgctVar.zzb |= 2;
        zzgctVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgct zzgctVar, zzgcc zzgccVar) {
        zzgccVar.getClass();
        zzgctVar.zzg = zzgccVar;
        zzgctVar.zzb |= 4;
    }

    public static /* synthetic */ void zzi(zzgct zzgctVar, zzgcr zzgcrVar) {
        zzgctVar.zzl = zzgcrVar.zza();
        zzgctVar.zzb |= 64;
    }

    public static /* synthetic */ void zzj(zzgct zzgctVar, String str) {
        str.getClass();
        zzfyv<String> zzfyvVar = zzgctVar.zzm;
        if (!zzfyvVar.zza()) {
            zzgctVar.zzm = zzfym.zzaF(zzfyvVar);
        }
        zzgctVar.zzm.add(str);
    }

    public final String zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzn = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzo;
                    }
                    return new zzgcs(null);
                }
                return new zzgct();
            }
            return zzaz(zzo, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgcr.zzc(), "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final int zzc() {
        return this.zzm.size();
    }
}
