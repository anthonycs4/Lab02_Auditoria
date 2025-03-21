package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbmt extends zzbmg {
    public static final /* synthetic */ int zza = 0;
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbmt(Context context, final WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        zzfes.zza(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener(webView) { // from class: com.google.android.gms.internal.ads.zzbms
            private final WebView zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = webView;
            }

            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = this.zza;
                int i = zzbmt.zza;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        zzccn.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmg, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmg, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzc(this.zzd)) {
            if (this.zzc.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzfes.zza(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.zzbmg, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (zzc(webView)) {
            if (this.zzc.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }
}
