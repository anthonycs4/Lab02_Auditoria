package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvu implements zzgdq<Context> {
    private final zzcvt zza;
    private final zzgeb<Context> zzb;

    public zzcvu(zzcvt zzcvtVar, zzgeb<Context> zzgebVar) {
        this.zza = zzcvtVar;
        this.zzb = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zze = this.zza.zze(((zzeuo) this.zzb).zza());
        zzgdw.zzb(zze);
        return zze;
    }
}
