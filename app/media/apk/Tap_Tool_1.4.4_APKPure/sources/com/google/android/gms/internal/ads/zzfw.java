package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfw implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzfy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfw(zzfy zzfyVar, int i, boolean z) {
        this.zzb = zzfyVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdc zzdcVar;
        zzfy zzfyVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzfyVar.zza.getPackageManager().getPackageInfo(zzfyVar.zza.getPackageName(), 0);
            Context context = zzfyVar.zza;
            zzdcVar = zzfbj.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzdcVar = null;
        }
        this.zzb.zzm = zzdcVar;
        if (this.zza < 4) {
            if (zzdcVar != null && zzdcVar.zza() && !zzdcVar.zzc().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzdcVar.zzg() && zzdcVar.zzh().zza() && zzdcVar.zzh().zzc() != -2) {
                return;
            }
            this.zzb.zzq(this.zza + 1, true);
        }
    }
}
