package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaxy extends zzfym<zzaxy, zzaxu> implements zzfzv {
    private static final zzaxy zzl;
    private int zzb;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private zzfyv<zzaxt> zze = zzaE();
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzaxy zzaxyVar = new zzaxy();
        zzl = zzaxyVar;
        zzfym.zzay(zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
    }

    public static zzaxu zza() {
        return zzl.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzaxy zzaxyVar, Iterable iterable) {
        zzfyv<zzaxt> zzfyvVar = zzaxyVar.zze;
        if (!zzfyvVar.zza()) {
            zzaxyVar.zze = zzfym.zzaF(zzfyvVar);
        }
        zzfwt.zzar(iterable, zzaxyVar.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzaxy zzaxyVar, int i) {
        zzaxyVar.zzb |= 1;
        zzaxyVar.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzaxy zzaxyVar, int i) {
        zzaxyVar.zzb |= 2;
        zzaxyVar.zzg = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzaxy zzaxyVar, long j) {
        zzaxyVar.zzb |= 4;
        zzaxyVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzaxy zzaxyVar, String str) {
        str.getClass();
        zzaxyVar.zzb |= 8;
        zzaxyVar.zzi = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzaxy zzaxyVar, String str) {
        str.getClass();
        zzaxyVar.zzb |= 16;
        zzaxyVar.zzj = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzaxy zzaxyVar, long j) {
        zzaxyVar.zzb |= 32;
        zzaxyVar.zzk = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzl;
                    }
                    return new zzaxu(null);
                }
                return new zzaxy();
            }
            return zzaz(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzb", "zze", zzaxt.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
