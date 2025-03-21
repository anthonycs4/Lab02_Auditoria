package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgw extends zzhg {
    private List<Long> zzi;

    public zzgw(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "tHdRNe/jhDrKe9TJQvcUj84NPZ0s3GzvdUdmVGo+tKBBdeggC8tn8wP69jltn3ho", "39psGfDY061ys4/Wj2pOCaqnZF5wiqQFlwVMT/Ve3NQ=", zzcnVar, i, 31);
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzq(-1L);
        this.zze.zzr(-1L);
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, this.zzb.zzb());
        }
        List<Long> list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzq(this.zzi.get(0).longValue());
            this.zze.zzr(this.zzi.get(1).longValue());
        }
    }
}
