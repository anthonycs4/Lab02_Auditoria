package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzfla;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        if (zzccm.zzk(context) && !zzccm.zzi()) {
            zzfla<?> zzb = new zzc(context).zzb();
            zze.zzh("Updating ad debug logging enablement.");
            zzcdc.zza(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
