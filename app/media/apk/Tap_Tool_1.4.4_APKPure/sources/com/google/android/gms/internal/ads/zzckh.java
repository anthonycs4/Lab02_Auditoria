package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzckh implements zzgdq<Set<zzdcx<zzdcl>>> {
    private final zzgeb<zzdwa> zza;
    private final zzgeb<Executor> zzb;

    public zzckh(zzgeb<zzdwa> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdwa zzb = this.zza.zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbn)).booleanValue()) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                emptySet = Collections.singleton(new zzdcx(zzb, zzflbVar));
                zzgdw.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzgdw.zzb(emptySet);
        return emptySet;
    }
}
