package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacx implements Comparable<zzacx> {
    private final boolean zza;
    private final boolean zzb;

    public zzacx(zzjq zzjqVar, int i) {
        this.zza = 1 == (zzjqVar.zzd & 1);
        this.zzb = zzadf.zzd(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzacx zzacxVar) {
        return zzfgo.zzg().zzd(this.zzb, zzacxVar.zzb).zzd(this.zza, zzacxVar.zza).zze();
    }
}
