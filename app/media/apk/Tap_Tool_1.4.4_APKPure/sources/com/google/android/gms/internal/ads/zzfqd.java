package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfqd extends zzfym<zzfqd, zzfqc> implements zzfzv {
    private static final zzfqd zzg;
    private int zzb;
    private zzfqj zze;
    private zzfxj zzf = zzfxj.zzb;

    static {
        zzfqd zzfqdVar = new zzfqd();
        zzg = zzfqdVar;
        zzfym.zzay(zzfqd.class, zzfqdVar);
    }

    private zzfqd() {
    }

    public static zzfqd zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfqd) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfqc zzf() {
        return zzg.zzas();
    }

    public static zzfqd zzg() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzfqd zzfqdVar, zzfqj zzfqjVar) {
        zzfqjVar.getClass();
        zzfqdVar.zze = zzfqjVar;
    }

    public final int zza() {
        return this.zzb;
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
                        return zzg;
                    }
                    return new zzfqc(null);
                }
                return new zzfqd();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfqj zzc() {
        zzfqj zzfqjVar = this.zze;
        return zzfqjVar == null ? zzfqj.zzc() : zzfqjVar;
    }

    public final zzfxj zzd() {
        return this.zzf;
    }
}
