package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgm extends zzhg {
    private final long zzi;

    public zzgm(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, long j, int i, int i2) {
        super(zzfyVar, "5OYIQdsidStip3SBjywYm0rOM8tyA+MY9PPNX7JmSvza1Onp24UtEjVR4gU3Ig+9", "GcgQ+JQVen6BN2jyFQVqgjJfTksMX5RTfakx+qKDe48=", zzcnVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzaa(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzk(longValue - j);
                this.zze.zzn(this.zzi);
            }
        }
    }
}
