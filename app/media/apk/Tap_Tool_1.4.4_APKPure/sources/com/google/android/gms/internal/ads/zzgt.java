package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgt extends zzhg {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzgt(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "ZhDCYxrCMcgSZPuGcM9wAQ/lryfELH/hwoSWjI7UgCmBL/U4jm1j8231unJQcN7G", "Tx6BN+D/YHy1QRF0a4sTUKKvc/7PTkfUYoCdGLIghAs=", zzcnVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zza("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zza(zzi);
        }
    }
}
