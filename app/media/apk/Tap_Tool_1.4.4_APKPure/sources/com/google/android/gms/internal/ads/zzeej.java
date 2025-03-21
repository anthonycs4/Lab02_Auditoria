package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeej extends zzbbp {
    final zzetj zza;
    final zzdhj zzb;
    private final Context zzc;
    private final zzcjz zzd;
    private zzbbh zze;

    public zzeej(zzcjz zzcjzVar, Context context, String str) {
        zzetj zzetjVar = new zzetj();
        this.zza = zzetjVar;
        this.zzb = new zzdhj();
        this.zzd = zzcjzVar;
        zzetjVar.zzf(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final zzbbn zze() {
        zzdhk zzg = this.zzb.zzg();
        this.zza.zzl(zzg.zzh());
        this.zza.zzm(zzg.zzi());
        zzetj zzetjVar = this.zza;
        if (zzetjVar.zze() == null) {
            zzetjVar.zzc(zzazx.zzb());
        }
        return new zzeek(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzf(zzbbh zzbbhVar) {
        this.zze = zzbbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzg(zzbje zzbjeVar) {
        this.zzb.zzb(zzbjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzh(zzbjh zzbjhVar) {
        this.zzb.zza(zzbjhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzi(String str, zzbjn zzbjnVar, zzbjk zzbjkVar) {
        this.zzb.zzf(str, zzbjnVar, zzbjkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzj(zzbhy zzbhyVar) {
        this.zza.zzn(zzbhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzk(zzbjr zzbjrVar, zzazx zzazxVar) {
        this.zzb.zzd(zzbjrVar);
        this.zza.zzc(zzazxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzq(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzm(zzbju zzbjuVar) {
        this.zzb.zzc(zzbjuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzn(zzbnv zzbnvVar) {
        this.zza.zzp(zzbnvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzo(zzboe zzboeVar) {
        this.zzb.zze(zzboeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzq(zzbcf zzbcfVar) {
        this.zza.zzN(zzbcfVar);
    }
}
