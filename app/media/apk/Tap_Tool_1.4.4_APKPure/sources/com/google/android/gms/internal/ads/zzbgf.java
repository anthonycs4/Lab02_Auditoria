package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbgf {
    private final List<zzbgc> zza = new LinkedList();
    private final Map<String, String> zzb;
    private final Object zzc;

    public zzbgf(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbgc zzf() {
        return new zzbgc(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime(), null, null);
    }

    public final void zza(zzbgf zzbgfVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbgc zzbgcVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (String str : strArr) {
                this.zza.add(new zzbgc(j, str, zzbgcVar));
            }
        }
        return true;
    }

    public final zzbge zzc() {
        zzbge zzbgeVar;
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbgc zzbgcVar : this.zza) {
                long zza = zzbgcVar.zza();
                String zzb = zzbgcVar.zzb();
                zzbgc zzc = zzbgcVar.zzc();
                if (zzc != null && zza > 0) {
                    sb.append(zzb);
                    sb.append('.');
                    sb.append(zza - zzc.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzc.zza()))) {
                            hashMap.put(Long.valueOf(zzc.zza()), new StringBuilder(zzb));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzc.zza()));
                            sb2.append('+');
                            sb2.append(zzb);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbgeVar = new zzbge(sb.toString(), str);
        }
        return zzbgeVar;
    }

    public final void zzd(String str, String str2) {
        zzbfv zza;
        if (TextUtils.isEmpty(str2) || (zza = com.google.android.gms.ads.internal.zzs.zzg().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbgb zzd = zza.zzd(str);
            Map<String, String> map = this.zzb;
            map.put(str, zzd.zza(map.get(str), str2));
        }
    }

    public final Map<String, String> zze() {
        Map<String, String> map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzs.zzg().zza();
            map = this.zzb;
        }
        return map;
    }
}
