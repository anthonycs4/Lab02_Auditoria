package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehi implements zzeld<zzelc<Bundle>> {
    private final Executor zza;
    private final zzcby zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehi(Executor executor, zzcby zzcbyVar) {
        this.zza = executor;
        this.zzb = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelc<Bundle>> zza() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbH)).booleanValue()) {
            return zzfks.zza(null);
        }
        return zzfks.zzj(this.zzb.zzn(), zzehg.zza, this.zza);
    }
}
