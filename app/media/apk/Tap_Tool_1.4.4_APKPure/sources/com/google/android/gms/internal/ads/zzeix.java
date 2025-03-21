package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeix implements zzgdq<zzeiv> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<ViewGroup> zzb;
    private final zzgeb<Context> zzc;
    private final zzgeb<Set<String>> zzd;

    public zzeix(zzgeb<zzflb> zzgebVar, zzgeb<ViewGroup> zzgebVar2, zzgeb<Context> zzgebVar3, zzgeb<Set<String>> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeiv(this.zza.zzb(), ((zzcqm) this.zzb).zza(), this.zzc.zzb(), ((zzgdz) this.zzd).zzb());
    }
}
