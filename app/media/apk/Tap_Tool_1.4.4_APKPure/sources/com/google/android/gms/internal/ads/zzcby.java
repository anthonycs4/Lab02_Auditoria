package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcby {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzccc zzc;
    private boolean zzd;
    private Context zze;
    private zzcct zzf;
    private zzbfv zzg;
    private Boolean zzh;
    private final AtomicInteger zzi;
    private final zzcbx zzj;
    private final Object zzk;
    private zzfla<ArrayList<String>> zzl;

    public zzcby() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzccc(zzbay.zzc(), zzjVar);
        this.zzd = false;
        this.zzg = null;
        this.zzh = null;
        this.zzi = new AtomicInteger(0);
        this.zzj = new zzcbx(null);
        this.zzk = new Object();
    }

    public final zzbfv zza() {
        zzbfv zzbfvVar;
        synchronized (this.zza) {
            zzbfvVar = this.zzg;
        }
        return zzbfvVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzh = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzh;
        }
        return bool;
    }

    public final void zzd() {
        this.zzj.zza();
    }

    public final void zze(Context context, zzcct zzcctVar) {
        zzbfv zzbfvVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcctVar;
                com.google.android.gms.ads.internal.zzs.zzf().zzb(this.zzc);
                this.zzb.zza(this.zze);
                zzbwn.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzs.zzl();
                if (!zzbgy.zzc.zze().booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbfvVar = null;
                } else {
                    zzbfvVar = new zzbfv();
                }
                this.zzg = zzbfvVar;
                if (zzbfvVar != null) {
                    zzcdc.zza(new zzcbw(this).zzb(), "AppState.registerCsiReporter");
                }
                this.zzd = true;
                zzn();
            }
        }
        com.google.android.gms.ads.internal.zzs.zzc().zze(context, zzcctVar.zza);
    }

    public final Resources zzf() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            zzccr.zzb(this.zze).getResources();
            return null;
        } catch (zzccq e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zzg(Throwable th, String str) {
        zzbwn.zzb(this.zze, this.zzf).zzd(th, str);
    }

    public final void zzh(Throwable th, String str) {
        zzbwn.zzb(this.zze, this.zzf).zze(th, str, zzbhj.zzg.zze().floatValue());
    }

    public final void zzi() {
        this.zzi.incrementAndGet();
    }

    public final void zzj() {
        this.zzi.decrementAndGet();
    }

    public final int zzk() {
        return this.zzi.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzl() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final Context zzm() {
        return this.zze;
    }

    public final zzfla<ArrayList<String>> zzn() {
        if (PlatformVersion.isAtLeastJellyBean() && this.zze != null) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzbH)).booleanValue()) {
                synchronized (this.zzk) {
                    zzfla<ArrayList<String>> zzflaVar = this.zzl;
                    if (zzflaVar != null) {
                        return zzflaVar;
                    }
                    zzfla<ArrayList<String>> zzb = zzccz.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcbv
                        private final zzcby zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzp();
                        }
                    });
                    this.zzl = zzb;
                    return zzb;
                }
            }
        }
        return zzfks.zza(new ArrayList());
    }

    public final zzccc zzo() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzp() throws Exception {
        Context zza = zzbxt.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }
}
