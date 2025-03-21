package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbwn implements zzbwp {
    static zzbwp zza;
    static zzbwp zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcct zzh;
    private final Object zzd = new Object();
    private final WeakHashMap<Thread, Boolean> zzf = new WeakHashMap<>();

    protected zzbwn(Context context, zzcct zzcctVar) {
        zzfdw.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcctVar;
    }

    public static zzbwp zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (zzbhj.zze.zze().booleanValue()) {
                    if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfe)).booleanValue()) {
                        zza = new zzbwn(context, zzcct.zza());
                    }
                }
                zza = new zzbwo();
            }
        }
        return zza;
    }

    public static zzbwp zzb(Context context, zzcct zzcctVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (zzbhj.zze.zze().booleanValue()) {
                    if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfe)).booleanValue()) {
                        zzbwn zzbwnVar = new zzbwn(context, zzcctVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbwnVar.zzd) {
                                zzbwnVar.zzf.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzbwm(zzbwnVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbwl(zzbwnVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbwnVar;
                    }
                }
                zzb = new zzbwo();
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzccg.zzi(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zze(th, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zze(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (zzccg.zzg(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzfwq.zzc(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d = f;
        double random = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzccn.zzg("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzccn.zzi("Cannot obtain package name, proceeding.");
                str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                sb.append(str3);
                sb.append(" ");
                sb.append(str4);
                str4 = sb.toString();
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", zzbfq.zzc())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "374971692").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbhj.zzc.zze()));
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaV)).booleanValue()) {
                appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1");
            }
            arrayList.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList) {
                final zzccs zzccsVar = new zzccs(null);
                this.zzg.execute(new Runnable(zzccsVar, str5) { // from class: com.google.android.gms.internal.ads.zzbwk
                    private final zzccs zza;
                    private final String zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzccsVar;
                        this.zzb = str5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(this.zzb);
                    }
                });
            }
        }
    }
}
