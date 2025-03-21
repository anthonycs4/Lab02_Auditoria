package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;
/* compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* loaded from: classes.dex */
public final class zzcc {
    public static zzcb zza(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        if (split.length == 1) {
            str2 = String.valueOf(context.getPackageName()).concat("_preferences");
            str3 = split[0];
        } else {
            if (split.length == 2) {
                str2 = split[0];
                str3 = split[1];
            }
            return null;
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return new zzcb(str2, str3);
        }
        return null;
    }

    public static void zza(Context context, Set<String> set) {
        SharedPreferences.Editor zza;
        zzce zzceVar = new zzce(context);
        for (String str : set) {
            zzcb zza2 = zza(context, str);
            if (zza2 == null) {
                String valueOf = String.valueOf(str);
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "clearKeys: unable to process key: ".concat(valueOf) : new String("clearKeys: unable to process key: "));
            } else {
                zza = zzceVar.zza(zza2.zza);
                zza.remove(zza2.zzb);
            }
        }
        zzceVar.zza();
    }
}
