package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzasz implements Runnable {
    final /* synthetic */ zzata zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasz(zzata zzataVar) {
        this.zza = zzataVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzatb> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            z = this.zza.zzd;
            if (z) {
                z2 = this.zza.zze;
                if (z2) {
                    zzata.zzi(this.zza, false);
                    com.google.android.gms.ads.internal.util.zze.zzd("App went background");
                    list = this.zza.zzf;
                    for (zzatb zzatbVar : list) {
                        try {
                            zzatbVar.zza(false);
                        } catch (Exception e) {
                            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.zze.zzd("App is still foreground");
        }
    }
}
