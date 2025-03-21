package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeto {
    public static zzest zza(List<zzest> list, zzest zzestVar) {
        return list.get(0);
    }

    public static zzazx zzb(Context context, List<zzest> list) {
        ArrayList arrayList = new ArrayList();
        for (zzest zzestVar : list) {
            if (zzestVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzestVar.zza, zzestVar.zzb));
            }
        }
        return new zzazx(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzest zzc(zzazx zzazxVar) {
        if (zzazxVar.zzi) {
            return new zzest(-3, 0, true);
        }
        return new zzest(zzazxVar.zze, zzazxVar.zzb, false);
    }
}
