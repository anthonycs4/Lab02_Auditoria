package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdsm implements com.google.android.gms.ads.internal.overlay.zzo, zzcjn {
    private final Context zza;
    private final zzcct zzb;
    private zzdsf zzc;
    private zzcib zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzbcx zzh;
    private boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsm(Context context, zzcct zzcctVar) {
        this.zza = context;
        this.zzb = zzcctVar;
    }

    private final synchronized boolean zzi(zzbcx zzbcxVar) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector had an internal error.");
            try {
                zzbcxVar.zze(zzeuf.zzd(15, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector had an internal error.");
            try {
                zzbcxVar.zze(zzeuf.zzd(15, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() >= this.zzg + ((Integer) zzbba.zzc().zzb(zzbfq.zzfX)).intValue()) {
                    return true;
                }
            }
            com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector cannot be opened because it is already open.");
            try {
                zzbcxVar.zze(zzeuf.zzd(18, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    private final synchronized void zzj() {
        if (this.zze && this.zzf) {
            zzccz.zze.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdsl
                private final zzdsm zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjn
    public final synchronized void zza(boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzj();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector failed to load.");
        try {
            zzbcx zzbcxVar = this.zzh;
            if (zzbcxVar != null) {
                zzbcxVar.zze(zzeuf.zzd(16, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbD(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            zzbcx zzbcxVar = this.zzh;
            if (zzbcxVar != null) {
                try {
                    zzbcxVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        this.zzf = true;
        zzj();
    }

    public final void zzf(zzdsf zzdsfVar) {
        this.zzc = zzdsfVar;
    }

    public final synchronized void zzg(zzbcx zzbcxVar, zzblq zzblqVar) {
        if (zzi(zzbcxVar)) {
            try {
                com.google.android.gms.ads.internal.zzs.zzd();
                zzcib zza = zzcin.zza(this.zza, zzcjr.zzb(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, null, null, this.zzb, null, null, null, zzavg.zza(), null, null);
                this.zzd = zza;
                zzcjp zzR = zza.zzR();
                if (zzR == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        zzbcxVar.zze(zzeuf.zzd(16, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.zzh = zzbcxVar;
                zzR.zzM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzblqVar);
                zzR.zzw(this);
                this.zzd.loadUrl((String) zzbba.zzc().zzb(zzbfq.zzfV));
                com.google.android.gms.ads.internal.zzs.zzb();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
            } catch (zzcim e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzbcxVar.zze(zzeuf.zzd(16, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzb("window.inspectorInfo", this.zzc.zzm().toString());
    }
}
