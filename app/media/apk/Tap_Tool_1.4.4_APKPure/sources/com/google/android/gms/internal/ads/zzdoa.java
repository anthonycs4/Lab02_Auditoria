package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdoa implements zzgdq<zzdcx<zzcyy>> {
    private final zzgeb<zzdok> zza;
    private final zzgeb<Executor> zzb;

    public zzdoa(zzgeb<zzdok> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdcx(this.zza.zzb(), zzflbVar);
    }
}
