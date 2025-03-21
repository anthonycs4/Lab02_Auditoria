package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtx {
    private final zzcjz zza;
    private final Context zzb;
    private final zzcct zzc;
    private final zzetk zzd;
    private final Executor zze;
    private final String zzf;

    public zzdtx(zzcjz zzcjzVar, Context context, zzcct zzcctVar, zzetk zzetkVar, Executor executor, String str) {
        this.zza = zzcjzVar;
        this.zzb = context;
        this.zzc = zzcctVar;
        this.zzd = zzetkVar;
        this.zze = executor;
        this.zzf = str;
    }

    private final zzfla<zzete> zzc(final String str, final String str2) {
        final zzbpu zza = com.google.android.gms.ads.internal.zzs.zzp().zzb(this.zzb, this.zzc).zza("google.afma.response.normalize", zzbqb.zza, zzbqb.zza);
        return zzfks.zzi(zzfks.zzi(zzfks.zzi(zzfks.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzfjz(this, str, str2) { // from class: com.google.android.gms.internal.ads.zzdtu
            private final zzdtx zza;
            private final String zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                String str3 = this.zzb;
                String str4 = this.zzc;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str3);
                jSONObject2.put("base_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                jSONObject2.put("signals", new JSONObject(str4));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzfks.zza(jSONObject);
            }
        }, this.zze), new zzfjz(zza) { // from class: com.google.android.gms.internal.ads.zzdtv
            private final zzbpu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfjz(this) { // from class: com.google.android.gms.internal.ads.zzdtw
            private final zzdtx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze);
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Failed to update the ad types for rendering. ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } catch (JSONException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public final zzfla<zzete> zza() {
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeZ)).booleanValue()) {
                String zzb = this.zza.zzw().zzb(zze(str));
                if (!TextUtils.isEmpty(zzb)) {
                    return zzc(str, zzd(zzb));
                }
            }
        }
        zzazk zzazkVar = this.zzd.zzd.zzs;
        if (zzazkVar == null) {
            return zzfks.zzc(new zzebr(1, "Internal error."));
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeX)).booleanValue()) {
            String zze = zze(zzazkVar.zza);
            String zze2 = zze(zzazkVar.zzb);
            if (TextUtils.isEmpty(zze2) || !zze.equals(zze2)) {
                return zzfks.zzc(new zzebr(14, "Mismatch request IDs."));
            }
        }
        return zzc(zzazkVar.zza, zzd(zzazkVar.zzb));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(JSONObject jSONObject) throws Exception {
        return zzfks.zza(new zzete(new zzetb(this.zzd), zzetd.zza(new StringReader(jSONObject.toString()))));
    }
}
