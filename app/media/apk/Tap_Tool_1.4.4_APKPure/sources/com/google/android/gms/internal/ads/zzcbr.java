package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbr {
    public final zzfla<AdvertisingIdClient.Info> zza(Context context, int i) {
        zzcde zzcdeVar = new zzcde();
        zzbay.zza();
        if (zzccg.zzo(context)) {
            zzccz.zza.execute(new zzcbq(this, context, zzcdeVar));
        }
        return zzcdeVar;
    }
}
