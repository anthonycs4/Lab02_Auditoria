package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdtq implements zzfjz {
    static final zzfjz zza = new zzdtq();

    private zzdtq() {
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfla zza(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzfks.zzc(new zzdsp(5));
    }
}
