package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public interface zzbvi {
    boolean zza(Context context);

    String zzc(Context context);

    IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4);

    IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5);

    IObjectWrapper zzf(String str, WebView webView, String str2, String str3, String str4, zzbvk zzbvkVar, zzbvj zzbvjVar, String str5);

    IObjectWrapper zzg(String str, WebView webView, String str2, String str3, String str4, String str5, zzbvk zzbvkVar, zzbvj zzbvjVar, String str6);

    void zzh(IObjectWrapper iObjectWrapper);

    void zzi(IObjectWrapper iObjectWrapper);

    void zzj(IObjectWrapper iObjectWrapper, View view);

    void zzk(IObjectWrapper iObjectWrapper, View view);
}
