package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeqo implements zzgdq<zzeqj<zzdmg, zzdmb>> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzeur> zzb;
    private final zzgeb<zzevj> zzc;

    public zzeqo(zzgeb<Context> zzgebVar, zzgeb<zzeur> zzgebVar2, zzgeb<zzevj> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzeqj<zzdmg, zzdmb> zzb() {
        Context zzb = this.zza.zzb();
        zzeur zzb2 = this.zzb.zzb();
        zzevj zzb3 = this.zzc.zzb();
        if (((Integer) zzbba.zzc().zzb(zzbfq.zzey)).intValue() > 0) {
            zzevi zza = zzb3.zza(zzeuz.Rewarded, zzb, zzb2, new zzepo(new zzepk()));
            return new zzepq(new zzeqa(new zzepz()), new zzepw(zza.zza, zzccz.zza), zza.zzb, zzccz.zza);
        }
        return new zzepz();
    }
}
