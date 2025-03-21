package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcnu implements zzcnp {
    private final zzdsf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnu(zzdsf zzdsfVar) {
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zza(Map<String, String> map) {
        char c;
        String str = map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zze(zzdsb.SHAKE);
        } else if (c == 1) {
            this.zza.zze(zzdsb.FLICK);
        } else {
            this.zza.zze(zzdsb.NONE);
        }
    }
}
