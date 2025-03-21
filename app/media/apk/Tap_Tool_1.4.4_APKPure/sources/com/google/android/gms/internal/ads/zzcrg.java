package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcrg implements zzgdq<zzcae> {
    private final zzcqv zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzetk> zzc;

    public zzcrg(zzcqv zzcqvVar, zzgeb<Context> zzgebVar, zzgeb<zzetk> zzgebVar2) {
        this.zza = zzcqvVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzcae zzb() {
        return new zzcae(((zzeuo) this.zzb).zza(), ((zzcvy) this.zzc).zza().zzf);
    }
}
