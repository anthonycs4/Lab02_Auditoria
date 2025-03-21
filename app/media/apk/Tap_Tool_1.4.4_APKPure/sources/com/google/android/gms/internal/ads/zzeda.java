package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeda implements zzcxo {
    boolean zza = false;
    final /* synthetic */ zzdyd zzb;
    final /* synthetic */ zzcde zzc;
    final /* synthetic */ zzedb zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeda(zzedb zzedbVar, zzdyd zzdydVar, zzcde zzcdeVar) {
        this.zzd = zzedbVar;
        this.zzb = zzdydVar;
        this.zzc = zzcdeVar;
    }

    private final void zze(zzazm zzazmVar) {
        this.zzc.zzd(new zzdye(true == ((Boolean) zzbba.zzc().zzb(zzbfq.zzdG)).booleanValue() ? 3 : 1, zzazmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzb(int i) {
        if (this.zza) {
            return;
        }
        zze(new zzazm(i, zzedb.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzedb.zze(this.zzb.zza, i);
        }
        zze(new zzazm(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final synchronized void zzd(zzazm zzazmVar) {
        this.zza = true;
        zze(zzazmVar);
    }
}
