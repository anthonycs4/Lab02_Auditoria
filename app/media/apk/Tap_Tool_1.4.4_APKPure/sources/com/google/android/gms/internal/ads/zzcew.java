package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcew implements Runnable {
    private final zzcei zza;
    private boolean zzb = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcew(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzr.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzr.zza.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzE();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzE();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
