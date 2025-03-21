package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegf implements zzgdq<zzegd> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzetk> zzc;
    private final zzgeb<ViewGroup> zzd;

    public zzegf(zzgeb<zzflb> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<zzetk> zzgebVar3, zzgeb<ViewGroup> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegd(this.zza.zzb(), ((zzeuo) this.zzb).zza(), ((zzcvy) this.zzc).zza(), ((zzcqm) this.zzd).zza());
    }
}
