package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdmk implements zzgdq<zzavq> {
    private final zzgeb<zzetk> zza;

    public zzdmk(zzgeb<zzetk> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzavq zzavqVar;
        if (((zzcvy) this.zza).zza().zzo.zza == 3) {
            zzavqVar = zzavq.REWARDED_INTERSTITIAL;
        } else {
            zzavqVar = zzavq.REWARD_BASED_VIDEO_AD;
        }
        zzgdw.zzb(zzavqVar);
        return zzavqVar;
    }
}
