package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdjf implements zzgdq<zzdcx<VideoController.VideoLifecycleCallbacks>> {
    private final zzdiy zza;
    private final zzgeb<zzdlw> zzb;
    private final zzgeb<Executor> zzc;

    public zzdjf(zzdiy zzdiyVar, zzgeb<zzdlw> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzdiyVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcx(((zzdlx) this.zzb).zzb(), this.zzc.zzb());
    }
}
