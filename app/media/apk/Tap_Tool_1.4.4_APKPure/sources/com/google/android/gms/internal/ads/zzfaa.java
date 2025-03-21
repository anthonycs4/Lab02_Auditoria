package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfaa extends zzezx {
    private WebView zza;
    private Long zzb = null;
    private final Map<String, zzezf> zzc;

    public zzfaa(Map<String, zzezf> map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final void zza() {
        WebView webView = new WebView(zzezo.zza().zzb());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzc(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("null".length() != 0 ? "javascript: ".concat("null") : new String("javascript: "));
        }
        Iterator<String> it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            this.zzc.get(it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final void zzb() {
        super.zzb();
        new Handler().postDelayed(new zzezz(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final void zzh(zzeyz zzeyzVar, zzeyx zzeyxVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, zzezf> zzf = zzeyxVar.zzf();
        for (String str : zzf.keySet()) {
            zzfab.zzc(jSONObject, str, zzf.get(str));
        }
        zzi(zzeyzVar, zzeyxVar, jSONObject);
    }
}
