package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeye implements zzgdq<zzeyd> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcct> zzb;

    public zzeye(zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzeyd zzb() {
        return new zzeyd(((zzcke) this.zza).zza(), ((zzckn) this.zzb).zza());
    }
}
