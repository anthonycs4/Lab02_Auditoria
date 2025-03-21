package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdeo implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcyk zza;
    private final zzdcv zzb;

    public zzdeo(zzcyk zzcykVar, zzdcv zzdcvVar) {
        this.zza = zzcykVar;
        this.zzb = zzdcvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
        this.zza.zzbB();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        this.zza.zzbC();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        this.zza.zzbD(i);
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
        this.zza.zzbT();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        this.zza.zzby();
        this.zzb.zza();
    }
}
