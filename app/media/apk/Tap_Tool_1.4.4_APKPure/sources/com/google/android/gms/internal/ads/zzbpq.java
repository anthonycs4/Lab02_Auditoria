package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.work.WorkRequest;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbpq {
    private final Context zzb;
    private final String zzc;
    private final zzcct zzd;
    private final com.google.android.gms.ads.internal.util.zzbd<zzbol> zze;
    private final com.google.android.gms.ads.internal.util.zzbd<zzbol> zzf;
    private zzbpp zzg;
    private final Object zza = new Object();
    private int zzh = 1;

    public zzbpq(Context context, zzcct zzcctVar, String str, com.google.android.gms.ads.internal.util.zzbd<zzbol> zzbdVar, com.google.android.gms.ads.internal.util.zzbd<zzbol> zzbdVar2) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcctVar;
        this.zze = zzbdVar;
        this.zzf = zzbdVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbpp zza(zzfb zzfbVar) {
        final zzbpp zzbppVar = new zzbpp(this.zzf);
        zzccz.zze.execute(new Runnable(this, null, zzbppVar) { // from class: com.google.android.gms.internal.ads.zzbov
            private final zzbpq zza;
            private final zzbpp zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbppVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(null, this.zzb);
            }
        });
        zzbppVar.zze(new zzbpf(this, zzbppVar), new zzbpg(this, zzbppVar));
        return zzbppVar;
    }

    public final zzbpk zzb(zzfb zzfbVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbpp zzbppVar = this.zzg;
                if (zzbppVar != null && this.zzh == 0) {
                    zzbppVar.zze(new zzcdi(this) { // from class: com.google.android.gms.internal.ads.zzbow
                        private final zzbpq zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcdi
                        public final void zza(Object obj) {
                            this.zza.zzc((zzbol) obj);
                        }
                    }, zzbox.zza);
                }
            }
            zzbpp zzbppVar2 = this.zzg;
            if (zzbppVar2 != null && zzbppVar2.zzh() != -1) {
                int i = this.zzh;
                if (i == 0) {
                    return this.zzg.zza();
                } else if (i != 1) {
                    return this.zzg.zza();
                } else {
                    this.zzh = 2;
                    zza(null);
                    return this.zzg.zza();
                }
            }
            this.zzh = 2;
            zzbpp zza = zza(null);
            this.zzg = zza;
            return zza.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbol zzbolVar) {
        if (zzbolVar.zzj()) {
            this.zzh = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfb zzfbVar, final zzbpp zzbppVar) {
        try {
            final zzbot zzbotVar = new zzbot(this.zzb, this.zzd, null, null);
            zzbotVar.zzh(new zzbok(this, zzbppVar, zzbotVar) { // from class: com.google.android.gms.internal.ads.zzboy
                private final zzbpq zza;
                private final zzbpp zzb;
                private final zzbol zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzbppVar;
                    this.zzc = zzbotVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbok
                public final void zza() {
                    final zzbpq zzbpqVar = this.zza;
                    final zzbpp zzbppVar2 = this.zzb;
                    final zzbol zzbolVar = this.zzc;
                    com.google.android.gms.ads.internal.util.zzr.zza.postDelayed(new Runnable(zzbpqVar, zzbppVar2, zzbolVar) { // from class: com.google.android.gms.internal.ads.zzboz
                        private final zzbpq zza;
                        private final zzbpp zzb;
                        private final zzbol zzc;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzbpqVar;
                            this.zzb = zzbppVar2;
                            this.zzc = zzbolVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(this.zzb, this.zzc);
                        }
                    }, WorkRequest.MIN_BACKOFF_MILLIS);
                }
            });
            zzbotVar.zzl("/jsLoaded", new zzbpb(this, zzbppVar, zzbotVar));
            com.google.android.gms.ads.internal.util.zzcb zzcbVar = new com.google.android.gms.ads.internal.util.zzcb();
            zzbpc zzbpcVar = new zzbpc(this, null, zzbotVar, zzcbVar);
            zzcbVar.zzb(zzbpcVar);
            zzbotVar.zzl("/requestReload", zzbpcVar);
            if (this.zzc.endsWith(".js")) {
                zzbotVar.zzc(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbotVar.zzg(this.zzc);
            } else {
                zzbotVar.zzf(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzr.zza.postDelayed(new zzbpe(this, zzbppVar, zzbotVar), 60000L);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzs.zzg().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbppVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbpp zzbppVar, zzbol zzbolVar) {
        synchronized (this.zza) {
            if (zzbppVar.zzh() != -1 && zzbppVar.zzh() != 1) {
                zzbppVar.zzg();
                zzccz.zze.execute(zzbpa.zza(zzbolVar));
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
