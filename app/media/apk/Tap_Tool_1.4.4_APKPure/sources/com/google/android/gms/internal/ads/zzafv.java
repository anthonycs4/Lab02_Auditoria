package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzafv {
    private final zzaft zza;
    private boolean zzb;

    public zzafv() {
        throw null;
    }

    public zzafv(zzaft zzaftVar) {
        this.zza = zzaftVar;
    }

    public final synchronized boolean zza() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z;
        z = this.zzb;
        this.zzb = false;
        return z;
    }

    public final synchronized void zzc() throws InterruptedException {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }
}
