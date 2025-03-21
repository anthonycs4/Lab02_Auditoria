package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexq implements zzgdq<zzbqe> {
    private final zzexp zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzcct> zzc;

    public zzexq(zzexp zzexpVar, zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2) {
        this.zza = zzexpVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbqe zzb = new zzbpv().zzb(((zzcke) this.zzb).zza(), ((zzckn) this.zzc).zza());
        zzgdw.zzb(zzb);
        return zzb;
    }
}
