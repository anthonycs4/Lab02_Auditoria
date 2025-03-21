package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqc implements zzgdq<Set<zzdcx<zzcwk>>> {
    private final zzdqa zza;
    private final zzgeb<zzdqj> zzb;
    private final zzgeb<Executor> zzc;

    public zzdqc(zzdqa zzdqaVar, zzgeb<zzdqj> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzdqaVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        Set<zzdcx<zzcwk>> zzb = zzdqa.zzb(this.zzb.zzb(), zzflbVar);
        zzgdw.zzb(zzb);
        return zzb;
    }
}
