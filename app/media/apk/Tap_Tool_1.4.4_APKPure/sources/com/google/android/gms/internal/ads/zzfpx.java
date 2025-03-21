package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfpx extends zzfym<zzfpx, zzfpw> implements zzfzv {
    private static final zzfpx zzg;
    private int zzb;
    private zzfqd zze;
    private zzfsr zzf;

    static {
        zzfpx zzfpxVar = new zzfpx();
        zzg = zzfpxVar;
        zzfym.zzay(zzfpx.class, zzfpxVar);
    }

    private zzfpx() {
    }

    public static zzfpx zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfpx) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfpw zzf() {
        return zzg.zzas();
    }

    public static /* synthetic */ void zzi(zzfpx zzfpxVar, zzfqd zzfqdVar) {
        zzfqdVar.getClass();
        zzfpxVar.zze = zzfqdVar;
    }

    public static /* synthetic */ void zzj(zzfpx zzfpxVar, zzfsr zzfsrVar) {
        zzfsrVar.getClass();
        zzfpxVar.zzf = zzfsrVar;
    }

    public final int zza() {
        return this.zzb;
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
                        return zzg;
                    }
                    return new zzfpw(null);
                }
                return new zzfpx();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfqd zzc() {
        zzfqd zzfqdVar = this.zze;
        return zzfqdVar == null ? zzfqd.zzg() : zzfqdVar;
    }

    public final zzfsr zzd() {
        zzfsr zzfsrVar = this.zzf;
        return zzfsrVar == null ? zzfsr.zzg() : zzfsrVar;
    }
}
