package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzgec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzr {
    public static final zzfdx zza = new zzf(Looper.getMainLooper());
    private static boolean zzd = false;
    private String zzg;
    private final AtomicReference<Pattern> zzb = new AtomicReference<>(null);
    private final AtomicReference<Pattern> zzc = new AtomicReference<>(null);
    private boolean zze = true;
    private final Object zzf = new Object();
    private boolean zzh = false;
    private boolean zzi = false;
    private final Executor zzj = Executors.newSingleThreadExecutor();

    public static final long zzA(View view) {
        int i;
        float f = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f = Math.min(f, view2.getAlpha());
            i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i > 0);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzB(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzs.zzc().zze(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new zzbp(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zze.zzj("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzC() {
        Resources zzf = com.google.android.gms.ads.internal.zzs.zzg().zzf();
        return zzf != null ? zzf.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbs zzD(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zze.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbs) {
                return (zzbs) queryLocalInterface;
            }
            return new zzbq(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzE(Context context, String str) {
        Context zza2 = zzbxt.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzF(String str) {
        if (zzccm.zzj()) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdg)).booleanValue()) {
                String str2 = (String) zzbba.zzc().zzb(zzbfq.zzdi);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) zzbba.zzc().zzb(zzbfq.zzdh);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        KeyguardManager zzac;
        return context != null && PlatformVersion.isAtLeastJellyBean() && (zzac = zzac(context)) != null && zzac.isKeyguardLocked();
    }

    public static final boolean zzH(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zze.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzI(Context context) {
        boolean z;
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfG)).booleanValue()) {
                synchronized (zzr.class) {
                    z = zzd;
                }
                return z;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean zzJ(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzK(Context context) {
        Bundle zzaf = zzaf(context);
        return TextUtils.isEmpty(zzae(zzaf)) && !TextUtils.isEmpty(zzaf.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzL(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzM(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(str2);
        for (String str3 : arrayList) {
            new zzbz(context, str, str3).zzb();
        }
    }

    public static final void zzN(Context context, Throwable th) {
        if (context != null) {
            try {
                if (zzbhj.zzb.zze().booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void zzO(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int zzP(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zze.zzi(sb.toString());
            return 0;
        }
    }

    public static final Map<String, String> zzQ(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzR(HttpURLConnection httpURLConnection) throws IOException {
        com.google.android.gms.ads.internal.zzs.zzc();
        String contentType = httpURLConnection.getContentType();
        boolean isEmpty = TextUtils.isEmpty(contentType);
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String trim = isEmpty ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzs.zzc();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzs.zze().zzn(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzS(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzz() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String zzT(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return zzw();
        }
    }

    public static final int[] zzU(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzz = (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzz() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{zzbay.zza().zza(activity, zzz[0]), zzbay.zza().zza(activity, zzz[1])};
    }

    public static final boolean zzV(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzs.zzc().zze || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzt(view);
        long zzA = zzA(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzaP)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgw)).booleanValue()) {
                    return true;
                }
                if (zzA >= ((Integer) zzbba.zzc().zzb(zzbfq.zzgy)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzW(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzu(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zze.zzd(sb.toString());
        } catch (ActivityNotFoundException e) {
            zze.zzg("No browser is found.", e);
        }
    }

    public static final int[] zzX(Activity activity) {
        int[] zzS = zzS(activity);
        return new int[]{zzbay.zza().zza(activity, zzS[0]), zzbay.zza().zza(activity, zzS[1])};
    }

    public static final boolean zzY(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzV(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzac(context));
    }

    private final JSONArray zzZ(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zzaa(jSONArray, it.next());
        }
        return jSONArray;
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(97);
            sb.append("HTTP timeout too low: ");
            sb.append(i);
            sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
            zze.zzi(sb.toString());
            return 60000;
        }
        return 60000;
    }

    private final void zzaa(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzf((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zzZ((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                zzaa(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzab(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzh((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzf((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, zzZ((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zzZ(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static KeyguardManager zzac(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean zzad(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String zzae(Bundle bundle) {
        if (bundle == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    private static Bundle zzaf(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static void zzk(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzccz.zza.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzt(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzr.zzt(android.view.View):boolean");
    }

    public static final void zzu(Context context, Intent intent) {
        if (intent != null && PlatformVersion.isAtLeastJellyBeanMR2()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final String zzv(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzae(zzaf(context));
    }

    static final String zzw() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzx() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final DisplayMetrics zzy(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzz() {
        return new int[]{0, 0};
    }

    public final void zzb(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(zza2);
        sb.append(" milliseconds.");
        zze.zzh(sb.toString());
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        httpURLConnection.setRequestProperty("User-Agent", zze(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzc(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter);
        this.zzh = true;
        return true;
    }

    public final boolean zzd(Context context) {
        if (this.zzi) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        this.zzi = true;
        return true;
    }

    public final String zze(Context context, String str) {
        synchronized (this.zzf) {
            String str2 = this.zzg;
            if (str2 != null) {
                return str2;
            }
            if (str != null) {
                try {
                    this.zzg = com.google.android.gms.ads.internal.zzs.zze().zzb(context);
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.zzg)) {
                    zzbay.zza();
                    if (!zzccg.zzp()) {
                        this.zzg = null;
                        zza.post(new zzm(this, context));
                        while (this.zzg == null) {
                            try {
                                this.zzf.wait();
                            } catch (InterruptedException unused2) {
                                String zzw = zzw();
                                this.zzg = zzw;
                                String valueOf = String.valueOf(zzw);
                                zze.zzi(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    } else {
                        this.zzg = zzT(context);
                    }
                }
                String valueOf2 = String.valueOf(this.zzg);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + str.length());
                sb.append(valueOf2);
                sb.append(" (Mobile; ");
                sb.append(str);
                this.zzg = sb.toString();
                try {
                    if (Wrappers.packageManager(context).isCallerInstantApp()) {
                        this.zzg = String.valueOf(this.zzg).concat(";aia");
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AdUtil.getUserAgent");
                }
                String concat = String.valueOf(this.zzg).concat(")");
                this.zzg = concat;
                return concat;
            }
            return zzw();
        }
    }

    public final JSONObject zzf(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzab(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject zzg(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzh(bundle);
            } catch (JSONException e) {
                zze.zzg("Error converting Bundle to JSON", e);
                return null;
            }
        }
        return null;
    }

    public final JSONObject zzh(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzab(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final zzfla<Map<String, String>> zzi(final Uri uri) {
        return zzfks.zzd(new Callable(uri) { // from class: com.google.android.gms.ads.internal.util.zzk
            private final Uri zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = uri;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = this.zza;
                zzfdx zzfdxVar = zzr.zza;
                com.google.android.gms.ads.internal.zzs.zzc();
                return zzr.zzQ(uri2);
            }
        }, this.zzj);
    }

    public final void zzj(Context context, String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzs.zzc();
        bundle.putString("device", zzx());
        bundle.putString("eids", TextUtils.join(",", zzbfq.zzc()));
        zzbay.zza();
        zzccg.zzr(context, str, "gmob-apps", bundle, true, new zzn(this, context, str));
    }

    public final boolean zzl(String str) {
        return zzad(str, this.zzb, (String) zzbba.zzc().zzb(zzbfq.zzW));
    }

    public final boolean zzm(String str) {
        return zzad(str, this.zzc, (String) zzbba.zzc().zzb(zzbfq.zzX));
    }

    public final void zzn(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfG)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzo(this));
            }
        }
    }

    public final int zzs(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!PlatformVersion.isAtLeastJellyBeanMR2()) {
            zze.zza("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i = 1;
        } else if (context instanceof Activity) {
            i = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        if (true == ((Boolean) zzbba.zzc().zzb(zzbfq.zzcM)).equals(zzbba.zzc().zzb(zzbfq.zzcN))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcM)).booleanValue()) {
            zzbgo zzbgoVar = new zzbgo();
            zzbgoVar.zzd(new zzl(this, zzbgoVar, context, uri));
            zzbgoVar.zze((Activity) context);
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcN)).booleanValue()) {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setPackage(zzgec.zza(context));
            build.launchUrl(context, uri);
            return 5;
        }
        return 5;
    }
}
