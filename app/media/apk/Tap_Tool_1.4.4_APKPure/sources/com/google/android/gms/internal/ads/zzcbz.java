package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbz {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzi = new Object();
    int zzg = 0;
    int zzh = 0;

    public zzcbz(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    public final void zza() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzc(zzazs zzazsVar, long j) {
        synchronized (this.zzi) {
            long zzq = this.zzj.zzq();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzq > ((Long) zzbba.zzc().zzb(zzbfq.zzaE)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzs();
                }
                this.zzb = j;
                this.zza = j;
            } else {
                this.zza = j;
            }
            Bundle bundle = zzazsVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i = this.zzd + 1;
            this.zzd = i;
            if (i == 0) {
                this.zze = 0L;
                this.zzj.zzt(currentTimeMillis);
            } else {
                this.zze = currentTimeMillis - this.zzj.zzu();
            }
        }
    }

    public final void zzd() {
        if (zzbhh.zza.zze().booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final Bundle zze(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzi) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzj.zzB() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zzf);
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzbxt.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                com.google.android.gms.ads.internal.util.zze.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Fail to fetch AdActivity theme");
                    com.google.android.gms.ads.internal.util.zze.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }
}
