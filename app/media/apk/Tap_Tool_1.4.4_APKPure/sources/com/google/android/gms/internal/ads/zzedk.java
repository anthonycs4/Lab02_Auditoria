package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedk implements zzgdq<zzedi> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcrl> zzb;
    private final zzgeb<zzexl> zzc;
    private final zzgeb<zzflb> zzd;
    private final zzgeb<zzbgl> zze;

    public zzedk(zzgeb<Context> zzgebVar, zzgeb<zzcrl> zzgebVar2, zzgeb<zzexl> zzgebVar3, zzgeb<zzflb> zzgebVar4, zzgeb<zzbgl> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzedi(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), ((zzedq) this.zze).zza());
    }
}
