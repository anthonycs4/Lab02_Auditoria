package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcgx {
    private final ArrayList<zzaqi> zza = new ArrayList<>();
    private long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        Iterator<zzaqi> it = this.zza.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> zze = it.next().zze();
            if (zze != null) {
                for (Map.Entry<String, List<String>> entry : zze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.zzb = Math.max(this.zzb, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzaqi zzaqiVar) {
        this.zza.add(zzaqiVar);
    }
}
