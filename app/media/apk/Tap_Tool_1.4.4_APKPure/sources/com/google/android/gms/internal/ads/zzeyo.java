package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyo implements zzgdq<zzeyn> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzccs> zzb;

    public zzeyo(zzgeb<Executor> zzgebVar, zzgeb<zzccs> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzeyn(zzflbVar, this.zzb.zzb());
    }
}
