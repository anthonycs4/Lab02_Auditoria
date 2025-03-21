package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcad extends zzcax {
    private final Clock zzb;
    private final zzgeb<Context> zzc;
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zzd;
    private final zzgeb<zzcaw> zze;
    private final zzgeb<zzbzv> zzf;
    private final zzgeb<Clock> zzg;
    private final zzgeb<zzbzx> zzh;
    private final zzgeb<zzbzz> zzi;
    private final zzgeb<zzcbc> zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcad(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcaw zzcawVar, zzcab zzcabVar) {
        this.zzb = clock;
        zzgdq zza = zzgdr.zza(context);
        this.zzc = zza;
        zzgdq zza2 = zzgdr.zza(zzgVar);
        this.zzd = zza2;
        zzgdq zza3 = zzgdr.zza(zzcawVar);
        this.zze = zza3;
        this.zzf = zzgdp.zza(new zzbzw(zza, zza2, zza3));
        zzgdq zza4 = zzgdr.zza(clock);
        this.zzg = zza4;
        zzgeb<zzbzx> zza5 = zzgdp.zza(new zzbzy(zza4, zza2, zza3));
        this.zzh = zza5;
        zzcaa zzcaaVar = new zzcaa(zza4, zza5);
        this.zzi = zzcaaVar;
        this.zzj = zzgdp.zza(new zzcbd(zza, zzcaaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    final zzbzv zza() {
        return this.zzf.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzcax
    public final zzbzz zzb() {
        return new zzbzz(this.zzb, this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    final zzcbc zzc() {
        return this.zzj.zzb();
    }
}
