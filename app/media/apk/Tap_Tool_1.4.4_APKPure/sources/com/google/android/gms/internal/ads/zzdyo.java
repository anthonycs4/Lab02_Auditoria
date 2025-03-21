package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdyo implements zzgdq<zzdyn> {
    private final zzgeb<zzcqc> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<Executor> zzc;
    private final zzgeb<zzdmy> zzd;
    private final zzgeb<zzetk> zze;
    private final zzgeb<zzcct> zzf;
    private final zzgeb<zzbls> zzg;

    public zzdyo(zzgeb<zzcqc> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<Executor> zzgebVar3, zzgeb<zzdmy> zzgebVar4, zzgeb<zzetk> zzgebVar5, zzgeb<zzcct> zzgebVar6, zzgeb<zzbls> zzgebVar7) {
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
        return new zzdyn(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), ((zzcvy) this.zze).zza(), ((zzckn) this.zzf).zza(), new zzbls());
    }
}
