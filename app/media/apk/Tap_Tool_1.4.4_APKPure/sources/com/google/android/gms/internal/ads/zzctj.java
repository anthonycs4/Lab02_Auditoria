package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzctj implements zzgdq<zzdcx<zzcwz>> {
    private final zzgeb<zzcyn> zza;
    private final zzgeb<Executor> zzb;

    public zzctj(zzgeb<zzcyn> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdcx(this.zza.zzb(), zzflbVar);
    }
}
