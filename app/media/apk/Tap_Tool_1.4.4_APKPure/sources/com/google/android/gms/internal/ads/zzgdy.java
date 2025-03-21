package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgdy<T> {
    private final List<zzgeb<T>> zza;
    private final List<zzgeb<Collection<T>>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdy(int i, int i2, zzgdx zzgdxVar) {
        this.zza = zzgdn.zza(i);
        this.zzb = zzgdn.zza(i2);
    }

    public final zzgdy<T> zza(zzgeb<? extends T> zzgebVar) {
        this.zza.add(zzgebVar);
        return this;
    }

    public final zzgdy<T> zzb(zzgeb<? extends Collection<? extends T>> zzgebVar) {
        this.zzb.add(zzgebVar);
        return this;
    }

    public final zzgdz<T> zzc() {
        return new zzgdz<>(this.zza, this.zzb, null);
    }
}
