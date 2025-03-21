package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcjr {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcjr(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcjr zza(zzazx zzazxVar) {
        if (zzazxVar.zzd) {
            return new zzcjr(3, 0, 0);
        }
        if (zzazxVar.zzi) {
            return new zzcjr(2, 0, 0);
        }
        return zzazxVar.zzh ? zzb() : zzc(zzazxVar.zzf, zzazxVar.zzc);
    }

    public static zzcjr zzb() {
        return new zzcjr(0, 0, 0);
    }

    public static zzcjr zzc(int i, int i2) {
        return new zzcjr(1, i, i2);
    }

    public static zzcjr zzd() {
        return new zzcjr(4, 0, 0);
    }

    public static zzcjr zze() {
        return new zzcjr(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
