package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfzp {
    public static final int zza(int i, Object obj, Object obj2) {
        zzfzo zzfzoVar = (zzfzo) obj;
        zzfzn zzfznVar = (zzfzn) obj2;
        if (zzfzoVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzfzoVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzfzo) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzfzo zzfzoVar = (zzfzo) obj;
        zzfzo zzfzoVar2 = (zzfzo) obj2;
        if (!zzfzoVar2.isEmpty()) {
            if (!zzfzoVar.zze()) {
                zzfzoVar = zzfzoVar.zzc();
            }
            zzfzoVar.zzb(zzfzoVar2);
        }
        return zzfzoVar;
    }
}
