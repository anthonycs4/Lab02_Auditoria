package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgh implements zzblp<zzceu> {
    private boolean zza;

    private static int zzb(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                zzbay.zza();
                i = zzccg.zzs(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return i;
    }

    private static void zzc(zzcei zzceiVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzceiVar.zzw(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzceiVar.zzx(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzceiVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzceiVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzceiVar.zzA(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzceu zzceuVar, Map map) {
        int min;
        int min2;
        int i;
        String[] split;
        zzceu zzceuVar2 = zzceuVar;
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Action missing from video GMSG.");
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzceuVar2.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzceuVar2.zzw(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.zze.zzi("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzceuVar2.zze("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzci.zza(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzceuVar2.zze("onVideoEvent", hashMap3);
                return;
            }
            zzcej zzf = zzceuVar2.zzf();
            if (zzf == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = zzceuVar2.getContext();
                int zzb = zzb(context, map, "x", 0);
                int zzb2 = zzb(context, map, "y", 0);
                int zzb3 = zzb(context, map, "w", -1);
                if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzch)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        int zzz = zzceuVar2.zzz();
                        StringBuilder sb2 = new StringBuilder(110);
                        sb2.append("Calculate width with original width ");
                        sb2.append(zzb3);
                        sb2.append(", videoHost.getVideoBoundingWidth() ");
                        sb2.append(zzz);
                        sb2.append(", x ");
                        sb2.append(zzb);
                        sb2.append(".");
                        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                    }
                    min = Math.min(zzb3, zzceuVar2.zzz() - zzb);
                } else if (zzb3 == -1) {
                    min = zzceuVar2.zzz();
                } else {
                    min = Math.min(zzb3, zzceuVar2.zzz());
                }
                int i2 = min;
                int zzb4 = zzb(context, map, "h", -1);
                if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzch)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        int zzy = zzceuVar2.zzy();
                        StringBuilder sb3 = new StringBuilder(113);
                        sb3.append("Calculate height with original height ");
                        sb3.append(zzb4);
                        sb3.append(", videoHost.getVideoBoundingHeight() ");
                        sb3.append(zzy);
                        sb3.append(", y ");
                        sb3.append(zzb2);
                        sb3.append(".");
                        com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                    }
                    min2 = Math.min(zzb4, zzceuVar2.zzy() - zzb2);
                } else if (zzb4 == -1) {
                    min2 = zzceuVar2.zzy();
                } else {
                    min2 = Math.min(zzb4, zzceuVar2.zzy());
                }
                int i3 = min2;
                try {
                    i = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                    i = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || zzf.zzc() != null) {
                    zzf.zza(zzb, zzb2, i2, i3);
                    return;
                }
                zzf.zzb(zzb, zzb2, i2, i3, i, parseBoolean, new zzcet((String) map.get("flags")));
                zzcei zzc = zzf.zzc();
                if (zzc != null) {
                    zzc(zzc, map);
                    return;
                }
                return;
            }
            zzcix zzh = zzceuVar2.zzh();
            if (zzh != null) {
                if ("timeupdate".equals(str)) {
                    String str6 = (String) map.get("currentTime");
                    if (str6 == null) {
                        com.google.android.gms.ads.internal.util.zze.zzi("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzh.zzd(Float.parseFloat(str6));
                        return;
                    } catch (NumberFormatException unused4) {
                        com.google.android.gms.ads.internal.util.zze.zzi(str6.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    zzh.zzr();
                    return;
                }
            }
            zzcei zzc2 = zzf.zzc();
            if (zzc2 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
                zzceuVar2.zze("onVideoEvent", hashMap4);
            } else if ("click".equals(str)) {
                Context context2 = zzceuVar2.getContext();
                int zzb5 = zzb(context2, map, "x", 0);
                int zzb6 = zzb(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
                zzc2.zzB(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str7 = (String) map.get("time");
                if (str7 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zzc2.zzs((int) (Float.parseFloat(str7) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    com.google.android.gms.ads.internal.util.zze.zzi(str7.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str7) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                zzc2.setVisibility(4);
            } else if ("load".equals(str)) {
                zzc2.zzp();
            } else if ("loadControl".equals(str)) {
                zzc(zzc2, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    zzc2.zzt();
                } else {
                    zzc2.zzu();
                }
            } else if ("pause".equals(str)) {
                zzc2.zzq();
            } else if ("play".equals(str)) {
                zzc2.zzr();
            } else if ("show".equals(str)) {
                zzc2.setVisibility(0);
            } else if ("src".equals(str)) {
                String str8 = (String) map.get("src");
                Integer num = null;
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        String str9 = (String) map.get("periodicReportIntervalMs");
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str9).length() + 65);
                        sb4.append("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ");
                        sb4.append(str9);
                        com.google.android.gms.ads.internal.util.zze.zzi(sb4.toString());
                    }
                }
                String[] strArr = {str8};
                String str10 = (String) map.get("demuxed");
                if (str10 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str10);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            strArr2[i4] = jSONArray.getString(i4);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        com.google.android.gms.ads.internal.util.zze.zzi(str10.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str10) : new String("Malformed demuxed URL list for playback: "));
                        strArr = new String[]{str8};
                    }
                }
                if (num != null) {
                    zzceuVar2.zzo(num.intValue());
                }
                zzc2.zzn(str8, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = zzceuVar2.getContext();
                zzc2.zzo(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzceuVar2.zzl();
                this.zza = true;
            } else if ("volume".equals(str)) {
                String str11 = (String) map.get("volume");
                if (str11 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zzc2.zzv(Float.parseFloat(str11));
                } catch (NumberFormatException unused8) {
                    com.google.android.gms.ads.internal.util.zze.zzi(str11.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str11) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                zzc2.zzC();
            } else {
                com.google.android.gms.ads.internal.util.zze.zzi(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
            }
        }
    }
}
