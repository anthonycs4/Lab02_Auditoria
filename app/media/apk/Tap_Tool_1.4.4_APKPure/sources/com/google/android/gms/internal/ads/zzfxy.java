package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfxy {
    static final zzfxy zza = new zzfxy(true);
    private static volatile boolean zzb = false;
    private static volatile zzfxy zzc;
    private static volatile zzfxy zzd;
    private final Map<zzfxx, zzfyk<?, ?>> zze;

    zzfxy() {
        this.zze = new HashMap();
    }

    public static zzfxy zza() {
        zzfxy zzfxyVar = zzc;
        if (zzfxyVar == null) {
            synchronized (zzfxy.class) {
                zzfxyVar = zzc;
                if (zzfxyVar == null) {
                    zzfxyVar = zza;
                    zzc = zzfxyVar;
                }
            }
        }
        return zzfxyVar;
    }

    public final <ContainingType extends zzfzu> zzfyk<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return (zzfyk<ContainingType, ?>) this.zze.get(new zzfxx(containingtype, i));
    }

    zzfxy(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzfxy zzb() {
        zzfxy zzfxyVar = zzd;
        if (zzfxyVar != null) {
            return zzfxyVar;
        }
        synchronized (zzfxy.class) {
            zzfxy zzfxyVar2 = zzd;
            if (zzfxyVar2 != null) {
                return zzfxyVar2;
            }
            zzfxy zzb2 = zzfyg.zzb(zzfxy.class);
            zzd = zzb2;
            return zzb2;
        }
    }
}
