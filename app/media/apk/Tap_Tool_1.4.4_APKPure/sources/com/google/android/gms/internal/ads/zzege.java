package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzege implements zzelc<Bundle> {
    public final Context zza;
    public final zzazx zzb;
    public final List<Parcelable> zzc;

    public zzege(Context context, zzazx zzazxVar, List<Parcelable> list) {
        this.zza = context;
        this.zzb = zzazxVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle2 = bundle;
        if (zzbhf.zza.zze().booleanValue()) {
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.zzs.zzc();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    str = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle3.putString("activity", str);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.zzb.zze);
            bundle4.putInt("height", this.zzb.zzb);
            bundle3.putBundle("size", bundle4);
            if (this.zzc.size() > 0) {
                List<Parcelable> list = this.zzc;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
