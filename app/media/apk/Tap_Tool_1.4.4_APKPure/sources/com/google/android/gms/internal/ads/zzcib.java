package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface zzcib extends zzazi, zzchs, zzbog, zzciy, zzcjd, zzbou, zzasi, zzcjh, com.google.android.gms.ads.internal.zzl, zzcjk, zzcjl, zzceu, zzcjm {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcjd, com.google.android.gms.internal.ads.zzceu
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzceu
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzchs
    zzess zzF();

    WebView zzG();

    @Override // com.google.android.gms.internal.ads.zzcjm
    View zzH();

    void zzI();

    void zzJ(int i);

    void zzK();

    void zzL();

    Context zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    @Override // com.google.android.gms.internal.ads.zzcjj
    zzcjr zzP();

    String zzQ();

    zzcjp zzR();

    WebViewClient zzS();

    boolean zzT();

    @Override // com.google.android.gms.internal.ads.zzcjk
    zzfb zzU();

    IObjectWrapper zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA();

    @Override // com.google.android.gms.internal.ads.zzciy
    zzesv zzaB();

    void zzaC(zzess zzessVar, zzesv zzesvVar);

    void zzaD(boolean z);

    zzfla<String> zzaE();

    boolean zzaa();

    void zzab(String str, zzblp<? super zzcib> zzblpVar);

    void zzac(String str, zzblp<? super zzcib> zzblpVar);

    void zzad(String str, Predicate<zzblp<? super zzcib>> predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzaf(zzcjr zzcjrVar);

    void zzag(boolean z);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z);

    void zzak(IObjectWrapper iObjectWrapper);

    void zzal(int i);

    void zzam(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzan(boolean z);

    void zzao();

    void zzap(zzbhw zzbhwVar);

    zzbhw zzaq();

    void zzar(boolean z);

    void zzas();

    void zzat(String str, String str2, String str3);

    void zzau();

    void zzav(boolean z);

    void zzaw(zzbht zzbhtVar);

    void zzax(zzatv zzatvVar);

    zzatv zzay();

    boolean zzaz(boolean z, int i);

    @Override // com.google.android.gms.internal.ads.zzceu
    zzcix zzh();

    @Override // com.google.android.gms.internal.ads.zzcjd, com.google.android.gms.internal.ads.zzceu
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzceu
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzceu
    zzbgd zzq();

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzceu
    zzcct zzt();

    @Override // com.google.android.gms.internal.ads.zzceu
    void zzu(String str, zzcgs zzcgsVar);

    @Override // com.google.android.gms.internal.ads.zzceu
    void zzx(zzcix zzcixVar);
}
