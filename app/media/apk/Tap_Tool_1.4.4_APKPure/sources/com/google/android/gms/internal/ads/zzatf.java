package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatf implements Runnable {
    final ValueCallback<String> zza = new zzate(this);
    final /* synthetic */ zzasx zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzath zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatf(zzath zzathVar, zzasx zzasxVar, WebView webView, boolean z) {
        this.zze = zzathVar;
        this.zzb = zzasxVar;
        this.zzc = webView;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                ((zzate) this.zza).onReceiveValue(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
    }
}
