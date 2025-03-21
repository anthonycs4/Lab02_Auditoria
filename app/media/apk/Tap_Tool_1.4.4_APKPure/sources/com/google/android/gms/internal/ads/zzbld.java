package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbld implements zzblp<zzcib> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        com.google.android.gms.ads.internal.zzs.zzc();
        DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzr.zzy((WindowManager) zzcibVar2.getContext().getSystemService("window"));
        int i = zzy.widthPixels;
        int i2 = zzy.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcibVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcibVar2.zze("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.zze.zzi("GET LOCATION COMPILED");
    }
}
