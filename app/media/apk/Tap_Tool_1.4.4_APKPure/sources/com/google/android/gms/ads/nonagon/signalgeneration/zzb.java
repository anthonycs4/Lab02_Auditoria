package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzb {
    private final int zza = ((Integer) zzbba.zzc().zzb(zzbfq.zzfa)).intValue();
    private final long zzb = ((Long) zzbba.zzc().zzb(zzbfq.zzfb)).longValue();
    private final Map<String, Pair<Long, String>> zzc = Collections.synchronizedMap(new zza(this));

    private final void zzd() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.zzc.entrySet().iterator();
            while (it.hasNext() && currentTimeMillis - ((Long) it.next().getValue().first).longValue() > this.zzb) {
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized void zza(String str, String str2) {
        this.zzc.put(str, new Pair<>(Long.valueOf(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()), str2));
        zzd();
    }

    public final synchronized String zzb(String str) {
        Pair<Long, String> pair = this.zzc.get(str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zzc.remove(str);
            return str2;
        }
        return null;
    }
}
