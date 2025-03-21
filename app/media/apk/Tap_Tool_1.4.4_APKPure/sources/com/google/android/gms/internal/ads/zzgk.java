package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgk extends zzhg {
    public zzgk(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "wGiQh6oIQPcfvqINgsDcKObtfJMmkAPkTuuTR+YWtX6ruuv68EJcK0wD9PuGwMVm", "Xn+NIOTt9a+kGD9HWjVPlcFOa97eg3lCTKq+K8aWyZk=", zzcnVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzd(-1L);
        this.zze.zze(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzd(iArr[0]);
            this.zze.zze(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzP(i);
            }
        }
    }
}
