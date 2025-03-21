package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaz {
    public static zzl zza(zzy zzyVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzyVar.zzc;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long zzb = str != null ? zzb(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long zzb2 = str3 != null ? zzb(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long zzb3 = str4 != null ? zzb(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zzb <= 0 || zzb2 < zzb) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zzb2 - zzb);
                j3 = j4;
            }
        }
        zzl zzlVar = new zzl();
        zzlVar.zza = zzyVar.zzb;
        zzlVar.zzb = str5;
        zzlVar.zzf = j4;
        zzlVar.zze = j3;
        zzlVar.zzc = zzb;
        zzlVar.zzd = zzb3;
        zzlVar.zzg = map;
        zzlVar.zzh = zzyVar.zzd;
        return zzlVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzao.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzao.zzd(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
