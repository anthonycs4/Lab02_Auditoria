package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdec implements zzgdq<zzdcx<zzcxt>> {
    private final zzddy zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzcct> zzc;
    private final zzgeb<zzess> zzd;
    private final zzgeb<zzetk> zze;

    public zzdec(zzddy zzddyVar, zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<zzess> zzgebVar3, zzgeb<zzetk> zzgebVar4) {
        this.zza = zzddyVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
        this.zzd = zzgebVar3;
        this.zze = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context zzb = this.zzb.zzb();
        final zzcct zza = ((zzckn) this.zzc).zza();
        final zzess zza2 = ((zzctd) this.zzd).zza();
        final zzetk zza3 = ((zzcvy) this.zze).zza();
        return new zzdcx(new zzcxt(zzb, zza, zza2, zza3) { // from class: com.google.android.gms.internal.ads.zzddw
            private final Context zza;
            private final zzcct zzb;
            private final zzess zzc;
            private final zzetk zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
                this.zzb = zza;
                this.zzc = zza2;
                this.zzd = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzcxt
            public final void zzbN() {
                com.google.android.gms.ads.internal.zzs.zzm().zzg(this.zza, this.zzb.zza, this.zzc.zzB.toString(), this.zzd.zzf);
            }
        }, zzccz.zzf);
    }
}
