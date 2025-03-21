package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcii;
import com.google.android.gms.internal.ads.zzcjg;
import java.io.InputStream;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzx extends zzw {
    @Override // com.google.android.gms.ads.internal.util.zzac
    public final CookieManager zzk(Context context) {
        if (!zzu()) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                zze.zzg("Failed to obtain CookieManager.", th);
                com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final zzcii zzl(zzcib zzcibVar, zzavg zzavgVar, boolean z) {
        return new zzcjg(zzcibVar, zzavgVar, z);
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final int zzm() {
        return 16974374;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final WebResourceResponse zzn(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
