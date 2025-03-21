package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeaj implements zzgdq<zzeai> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcct> zzb;
    private final zzgeb<zzder> zzc;
    private final zzgeb<Executor> zzd;

    public zzeaj(zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<zzder> zzgebVar3, zzgeb<Executor> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzeai(this.zza.zzb(), ((zzckn) this.zzb).zza(), this.zzc.zzb(), zzflbVar);
    }
}
