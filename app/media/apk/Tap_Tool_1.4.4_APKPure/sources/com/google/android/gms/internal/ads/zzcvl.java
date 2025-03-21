package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvl implements zzgdq<zzcvk> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzess> zzb;
    private final zzgeb<zzbvr> zzc;

    public zzcvl(zzgeb<Context> zzgebVar, zzgeb<zzess> zzgebVar2, zzgeb<zzbvr> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvk(this.zza.zzb(), ((zzctd) this.zzb).zza(), new zzbvr(), null);
    }
}
