package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzezx {
    private zzfav zza;
    private long zzb;
    private int zzc;

    public zzezx() {
        zzk();
        this.zza = new zzfav(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zza.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(WebView webView) {
        this.zza = new zzfav(webView);
    }

    public final WebView zzd() {
        return (WebView) this.zza.get();
    }

    public final boolean zze() {
        return this.zza.get() != null;
    }

    public final void zzf(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzezq.zza().zze(zzd(), str);
        }
    }

    public final void zzg(String str, long j) {
        if (j < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzezq.zza().zze(zzd(), str);
    }

    public void zzh(zzeyz zzeyzVar, zzeyx zzeyxVar) {
        zzi(zzeyzVar, zzeyxVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(zzeyz zzeyzVar, zzeyx zzeyxVar, JSONObject jSONObject) {
        String zzi = zzeyzVar.zzi();
        JSONObject jSONObject2 = new JSONObject();
        zzfab.zzc(jSONObject2, "environment", "app");
        zzfab.zzc(jSONObject2, "adSessionType", zzeyxVar.zzj());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        zzfab.zzc(jSONObject3, "deviceType", sb.toString());
        zzfab.zzc(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfab.zzc(jSONObject3, "os", "Android");
        zzfab.zzc(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfab.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfab.zzc(jSONObject4, "partnerName", zzeyxVar.zzd().zzb());
        zzfab.zzc(jSONObject4, "partnerVersion", zzeyxVar.zzd().zzc());
        zzfab.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfab.zzc(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        zzfab.zzc(jSONObject5, "appId", zzezo.zza().zzb().getApplicationContext().getPackageName());
        zzfab.zzc(jSONObject2, "app", jSONObject5);
        if (zzeyxVar.zzh() != null) {
            zzfab.zzc(jSONObject2, "contentUrl", zzeyxVar.zzh());
        }
        zzfab.zzc(jSONObject2, "customReferenceData", zzeyxVar.zzi());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<zzezf> it = zzeyxVar.zze().iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        } else {
            zzezq.zza().zzc(zzd(), zzi, jSONObject2, jSONObject6, jSONObject);
        }
    }

    public final void zzj(float f) {
        zzezq.zza().zzf(zzd(), f);
    }

    public final void zzk() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }
}
