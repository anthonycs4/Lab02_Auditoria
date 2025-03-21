package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdof implements zzgdq<Set<zzdcx<zzexm>>> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzdox> zzb;

    public zzdof(zzgeb<Executor> zzgebVar, zzgeb<zzdox> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        zzdox zzb = ((zzdoy) this.zzb).zzb();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzde)).booleanValue()) {
            emptySet = Collections.singleton(new zzdcx(zzb, zzflbVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgdw.zzb(emptySet);
        return emptySet;
    }
}
