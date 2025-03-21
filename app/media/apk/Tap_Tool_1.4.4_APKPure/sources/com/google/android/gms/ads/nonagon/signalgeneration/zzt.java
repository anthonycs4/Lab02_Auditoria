package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbi;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzcjz;
import com.google.android.gms.internal.ads.zzcvs;
import com.google.android.gms.internal.ads.zzdbg;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzetj;
import com.google.android.gms.internal.ads.zzeuc;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfc;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzflb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzt extends zzcbi {
    protected static final List<String> zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    protected static final List<String> zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List<String> zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    protected static final List<String> zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcjz zzf;
    private Context zzg;
    private final zzfb zzh;
    private final zzeuc<zzdlt> zzi;
    private final zzflb zzj;
    private final ScheduledExecutorService zzk;
    private zzbwi zzl;
    private Point zzm = new Point();
    private Point zzn = new Point();
    private final Set<WebView> zzo = Collections.newSetFromMap(new WeakHashMap());
    private final zzb zzp;

    public zzt(zzcjz zzcjzVar, Context context, zzfb zzfbVar, zzeuc<zzdlt> zzeucVar, zzflb zzflbVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzf = zzcjzVar;
        this.zzg = context;
        this.zzh = zzfbVar;
        this.zzi = zzeucVar;
        this.zzj = zzflbVar;
        this.zzk = scheduledExecutorService;
        this.zzp = zzcjzVar.zzw();
    }

    static boolean zzc(Uri uri) {
        return zzs(uri, zzc, zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Uri zzq(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzv(uri, "nas", str) : uri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ ArrayList zzr(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzv(uri, "nas", str));
            }
        }
        return arrayList;
    }

    private static boolean zzs(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final zzfla<String> zzt(final String str) {
        final zzdlt[] zzdltVarArr = new zzdlt[1];
        zzfla zzi = zzfks.zzi(this.zzi.zzb(), new zzfjz(this, zzdltVarArr, str) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
            private final zzt zza;
            private final zzdlt[] zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzdltVarArr;
                this.zzc = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzk(this.zzb, this.zzc, (zzdlt) obj);
            }
        }, this.zzj);
        zzi.zze(new Runnable(this, zzdltVarArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
            private final zzt zza;
            private final zzdlt[] zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzdltVarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(this.zzb);
            }
        }, this.zzj);
        return zzfks.zzf(zzfks.zzj((zzfkj) zzfks.zzh(zzfkj.zzw(zzi), ((Integer) zzbba.zzc().zzb(zzbfq.zzfd)).intValue(), TimeUnit.MILLISECONDS, this.zzk), zzm.zza, this.zzj), Exception.class, zzn.zza, this.zzj);
    }

    private final boolean zzu() {
        Map<String, WeakReference<View>> map;
        zzbwi zzbwiVar = this.zzl;
        return (zzbwiVar == null || (map = zzbwiVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    private static final Uri zzv(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdlt[] zzdltVarArr) {
        zzdlt zzdltVar = zzdltVarArr[0];
        if (zzdltVar != null) {
            this.zzi.zzc(zzfks.zza(zzdltVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zze(IObjectWrapper iObjectWrapper, zzcbn zzcbnVar, zzcbg zzcbgVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        String str = zzcbnVar.zza;
        String str2 = zzcbnVar.zzb;
        zzazx zzazxVar = zzcbnVar.zzc;
        zzazs zzazsVar = zzcbnVar.zzd;
        zze zzu = this.zzf.zzu();
        zzcvs zzcvsVar = new zzcvs();
        zzcvsVar.zza(context);
        zzetj zzetjVar = new zzetj();
        if (str == null) {
            str = "adUnitId";
        }
        zzetjVar.zzf(str);
        if (zzazsVar == null) {
            zzazsVar = new zzazt().zza();
        }
        zzetjVar.zza(zzazsVar);
        if (zzazxVar == null) {
            zzazxVar = new zzazx();
        }
        zzetjVar.zzc(zzazxVar);
        zzcvsVar.zzb(zzetjVar.zzu());
        zzu.zzc(zzcvsVar.zzd());
        zzw zzwVar = new zzw();
        zzwVar.zza(str2);
        zzu.zzb(new zzx(zzwVar, null));
        new zzdbg();
        zzfks.zzp(zzu.zza().zza(), new zzq(this, zzcbgVar), this.zzf.zze());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfc)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbwi zzbwiVar = this.zzl;
            this.zzm = zzby.zzh(motionEvent, zzbwiVar == null ? null : zzbwiVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzn = this.zzm;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzm.x, this.zzm.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzg(final List<Uri> list, final IObjectWrapper iObjectWrapper, zzbwb zzbwbVar) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfc)).booleanValue()) {
            try {
                zzbwbVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                return;
            }
        }
        zzfla zzb2 = this.zzj.zzb(new Callable(this, list, iObjectWrapper) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            private final zzt zza;
            private final List zzb;
            private final IObjectWrapper zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = list;
                this.zzc = iObjectWrapper;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzo(this.zzb, this.zzc);
            }
        });
        if (zzu()) {
            zzb2 = zzfks.zzi(zzb2, new zzfjz(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                private final zzt zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    return this.zza.zzn((ArrayList) obj);
                }
            }, this.zzj);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzh("Asset view map is empty.");
        }
        zzfks.zzp(zzb2, new zzr(this, zzbwbVar), this.zzf.zze());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzh(List<Uri> list, final IObjectWrapper iObjectWrapper, zzbwb zzbwbVar) {
        try {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfc)).booleanValue()) {
                zzbwbVar.zzf("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzbwbVar.zzf("There should be only 1 click URL.");
            } else {
                final Uri uri = list.get(0);
                if (zzs(uri, zza, zzb)) {
                    zzfla zzb2 = this.zzj.zzb(new Callable(this, uri, iObjectWrapper) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        private final zzt zza;
                        private final Uri zzb;
                        private final IObjectWrapper zzc;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                            this.zzb = uri;
                            this.zzc = iObjectWrapper;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzm(this.zzb, this.zzc);
                        }
                    });
                    if (zzu()) {
                        zzb2 = zzfks.zzi(zzb2, new zzfjz(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
                            private final zzt zza;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfjz
                            public final zzfla zza(Object obj) {
                                return this.zza.zzl((Uri) obj);
                            }
                        }, this.zzj);
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zzh("Asset view map is empty.");
                    }
                    zzfks.zzp(zzb2, new zzs(this, zzbwbVar), this.zzf.zze());
                    return;
                }
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                zzbwbVar.zze(list);
            }
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzi(zzbwi zzbwiVar) {
        this.zzl = zzbwiVar;
        this.zzi.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgm)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                com.google.android.gms.ads.internal.util.zze.zzi("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.zze.zzf("The webView cannot be null.");
            } else if (this.zzo.contains(webView)) {
                com.google.android.gms.ads.internal.util.zze.zzh("This webview has already been registered.");
            } else {
                this.zzo.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView), "gmaSdk");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzk(zzdlt[] zzdltVarArr, String str, zzdlt zzdltVar) throws Exception {
        zzdltVarArr[0] = zzdltVar;
        Context context = this.zzg;
        zzbwi zzbwiVar = this.zzl;
        Map<String, WeakReference<View>> map = zzbwiVar.zzb;
        JSONObject zze2 = zzby.zze(context, map, map, zzbwiVar.zza);
        JSONObject zzb2 = zzby.zzb(this.zzg, this.zzl.zza);
        JSONObject zzc2 = zzby.zzc(this.zzl.zza);
        JSONObject zzd2 = zzby.zzd(this.zzg, this.zzl.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zze2);
        jSONObject.put("ad_view_signal", zzb2);
        jSONObject.put("scroll_view_signal", zzc2);
        jSONObject.put("lock_screen_signal", zzd2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzby.zzf(null, this.zzg, this.zzn, this.zzm));
        }
        return zzdltVar.zzc(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzl(final Uri uri) throws Exception {
        return zzfks.zzj(zzt("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfei(this, uri) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            private final zzt zza;
            private final Uri zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = uri;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                return zzt.zzq(this.zzb, (String) obj);
            }
        }, this.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zze(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzfc e) {
            zzccn.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzn(final ArrayList arrayList) throws Exception {
        return zzfks.zzj(zzt("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfei(this, arrayList) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            private final zzt zza;
            private final List zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                return zzt.zzr(this.zzb, (String) obj);
            }
        }, this.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzi = this.zzh.zzb() != null ? this.zzh.zzb().zzi(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (TextUtils.isEmpty(zzi)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                arrayList.add(uri);
            } else {
                arrayList.add(zzv(uri, "ms", zzi));
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }
}
