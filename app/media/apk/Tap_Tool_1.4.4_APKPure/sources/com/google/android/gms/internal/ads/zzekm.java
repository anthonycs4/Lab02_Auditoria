package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekm implements zzgdq<zzekk> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<ScheduledExecutorService> zzb;
    private final zzgeb<String> zzc;
    private final zzgeb<zzeed> zzd;
    private final zzgeb<Context> zze;
    private final zzgeb<zzetk> zzf;
    private final zzgeb<zzedy> zzg;

    public zzekm(zzgeb<zzflb> zzgebVar, zzgeb<ScheduledExecutorService> zzgebVar2, zzgeb<String> zzgebVar3, zzgeb<zzeed> zzgebVar4, zzgeb<Context> zzgebVar5, zzgeb<zzetk> zzgebVar6, zzgeb<zzedy> zzgebVar7) {
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
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzekk(zzflbVar, this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), this.zze.zzb(), ((zzcvy) this.zzf).zza(), this.zzg.zzb());
    }
}
