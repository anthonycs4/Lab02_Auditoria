package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzata implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List<zzatb> zzf = new ArrayList();
    private final List<zzatp> zzg = new ArrayList();
    private boolean zzi = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzi(zzata zzataVar, boolean z) {
        zzataVar.zzd = false;
        return false;
    }

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator<zzatp> it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzatp zzatpVar : this.zzg) {
                try {
                    zzatpVar.zzb();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                }
            }
        }
        this.zze = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzr.zza.removeCallbacks(this.zzh);
        }
        zzfdx zzfdxVar = com.google.android.gms.ads.internal.util.zzr.zza;
        zzasz zzaszVar = new zzasz(this);
        this.zzh = zzaszVar;
        zzfdxVar.postDelayed(zzaszVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzr.zza.removeCallbacks(this.zzh);
        }
        synchronized (this.zzc) {
            for (zzatp zzatpVar : this.zzg) {
                try {
                    zzatpVar.zzc();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                }
            }
            if (z) {
                for (zzatb zzatbVar : this.zzf) {
                    try {
                        zzatbVar.zza(true);
                    } catch (Exception e2) {
                        zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zzd("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) zzbba.zzc().zzb(zzbfq.zzaD)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzatb zzatbVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzatbVar);
        }
    }

    public final void zzc(zzatb zzatbVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzatbVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }
}
