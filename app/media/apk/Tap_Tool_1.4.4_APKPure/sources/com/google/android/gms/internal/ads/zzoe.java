package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzoe {
    private int zza;

    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzh(Integer.MIN_VALUE);
    }

    public final boolean zzc() {
        return zzh(4);
    }

    public final boolean zzd() {
        return zzh(1);
    }

    public final boolean zze() {
        return zzh(268435456);
    }

    public final void zzf(int i) {
        this.zza = i;
    }

    public final void zzg(int i) {
        this.zza |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzh(int i) {
        return (this.zza & i) == i;
    }
}
