package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyx {
    private final zzeze zza;
    private final WebView zzb;
    private final List<zzezf> zzc = new ArrayList();
    private final Map<String, zzezf> zzd = new HashMap();
    private final String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private final String zzf;
    private final zzeyy zzg;

    private zzeyx(zzeze zzezeVar, WebView webView, String str, List<zzezf> list, String str2, String str3, zzeyy zzeyyVar) {
        this.zza = zzezeVar;
        this.zzb = webView;
        this.zzg = zzeyyVar;
        this.zzf = str2;
    }

    @Deprecated
    public static zzeyx zza(zzeze zzezeVar, WebView webView, String str) {
        return new zzeyx(zzezeVar, webView, null, null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzeyy.HTML);
    }

    public static zzeyx zzb(zzeze zzezeVar, WebView webView, String str, String str2) {
        return new zzeyx(zzezeVar, webView, null, null, str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzeyy.HTML);
    }

    public static zzeyx zzc(zzeze zzezeVar, WebView webView, String str, String str2) {
        return new zzeyx(zzezeVar, webView, null, null, str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzeyy.JAVASCRIPT);
    }

    public final zzeze zzd() {
        return this.zza;
    }

    public final List<zzezf> zze() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map<String, zzezf> zzf() {
        return Collections.unmodifiableMap(this.zzd);
    }

    public final WebView zzg() {
        return this.zzb;
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zze;
    }

    public final zzeyy zzj() {
        return this.zzg;
    }
}
