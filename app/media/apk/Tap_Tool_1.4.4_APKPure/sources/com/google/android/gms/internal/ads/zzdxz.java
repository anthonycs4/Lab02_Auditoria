package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxz implements zzbvi {
    private final zzbvi zza;
    private final zzbvi zzb;

    public zzdxz(zzbvi zzbviVar, zzbvi zzbviVar2) {
        this.zza = zzbviVar;
        this.zzb = zzbviVar2;
    }

    private final zzbvi zzb() {
        return ((Boolean) zzbba.zzc().zzb(zzbfq.zzdr)).booleanValue() ? this.zza : this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zza(Context context) {
        return zzb().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final String zzc(Context context) {
        return zzb().zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4) {
        return zzb().zzd(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5) {
        return zzb().zze(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzf(String str, WebView webView, String str2, String str3, String str4, zzbvk zzbvkVar, zzbvj zzbvjVar, String str5) {
        return zzb().zzf(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, zzbvkVar, zzbvjVar, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzg(String str, WebView webView, String str2, String str3, String str4, String str5, zzbvk zzbvkVar, zzbvj zzbvjVar, String str6) {
        return zzb().zzg(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, str5, zzbvkVar, zzbvjVar, str6);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzb().zzh(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi(IObjectWrapper iObjectWrapper) {
        zzb().zzi(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj(IObjectWrapper iObjectWrapper, View view) {
        zzb().zzj(iObjectWrapper, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk(IObjectWrapper iObjectWrapper, View view) {
        zzb().zzk(iObjectWrapper, view);
    }
}
