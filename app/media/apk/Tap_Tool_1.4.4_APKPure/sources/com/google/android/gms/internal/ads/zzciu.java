package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzciu extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcib {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbhw zzC;
    private zzbht zzD;
    private zzatv zzE;
    private int zzF;
    private int zzG;
    private zzbgc zzH;
    private final zzbgc zzI;
    private zzbgc zzJ;
    private final zzbgd zzK;
    private WeakReference<View.OnClickListener> zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private com.google.android.gms.ads.internal.overlay.zzl zzP;
    private boolean zzQ;
    private final com.google.android.gms.ads.internal.util.zzcj zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map<String, zzcgs> zzW;
    private final WindowManager zzX;
    private final zzavg zzY;
    private final zzcjq zzb;
    private final zzfb zzc;
    private final zzbgp zzd;
    private final zzcct zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzess zzj;
    private zzesv zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcii zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private IObjectWrapper zzp;
    private zzcjr zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcix zzz;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzciu(zzcjq zzcjqVar, zzcjr zzcjrVar, String str, boolean z, boolean z2, zzfb zzfbVar, zzbgp zzbgpVar, zzcct zzcctVar, zzbgf zzbgfVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzavg zzavgVar, zzess zzessVar, zzesv zzesvVar) {
        super(zzcjqVar);
        zzesv zzesvVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcjqVar;
        this.zzq = zzcjrVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzfbVar;
        this.zzd = zzbgpVar;
        this.zze = zzcctVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzs.zzc();
        DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzr.zzy(windowManager);
        this.zzh = zzy;
        this.zzi = zzy.density;
        this.zzY = zzavgVar;
        this.zzj = zzessVar;
        this.zzk = zzesvVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzs.zzc().zze(zzcjqVar, zzcctVar.zza));
        com.google.android.gms.ads.internal.zzs.zze().zza(getContext(), settings);
        setDownloadListener(this);
        zzaX();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(new zzcjc(this, new zzcjb(this) { // from class: com.google.android.gms.internal.ads.zzciz
                private final zzcib zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzcjb
                public final void zza(Uri uri) {
                    zzcii zzaQ = ((zzciu) this.zza).zzaQ();
                    if (zzaQ == null) {
                        com.google.android.gms.ads.internal.util.zze.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        zzaQ.zzD(uri);
                    }
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzR = new com.google.android.gms.ads.internal.util.zzcj(this.zzb.zza(), this, this, null);
        zzbc();
        zzbgd zzbgdVar = new zzbgd(new zzbgf(true, "make_wv", this.zzr));
        this.zzK = zzbgdVar;
        zzbgdVar.zzc().zza(null);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() && (zzesvVar2 = this.zzk) != null && zzesvVar2.zzb != null) {
            zzbgdVar.zzc().zzd("gqi", this.zzk.zzb);
        }
        zzbgdVar.zzc();
        zzbgc zzf = zzbgf.zzf();
        this.zzI = zzf;
        zzbgdVar.zza("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.zzs.zze().zzc(zzcjqVar);
        com.google.android.gms.ads.internal.zzs.zzg().zzi();
    }

    private final synchronized void zzaU(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.zze.zzj("Could not call loadUrl. ", e);
        }
    }

    private final synchronized void zzaV() {
        Boolean zzc = com.google.android.gms.ads.internal.zzs.zzg().zzc();
        this.zzw = zzc;
        if (zzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaO(true);
            } catch (IllegalStateException unused) {
                zzaO(false);
            }
        }
    }

    private final void zzaW() {
        zzbfx.zza(this.zzK.zzc(), this.zzI, "aeh2");
    }

    private final synchronized void zzaY() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final synchronized void zzaZ() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzba() {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        com.google.android.gms.ads.internal.zzs.zzg().zzj();
    }

    private final synchronized void zzbb() {
        Map<String, zzcgs> map = this.zzW;
        if (map != null) {
            for (zzcgs zzcgsVar : map.values()) {
                zzcgsVar.release();
            }
        }
        this.zzW = null;
    }

    private final void zzbc() {
        zzbgd zzbgdVar = this.zzK;
        if (zzbgdVar == null) {
            return;
        }
        zzbgf zzc = zzbgdVar.zzc();
        if (com.google.android.gms.ads.internal.zzs.zzg().zza() != null) {
            com.google.android.gms.ads.internal.zzs.zzg().zza().zzb(zzc);
        }
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final synchronized void destroy() {
        zzbc();
        this.zzR.zzc();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzq();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzv();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzy();
        zzcgl.zzd(this);
        zzbb();
        this.zzt = true;
        com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
        com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
        zzaU("about:blank");
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (zzX()) {
            zzccn.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzv();
                    com.google.android.gms.ads.internal.zzs.zzy();
                    zzcgl.zzd(this);
                    zzbb();
                    zzba();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzX()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final synchronized void loadUrl(String str) {
        if (!zzX()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AdWebViewImpl.loadUrl");
                com.google.android.gms.ads.internal.util.zze.zzj("Could not call loadUrl. ", e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        zzcii zzciiVar = this.zzn;
        if (zzciiVar != null) {
            zzciiVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzX()) {
            this.zzR.zzd();
        }
        boolean z = this.zzA;
        zzcii zzciiVar = this.zzn;
        if (zzciiVar != null && zzciiVar.zzd()) {
            if (!this.zzB) {
                this.zzn.zzf();
                this.zzn.zzg();
                this.zzB = true;
            }
            zzaK();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcii zzciiVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzR.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzciiVar = this.zzn) != null && zzciiVar.zzd() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zzf();
                this.zzn.zzg();
                this.zzB = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzs.zzc();
            com.google.android.gms.ads.internal.util.zzr.zzO(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaK = zzaK();
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN == null || !zzaK) {
            return;
        }
        zzN.zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c9 A[Catch: all -> 0x01ef, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b6, B:57:0x00d2, B:59:0x00db, B:58:0x00d7, B:62:0x00e0, B:65:0x00e5, B:67:0x00ed, B:70:0x00fa, B:79:0x0120, B:81:0x0127, B:86:0x012f, B:88:0x0141, B:90:0x014f, B:99:0x0164, B:101:0x01b1, B:102:0x01b5, B:104:0x01bc, B:109:0x01c9, B:111:0x01cf, B:112:0x01d2, B:114:0x01d6, B:115:0x01df, B:118:0x01ea), top: B:124:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141 A[Catch: all -> 0x01ef, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b6, B:57:0x00d2, B:59:0x00db, B:58:0x00d7, B:62:0x00e0, B:65:0x00e5, B:67:0x00ed, B:70:0x00fa, B:79:0x0120, B:81:0x0127, B:86:0x012f, B:88:0x0141, B:90:0x014f, B:99:0x0164, B:101:0x01b1, B:102:0x01b5, B:104:0x01bc, B:109:0x01c9, B:111:0x01cf, B:112:0x01d2, B:114:0x01d6, B:115:0x01df, B:118:0x01ea), top: B:124:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164 A[Catch: all -> 0x01ef, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b6, B:57:0x00d2, B:59:0x00db, B:58:0x00d7, B:62:0x00e0, B:65:0x00e5, B:67:0x00ed, B:70:0x00fa, B:79:0x0120, B:81:0x0127, B:86:0x012f, B:88:0x0141, B:90:0x014f, B:99:0x0164, B:101:0x01b1, B:102:0x01b5, B:104:0x01bc, B:109:0x01c9, B:111:0x01cf, B:112:0x01d2, B:114:0x01d6, B:115:0x01df, B:118:0x01ea), top: B:124:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciu.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzd() || this.zzn.zze()) {
            zzfb zzfbVar = this.zzc;
            if (zzfbVar != null) {
                zzfbVar.zzd(motionEvent);
            }
            zzbgp zzbgpVar = this.zzd;
            if (zzbgpVar != null) {
                zzbgpVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbhw zzbhwVar = this.zzC;
                if (zzbhwVar != null) {
                    zzbhwVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcib
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzL = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcib
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcii) {
            this.zzn = (zzcii) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final synchronized void zzA() {
        zzbht zzbhtVar = this.zzD;
        if (zzbhtVar != null) {
            zzbhtVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzB(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzC(int i) {
        this.zzO = i;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzD() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzE() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzchs
    public final zzess zzF() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjm
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzI() {
        zzaW();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzJ(int i) {
        if (i == 0) {
            zzbfx.zza(this.zzK.zzc(), this.zzI, "aebb2");
        }
        zzaW();
        this.zzK.zzc();
        this.zzK.zzc().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zze.zza);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzK() {
        if (this.zzH == null) {
            zzbfx.zza(this.zzK.zzc(), this.zzI, "aes2");
            this.zzK.zzc();
            zzbgc zzf = zzbgf.zzf();
            this.zzH = zzf;
            this.zzK.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzL() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final Context zzM() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zzP;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjj
    public final synchronized zzcjr zzP() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized String zzQ() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final /* bridge */ /* synthetic */ zzcjp zzR() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final WebViewClient zzS() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized boolean zzT() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjk
    public final zzfb zzU() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized IObjectWrapper zzV() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized boolean zzW() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized boolean zzX() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzba();
        com.google.android.gms.ads.internal.util.zzr.zza.post(new zzcit(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized boolean zzZ() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzaA() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzciy
    public final zzesv zzaB() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzaC(zzess zzessVar, zzesv zzesvVar) {
        this.zzj = zzessVar;
        this.zzk = zzesvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzaD(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzu(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final zzfla<String> zzaE() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzn.zzm(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaG(boolean z, int i) {
        this.zzn.zzo(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaH(boolean z, int i, String str) {
        this.zzn.zzp(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaI(boolean z, int i, String str, String str2) {
        this.zzn.zzq(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzaJ(com.google.android.gms.ads.internal.util.zzbs zzbsVar, zzdxo zzdxoVar, zzdpn zzdpnVar, zzexv zzexvVar, String str, String str2, int i) {
        this.zzn.zzn(zzbsVar, zzdxoVar, zzdpnVar, zzexvVar, str, str2, i);
    }

    public final boolean zzaK() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzn.zzc() || this.zzn.zzd()) {
            zzbay.zza();
            DisplayMetrics displayMetrics = this.zzh;
            int zzq = zzccg.zzq(displayMetrics, displayMetrics.widthPixels);
            zzbay.zza();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzq2 = zzccg.zzq(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i = zzq;
                i2 = zzq2;
            } else {
                com.google.android.gms.ads.internal.zzs.zzc();
                int[] zzS = com.google.android.gms.ads.internal.util.zzr.zzS(zza2);
                zzbay.zza();
                int zzq3 = zzccg.zzq(this.zzh, zzS[0]);
                zzbay.zza();
                i2 = zzccg.zzq(this.zzh, zzS[1]);
                i = zzq3;
            }
            int i3 = this.zzT;
            if (i3 == zzq && this.zzS == zzq2 && this.zzU == i && this.zzV == i2) {
                return false;
            }
            z = (i3 == zzq && this.zzS == zzq2) ? true : true;
            this.zzT = zzq;
            this.zzS = zzq2;
            this.zzU = i;
            this.zzV = i2;
            new zzbun(this, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).zzk(zzq, zzq2, i, i2, this.zzh.density, this.zzX.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    protected final synchronized void zzaL(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaM(String str, ValueCallback<String> valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaN(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaP() == null) {
                zzaV();
            }
            if (zzaP().booleanValue()) {
                zzaM(str, null);
                return;
            }
            String valueOf = String.valueOf(str);
            zzaL(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        zzaL(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    final void zzaO(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzs.zzg().zzb(bool);
    }

    final synchronized Boolean zzaP() {
        return this.zzw;
    }

    public final zzcii zzaQ() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized boolean zzaa() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzab(String str, zzblp<? super zzcib> zzblpVar) {
        zzcii zzciiVar = this.zzn;
        if (zzciiVar != null) {
            zzciiVar.zzs(str, zzblpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzac(String str, zzblp<? super zzcib> zzblpVar) {
        zzcii zzciiVar = this.zzn;
        if (zzciiVar != null) {
            zzciiVar.zzt(str, zzblpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzad(String str, Predicate<zzblp<? super zzcib>> predicate) {
        zzcii zzciiVar = this.zzn;
        if (zzciiVar != null) {
            zzciiVar.zzu(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzaf(zzcjr zzcjrVar) {
        this.zzq = zzcjrVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzag(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaX();
        if (z != z2) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzL)).booleanValue() || !this.zzq.zzg()) {
                new zzbun(this, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).zzj(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzah() {
        this.zzR.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzai(Context context) {
        this.zzb.setBaseContext(context);
        this.zzR.zza(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzt(this.zzn.zzc(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzal(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzam(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzP = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzan(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzao() {
        if (this.zzJ == null) {
            this.zzK.zzc();
            zzbgc zzf = zzbgf.zzf();
            this.zzJ = zzf;
            this.zzK.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzap(zzbhw zzbhwVar) {
        this.zzC = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized zzbhw zzaq() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzar(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzas() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzat(String str, String str2, String str3) {
        String str4;
        if (!zzX()) {
            String[] strArr = new String[1];
            String str5 = (String) zzbba.zzc().zzb(zzbfq.zzK);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcji.zza(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzau() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzav(boolean z) {
        this.zzn.zzB(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzaw(zzbht zzbhtVar) {
        this.zzD = zzbhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized void zzax(zzatv zzatvVar) {
        this.zzE = zzatvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final synchronized zzatv zzay() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final boolean zzaz(final boolean z, final int i) {
        destroy();
        this.zzY.zzc(new zzavf(z, i) { // from class: com.google.android.gms.internal.ads.zzcir
            private final boolean zza;
            private final int zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = z;
                this.zzb = i;
            }

            @Override // com.google.android.gms.internal.ads.zzavf
            public final void zza(zzawz zzawzVar) {
                boolean z2 = this.zza;
                int i2 = this.zzb;
                int i3 = zzciu.zza;
                zzazg zzc = zzazh.zzc();
                if (zzc.zza() != z2) {
                    zzc.zzb(z2);
                }
                zzc.zzc(i2);
                zzawzVar.zzj(zzc.zzah());
            }
        });
        this.zzY.zzb(zzavi.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzb(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaN(sb.toString());
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbv() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbv();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbw() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzc(zzash zzashVar) {
        synchronized (this) {
            this.zzA = zzashVar.zzj;
        }
        zzbd(zzashVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zzd(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzaN(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zze(String str, Map<String, ?> map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.zzs.zzc().zzf(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final zzcej zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzg(boolean z) {
        this.zzn.zzz(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final synchronized zzcix zzh() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final zzbgc zzi() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjd, com.google.android.gms.internal.ads.zzceu
    public final Activity zzj() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final synchronized String zzm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final synchronized String zzn() {
        zzesv zzesvVar = this.zzk;
        if (zzesvVar != null) {
            return zzesvVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final synchronized void zzo(int i) {
        this.zzM = i;
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final synchronized int zzp() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final zzbgd zzq() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final synchronized zzcgs zzs(String str) {
        Map<String, zzcgs> map = this.zzW;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzceu
    public final zzcct zzt() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final synchronized void zzu(String str, zzcgs zzcgsVar) {
        if (this.zzW == null) {
            this.zzW = new HashMap();
        }
        this.zzW.put(str, zzcgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzv(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final void zzw(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcib, com.google.android.gms.internal.ads.zzceu
    public final synchronized void zzx(zzcix zzcixVar) {
        if (this.zzz != null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcixVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzy() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzceu
    public final int zzz() {
        return getMeasuredWidth();
    }

    private final synchronized void zzaX() {
        zzess zzessVar = this.zzj;
        if (zzessVar != null && zzessVar.zzah) {
            com.google.android.gms.ads.internal.util.zze.zzd("Disabling hardware acceleration on an overlay.");
            zzaY();
            return;
        }
        if (!this.zzu && !this.zzq.zzg()) {
            if (Build.VERSION.SDK_INT < 18) {
                com.google.android.gms.ads.internal.util.zze.zzd("Disabling hardware acceleration on an AdView.");
                zzaY();
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zzd("Enabling hardware acceleration on an AdView.");
            zzaZ();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzd("Enabling hardware acceleration on an overlay.");
        zzaZ();
    }
}
