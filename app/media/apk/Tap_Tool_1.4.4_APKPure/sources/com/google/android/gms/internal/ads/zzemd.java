package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemd implements zzgdq<zzemb> {
    private final zzgeb<zzbxh> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<String> zzc;
    private final zzgeb<zzflb> zzd;

    public zzemd(zzgeb<zzbxh> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<String> zzgebVar3, zzgeb<zzflb> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcke) this.zzb).zza();
        String zza2 = ((zzend) this.zzc).zza();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzemb(null, zza, zza2, zzflbVar);
    }
}
