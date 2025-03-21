package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzela;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzq {
    private final Context zza;
    private final String zzb;
    private final Map<String, String> zzc = new TreeMap();
    private String zzd;
    private String zze;

    public zzq(Context context, String str) {
        this.zza = context.getApplicationContext();
        this.zzb = str;
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map<String, String> zzd() {
        return this.zzc;
    }

    public final void zze(zzazs zzazsVar, zzcct zzcctVar) {
        this.zzd = zzazsVar.zzj.zza;
        Bundle bundle = zzazsVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String zze = zzbgu.zzc.zze();
        for (String str : bundle2.keySet()) {
            if (zze.equals(str)) {
                this.zze = bundle2.getString(str);
            } else if (str.startsWith("csa_")) {
                this.zzc.put(str.substring(4), bundle2.getString(str));
            }
        }
        this.zzc.put("SDKVersion", zzcctVar.zza);
        if (zzbgu.zza.zze().booleanValue()) {
            try {
                Bundle zzb = zzela.zzb(this.zza, new JSONArray(zzbgu.zzb.zze()));
                for (String str2 : zzb.keySet()) {
                    this.zzc.put(str2, zzb.get(str2).toString());
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }
}
