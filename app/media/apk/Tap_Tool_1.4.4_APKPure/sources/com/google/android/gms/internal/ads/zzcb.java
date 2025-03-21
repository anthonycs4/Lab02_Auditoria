package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcb extends zzfym<zzcb, zzbv> implements zzfzv {
    private static final zzcb zzr;
    private int zzb;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzn = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzo = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<zzbx> zzp = zzaE();

    static {
        zzcb zzcbVar = new zzcb();
        zzr = zzcbVar;
        zzfym.zzay(zzcb.class, zzcbVar);
    }

    private zzcb() {
    }

    public static zzbv zza() {
        return zzr.zzas();
    }

    public static /* synthetic */ void zzd(zzcb zzcbVar, String str) {
        str.getClass();
        zzcbVar.zzb |= 1;
        zzcbVar.zze = str;
    }

    public static /* synthetic */ void zze(zzcb zzcbVar, long j) {
        zzcbVar.zzb |= 2;
        zzcbVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzcb zzcbVar, String str) {
        str.getClass();
        zzcbVar.zzb |= 4;
        zzcbVar.zzg = str;
    }

    public static /* synthetic */ void zzg(zzcb zzcbVar, String str) {
        str.getClass();
        zzcbVar.zzb |= 8;
        zzcbVar.zzh = str;
    }

    public static /* synthetic */ void zzh(zzcb zzcbVar, String str) {
        zzcbVar.zzb |= 16;
        zzcbVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzcb zzcbVar, String str) {
        zzcbVar.zzb |= 1024;
        zzcbVar.zzo = str;
    }

    public static /* synthetic */ void zzj(zzcb zzcbVar, zzca zzcaVar) {
        zzcbVar.zzq = zzcaVar.zza();
        zzcbVar.zzb |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzr;
                    }
                    return new zzbv(null);
                }
                return new zzcb();
            }
            return zzaz(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbx.class, "zzq", zzca.zzc()});
        }
        return (byte) 1;
    }
}
