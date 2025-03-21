package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcay {
    public static String zza(String str, Context context, boolean z) {
        String zzl;
        if ((!((Boolean) zzbba.zzc().zzb(zzbfq.zzag)).booleanValue() || z) && com.google.android.gms.ads.internal.zzs.zzA().zzb(context) && !TextUtils.isEmpty(str) && (zzl = com.google.android.gms.ads.internal.zzs.zzA().zzl(context)) != null) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzY)).booleanValue()) {
                String str2 = (String) zzbba.zzc().zzb(zzbfq.zzZ);
                if (str.contains(str2)) {
                    if (com.google.android.gms.ads.internal.zzs.zzc().zzl(str)) {
                        com.google.android.gms.ads.internal.zzs.zzA().zzn(context, zzl);
                        return zzd(str, context).replace(str2, zzl);
                    } else if (com.google.android.gms.ads.internal.zzs.zzc().zzm(str)) {
                        com.google.android.gms.ads.internal.zzs.zzA().zzo(context, zzl);
                        return zzd(str, context).replace(str2, zzl);
                    } else {
                        return str;
                    }
                }
                return str;
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (com.google.android.gms.ads.internal.zzs.zzc().zzl(str)) {
                    com.google.android.gms.ads.internal.zzs.zzA().zzn(context, zzl);
                    return zzc(zzd(str, context), "fbs_aeid", zzl).toString();
                } else if (com.google.android.gms.ads.internal.zzs.zzc().zzm(str)) {
                    com.google.android.gms.ads.internal.zzs.zzA().zzo(context, zzl);
                    return zzc(zzd(str, context), "fbs_aeid", zzl).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzs.zzA().zzb(context)) {
            return uri.toString();
        }
        String zzl = com.google.android.gms.ads.internal.zzs.zzA().zzl(context);
        if (zzl == null) {
            return uri.toString();
        }
        String str = (String) zzbba.zzc().zzb(zzbfq.zzZ);
        String uri2 = uri.toString();
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzY)).booleanValue() || !uri2.contains(str)) {
            if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                String uri3 = zzc(zzd(uri2, context), "fbs_aeid", zzl).toString();
                com.google.android.gms.ads.internal.zzs.zzA().zzn(context, zzl);
                return uri3;
            }
            return uri2;
        }
        com.google.android.gms.ads.internal.zzs.zzA().zzn(context, zzl);
        return zzd(uri2, context).replace(str, zzl);
    }

    static Uri zzc(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    private static String zzd(String str, Context context) {
        String zzj = com.google.android.gms.ads.internal.zzs.zzA().zzj(context);
        String zzk = com.google.android.gms.ads.internal.zzs.zzA().zzk(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzj)) {
            str = zzc(str, "gmp_app_id", zzj).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzk)) ? str : zzc(str, "fbs_aiid", zzk).toString();
    }
}
