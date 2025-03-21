package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgp extends zzhg {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzgp(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "3kDC/5zdzriiTlLT98JAXh+tBEcp8Zs9D/7C5pBfnPMFpbO41uhjttSiwgYBtCds", "XaEk5xUvARugMaH/yLgQFFyBRau1nqpoJU7dPEEG4NA=", zzcnVar, i, 22);
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
            this.zze.zzm(zzi.longValue());
        }
    }
}
