package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbls {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized void zza(boolean z) {
        this.zza = z;
        this.zzd.set(true);
    }

    public final synchronized void zzb(boolean z, float f) {
        this.zzb = z;
        this.zzc = f;
    }

    public final synchronized boolean zzc(boolean z) {
        if (this.zzd.get()) {
            return this.zza;
        }
        return z;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized float zze() {
        return this.zzc;
    }
}
