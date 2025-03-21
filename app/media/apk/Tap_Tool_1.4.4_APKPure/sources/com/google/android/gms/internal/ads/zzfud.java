package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfud extends zzfym<zzfud, zzfuc> implements zzfzv {
    private static final zzfud zzf;
    private int zzb;
    private zzfug zze;

    static {
        zzfud zzfudVar = new zzfud();
        zzf = zzfudVar;
        zzfym.zzay(zzfud.class, zzfudVar);
    }

    private zzfud() {
    }

    public static zzfud zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfud) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzfuc zze() {
        return zzf.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzfud zzfudVar, zzfug zzfugVar) {
        zzfugVar.getClass();
        zzfudVar.zze = zzfugVar;
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
                        return zzf;
                    }
                    return new zzfuc(null);
                }
                return new zzfud();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfug zzc() {
        zzfug zzfugVar = this.zze;
        return zzfugVar == null ? zzfug.zzf() : zzfugVar;
    }
}
