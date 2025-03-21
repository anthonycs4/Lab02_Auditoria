package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedh implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcwf zzb;
    private final zzcwx zzc;
    private final zzddc zzd;
    private final zzdcz zze;
    private final zzcox zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedh(zzcwf zzcwfVar, zzcwx zzcwxVar, zzddc zzddcVar, zzdcz zzdczVar, zzcox zzcoxVar) {
        this.zzb = zzcwfVar;
        this.zzc = zzcwxVar;
        this.zzd = zzddcVar;
        this.zze = zzdczVar;
        this.zzf = zzcoxVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzbz();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
