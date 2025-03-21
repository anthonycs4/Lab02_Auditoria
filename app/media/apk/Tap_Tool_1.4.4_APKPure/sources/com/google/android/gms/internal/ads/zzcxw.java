package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcxw implements zzgdq<zzcxv> {
    private final zzgeb<Set<zzdcx<zzcxx>>> zza;

    public zzcxw(zzgeb<Set<zzdcx<zzcxx>>> zzgebVar) {
        this.zza = zzgebVar;
    }

    public static zzcxv zzc(Set<zzdcx<zzcxx>> set) {
        return new zzcxv(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzcxv zzb() {
        return new zzcxv(((zzgdz) this.zza).zzb());
    }
}
