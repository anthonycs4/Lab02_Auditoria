package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcje extends zzcjf {
    public zzcje(zzcib zzcibVar, zzavg zzavgVar, boolean z) {
        super(zzcibVar, zzavgVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcii, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, (Map<String, String>) null);
    }
}
