package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcet {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;
    public final boolean zzl;
    public final boolean zzm;

    public zzcet(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbfq.zzD);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbfq.zzj);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbfq.zzr);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbfq.zzf);
        zzbfi<String> zzbfiVar = zzbfq.zze;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = string;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbfq.zzg);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbfq.zzh);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbfq.zzi);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbfq.zzk);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbfq.zzcy);
            this.zzk = zzb(jSONObject, "min_retry_count", zzbfq.zzl);
            this.zzl = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbfq.zzo);
            this.zzm = zza(jSONObject, "using_official_exo_player", zzbfq.zzbk);
        }
        string = (String) zzbba.zzc().zzb(zzbfiVar);
        this.zze = string;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbfq.zzg);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbfq.zzh);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbfq.zzi);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbfq.zzk);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbfq.zzcy);
        this.zzk = zzb(jSONObject, "min_retry_count", zzbfq.zzl);
        this.zzl = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbfq.zzo);
        this.zzm = zza(jSONObject, "using_official_exo_player", zzbfq.zzbk);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbfi<Boolean> zzbfiVar) {
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfiVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbfi<Integer> zzbfiVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzbba.zzc().zzb(zzbfiVar)).intValue();
    }
}
