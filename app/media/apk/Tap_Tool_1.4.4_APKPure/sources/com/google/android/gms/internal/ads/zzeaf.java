package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeaf implements zzgdq<zzeae> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcct> zzb;
    private final zzgeb<zzetk> zzc;
    private final zzgeb<Executor> zzd;
    private final zzgeb<zzder> zze;
    private final zzgeb<zzdmy> zzf;
    private final zzgeb<zzbls> zzg;

    public zzeaf(zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<zzetk> zzgebVar3, zzgeb<Executor> zzgebVar4, zzgeb<zzder> zzgebVar5, zzgeb<zzdmy> zzgebVar6, zzgeb<zzbls> zzgebVar7) {
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
        return new zzeae(this.zza.zzb(), ((zzckn) this.zzb).zza(), ((zzcvy) this.zzc).zza(), this.zzd.zzb(), this.zze.zzb(), this.zzf.zzb(), new zzbls());
    }
}
