package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadq {
    public final int zza;
    public final zzli[] zzb;
    public final Object zzc;
    public final zzacs[] zzd;

    public zzadq(zzli[] zzliVarArr, zzacs[] zzacsVarArr, Object obj, byte[] bArr) {
        this.zzb = zzliVarArr;
        this.zzd = (zzacs[]) zzacsVarArr.clone();
        this.zzc = obj;
        this.zza = zzliVarArr.length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(zzadq zzadqVar, int i) {
        return zzadqVar != null && zzaht.zzc(this.zzb[i], zzadqVar.zzb[i]) && zzaht.zzc(this.zzd[i], zzadqVar.zzd[i]);
    }
}
