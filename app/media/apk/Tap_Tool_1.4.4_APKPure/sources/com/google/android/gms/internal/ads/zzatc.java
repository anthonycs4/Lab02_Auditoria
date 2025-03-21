package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzatc {
    private final Object zza = new Object();
    private zzata zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzata();
                }
                this.zzb.zza(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zzb(zzatb zzatbVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzata();
            }
            this.zzb.zzb(zzatbVar);
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            zzata zzataVar = this.zzb;
            if (zzataVar != null) {
                return zzataVar.zzd();
            }
            return null;
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            zzata zzataVar = this.zzb;
            if (zzataVar != null) {
                return zzataVar.zze();
            }
            return null;
        }
    }

    public final void zzc(zzatb zzatbVar) {
        synchronized (this.zza) {
            zzata zzataVar = this.zzb;
            if (zzataVar == null) {
                return;
            }
            zzataVar.zzc(zzatbVar);
        }
    }
}
