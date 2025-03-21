package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzcjf extends zzcii {
    public zzcjf(zzcib zzcibVar, zzavg zzavgVar, boolean z) {
        super(zzcibVar, zzavgVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzN(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzcib)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcib zzcibVar = (zzcib) webView;
        zzbzu zzbzuVar = this.zza;
        if (zzbzuVar != null) {
            zzbzuVar.zze(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzy(str, map);
        }
        if (zzcibVar.zzR() != null) {
            zzcibVar.zzR().zzA();
        }
        if (zzcibVar.zzP().zzg()) {
            str2 = (String) zzbba.zzc().zzb(zzbfq.zzJ);
        } else if (zzcibVar.zzW()) {
            str2 = (String) zzbba.zzc().zzb(zzbfq.zzI);
        } else {
            str2 = (String) zzbba.zzc().zzb(zzbfq.zzH);
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        return com.google.android.gms.ads.internal.util.zzr.zzB(zzcibVar.getContext(), zzcibVar.zzt().zza, str2);
    }
}
