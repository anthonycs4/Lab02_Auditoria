package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzblq implements zzblp<Object> {
    private final zzdsf zza;

    public zzblq(zzdsf zzdsfVar) {
        Preconditions.checkNotNull(zzdsfVar, "The Inspector Manager must not be null");
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        boolean containsKey = map.containsKey("expires");
        long j = LongCompanionObject.MAX_VALUE;
        if (containsKey) {
            try {
                j = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi(map.get("extras"), j);
    }
}
