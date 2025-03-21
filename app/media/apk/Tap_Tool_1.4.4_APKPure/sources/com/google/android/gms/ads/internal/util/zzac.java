package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcii;
import com.google.android.gms.internal.ads.zzcje;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzac {
    private zzac() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzac(zzt zztVar) {
    }

    public static zzac zzt(int i) {
        return i >= 28 ? new zzab() : i >= 26 ? new zzz() : i >= 24 ? new zzy() : i >= 21 ? new zzx() : i >= 19 ? new zzw() : i >= 18 ? new zzv() : i >= 17 ? new zzu() : new zzac();
    }

    public static final boolean zzu() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public boolean zza(final Context context, final WebSettings webSettings) {
        zzcc.zza(context, new Callable(context, webSettings) { // from class: com.google.android.gms.ads.internal.util.zzs
            private final Context zza;
            private final WebSettings zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = context;
                this.zzb = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.zza;
                WebSettings webSettings2 = this.zzb;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaw)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return true;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public String zzb(Context context) {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public void zzc(Context context) {
    }

    public Drawable zzd(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public int zze(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzf(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public boolean zzg(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int zzh() {
        return 5;
    }

    public long zzi() {
        return -1L;
    }

    public ViewGroup.LayoutParams zzj() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public CookieManager zzk(Context context) {
        if (!zzu()) {
            try {
                CookieSyncManager.createInstance(context);
                return CookieManager.getInstance();
            } catch (Throwable th) {
                zze.zzg("Failed to obtain CookieManager.", th);
                com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }

    public zzcii zzl(zzcib zzcibVar, zzavg zzavgVar, boolean z) {
        return new zzcje(zzcibVar, zzavgVar, z);
    }

    public int zzm() {
        return 1;
    }

    public WebResourceResponse zzn(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public boolean zzo(Activity activity, Configuration configuration) {
        return false;
    }

    public zzawy zzq(Context context, TelephonyManager telephonyManager) {
        return zzawy.ENUM_UNKNOWN;
    }

    public void zzr(Activity activity) {
    }
}
