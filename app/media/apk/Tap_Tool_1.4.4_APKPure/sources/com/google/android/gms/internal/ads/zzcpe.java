package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcpe implements zzgdq<Set<zzdcx<zzasi>>> {
    private final zzgeb<zzcox> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<JSONObject> zzc;

    public zzcpe(zzgeb<zzcox> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<JSONObject> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcox zzb = this.zza.zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        if (this.zzc.zzb() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdcx(zzb, zzflbVar));
        }
        zzgdw.zzb(singleton);
        return singleton;
    }
}
