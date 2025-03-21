package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcih implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcib zza;
    private final com.google.android.gms.ads.internal.overlay.zzo zzb;

    public zzcih(zzcib zzcibVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zza = zzcibVar;
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbB();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbD(i);
        }
        this.zza.zzI();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
        this.zza.zzK();
    }
}
