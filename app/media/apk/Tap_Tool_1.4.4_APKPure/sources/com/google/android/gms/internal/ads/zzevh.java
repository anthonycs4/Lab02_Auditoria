package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzevh implements zzevf {
    private final String zza;

    public zzevh(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final boolean equals(Object obj) {
        if (obj instanceof zzevh) {
            return this.zza.equals(((zzevh) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
