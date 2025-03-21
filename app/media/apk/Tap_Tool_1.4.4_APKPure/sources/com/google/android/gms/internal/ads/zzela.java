package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzela implements zzeld<zzelc<Bundle>> {
    private final zzflb zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzela(zzflb zzflbVar, Context context) {
        this.zza = zzflbVar;
        this.zzb = context;
    }

    public static Bundle zzb(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelc<Bundle>> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeky
            private final zzela zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzelc zzc() throws Exception {
        String str = (String) zzbba.zzc().zzb(zzbfq.zzen);
        if (!TextUtils.isEmpty(str)) {
            try {
                final Bundle zzb = zzb(this.zzb, new JSONArray(str));
                return new zzelc(zzb) { // from class: com.google.android.gms.internal.ads.zzekz
                    private final Bundle zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzb;
                    }

                    @Override // com.google.android.gms.internal.ads.zzelc
                    public final void zzd(Object obj) {
                        ((Bundle) obj).putBundle("shared_pref", this.zza);
                    }
                };
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zze("JSON parsing error", e);
            }
        }
        return null;
    }
}
