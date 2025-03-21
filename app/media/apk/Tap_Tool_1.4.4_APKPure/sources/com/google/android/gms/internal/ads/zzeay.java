package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeay implements zzgdq<zzeax> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzdfn> zzb;
    private final zzgeb<Executor> zzc;

    public zzeay(zzgeb<Context> zzgebVar, zzgeb<zzdfn> zzgebVar2, zzgeb<Executor> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeax(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
