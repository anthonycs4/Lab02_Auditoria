package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcuj implements zzgdq<com.google.android.gms.ads.internal.zzb> {
    private final zzcui zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzbzu> zzc;

    public zzcuj(zzcui zzcuiVar, zzgeb<Context> zzgebVar, zzgeb<zzbzu> zzgebVar2) {
        this.zza = zzcuiVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb(this.zzb.zzb(), this.zzc.zzb(), null);
    }
}
