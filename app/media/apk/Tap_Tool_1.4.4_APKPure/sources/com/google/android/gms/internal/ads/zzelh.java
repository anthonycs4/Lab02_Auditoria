package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzelh<T> implements zzgdq<zzelg<T>> {
    private final zzgeb<Executor> zza;
    private final zzgeb<Set<zzeld<? extends zzelc<T>>>> zzb;

    public zzelh(zzgeb<Executor> zzgebVar, zzgeb<Set<zzeld<? extends zzelc<T>>>> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzelg<T> zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzelg<>(zzflbVar, ((zzgdz) this.zzb).zzb());
    }
}
