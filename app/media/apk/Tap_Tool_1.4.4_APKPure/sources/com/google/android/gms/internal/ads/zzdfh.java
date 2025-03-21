package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdfh implements zzgdq<zzdfg> {
    private final zzgeb<Map<String, zzdya<zzcsu>>> zza;
    private final zzgeb<Map<String, zzdya<zzdgu>>> zzb;
    private final zzgeb<Map<String, zzeap<zzdgu>>> zzc;
    private final zzgeb<zzcsq<zzcqo>> zzd;
    private final zzgeb<zzdhk> zze;

    public zzdfh(zzgeb<Map<String, zzdya<zzcsu>>> zzgebVar, zzgeb<Map<String, zzdya<zzdgu>>> zzgebVar2, zzgeb<Map<String, zzeap<zzdgu>>> zzgebVar3, zzgeb<zzcsq<zzcqo>> zzgebVar4, zzgeb<zzdhk> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfg(((zzgdu) this.zza).zzb(), ((zzgdu) this.zzb).zzb(), ((zzgdu) this.zzc).zzb(), this.zzd, ((zzdfl) this.zze).zza());
    }
}
