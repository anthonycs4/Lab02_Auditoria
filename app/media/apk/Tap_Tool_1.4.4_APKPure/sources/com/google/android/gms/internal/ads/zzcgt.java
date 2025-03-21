package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgt implements zzblp<zzceu> {
    private static final Integer zzb(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
                sb.append("Precache invalid numeric parameter '");
                sb.append(str);
                sb.append("': ");
                sb.append(str2);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzceu zzceuVar, Map map) {
        zzcgs zzcgsVar;
        zzceu zzceuVar2 = zzceuVar;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
        com.google.android.gms.ads.internal.zzs.zzy();
        if (map.containsKey("abort")) {
            if (zzcgl.zzd(zzceuVar2)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzi(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzcgl.zzc(zzceuVar2) != null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Precache task is already running.");
                return;
            } else if (zzceuVar2.zzk() == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Precache requires a dependency provider.");
                return;
            } else {
                zzcet zzcetVar = new zzcet((String) map.get("flags"));
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzceuVar2.zzo(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzceuVar2.zzB(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzceuVar2.zzC(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzcgf zzcgfVar = zzceuVar2.zzk().zzc;
                if (intValue <= 0) {
                    zzcgsVar = new zzcgv(zzceuVar2);
                } else {
                    int zzQ = zzcel.zzQ();
                    if (zzQ < zzcetVar.zzh) {
                        zzcgsVar = new zzcha(zzceuVar2, zzcetVar);
                    } else if (zzQ < zzcetVar.zzb) {
                        zzcgsVar = new zzcgy(zzceuVar2, zzcetVar);
                    } else {
                        zzcgsVar = new zzcgw(zzceuVar2);
                    }
                }
                new zzcgk(zzceuVar2, zzcgsVar, str, strArr).zzb();
            }
        } else {
            zzcgk zzc = zzcgl.zzc(zzceuVar2);
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Precache must specify a source.");
                return;
            }
            zzcgsVar = zzc.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcgsVar.zzd(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcgsVar.zzc(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcgsVar.zze(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcgsVar.zzf(zzb8.intValue());
        }
    }
}
