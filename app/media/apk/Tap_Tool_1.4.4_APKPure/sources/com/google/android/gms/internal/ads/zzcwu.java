package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcwu implements zzgdq<zzcws> {
    private final zzgeb<zzcwr> zza;
    private final zzgeb<Set<zzdcx<zzcwl>>> zzb;
    private final zzgeb<Executor> zzc;

    public zzcwu(zzgeb<zzcwr> zzgebVar, zzgeb<Set<zzdcx<zzcwl>>> zzgebVar2, zzgeb<Executor> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcwr zzb = ((zzcwt) this.zza).zzb();
        Set zzb2 = ((zzgdz) this.zzb).zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzcws(zzb, zzb2, zzflbVar);
    }
}
