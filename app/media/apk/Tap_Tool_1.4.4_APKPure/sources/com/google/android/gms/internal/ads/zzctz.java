package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzctz implements zzcxt, zzazi, zzcyy, zzcwz, zzcwh, zzdbb {
    private final Clock zza;
    private final zzcbt zzb;

    public zzctz(Clock clock, zzcbt zzcbtVar) {
        this.zza = clock;
        this.zzb = zzcbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        this.zzb.zzg(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
    }

    public final void zzi(zzazs zzazsVar) {
        this.zzb.zza(zzazsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzk(zzawd zzawdVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzl(zzawd zzawdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzm(zzawd zzawdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzo(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
        this.zzb.zzc(this.zza.elapsedRealtime());
    }

    public final String zzr() {
        return this.zzb.zzi();
    }
}
