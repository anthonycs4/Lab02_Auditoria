package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzcjm;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcjc<WebViewT extends zzcjd & zzcjk & zzcjm> {
    private final zzcjb zza;
    private final WebViewT zzb;

    public zzcjc(WebViewT webviewt, zzcjb zzcjbVar) {
        this.zza = zzcjbVar;
        this.zzb = webviewt;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzfb zzU = this.zzb.zzU();
        if (zzU == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzex zzb = zzU.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else if (this.zzb.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            Context context = this.zzb.getContext();
            WebViewT webviewt = this.zzb;
            return zzb.zzf(context, str, (View) webviewt, webviewt.zzj());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzi("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzcja
                private final zzcjc zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(this.zzb);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
