package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgv extends zzhg {
    public zzgv(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "1awJYzD+83j7B9eX6wfFcblqRy0I5IsvjjNLhcUURSjwWlhd1c9W/cfZ/PPMWvlS", "HJEi+2IOFxRSipNp6qbDeqGjXnf50mdvT5qWzt7Vsy8=", zzcnVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            this.zze.zzV(((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue() ? zzdm.ENUM_TRUE : zzdm.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.zze.zzV(zzdm.ENUM_FAILURE);
        }
    }
}
