package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzku {
    public static final zzku zza = new zzku(1.0f, 1.0f);
    public static final zzhw<zzku> zzd = zzkt.zza;
    public final float zzb;
    public final float zzc;
    private final int zze;

    public zzku(float f, float f2) {
        zzafs.zza(f > 0.0f);
        zzafs.zza(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zze = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzku zzkuVar = (zzku) obj;
            if (this.zzb == zzkuVar.zzb && this.zzc == zzkuVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + 527) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        return zzaht.zzw("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j) {
        return j * this.zze;
    }
}
