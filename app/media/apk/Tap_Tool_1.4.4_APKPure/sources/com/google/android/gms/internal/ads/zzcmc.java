package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcmc implements zzera {
    final /* synthetic */ zzcmk zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzazx> zzc;
    private final zzgeb<String> zzd;
    private final zzgeb<zzefe> zze;
    private final zzgeb<zzerw> zzf;
    private final zzgeb<zzeqx> zzg;
    private final zzgeb<zzefm> zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcmc(zzcmk zzcmkVar, Context context, String str, zzazx zzazxVar, zzckz zzckzVar) {
        zzgeb zzgebVar;
        zzgeb zzgebVar2;
        zzgeb zzgebVar3;
        zzgeb zzgebVar4;
        this.zza = zzcmkVar;
        zzgdq zza = zzgdr.zza(context);
        this.zzb = zza;
        zzgdq zza2 = zzgdr.zza(zzazxVar);
        this.zzc = zza2;
        zzgdq zza3 = zzgdr.zza(str);
        this.zzd = zza3;
        zzgebVar = zzcmkVar.zzn;
        zzgeb<zzefe> zza4 = zzgdp.zza(new zzeff(zzgebVar));
        this.zze = zza4;
        zzgebVar2 = zzcmkVar.zzaq;
        zzgeb<zzerw> zza5 = zzgdp.zza(new zzerx(zzgebVar2));
        this.zzf = zza5;
        zzgebVar3 = zzcmkVar.zzo;
        zzgebVar4 = zzcmkVar.zzM;
        zzgeb<zzeqx> zza6 = zzgdp.zza(new zzeqy(zza, zzgebVar3, zzgebVar4, zza4, zza5, zzetm.zza()));
        this.zzg = zza6;
        this.zzh = zzgdp.zza(new zzefn(zza, zza2, zza3, zza6, zza4, zza5));
    }

    @Override // com.google.android.gms.internal.ads.zzera
    public final zzefm zza() {
        return this.zzh.zzb();
    }
}
