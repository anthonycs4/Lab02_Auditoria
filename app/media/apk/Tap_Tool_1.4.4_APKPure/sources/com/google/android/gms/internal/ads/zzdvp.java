package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdvp implements zzgdq<zzdvo> {
    private final zzgeb<Context> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzbxr> zzc;
    private final zzgeb<zzcnm> zzd;
    private final zzgeb<zzbxq> zze;
    private final zzgeb<HashMap<String, zzdvl>> zzf;
    private final zzgeb<zzdvt> zzg;

    public zzdvp(zzgeb<Context> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzbxr> zzgebVar3, zzgeb<zzcnm> zzgebVar4, zzgeb<zzbxq> zzgebVar5, zzgeb<HashMap<String, zzdvl>> zzgebVar6, zzgeb<zzdvt> zzgebVar7) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
        this.zzg = zzgebVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvo(((zzcke) this.zza).zza(), this.zzb.zzb(), new zzbxr(), ((zzckk) this.zzd).zzb(), ((zzckv) this.zze).zzb(), this.zzf.zzb(), new zzdvt(), null);
    }
}
