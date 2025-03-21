package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavs extends zzfym<zzavs, zzavr> implements zzfzv {
    private static final zzavs zzp;
    private int zzb;
    private int zze;
    private zzawk zzg;
    private zzawm zzh;
    private zzawo zzj;
    private zzaya zzk;
    private zzaxq zzl;
    private zzaxe zzm;
    private zzaxg zzn;
    private int zzf = 1000;
    private zzfyv<zzawi> zzi = zzaE();
    private zzfyv<zzaym> zzo = zzaE();

    static {
        zzavs zzavsVar = new zzavs();
        zzp = zzavsVar;
        zzfym.zzay(zzavs.class, zzavsVar);
    }

    private zzavs() {
    }

    public static zzavs zzc() {
        return zzp;
    }

    public static /* synthetic */ void zze(zzavs zzavsVar, zzavq zzavqVar) {
        zzavsVar.zze = zzavqVar.zza();
        zzavsVar.zzb |= 1;
    }

    public static /* synthetic */ void zzf(zzavs zzavsVar, zzawm zzawmVar) {
        zzawmVar.getClass();
        zzavsVar.zzh = zzawmVar;
        zzavsVar.zzb |= 8;
    }

    public final zzawm zza() {
        zzawm zzawmVar = this.zzh;
        return zzawmVar == null ? zzawm.zza() : zzawmVar;
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
                        return zzp;
                    }
                    return new zzavr(null);
                }
                return new zzavs();
            }
            return zzaz(zzp, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzb", "zze", zzavq.zzc(), "zzf", zzawy.zzc(), "zzg", "zzh", "zzi", zzawi.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzaym.class});
        }
        return (byte) 1;
    }
}
