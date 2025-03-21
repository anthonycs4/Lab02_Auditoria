package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebc implements zzgdq<zzebb> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzdfn> zzb;
    private final zzgeb<zzcct> zzc;

    public zzebc(zzgeb<Context> zzgebVar, zzgeb<zzdfn> zzgebVar2, zzgeb<zzcct> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebb(this.zza.zzb(), this.zzb.zzb(), ((zzckn) this.zzc).zza());
    }
}
