package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbd implements zzgdq<zzcbc> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzbzz> zzb;

    public zzcbd(zzgeb<Context> zzgebVar, zzgeb<zzbzz> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcbc(this.zza.zzb(), ((zzcaa) this.zzb).zzb());
    }
}
