package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbzu;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbzu zzc;
    private final zzbwt zzd = new zzbwt(false, Collections.emptyList());

    public zzb(Context context, zzbzu zzbzuVar, zzbwt zzbwtVar) {
        this.zza = context;
        this.zzc = zzbzuVar;
    }

    private final boolean zzd() {
        zzbzu zzbzuVar = this.zzc;
        return (zzbzuVar != null && zzbzuVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            zzbzu zzbzuVar = this.zzc;
            if (zzbzuVar != null) {
                zzbzuVar.zze(str, null, 3);
                return;
            }
            zzbwt zzbwtVar = this.zzd;
            if (!zzbwtVar.zza || (list = zzbwtVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzs.zzc();
                    com.google.android.gms.ads.internal.util.zzr.zzM(this.zza, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, replace);
                }
            }
        }
    }
}
