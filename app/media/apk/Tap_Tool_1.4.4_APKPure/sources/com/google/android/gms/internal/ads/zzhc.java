package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhc extends zzhg {
    public zzhc(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "ve98w3uvwL+WbIhcx9tIAXYisv3RoRLLGwxFdq305Znx3OEzhYuRa3SMbNvxvcZ5", "COyKgr9nLwjtPmD4ZyUGB47tHeKQEqJ+6+4+oYNfjv8=", zzcnVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzF(zzdm.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzF(zzdm.ENUM_TRUE);
            } else {
                this.zze.zzF(zzdm.ENUM_FALSE);
            }
        }
    }
}
