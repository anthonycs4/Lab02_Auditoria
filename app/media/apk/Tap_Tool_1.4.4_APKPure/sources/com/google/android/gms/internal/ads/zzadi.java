package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadi {
    private final int zza;
    private final String[] zzb;
    private final int[] zzc;
    private final zzach[] zzd;
    private final int[] zze;
    private final int[][][] zzf;
    private final zzach zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadi(String[] strArr, int[] iArr, zzach[] zzachVarArr, int[] iArr2, int[][][] iArr3, zzach zzachVar) {
        this.zzb = strArr;
        this.zzc = iArr;
        this.zzd = zzachVarArr;
        this.zzf = iArr3;
        this.zze = iArr2;
        this.zzg = zzachVar;
        this.zza = iArr.length;
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb(int i) {
        return this.zzc[i];
    }

    public final zzach zzc(int i) {
        return this.zzd[i];
    }
}
