package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzw implements zzgdq<zzbzv> {
    private final zzgeb<Context> zza;
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zzb;
    private final zzgeb<zzcaw> zzc;

    public zzbzw(zzgeb<Context> zzgebVar, zzgeb<com.google.android.gms.ads.internal.util.zzg> zzgebVar2, zzgeb<zzcaw> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbzv(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
