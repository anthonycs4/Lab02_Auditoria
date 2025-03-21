package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegt implements zzgdq<zzegs> {
    private final zzgeb<Set<String>> zza;

    public zzegt(zzgeb<Set<String>> zzgebVar) {
        this.zza = zzgebVar;
    }

    public static zzegs zza(Set<String> set) {
        return new zzegs(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegs(this.zza.zzb());
    }
}
