package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcnw implements zzcnp {
    private final zzdsf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnw(zzdsf zzdsfVar) {
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zza(Map<String, String> map) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgk)).booleanValue()) {
            String str = map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.zzl(str);
        }
    }
}
