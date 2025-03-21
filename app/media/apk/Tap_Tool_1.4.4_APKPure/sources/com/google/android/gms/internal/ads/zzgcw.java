package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgcw extends zzfym<zzgcw, zzgbu> implements zzfzv {
    private static final zzgcw zzx;
    private int zzb;
    private int zze;
    private int zzf;
    private zzgbw zzj;
    private zzgcl zzm;
    private boolean zzn;
    private boolean zzq;
    private boolean zzr;
    private zzgcv zzt;
    private byte zzw = 2;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<zzgct> zzk = zzaE();
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<String> zzo = zzfym.zzaE();
    private String zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfxj zzs = zzfxj.zzb;
    private zzfyv<String> zzu = zzfym.zzaE();
    private zzfyv<String> zzv = zzfym.zzaE();

    static {
        zzgcw zzgcwVar = new zzgcw();
        zzx = zzgcwVar;
        zzfym.zzay(zzgcw.class, zzgcwVar);
    }

    private zzgcw() {
    }

    public static zzgbu zze() {
        return zzx.zzas();
    }

    public static /* synthetic */ void zzg(zzgcw zzgcwVar, zzgco zzgcoVar) {
        zzgcwVar.zze = zzgcoVar.zza();
        zzgcwVar.zzb |= 1;
    }

    public static /* synthetic */ void zzh(zzgcw zzgcwVar, String str) {
        str.getClass();
        zzgcwVar.zzb |= 4;
        zzgcwVar.zzg = str;
    }

    public static /* synthetic */ void zzi(zzgcw zzgcwVar, String str) {
        str.getClass();
        zzgcwVar.zzb |= 8;
        zzgcwVar.zzh = str;
    }

    public static /* synthetic */ void zzj(zzgcw zzgcwVar, zzgbw zzgbwVar) {
        zzgbwVar.getClass();
        zzgcwVar.zzj = zzgbwVar;
        zzgcwVar.zzb |= 32;
    }

    public static /* synthetic */ void zzk(zzgcw zzgcwVar, zzgct zzgctVar) {
        zzgctVar.getClass();
        zzfyv<zzgct> zzfyvVar = zzgcwVar.zzk;
        if (!zzfyvVar.zza()) {
            zzgcwVar.zzk = zzfym.zzaF(zzfyvVar);
        }
        zzgcwVar.zzk.add(zzgctVar);
    }

    public static /* synthetic */ void zzl(zzgcw zzgcwVar, String str) {
        zzgcwVar.zzb |= 64;
        zzgcwVar.zzl = str;
    }

    public static /* synthetic */ void zzm(zzgcw zzgcwVar) {
        zzgcwVar.zzb &= -65;
        zzgcwVar.zzl = zzx.zzl;
    }

    public static /* synthetic */ void zzn(zzgcw zzgcwVar, zzgcl zzgclVar) {
        zzgclVar.getClass();
        zzgcwVar.zzm = zzgclVar;
        zzgcwVar.zzb |= 128;
    }

    public static /* synthetic */ void zzo(zzgcw zzgcwVar, zzgcv zzgcvVar) {
        zzgcvVar.getClass();
        zzgcwVar.zzt = zzgcvVar;
        zzgcwVar.zzb |= 8192;
    }

    public static /* synthetic */ void zzp(zzgcw zzgcwVar, Iterable iterable) {
        zzfyv<String> zzfyvVar = zzgcwVar.zzu;
        if (!zzfyvVar.zza()) {
            zzgcwVar.zzu = zzfym.zzaF(zzfyvVar);
        }
        zzfwt.zzar(iterable, zzgcwVar.zzu);
    }

    public static /* synthetic */ void zzq(zzgcw zzgcwVar, Iterable iterable) {
        zzfyv<String> zzfyvVar = zzgcwVar.zzv;
        if (!zzfyvVar.zza()) {
            zzgcwVar.zzv = zzfym.zzaF(zzfyvVar);
        }
        zzfwt.zzar(iterable, zzgcwVar.zzv);
    }

    public final String zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzw = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzx;
                    }
                    return new zzgbu(null);
                }
                return new zzgcw();
            }
            return zzaz(zzx, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzk", zzgct.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zze", zzgco.zzc(), "zzf", zzgbt.zzb(), "zzj", "zzl", "zzm", "zzs", "zzt", "zzu", "zzv"});
        }
        return Byte.valueOf(this.zzw);
    }

    public final List<zzgct> zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzl;
    }
}
