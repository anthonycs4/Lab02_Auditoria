package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcth implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcxm zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzcth(zzcxm zzcxmVar) {
        this.zza = zzcxmVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        this.zzb.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        this.zza.zzc();
    }

    public final boolean zzf() {
        return this.zzb.get();
    }
}
