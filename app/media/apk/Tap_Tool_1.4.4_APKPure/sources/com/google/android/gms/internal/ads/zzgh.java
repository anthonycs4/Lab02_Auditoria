package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgh extends zzhg {
    public zzgh(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "ymEBQrm9U6oe66zraL8TMCz2DXOLL9KQTnrV40u0sowIyd/opEzPMlsdilx/qVZg", "EUHQvfImnZF71YZIWfpsbLorbTgsT1XsQrZZ+fhXkl4=", zzcnVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzG(zzdm.ENUM_FAILURE);
        try {
            this.zze.zzG(((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue() ? zzdm.ENUM_TRUE : zzdm.ENUM_FALSE);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
