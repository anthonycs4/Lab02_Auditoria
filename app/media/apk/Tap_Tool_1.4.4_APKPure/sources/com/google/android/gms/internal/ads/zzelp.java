package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzelp implements zzgdq<zzelo> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<Context> zzb;

    public zzelp(zzgeb<zzflb> zzgebVar, zzgeb<Context> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzelo(zzflbVar, ((zzeuo) this.zzb).zza());
    }
}
