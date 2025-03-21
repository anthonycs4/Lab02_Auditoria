package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcls implements zzeph {
    final /* synthetic */ zzcmk zza;
    private final Context zzb;
    private final zzazx zzc;
    private final String zzd;
    private final zzgeb<Context> zze;
    private final zzgeb<zzazx> zzf;
    private final zzgeb<zzefe> zzg;
    private final zzgeb<zzefi> zzh;
    private final zzgeb<zzepe> zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcls(zzcmk zzcmkVar, Context context, String str, zzazx zzazxVar, zzckz zzckzVar) {
        zzgeb zzgebVar;
        zzgeb zzgebVar2;
        zzgeb zzgebVar3;
        this.zza = zzcmkVar;
        this.zzb = context;
        this.zzc = zzazxVar;
        this.zzd = str;
        zzgdq zza = zzgdr.zza(context);
        this.zze = zza;
        zzgdq zza2 = zzgdr.zza(zzazxVar);
        this.zzf = zza2;
        zzgebVar = zzcmkVar.zzn;
        zzgeb<zzefe> zza3 = zzgdp.zza(new zzeff(zzgebVar));
        this.zzg = zza3;
        zzgeb<zzefi> zza4 = zzgdp.zza(zzefk.zza());
        this.zzh = zza4;
        zzgebVar2 = zzcmkVar.zzo;
        zzgebVar3 = zzcmkVar.zzM;
        this.zzi = zzgdp.zza(new zzepf(zza, zzgebVar2, zza2, zzgebVar3, zza3, zza4, zzetm.zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzeph
    public final zzeem zza() {
        return new zzeem(this.zzb, this.zzc, this.zzd, this.zzi.zzb(), this.zzg.zzb());
    }
}
