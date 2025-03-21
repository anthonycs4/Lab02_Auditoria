package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeku implements zzgdq<zzeks> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzcct> zzc;

    public zzeku(zzgeb<zzflb> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<zzcct> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzeks(zzflbVar, ((zzeuo) this.zzb).zza(), ((zzckn) this.zzc).zza());
    }
}
