package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdrp implements zzgdq<zzdro> {
    private final zzgeb<Executor> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<WeakReference<Context>> zzc;
    private final zzgeb<Executor> zzd;
    private final zzgeb<zzdnl> zze;
    private final zzgeb<ScheduledExecutorService> zzf;
    private final zzgeb<zzdpw> zzg;
    private final zzgeb<zzcct> zzh;
    private final zzgeb<zzdcj> zzi;

    public zzdrp(zzgeb<Executor> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<WeakReference<Context>> zzgebVar3, zzgeb<Executor> zzgebVar4, zzgeb<zzdnl> zzgebVar5, zzgeb<ScheduledExecutorService> zzgebVar6, zzgeb<zzdpw> zzgebVar7, zzgeb<zzcct> zzgebVar8, zzgeb<zzdcj> zzgebVar9) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
        this.zzg = zzgebVar7;
        this.zzh = zzgebVar8;
        this.zzi = zzgebVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor zzb = this.zza.zzb();
        Context zza = ((zzcke) this.zzb).zza();
        WeakReference<Context> zza2 = ((zzckf) this.zzc).zza();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdro(zzb, zza, zza2, zzflbVar, this.zze.zzb(), this.zzf.zzb(), this.zzg.zzb(), ((zzckn) this.zzh).zza(), ((zzdck) this.zzi).zzb());
    }
}
