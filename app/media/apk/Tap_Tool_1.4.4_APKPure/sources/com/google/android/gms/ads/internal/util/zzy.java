package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzccg;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzy extends zzx {
    static final boolean zzp(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final boolean zzo(Activity activity, Configuration configuration) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzda)).booleanValue()) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdc)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            zzbay.zza();
            int zzs = zzccg.zzs(activity, configuration.screenHeightDp);
            int zzs2 = zzccg.zzs(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzs.zzc();
            DisplayMetrics zzy = zzr.zzy((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzy.heightPixels;
            int i2 = zzy.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) zzbba.zzc().zzb(zzbfq.zzcY)).intValue();
            return (zzp(i, zzs + dimensionPixelSize, round) && zzp(i2, zzs2, round)) ? false : true;
        }
        return false;
    }
}
