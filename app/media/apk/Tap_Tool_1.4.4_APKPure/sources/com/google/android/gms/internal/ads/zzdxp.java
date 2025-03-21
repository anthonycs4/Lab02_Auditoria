package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxp implements zzgdq<zzdxo> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzflb> zzb;

    public zzdxp(zzgeb<Context> zzgebVar, zzgeb<zzflb> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcke) this.zza).zza();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdxo(zza, zzflbVar);
    }
}
