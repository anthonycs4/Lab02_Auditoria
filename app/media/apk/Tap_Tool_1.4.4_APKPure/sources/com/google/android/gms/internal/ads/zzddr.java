package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzddr extends zzdbe<VideoController.VideoLifecycleCallbacks> {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzddr(Set<zzdcx<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void zza() {
        zzr(zzddm.zza);
    }

    public final void zzb() {
        zzr(zzddn.zza);
    }

    public final synchronized void zzc() {
        zzr(zzddo.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzr(zzddp.zza);
            this.zzb = true;
        }
        zzr(zzddq.zza);
    }
}
