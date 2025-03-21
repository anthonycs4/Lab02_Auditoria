package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbqe {
    static final com.google.android.gms.ads.internal.util.zzbd<zzbol> zza = new zzbqc();
    static final com.google.android.gms.ads.internal.util.zzbd<zzbol> zzb = new zzbqd();
    private final zzbpq zzc;

    public zzbqe(Context context, zzcct zzcctVar, String str) {
        this.zzc = new zzbpq(context, zzcctVar, str, zza, zzb);
    }

    public final <I, O> zzbpu<I, O> zza(String str, zzbpx<I> zzbpxVar, zzbpw<O> zzbpwVar) {
        return new zzbqi(this.zzc, str, zzbpxVar, zzbpwVar);
    }

    public final zzbqn zzb() {
        return new zzbqn(this.zzc);
    }
}
