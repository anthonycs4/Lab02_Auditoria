package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcxz extends zzdbe<zzfaw> implements zzbkq {
    private final Bundle zzb;

    public zzcxz(Set<zzdcx<zzfaw>> set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzr(zzcxy.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
