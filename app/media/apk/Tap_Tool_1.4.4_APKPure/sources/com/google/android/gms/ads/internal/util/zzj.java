package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzfla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private zzfla<?> zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List<Runnable> zzc = new ArrayList();
    private zzath zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private zzcbu zzl = new zzcbu(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
    private long zzm = 0;
    private long zzn = 0;
    private int zzo = -1;
    private int zzp = 0;
    private Set<String> zzq = Collections.emptySet();
    private JSONObject zzr = new JSONObject();
    private boolean zzs = true;
    private boolean zzt = true;
    private String zzu = null;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private boolean zzw = false;
    private String zzx = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzy = -1;
    private int zzz = -1;
    private long zzA = 0;

    private final void zzM() {
        zzfla<?> zzflaVar = this.zzd;
        if (zzflaVar == null || zzflaVar.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zze.zzj("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zze.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zze.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zze.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzN() {
        zzccz.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzi
            private final zzj zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(boolean z) {
        zzM();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzB() {
        boolean z;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzao)).booleanValue()) {
            zzM();
            synchronized (this.zza) {
                z = this.zzk;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(int i) {
        zzM();
        synchronized (this.zza) {
            if (this.zzz == i) {
                return;
            }
            this.zzz = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzD() {
        long j;
        zzM();
        synchronized (this.zza) {
            j = this.zzA;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(long j) {
        zzM();
        synchronized (this.zza) {
            if (this.zzA == j) {
                return;
            }
            this.zzA = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzF() {
        String str;
        zzM();
        synchronized (this.zza) {
            str = this.zzv;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue()) {
            zzM();
            synchronized (this.zza) {
                if (this.zzv.equals(str)) {
                    return;
                }
                this.zzv = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzN();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzH() {
        boolean z;
        zzM();
        synchronized (this.zza) {
            z = this.zzw;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(boolean z) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue()) {
            zzM();
            synchronized (this.zza) {
                if (this.zzw == z) {
                    return;
                }
                this.zzw = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.zzg.apply();
                }
                zzN();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzJ() {
        String str;
        zzM();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue()) {
            zzM();
            synchronized (this.zza) {
                if (this.zzx.equals(str)) {
                    return;
                }
                this.zzx = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzN();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = edit;
            if (PlatformVersion.isAtLeastM()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzs = this.zzf.getBoolean("content_url_opted_out", this.zzs);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzt = this.zzf.getBoolean("content_vertical_opted_out", this.zzt);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzp = this.zzf.getInt("version_code", this.zzp);
            this.zzl = new zzcbu(this.zzf.getString("app_settings_json", this.zzl.zzd()), this.zzf.getLong("app_settings_last_update_ms", this.zzl.zzb()));
            this.zzm = this.zzf.getLong("app_last_background_time_ms", this.zzm);
            this.zzo = this.zzf.getInt("request_in_session_count", this.zzo);
            this.zzn = this.zzf.getLong("first_ad_req_time_ms", this.zzn);
            this.zzq = this.zzf.getStringSet("never_pool_slots", this.zzq);
            this.zzu = this.zzf.getString("display_cutout", this.zzu);
            this.zzy = this.zzf.getInt("app_measurement_npa", this.zzy);
            this.zzz = this.zzf.getInt("sd_app_measure_npa", this.zzz);
            this.zzA = this.zzf.getLong("sd_app_measure_npa_ts", this.zzA);
            this.zzv = this.zzf.getString("inspector_info", this.zzv);
            this.zzw = this.zzf.getBoolean("linked_device", this.zzw);
            this.zzx = this.zzf.getString("linked_ad_unit", this.zzx);
            try {
                this.zzr = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zze.zzj("Could not convert native advanced settings to json object", e);
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zza(final Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            this.zzd = zzccz.zza.zza(new Runnable(this, context, "admob") { // from class: com.google.android.gms.ads.internal.util.zzh
                private final zzj zza;
                private final Context zzb;
                private final String zzc = "admob";

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzL(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzath zzb() {
        if (this.zzb) {
            if (!(zzd() && zzh()) && zzbgx.zzb.zze().booleanValue()) {
                synchronized (this.zza) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.zze == null) {
                        this.zze = new zzath();
                    }
                    this.zze.zza();
                    zze.zzh("start fetching content...");
                    return this.zze;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzc(boolean z) {
        zzM();
        synchronized (this.zza) {
            if (this.zzs == z) {
                return;
            }
            this.zzs = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzd() {
        boolean z;
        zzM();
        synchronized (this.zza) {
            z = this.zzs;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zze(String str) {
        zzM();
        synchronized (this.zza) {
            if (str.equals(this.zzi)) {
                return;
            }
            this.zzi = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzf() {
        String str;
        zzM();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzg(boolean z) {
        zzM();
        synchronized (this.zza) {
            if (this.zzt == z) {
                return;
            }
            this.zzt = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzh() {
        boolean z;
        zzM();
        synchronized (this.zza) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzi(String str) {
        zzM();
        synchronized (this.zza) {
            if (str.equals(this.zzj)) {
                return;
            }
            this.zzj = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzM();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzk(int i) {
        zzM();
        synchronized (this.zza) {
            if (this.zzp == i) {
                return;
            }
            this.zzp = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzl() {
        int i;
        zzM();
        synchronized (this.zza) {
            i = this.zzp;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzm(String str) {
        zzM();
        synchronized (this.zza) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
            if (str != null && !str.equals(this.zzl.zzd())) {
                this.zzl = new zzcbu(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzN();
                for (Runnable runnable : this.zzc) {
                    runnable.run();
                }
                return;
            }
            this.zzl.zza(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcbu zzn() {
        zzcbu zzcbuVar;
        zzM();
        synchronized (this.zza) {
            zzcbuVar = this.zzl;
        }
        return zzcbuVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(long j) {
        zzM();
        synchronized (this.zza) {
            if (this.zzm == j) {
                return;
            }
            this.zzm = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzq() {
        long j;
        zzM();
        synchronized (this.zza) {
            j = this.zzm;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(int i) {
        zzM();
        synchronized (this.zza) {
            if (this.zzo == i) {
                return;
            }
            this.zzo = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzs() {
        int i;
        zzM();
        synchronized (this.zza) {
            i = this.zzo;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j) {
        zzM();
        synchronized (this.zza) {
            if (this.zzn == j) {
                return;
            }
            this.zzn = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzu() {
        long j;
        zzM();
        synchronized (this.zza) {
            j = this.zzn;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str, String str2, boolean z) {
        zzM();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzr.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzr.put(str, optJSONArray);
            } catch (JSONException e) {
                zze.zzj("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzr.toString());
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzw() {
        JSONObject jSONObject;
        zzM();
        synchronized (this.zza) {
            jSONObject = this.zzr;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx() {
        zzM();
        synchronized (this.zza) {
            this.zzr = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzN();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzy() {
        String str;
        zzM();
        synchronized (this.zza) {
            str = this.zzu;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(String str) {
        zzM();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzu, str)) {
                return;
            }
            this.zzu = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzN();
        }
    }
}
