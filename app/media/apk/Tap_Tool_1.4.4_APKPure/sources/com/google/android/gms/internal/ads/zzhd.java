package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhd extends zzhg {
    private final View zzi;

    public zzhd(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2, View view) {
        super(zzfyVar, "vefonVnYKoEEgd6CSCVE/bYu22aLs4D8v1V0lNqO4hdlAYob7Lw72sorrCIN3zpD", "gYJIsaJeV9lPo/cCsxCjt1P0O4OoIzIZoy68hFiQOi8=", zzcnVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzbba.zzc().zzb(zzbfq.zzbQ);
            zzgc zzgcVar = new zzgc((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool));
            zzda zza = zzdb.zza();
            zza.zza(zzgcVar.zza.longValue());
            zza.zzb(zzgcVar.zzb.longValue());
            zza.zzc(zzgcVar.zzc.longValue());
            if (bool.booleanValue()) {
                zza.zzd(zzgcVar.zzd.longValue());
            }
            this.zze.zzO(zza.zzah());
        }
    }
}
