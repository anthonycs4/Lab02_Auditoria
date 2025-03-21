package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbgq implements zzgdq<zzbgp> {
    private final zzgeb<Context> zza;
    private final zzgeb<ScheduledExecutorService> zzb;
    private final zzgeb<zzbgr> zzc;

    public zzbgq(zzgeb<Context> zzgebVar, zzgeb<ScheduledExecutorService> zzgebVar2, zzgeb<zzbgr> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbgp(((zzeuo) this.zza).zza(), this.zzb.zzb(), new zzbgr(), null);
    }
}
