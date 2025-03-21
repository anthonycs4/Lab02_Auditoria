package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdfg implements zzcsq<zzcsu> {
    private final Map<String, zzdya<zzcsu>> zza;
    private final Map<String, zzdya<zzdgu>> zzb;
    private final Map<String, zzeap<zzdgu>> zzc;
    private final zzgeb<zzcsq<zzcqo>> zzd;
    private final zzdhk zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdfg(Map<String, zzdya<zzcsu>> map, Map<String, zzdya<zzdgu>> map2, Map<String, zzeap<zzdgu>> map3, zzgeb<zzcsq<zzcqo>> zzgebVar, zzdhk zzdhkVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgebVar;
        this.zze = zzdhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsq
    public final zzdya<zzcsu> zza(int i, String str) {
        zzdya<zzcqo> zza;
        zzdya<zzcsu> zzdyaVar = this.zza.get(str);
        if (zzdyaVar != null) {
            return zzdyaVar;
        }
        if (i == 1) {
            if (this.zze.zzd() == null || (zza = this.zzd.zzb().zza(i, str)) == null) {
                return null;
            }
            return zzcsu.zzb(zza);
        } else if (i != 4) {
            return null;
        } else {
            zzeap<zzdgu> zzeapVar = this.zzc.get(str);
            if (zzeapVar != null) {
                return zzcsu.zza(zzeapVar);
            }
            zzdya<zzdgu> zzdyaVar2 = this.zzb.get(str);
            if (zzdyaVar2 == null) {
                return null;
            }
            return zzcsu.zzb(zzdyaVar2);
        }
    }
}
