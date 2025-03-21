package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzawy;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzz extends zzy {
    @Override // com.google.android.gms.ads.internal.util.zzac
    public final zzawy zzq(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzs.zzc();
        if (zzr.zzE(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzawy.ENUM_TRUE : zzawy.ENUM_FALSE;
        }
        return zzawy.ENUM_FALSE;
    }
}
