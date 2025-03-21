package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgx extends zzhg {
    private final boolean zzi;

    public zzgx(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "YGljdmTqVecnIT/TcNBW8EyCW98CifULQ4UQ5x4xY9d0w3w6sROgLyygqbyghtw3", "UuCnFh6ovoijq9XZ+A2Y7XU13mSANZwBIMCWkOnrp4k=", zzcnVar, i, 61);
        this.zzi = zzfyVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzR(longValue);
        }
    }
}
