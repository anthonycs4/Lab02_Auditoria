package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzboh {
    public static void zza(zzboi zzboiVar, String str, JSONObject jSONObject) {
        zzboiVar.zzb(str, jSONObject.toString());
    }

    public static void zzb(zzboi zzboiVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzboiVar.zza(sb.toString());
    }

    public static void zzc(zzboi zzboiVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zzd(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzboiVar.zza(sb.toString());
    }

    public static void zzd(zzboi zzboiVar, String str, Map map) {
        try {
            zzboiVar.zzd(str, com.google.android.gms.ads.internal.zzs.zzc().zzf(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
    }
}
