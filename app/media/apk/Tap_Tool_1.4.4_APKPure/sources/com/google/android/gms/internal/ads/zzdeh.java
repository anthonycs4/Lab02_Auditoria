package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdeh implements zzgdq<zzcae> {
    private final zzddy zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzetk> zzc;

    public zzdeh(zzddy zzddyVar, zzgeb<Context> zzgebVar, zzgeb<zzetk> zzgebVar2) {
        this.zza = zzddyVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzcae zzb() {
        return new zzcae(((zzeuo) this.zzb).zza(), ((zzcvy) this.zzc).zza().zzf);
    }
}
