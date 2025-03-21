package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzha extends zzhg {
    private final zzgf zzi;
    private long zzj;

    public zzha(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2, zzgf zzgfVar) {
        super(zzfyVar, "/PoX3bCyipS3p2k7kjc4HvQ27M63u+31cicZbFfWzwv/nsnLRaohqBhTdPid92VG", "Empsd+ouV88t4n5YSBzcvDK1RtnsR/tpf2QPTdrQaLw=", zzcnVar, i, 53);
        this.zzi = zzgfVar;
        if (zzgfVar != null) {
            this.zzj = zzgfVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzJ(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
