package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzcii extends WebViewClient implements zzcjp {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet<String> zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzbzu zza;
    private final zzcib zzc;
    private final zzavg zzd;
    private final HashMap<String, List<zzblp<? super zzcib>>> zze;
    private final Object zzf;
    private zzazi zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcjn zzi;
    private zzcjo zzj;
    private zzbkq zzk;
    private zzbks zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzv zzs;
    private zzbum zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbuh zzv;
    private zzeyn zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcii(zzcib zzcibVar, zzavg zzavgVar, boolean z) {
        zzbum zzbumVar = new zzbum(zzcibVar, zzcibVar.zzM(), new zzbfb(zzcibVar.getContext()));
        this.zze = new HashMap<>();
        this.zzf = new Object();
        this.zzr = false;
        this.zzd = zzavgVar;
        this.zzc = zzcibVar;
        this.zzo = z;
        this.zzt = zzbumVar;
        this.zzv = null;
        this.zzB = new HashSet<>(Arrays.asList(((String) zzbba.zzc().zzb(zzbfq.zzdO)).split(",")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzN(final View view, final zzbzu zzbzuVar, final int i) {
        if (!zzbzuVar.zzc() || i <= 0) {
            return;
        }
        zzbzuVar.zzd(view);
        if (zzbzuVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzr.zza.postDelayed(new Runnable(this, view, zzbzuVar, i) { // from class: com.google.android.gms.internal.ads.zzcic
                private final zzcii zza;
                private final View zzb;
                private final zzbzu zzc;
                private final int zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = view;
                    this.zzc = zzbzuVar;
                    this.zzd = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(this.zzb, this.zzc, this.zzd);
                }
            }, 100L);
        }
    }

    private final void zzO() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzP() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzav)).booleanValue()) {
            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzQ(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.zzs.zzc().zzb(this.zzc.getContext(), this.zzc.zzt().zza, false, httpURLConnection, false, 60000);
                zzccm zzccmVar = new zzccm(null);
                zzccmVar.zza(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzccmVar.zzc(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Protocol is null");
                    return zzP();
                } else if (!protocol.equals("http") && !protocol.equals("https")) {
                    com.google.android.gms.ads.internal.util.zze.zzi(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                    return zzP();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zzd(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            com.google.android.gms.ads.internal.zzs.zzc();
            return com.google.android.gms.ads.internal.util.zzr.zzR(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(Map<String, String> map, List<zzblp<? super zzcib>> list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        for (zzblp<? super zzcib> zzblpVar : list) {
            zzblpVar.zza(this.zzc, map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        zzazi zzaziVar = this.zzg;
        if (zzaziVar != null) {
            zzaziVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzD(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzY();
                return;
            }
            this.zzx = true;
            zzcjo zzcjoVar = this.zzj;
            if (zzcjoVar != null) {
                zzcjoVar.zzb();
                this.zzj = null;
            }
            zzl();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzn = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaz(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzy(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzm && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzazi zzaziVar = this.zzg;
                    if (zzaziVar != null) {
                        zzaziVar.onAdClicked();
                        zzbzu zzbzuVar = this.zza;
                        if (zzbzuVar != null) {
                            zzbzuVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzfb zzU = this.zzc.zzU();
                    if (zzU != null && zzU.zza(parse)) {
                        Context context = this.zzc.getContext();
                        zzcib zzcibVar = this.zzc;
                        parse = zzU.zze(parse, context, (View) zzcibVar, zzcibVar.zzj());
                    }
                } catch (zzfc unused) {
                    String valueOf2 = String.valueOf(str);
                    com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar == null || zzbVar.zzb()) {
                    zzm(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null));
                    return true;
                }
                this.zzu.zzc(str);
                return true;
            }
            String valueOf3 = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zzi(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            return true;
        }
        zzD(parse);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzA() {
        synchronized (this.zzf) {
            this.zzm = false;
            this.zzo = true;
            zzccz.zze.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcid
                private final zzcii zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    public final void zzB(boolean z) {
        this.zzA = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzC(int i, int i2) {
        zzbuh zzbuhVar = this.zzv;
        if (zzbuhVar != null) {
            zzbuhVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzD(Uri uri) {
        String path = uri.getPath();
        List<zzblp<? super zzcib>> list = this.zze.get(path);
        if (path == null || list == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzeR)).booleanValue() || com.google.android.gms.ads.internal.zzs.zzg().zza() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzccz.zza.execute(new Runnable(substring) { // from class: com.google.android.gms.internal.ads.zzcie
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = substring;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str = this.zza;
                    int i = zzcii.zzb;
                    com.google.android.gms.ads.internal.zzs.zzg().zza().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdN)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbba.zzc().zzb(zzbfq.zzdP)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                zzfks.zzp(com.google.android.gms.ads.internal.zzs.zzc().zzi(uri), new zzcig(this, list, path, uri), zzccz.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        zzR(com.google.android.gms.ads.internal.util.zzr.zzQ(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzp = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzq = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzr = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final boolean zzH() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI() {
        this.zzc.zzah();
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzv();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(View view, zzbzu zzbzuVar, int i) {
        zzN(view, zzbzuVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzM(zzazi zzaziVar, zzbkq zzbkqVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbks zzbksVar, com.google.android.gms.ads.internal.overlay.zzv zzvVar, boolean z, zzbls zzblsVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbuo zzbuoVar, zzbzu zzbzuVar, zzdxo zzdxoVar, zzeyn zzeynVar, zzdpn zzdpnVar, zzexv zzexvVar, zzblq zzblqVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbzuVar, null) : zzbVar;
        this.zzv = new zzbuh(this.zzc, zzbuoVar);
        this.zza = zzbzuVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaC)).booleanValue()) {
            zzs("/adMetadata", new zzbkp(zzbkqVar));
        }
        if (zzbksVar != null) {
            zzs("/appEvent", new zzbkr(zzbksVar));
        }
        zzs("/backButton", zzblo.zzk);
        zzs("/refresh", zzblo.zzl);
        zzs("/canOpenApp", zzblo.zzb);
        zzs("/canOpenURLs", zzblo.zza);
        zzs("/canOpenIntents", zzblo.zzc);
        zzs("/close", zzblo.zze);
        zzs("/customClose", zzblo.zzf);
        zzs("/instrument", zzblo.zzo);
        zzs("/delayPageLoaded", zzblo.zzq);
        zzs("/delayPageClosed", zzblo.zzr);
        zzs("/getLocationInfo", zzblo.zzs);
        zzs("/log", zzblo.zzh);
        zzs("/mraid", new zzblw(zzbVar2, this.zzv, zzbuoVar));
        zzbum zzbumVar = this.zzt;
        if (zzbumVar != null) {
            zzs("/mraidLoaded", zzbumVar);
        }
        zzs("/open", new zzbma(zzbVar2, this.zzv, zzdxoVar, zzdpnVar, zzexvVar));
        zzs("/precache", new zzcgt());
        zzs("/touch", zzblo.zzj);
        zzs("/video", zzblo.zzm);
        zzs("/videoMeta", zzblo.zzn);
        if (zzdxoVar == null || zzeynVar == null) {
            zzs("/click", zzblo.zzd);
            zzs("/httpTrack", zzblo.zzg);
        } else {
            zzs("/click", zzett.zza(zzdxoVar, zzeynVar));
            zzs("/httpTrack", zzett.zzb(zzdxoVar, zzeynVar));
        }
        if (com.google.android.gms.ads.internal.zzs.zzA().zzb(this.zzc.getContext())) {
            zzs("/logScionEvent", new zzblv(this.zzc.getContext()));
        }
        if (zzblsVar != null) {
            zzs("/setInterstitialProperties", new zzblr(zzblsVar, null));
        }
        if (zzblqVar != null) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue()) {
                zzs("/inspectorNetworkExtras", zzblqVar);
            }
        }
        this.zzg = zzaziVar;
        this.zzh = zzoVar;
        this.zzk = zzbkqVar;
        this.zzl = zzbksVar;
        this.zzs = zzvVar;
        this.zzu = zzbVar2;
        this.zzm = z;
        this.zzw = zzeynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zza(int i, int i2, boolean z) {
        zzbum zzbumVar = this.zzt;
        if (zzbumVar != null) {
            zzbumVar.zzb(i, i2);
        }
        zzbuh zzbuhVar = this.zzv;
        if (zzbuhVar != null) {
            zzbuhVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final com.google.android.gms.ads.internal.zzb zzb() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final boolean zzc() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzo;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzf() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzg() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzh() {
        zzbzu zzbzuVar = this.zza;
        if (zzbzuVar != null) {
            WebView zzG = this.zzc.zzG();
            if (!ViewCompat.isAttachedToWindow(zzG)) {
                zzO();
                zzcif zzcifVar = new zzcif(this, zzbzuVar);
                this.zzC = zzcifVar;
                ((View) this.zzc).addOnAttachStateChangeListener(zzcifVar);
                return;
            }
            zzN(zzG, zzbzuVar, 10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzi() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzj() {
        this.zzz--;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzk() {
        zzavg zzavgVar = this.zzd;
        if (zzavgVar != null) {
            zzavgVar.zzb(zzavi.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzy = true;
        zzl();
        this.zzc.destroy();
    }

    public final void zzl() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzn)) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() && this.zzc.zzq() != null) {
                zzbfx.zza(this.zzc.zzq().zzc(), this.zzc.zzi(), "awfllc");
            }
            zzcjn zzcjnVar = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzn) {
                z = true;
            }
            zzcjnVar.zza(z);
            this.zzi = null;
        }
        this.zzc.zzao();
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        boolean zzW = this.zzc.zzW();
        zzr(new AdOverlayInfoParcel(zzcVar, (!zzW || this.zzc.zzP().zzg()) ? this.zzg : null, zzW ? null : this.zzh, this.zzs, this.zzc.zzt(), this.zzc));
    }

    public final void zzn(com.google.android.gms.ads.internal.util.zzbs zzbsVar, zzdxo zzdxoVar, zzdpn zzdpnVar, zzexv zzexvVar, String str, String str2, int i) {
        zzcib zzcibVar = this.zzc;
        zzr(new AdOverlayInfoParcel(zzcibVar, zzcibVar.zzt(), zzbsVar, zzdxoVar, zzdpnVar, zzexvVar, str, str2, i));
    }

    public final void zzo(boolean z, int i) {
        zzazi zzaziVar = (!this.zzc.zzW() || this.zzc.zzP().zzg()) ? this.zzg : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zzs;
        zzcib zzcibVar = this.zzc;
        zzr(new AdOverlayInfoParcel(zzaziVar, zzoVar, zzvVar, zzcibVar, z, i, zzcibVar.zzt()));
    }

    public final void zzp(boolean z, int i, String str) {
        boolean zzW = this.zzc.zzW();
        zzazi zzaziVar = (!zzW || this.zzc.zzP().zzg()) ? this.zzg : null;
        zzcih zzcihVar = zzW ? null : new zzcih(this.zzc, this.zzh);
        zzbkq zzbkqVar = this.zzk;
        zzbks zzbksVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zzs;
        zzcib zzcibVar = this.zzc;
        zzr(new AdOverlayInfoParcel(zzaziVar, zzcihVar, zzbkqVar, zzbksVar, zzvVar, zzcibVar, z, i, str, zzcibVar.zzt()));
    }

    public final void zzq(boolean z, int i, String str, String str2) {
        boolean zzW = this.zzc.zzW();
        zzazi zzaziVar = (!zzW || this.zzc.zzP().zzg()) ? this.zzg : null;
        zzcih zzcihVar = zzW ? null : new zzcih(this.zzc, this.zzh);
        zzbkq zzbkqVar = this.zzk;
        zzbks zzbksVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zzs;
        zzcib zzcibVar = this.zzc;
        zzr(new AdOverlayInfoParcel(zzaziVar, zzcihVar, zzbkqVar, zzbksVar, zzvVar, zzcibVar, z, i, str, str2, zzcibVar.zzt()));
    }

    public final void zzr(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbuh zzbuhVar = this.zzv;
        boolean zzd = zzbuhVar != null ? zzbuhVar.zzd() : false;
        com.google.android.gms.ads.internal.zzs.zzb();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzd);
        zzbzu zzbzuVar = this.zza;
        if (zzbzuVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbzuVar.zzb(str);
        }
    }

    public final void zzs(String str, zzblp<? super zzcib> zzblpVar) {
        synchronized (this.zzf) {
            List<zzblp<? super zzcib>> list = this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.zze.put(str, list);
            }
            list.add(zzblpVar);
        }
    }

    public final void zzt(String str, zzblp<? super zzcib> zzblpVar) {
        synchronized (this.zzf) {
            List<zzblp<? super zzcib>> list = this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzblpVar);
        }
    }

    public final void zzu(String str, Predicate<zzblp<? super zzcib>> predicate) {
        synchronized (this.zzf) {
            List<zzblp<? super zzcib>> list = this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzblp<? super zzcib> zzblpVar : list) {
                if (predicate.apply(zzblpVar)) {
                    arrayList.add(zzblpVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzv() {
        zzbzu zzbzuVar = this.zza;
        if (zzbzuVar != null) {
            zzbzuVar.zzf();
            this.zza = null;
        }
        zzO();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzm = false;
            this.zzo = false;
            this.zzp = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbuh zzbuhVar = this.zzv;
            if (zzbuhVar != null) {
                zzbuhVar.zzb(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzw(zzcjn zzcjnVar) {
        this.zzi = zzcjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final void zzx(zzcjo zzcjoVar) {
        this.zzj = zzcjoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzy(String str, Map<String, String> map) {
        zzaup zzc;
        try {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgu)).booleanValue() || this.zzw == null || !"oda".equals(Uri.parse(str).getScheme())) {
                String zza = zzcay.zza(str, this.zzc.getContext(), this.zzA);
                if (zza.equals(str)) {
                    zzaus zza2 = zzaus.zza(Uri.parse(str));
                    if (zza2 != null && (zzc = com.google.android.gms.ads.internal.zzs.zzi().zzc(zza2)) != null && zzc.zza()) {
                        return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzc.zzb());
                    }
                    if (zzccm.zzj() && zzbha.zzb.zze().booleanValue()) {
                        return zzQ(str, map);
                    }
                    return null;
                }
                return zzQ(zza, map);
            }
            this.zzw.zzb(str);
            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new ByteArrayInputStream(new byte[0]));
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AdWebViewClient.interceptRequest");
            return zzP();
        }
    }

    public final void zzz(boolean z) {
        this.zzm = false;
    }
}
