package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbxp extends zzbxq {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbpu<JSONObject, JSONObject> zzd;

    public zzbxp(Context context, zzbpu<JSONObject, JSONObject> zzbpuVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbpuVar;
    }

    public static JSONObject zzb(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcct.zza().zza);
            jSONObject.put("mf", zzbhd.zza.zze());
            jSONObject.put("cl", "374971692");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final zzfla<Void> zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < zzbhd.zzb.zze().longValue()) {
            return zzfks.zza(null);
        }
        return zzfks.zzj(this.zzd.zzb(zzb(this.zzb)), new zzfei(this) { // from class: com.google.android.gms.internal.ads.zzbxo
            private final zzbxp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                this.zza.zzc((JSONObject) obj);
                return null;
            }
        }, zzccz.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzc(JSONObject jSONObject) {
        zzbfq.zzb(this.zzb, 1, jSONObject);
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()).apply();
        return null;
    }
}
