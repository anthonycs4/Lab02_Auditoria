package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekq implements zzgdq<zzeko> {
    private final zzgeb<zzcaw> zza;
    private final zzgeb<zzflb> zzb;
    private final zzgeb<Context> zzc;

    public zzekq(zzgeb<zzcaw> zzgebVar, zzgeb<zzflb> zzgebVar2, zzgeb<Context> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzeko(this.zza.zzb(), zzflbVar, ((zzeuo) this.zzc).zza());
    }
}
