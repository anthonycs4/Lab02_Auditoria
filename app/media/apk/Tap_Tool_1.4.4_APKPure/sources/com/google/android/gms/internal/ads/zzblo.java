package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzblo {
    public static final zzblp<zzcib> zza = zzbku.zza;
    public static final zzblp<zzcib> zzb = zzbkv.zza;
    public static final zzblp<zzcib> zzc = zzbkw.zza;
    public static final zzblp<zzcib> zzd = zzbla.zza;
    public static final zzblp<zzcib> zze = new zzblg();
    public static final zzblp<zzcib> zzf = new zzblh();
    public static final zzblp<zzcib> zzg = zzblb.zza;
    public static final zzblp<Object> zzh = new zzbli();
    public static final zzblp<zzcib> zzi = new zzblj();
    public static final zzblp<zzcib> zzj = zzblc.zza;
    public static final zzblp<zzcib> zzk = new zzblk();
    public static final zzblp<zzcib> zzl = new zzbll();
    public static final zzblp<zzceu> zzm = new zzcgh();
    public static final zzblp<zzceu> zzn = new zzcgi();
    public static final zzblp<zzcib> zzo = new zzbkt();
    public static final zzbmd zzp = new zzbmd();
    public static final zzblp<zzcib> zzq = new zzblm();
    public static final zzblp<zzcib> zzr = new zzbln();
    public static final zzblp<zzcib> zzs = new zzbld();
    public static final zzblp<zzcib> zzt = new zzble();

    public static zzfla<String> zza(zzcib zzcibVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzfb zzU = zzcibVar.zzU();
            if (zzU != null && zzU.zza(parse)) {
                parse = zzU.zze(parse, zzcibVar.getContext(), zzcibVar.zzH(), zzcibVar.zzj());
            }
        } catch (zzfc unused) {
            com.google.android.gms.ads.internal.util.zze.zzi(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        final String zzb2 = zzcay.zzb(parse, zzcibVar.getContext());
        if (zzbhc.zzf.zze().booleanValue()) {
            return zzfks.zzf(zzfks.zzj(zzfks.zzf(zzfkj.zzw((zzfla) zzcibVar.zzaE()), Throwable.class, zzbkx.zza, zzccz.zzf), new zzfei(zzb2) { // from class: com.google.android.gms.internal.ads.zzbky
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzb2;
                }

                @Override // com.google.android.gms.internal.ads.zzfei
                public final Object apply(Object obj) {
                    String str2 = this.zza;
                    String str3 = (String) obj;
                    zzblp<zzcib> zzblpVar = zzblo.zza;
                    if (str3 != null) {
                        if (zzbhc.zze.zze().booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str2).getHost();
                            for (int i = 0; i < 3; i++) {
                                if (!host.endsWith(strArr[i])) {
                                }
                            }
                        }
                        String zze2 = zzbhc.zza.zze();
                        String zze3 = zzbhc.zzb.zze();
                        if (!TextUtils.isEmpty(zze2)) {
                            str2 = str2.replace(zze2, str3);
                        }
                        if (!TextUtils.isEmpty(zze3)) {
                            Uri parse2 = Uri.parse(str2);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(zze3))) {
                                return parse2.buildUpon().appendQueryParameter(zze3, str3).toString();
                            }
                        }
                    }
                    return str2;
                }
            }, zzccz.zzf), Throwable.class, new zzfei(zzb2) { // from class: com.google.android.gms.internal.ads.zzbkz
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzb2;
                }

                @Override // com.google.android.gms.internal.ads.zzfei
                public final Object apply(Object obj) {
                    String str2 = this.zza;
                    Throwable th = (Throwable) obj;
                    zzblp<zzcib> zzblpVar = zzblo.zza;
                    if (zzbhc.zzj.zze().booleanValue()) {
                        com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "prepareClickUrl.attestation2");
                    }
                    return str2;
                }
            }, zzccz.zzf);
        }
        return zzfks.zza(zzb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzb(zzcjd zzcjdVar, Map map) {
        PackageManager packageManager = zzcjdVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                String valueOf = String.valueOf(optString7);
                                com.google.android.gms.ads.internal.util.zze.zzg(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e2) {
                            com.google.android.gms.ads.internal.util.zze.zzg("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Error parsing the intent data.", e3);
                    }
                }
                ((zzbog) zzcjdVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbog) zzcjdVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbog) zzcjdVar).zzd("openableIntents", new JSONObject());
        }
    }
}
