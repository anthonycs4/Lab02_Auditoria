package com.google.android.gms.ads;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.zzbdy;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzbdy.zza().zzk(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzbdy.zza().zzj();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzbdy.zza().zzm();
    }

    public static String getVersionString() {
        return zzbdy.zza().zzh();
    }

    public static void initialize(Context context) {
        zzbdy.zza().zzb(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzbdy.zza().zzl(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzbdy.zza().zzg(context, str);
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzbdy.zza().zzi(cls);
    }

    public static void registerWebView(WebView webView) {
        zzbdy.zza().zzo(webView);
    }

    public static void setAppMuted(boolean z) {
        zzbdy.zza().zze(z);
    }

    public static void setAppVolume(float f) {
        zzbdy.zza().zzc(f);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzbdy.zza().zzn(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzbdy.zza().zzb(context, null, onInitializationCompleteListener);
    }
}
