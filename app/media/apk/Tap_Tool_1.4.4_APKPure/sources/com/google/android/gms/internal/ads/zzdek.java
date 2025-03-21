package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdek implements zzgdq<zzdcx<zzdak>> {
    private final zzddy zza;
    private final zzgeb<Executor> zzb;

    public zzdek(zzddy zzddyVar, zzgeb<Executor> zzgebVar) {
        this.zza = zzddyVar;
        this.zzb = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg(this.zzb.zzb());
    }
}
