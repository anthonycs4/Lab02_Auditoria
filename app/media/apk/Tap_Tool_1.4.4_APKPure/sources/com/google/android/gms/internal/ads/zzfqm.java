package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfqm extends zzfym<zzfqm, zzfql> implements zzfzv {
    private static final zzfqm zzg;
    private int zzb;
    private zzfqs zze;
    private zzfxj zzf = zzfxj.zzb;

    static {
        zzfqm zzfqmVar = new zzfqm();
        zzg = zzfqmVar;
        zzfym.zzay(zzfqm.class, zzfqmVar);
    }

    private zzfqm() {
    }

    public static zzfqm zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfqm) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfql zzf() {
        return zzg.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfqm zzfqmVar, zzfqs zzfqsVar) {
        zzfqsVar.getClass();
        zzfqmVar.zze = zzfqsVar;
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
                    return new zzfql(null);
                }
                return new zzfqm();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfqs zzc() {
        zzfqs zzfqsVar = this.zze;
        return zzfqsVar == null ? zzfqs.zzc() : zzfqsVar;
    }

    public final zzfxj zzd() {
        return this.zzf;
    }
}
