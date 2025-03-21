package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcwx extends zzdbe<zzcwz> {
    private boolean zzb;

    public zzcwx(Set<zzdcx<zzcwz>> set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzr(zzcww.zza);
        this.zzb = true;
    }
}
