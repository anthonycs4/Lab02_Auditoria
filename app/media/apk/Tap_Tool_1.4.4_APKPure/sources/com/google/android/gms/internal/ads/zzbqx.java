package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbqx {
    private static zzbqx zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbqx() {
    }

    public static zzbqx zza() {
        if (zza == null) {
            zza = new zzbqx();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (this.zzb.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.zzbqv
                private final zzbqx zza;
                private final Context zzb;
                private final String zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = context;
                    this.zzc = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.zzb;
                    String str2 = this.zzc;
                    zzbfq.zza(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) zzbba.zzc().zzb(zzbfq.zzac)).booleanValue());
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaj)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((zzcjw) zzccr.zza(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbqw.zza)).zze(ObjectWrapper.wrap(context2), new zzbqu(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                    } catch (RemoteException | zzccq | NullPointerException e) {
                        zzccn.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
