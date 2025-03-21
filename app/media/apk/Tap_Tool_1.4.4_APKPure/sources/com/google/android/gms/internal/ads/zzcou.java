package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcou implements zzgdq<zzcot> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzase> zzb;

    public zzcou(zzgeb<Context> zzgebVar, zzgeb<zzase> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcot(((zzeuo) this.zza).zza(), this.zzb.zzb());
    }
}
