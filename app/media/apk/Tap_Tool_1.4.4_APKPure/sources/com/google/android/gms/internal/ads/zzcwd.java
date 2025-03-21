package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcwd implements zzgdq<zzbzu> {
    private final zzcwc zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzcct> zzc;
    private final zzgeb<zzess> zzd;
    private final zzgeb<zzbzq> zze;

    public zzcwd(zzcwc zzcwcVar, zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<zzess> zzgebVar3, zzgeb<zzbzq> zzgebVar4) {
        this.zza = zzcwcVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
        this.zzd = zzgebVar3;
        this.zze = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzb = this.zzb.zzb();
        zzcct zza = ((zzckn) this.zzc).zza();
        zzess zza2 = ((zzctd) this.zzd).zza();
        zzbzq zzbzqVar = new zzbzq();
        zzbzr zzbzrVar = zza2.zzz;
        if (zzbzrVar != null) {
            return new zzbzo(zzb, zza, zzbzrVar, zza2.zzr.zzb, zzbzqVar, null);
        }
        return null;
    }
}
