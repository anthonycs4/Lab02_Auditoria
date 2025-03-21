package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaggingLibraryJsInterface(WebView webView) {
        this.zzb = webView;
        this.zza = webView.getContext();
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzs.zzc();
        String uuid = UUID.randomUUID().toString();
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().build(), new zzag(this, uuid));
        return uuid;
    }
}
