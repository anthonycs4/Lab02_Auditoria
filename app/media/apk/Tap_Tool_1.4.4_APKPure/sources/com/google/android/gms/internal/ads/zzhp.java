package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhp extends zzfym<zzhp, zzho> implements zzfzv {
    private static final zzhp zzj;
    private int zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzhp zzhpVar = new zzhp();
        zzj = zzhpVar;
        zzfym.zzay(zzhp.class, zzhpVar);
    }

    private zzhp() {
    }

    public static zzhp zzg(zzfxj zzfxjVar) throws zzfyy {
        return (zzhp) zzfym.zzaH(zzj, zzfxjVar);
    }

    public static zzhp zzh(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzhp) zzfym.zzaI(zzj, zzfxjVar, zzfxyVar);
    }

    public static zzho zzi() {
        return zzj.zzas();
    }

    public static zzhp zzj() {
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzhp zzhpVar, String str) {
        str.getClass();
        zzhpVar.zzb |= 1;
        zzhpVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzhp zzhpVar, String str) {
        str.getClass();
        zzhpVar.zzb |= 2;
        zzhpVar.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzhp zzhpVar, long j) {
        zzhpVar.zzb |= 4;
        zzhpVar.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzhp zzhpVar, long j) {
        zzhpVar.zzb |= 8;
        zzhpVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzhp zzhpVar, long j) {
        zzhpVar.zzb |= 16;
        zzhpVar.zzi = j;
    }

    public final String zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                        return zzj;
                    }
                    return new zzho(null);
                }
                return new zzhp();
            }
            return zzaz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final long zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzi;
    }
}
