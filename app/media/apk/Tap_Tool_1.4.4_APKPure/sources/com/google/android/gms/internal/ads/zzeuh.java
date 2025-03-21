package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeuh implements zzgdq<Clock> {
    private final zzeug zza;

    public zzeuh(zzeug zzeugVar) {
        this.zza = zzeugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgdw.zzb(defaultClock);
        return defaultClock;
    }
}
