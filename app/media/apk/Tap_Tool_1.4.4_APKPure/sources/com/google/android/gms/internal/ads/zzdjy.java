package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdjy {
    private final Context zza;
    private final zzdjh zzb;
    private final zzfb zzc;
    private final zzcct zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzavg zzf;
    private final Executor zzg;
    private final zzbhy zzh;
    private final zzdkq zzi;
    private final zzdmy zzj;
    private final ScheduledExecutorService zzk;

    public zzdjy(Context context, zzdjh zzdjhVar, zzfb zzfbVar, zzcct zzcctVar, com.google.android.gms.ads.internal.zza zzaVar, zzavg zzavgVar, Executor executor, zzetk zzetkVar, zzdkq zzdkqVar, zzdmy zzdmyVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzb = zzdjhVar;
        this.zzc = zzfbVar;
        this.zzd = zzcctVar;
        this.zze = zzaVar;
        this.zzf = zzavgVar;
        this.zzg = executor;
        this.zzh = zzetkVar.zzi;
        this.zzi = zzdkqVar;
        this.zzj = zzdmyVar;
        this.zzk = scheduledExecutorService;
    }

    public static final zzbea zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List<zzbea> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfgz.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfgz.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzbea zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfgz.zzp(arrayList);
    }

    private final zzfla<List<zzbhu>> zzk(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfks.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzl(jSONArray.optJSONObject(i), z));
        }
        return zzfks.zzj(zzfks.zzk(arrayList), zzdjn.zza, this.zzg);
    }

    private final zzfla<zzbhu> zzl(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfks.zza(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfks.zza(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfks.zza(new zzbhu(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzp(jSONObject.optBoolean("require"), zzfks.zzj(this.zzb.zza(optString, optDouble, optBoolean), new zzfei(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.zzdjp
            private final String zza;
            private final double zzb;
            private final int zzc;
            private final int zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = optString;
                this.zzb = optDouble;
                this.zzc = optInt;
                this.zzd = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                String str = this.zza;
                return new zzbhu(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzb, this.zzc, this.zzd);
            }
        }, this.zzg), null);
    }

    private static Integer zzm(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final zzfla<zzcib> zzn(JSONObject jSONObject, zzess zzessVar, zzesv zzesvVar) {
        final zzfla<zzcib> zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzessVar, zzesvVar, zzq(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfks.zzi(zzb, new zzfjz(zzb) { // from class: com.google.android.gms.internal.ads.zzdju
            private final zzfla zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                zzfla zzflaVar = this.zza;
                zzcib zzcibVar = (zzcib) obj;
                if (zzcibVar == null || zzcibVar.zzh() == null) {
                    throw new zzebr(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzflaVar;
            }
        }, zzccz.zzf);
    }

    private static <T> zzfla<T> zzo(zzfla<T> zzflaVar, T t) {
        return zzfks.zzg(zzflaVar, Exception.class, new zzfjz(null) { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj);
                return zzfks.zza(null);
            }
        }, zzccz.zzf);
    }

    private static <T> zzfla<T> zzp(boolean z, final zzfla<T> zzflaVar, T t) {
        if (z) {
            return zzfks.zzi(zzflaVar, new zzfjz(zzflaVar) { // from class: com.google.android.gms.internal.ads.zzdjw
                private final zzfla zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzflaVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    return obj != null ? this.zza : zzfks.zzc(new zzebr(1, "Retrieve required value in native ad response failed."));
                }
            }, zzccz.zzf);
        }
        return zzo(zzflaVar, null);
    }

    private static final zzbea zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzbea(optString, optString2);
    }

    public final zzfla<zzbhu> zza(JSONObject jSONObject, String str) {
        return zzl(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfla<List<zzbhu>> zzb(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbhy zzbhyVar = this.zzh;
        return zzk(optJSONArray, zzbhyVar.zzb, zzbhyVar.zzd);
    }

    public final zzfla<zzcib> zzc(JSONObject jSONObject, String str, final zzess zzessVar, final zzesv zzesvVar) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgs)).booleanValue()) {
            return zzfks.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfks.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfks.zza(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final zzazx zzq = zzq(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (!TextUtils.isEmpty(optString2)) {
            final zzfla zzi = zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzq, zzessVar, zzesvVar, optString, optString2) { // from class: com.google.android.gms.internal.ads.zzdjq
                private final zzdjy zza;
                private final zzazx zzb;
                private final zzess zzc;
                private final zzesv zzd;
                private final String zze;
                private final String zzf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzq;
                    this.zzc = zzessVar;
                    this.zzd = zzesvVar;
                    this.zze = optString;
                    this.zzf = optString2;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    return this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, obj);
                }
            }, zzccz.zze);
            return zzfks.zzi(zzi, new zzfjz(zzi) { // from class: com.google.android.gms.internal.ads.zzdjr
                private final zzfla zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzi;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    zzfla zzflaVar = this.zza;
                    if (((zzcib) obj) != null) {
                        return zzflaVar;
                    }
                    throw new zzebr(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzccz.zzf);
        }
        return zzfks.zza(null);
    }

    public final zzfla<zzbhr> zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfks.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzp(optJSONObject.optBoolean("require"), zzfks.zzj(zzk(optJSONArray, false, true), new zzfei(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.zzdjs
            private final zzdjy zza;
            private final JSONObject zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                return this.zza.zzg(this.zzb, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfla<zzcib> zze(JSONObject jSONObject, zzess zzessVar, zzesv zzesvVar) {
        zzfla<zzcib> zza;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbv.zzh(jSONObject, "html_containers", "instream");
        if (zzh == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzfks.zza(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgr)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Required field 'vast_xml' or 'html' is missing");
                    return zzfks.zza(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                return zzo(zzfks.zzh(zza, ((Integer) zzbba.zzc().zzb(zzbfq.zzcc)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzn(optJSONObject, zzessVar, zzesvVar);
            return zzo(zzfks.zzh(zza, ((Integer) zzbba.zzc().zzb(zzbfq.zzcc)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzn(zzh, zzessVar, zzesvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzf(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzs.zzd();
        zzcib zza = zzcin.zza(this.zza, zzcjr.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzcdd zza2 = zzcdd.zza(zza);
        zza.zzR().zzw(new zzcjn(zza2) { // from class: com.google.android.gms.internal.ads.zzdjx
            private final zzcdd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzcjn
            public final void zza(boolean z) {
                this.zza.zzb();
            }
        });
        zza.loadData(str, "text/html", "UTF-8");
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbhr zzg(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzm = zzm(jSONObject, "bg_color");
        Integer zzm2 = zzm(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbhr(optString, list, zzm, zzm2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzh(zzazx zzazxVar, zzess zzessVar, zzesv zzesvVar, String str, String str2, Object obj) throws Exception {
        zzcib zza = this.zzj.zza(zzazxVar, zzessVar, zzesvVar);
        final zzcdd zza2 = zzcdd.zza(zza);
        zza.zzR().zzG(true);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcb)).booleanValue()) {
            zza.zzab("/getNativeAdViewSignals", zzblo.zzt);
        }
        zza.zzab("/canOpenApp", zzblo.zzb);
        zza.zzab("/canOpenURLs", zzblo.zza);
        zza.zzab("/canOpenIntents", zzblo.zzc);
        zza.zzR().zzw(new zzcjn(zza2) { // from class: com.google.android.gms.internal.ads.zzdjo
            private final zzcdd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzcjn
            public final void zza(boolean z) {
                zzcdd zzcddVar = this.zza;
                if (z) {
                    zzcddVar.zzb();
                } else {
                    zzcddVar.zzd(new zzebr(1, "Image Web View failed to load."));
                }
            }
        });
        zza.zzat(str, str2, null);
        return zza2;
    }

    private final zzazx zzq(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzazx.zzb();
            }
            i = 0;
        }
        return new zzazx(this.zza, new AdSize(i, i2));
    }
}
