package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdds implements zzgdq<zzddr> {
    private final zzgeb<Set<zzdcx<VideoController.VideoLifecycleCallbacks>>> zza;

    public zzdds(zzgeb<Set<zzdcx<VideoController.VideoLifecycleCallbacks>>> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr(((zzgdz) this.zza).zzb());
    }
}
