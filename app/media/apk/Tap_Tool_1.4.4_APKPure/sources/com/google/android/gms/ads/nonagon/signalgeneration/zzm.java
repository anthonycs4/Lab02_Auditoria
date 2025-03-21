package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfei;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzm implements zzfei {
    static final zzfei zza = new zzm();

    private zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Object apply(Object obj) {
        int i = zzt.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
