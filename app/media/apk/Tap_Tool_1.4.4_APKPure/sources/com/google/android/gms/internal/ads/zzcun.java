package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcun implements zzgdq<zzdcx<zzcwl>> {
    private final zzgeb<zzdoz> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzdvw> zzc;

    public zzcun(zzgeb<zzdoz> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzdvw> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdoz zzb = this.zza.zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        zzdvw zzb2 = this.zzc.zzb();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
            return new zzdcx(zzb2, zzflbVar);
        }
        return new zzdcx(zzb, zzflbVar);
    }
}
