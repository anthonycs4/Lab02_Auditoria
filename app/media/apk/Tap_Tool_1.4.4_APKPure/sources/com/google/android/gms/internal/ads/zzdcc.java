package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdcc implements zzgdq<zzebo> {
    private final zzdbh zza;
    private final zzgeb<Clock> zzb;
    private final zzgeb<zzebp> zzc;
    private final zzgeb<zzdyf> zzd;

    public zzdcc(zzdbh zzdbhVar, zzgeb<Clock> zzgebVar, zzgeb<zzebp> zzgebVar2, zzgeb<zzdyf> zzgebVar3) {
        this.zza = zzdbhVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
        this.zzd = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzebo zzp = this.zza.zzp(this.zzb.zzb(), ((zzebq) this.zzc).zzb(), this.zzd.zzb());
        zzgdw.zzb(zzp);
        return zzp;
    }
}
