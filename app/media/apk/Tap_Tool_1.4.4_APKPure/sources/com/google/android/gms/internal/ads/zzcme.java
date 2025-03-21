package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcme implements zzesm {
    final /* synthetic */ zzcmk zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzeqj<zzdmg, zzdmb>> zzc;
    private final zzgeb<zzerw> zzd;
    private final zzgeb<zzetf> zze;
    private final zzgeb<zzesf> zzf;
    private final zzgeb<zzesp> zzg;
    private final zzgeb<String> zzh;
    private final zzgeb<zzesj> zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcme(zzcmk zzcmkVar, Context context, String str, zzckz zzckzVar) {
        zzgeb zzgebVar;
        zzgeb zzgebVar2;
        zzgeb zzgebVar3;
        zzgeb zzgebVar4;
        zzgeb zzgebVar5;
        this.zza = zzcmkVar;
        zzgdq zza = zzgdr.zza(context);
        this.zzb = zza;
        zzgebVar = zzcmkVar.zzaq;
        zzgebVar2 = zzcmkVar.zzar;
        zzeqo zzeqoVar = new zzeqo(zza, zzgebVar, zzgebVar2);
        this.zzc = zzeqoVar;
        zzgebVar3 = zzcmkVar.zzaq;
        zzgeb<zzerw> zza2 = zzgdp.zza(new zzerx(zzgebVar3));
        this.zzd = zza2;
        zzgeb<zzetf> zza3 = zzgdp.zza(zzeth.zza());
        this.zze = zza3;
        zzgebVar4 = zzcmkVar.zzo;
        zzgebVar5 = zzcmkVar.zzM;
        zzgeb<zzesf> zza4 = zzgdp.zza(new zzesg(zza, zzgebVar4, zzgebVar5, zzeqoVar, zza2, zzetm.zza(), zza3));
        this.zzf = zza4;
        this.zzg = zzgdp.zza(new zzesq(zza4, zza2, zza3));
        zzgdq zzc = zzgdr.zzc(str);
        this.zzh = zzc;
        this.zzi = zzgdp.zza(new zzesk(zzc, zza4, zza, zza2, zza3));
    }

    @Override // com.google.android.gms.internal.ads.zzesm
    public final zzesp zza() {
        return this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzesm
    public final zzesj zzb() {
        return this.zzi.zzb();
    }
}
