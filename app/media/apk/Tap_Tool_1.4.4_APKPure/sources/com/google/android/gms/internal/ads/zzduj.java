package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzduj implements zzgdq<zzdui> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcaw> zzb;

    public zzduj(zzgeb<Context> zzgebVar, zzgeb<zzcaw> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdui zzb() {
        return new zzdui(((zzeuo) this.zza).zza(), this.zzb.zzb());
    }
}
