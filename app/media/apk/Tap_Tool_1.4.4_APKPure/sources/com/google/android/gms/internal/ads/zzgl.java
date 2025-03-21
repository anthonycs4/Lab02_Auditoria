package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgl extends zzhg {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzgl(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "2jgw5zKbHso9qSu2FHWgkwMGYpWraOZgKzMlINCc6R3raSWmpy2CL0CBKMif8Xd3", "xwe9uWAuGPfe//9yVRExw0dL2o3Hs2ICdfgY11WBl0c=", zzcnVar, i, 44);
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
            this.zze.zzB(zzi.longValue());
        }
    }
}
