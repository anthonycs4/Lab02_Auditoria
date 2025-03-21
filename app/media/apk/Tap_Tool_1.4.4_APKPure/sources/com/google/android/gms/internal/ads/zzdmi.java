package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdmi implements zzgdq<zzdya<zzdmb>> {
    private final zzgeb<zzedb<zzdmb, zzeub, zzdzx>> zza;
    private final zzgeb<zzedb<zzdmb, zzeub, zzdzw>> zzb;
    private final zzgeb<zzetk> zzc;

    public zzdmi(zzgeb<zzedb<zzdmb, zzeub, zzdzx>> zzgebVar, zzgeb<zzedb<zzdmb, zzeub, zzdzw>> zzgebVar2, zzgeb<zzetk> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgeb<zzedb<zzdmb, zzeub, zzdzx>> zzgebVar = this.zza;
        zzgeb<zzedb<zzdmb, zzeub, zzdzw>> zzgebVar2 = this.zzb;
        int i = ((zzcvy) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                return ((zzedc) zzgebVar2).zzb();
            }
            return ((zzedc) zzgebVar).zzb();
        }
        throw null;
    }
}
