package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemz implements zzeld<zzena> {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbvq zzc;

    public zzemz(zzbvq zzbvqVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbvqVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzena> zza() {
        return zzfks.zzj(zzfks.zzh(zzfks.zza(new Bundle()), ((Long) zzbba.zzc().zzb(zzbfq.zzcp)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzemy.zza, zzccz.zza);
    }
}
