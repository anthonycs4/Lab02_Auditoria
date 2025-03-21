package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhb extends zzhg {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzhb(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "dtSI0aKX7UTEtNqwwKeUCAgkaGFO8NldeUWoEFEF24FGt0zcuIxq/320xj/CPQVD", "aR1qQgZoj5moBo+qhq9c0z5J3aresRgomgvyzjE3nwA=", zzcnVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzs(zzi.longValue());
        }
    }
}
