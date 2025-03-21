package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzli {
    public static final zzli zza = new zzli(false);
    public final boolean zzb;

    public zzli(boolean z) {
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zzb == ((zzli) obj).zzb;
    }

    public final int hashCode() {
        return this.zzb ? 0 : 1;
    }
}
