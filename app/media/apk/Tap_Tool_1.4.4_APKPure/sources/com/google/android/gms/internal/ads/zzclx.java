package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzclx implements zzdqv {
    final /* synthetic */ zzcmk zza;
    private final Context zzb;
    private final zzbmk zzc;
    private final zzgeb<zzdqv> zzd;
    private final zzgeb<zzbmk> zze;
    private final zzgeb<zzdqq> zzf;
    private final zzgeb<zzdqs> zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclx(zzcmk zzcmkVar, Context context, zzbmk zzbmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
        this.zzb = context;
        this.zzc = zzbmkVar;
        zzgdq zza = zzgdr.zza(this);
        this.zzd = zza;
        zzgdq zza2 = zzgdr.zza(zzbmkVar);
        this.zze = zza2;
        zzdqr zzdqrVar = new zzdqr(zza2);
        this.zzf = zzdqrVar;
        this.zzg = zzgdp.zza(new zzdqt(zza, zzdqrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdqv
    public final zzdqs zza() {
        return this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdqv
    public final zzdqm zzb() {
        return new zzclv(this, null);
    }
}
