package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.RequestConfiguration;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcin {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcib] */
    public static final zzcib zza(final Context context, final zzcjr zzcjrVar, final String str, final boolean z, final boolean z2, final zzfb zzfbVar, final zzbgp zzbgpVar, final zzcct zzcctVar, zzbgf zzbgfVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzavg zzavgVar, final zzess zzessVar, final zzesv zzesvVar) throws zzcim {
        zzbfq.zza(context);
        try {
            zzffb zzffbVar = new zzffb(context, zzcjrVar, str, z, z2, zzfbVar, zzbgpVar, zzcctVar, null, zzlVar, zzaVar, zzavgVar, zzessVar, zzesvVar) { // from class: com.google.android.gms.internal.ads.zzcik
                private final Context zza;
                private final zzcjr zzb;
                private final String zzc;
                private final boolean zzd;
                private final boolean zze;
                private final zzfb zzf;
                private final zzbgp zzg;
                private final zzcct zzh;
                private final com.google.android.gms.ads.internal.zzl zzi;
                private final com.google.android.gms.ads.internal.zza zzj;
                private final zzavg zzk;
                private final zzess zzl;
                private final zzesv zzm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = context;
                    this.zzb = zzcjrVar;
                    this.zzc = str;
                    this.zzd = z;
                    this.zze = z2;
                    this.zzf = zzfbVar;
                    this.zzg = zzbgpVar;
                    this.zzh = zzcctVar;
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzavgVar;
                    this.zzl = zzessVar;
                    this.zzm = zzesvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzffb
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcjr zzcjrVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzfb zzfbVar2 = this.zzf;
                    zzbgp zzbgpVar2 = this.zzg;
                    zzcct zzcctVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzavg zzavgVar2 = this.zzk;
                    zzess zzessVar2 = this.zzl;
                    zzesv zzesvVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzciu.zza;
                        zzciq zzciqVar = new zzciq(new zzciu(new zzcjq(context2), zzcjrVar2, str2, z3, z4, zzfbVar2, zzbgpVar2, zzcctVar2, null, zzlVar2, zzaVar2, zzavgVar2, zzessVar2, zzesvVar2));
                        zzciqVar.setWebViewClient(com.google.android.gms.ads.internal.zzs.zze().zzl(zzciqVar, zzavgVar2, z4));
                        zzciqVar.setWebChromeClient(new zzcia(zzciqVar));
                        return zzciqVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzffbVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzcim("Webview initialization failed.", th);
        }
    }

    public static final zzfla<zzcib> zzb(final Context context, final zzcct zzcctVar, final String str, final zzfb zzfbVar, final com.google.android.gms.ads.internal.zza zzaVar) {
        return zzfks.zzi(zzfks.zza(null), new zzfjz(context, zzfbVar, zzcctVar, zzaVar, str) { // from class: com.google.android.gms.internal.ads.zzcij
            private final Context zza;
            private final zzfb zzb;
            private final zzcct zzc;
            private final com.google.android.gms.ads.internal.zza zzd;
            private final String zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = context;
                this.zzb = zzfbVar;
                this.zzc = zzcctVar;
                this.zzd = zzaVar;
                this.zze = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                Context context2 = this.zza;
                zzfb zzfbVar2 = this.zzb;
                zzcct zzcctVar2 = this.zzc;
                com.google.android.gms.ads.internal.zza zzaVar2 = this.zzd;
                String str2 = this.zze;
                com.google.android.gms.ads.internal.zzs.zzd();
                zzcib zza = zzcin.zza(context2, zzcjr.zzb(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, zzfbVar2, null, zzcctVar2, null, null, zzaVar2, zzavg.zza(), null, null);
                final zzcdd zza2 = zzcdd.zza(zza);
                zza.zzR().zzw(new zzcjn(zza2) { // from class: com.google.android.gms.internal.ads.zzcil
                    private final zzcdd zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zza2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcjn
                    public final void zza(boolean z) {
                        this.zza.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzccz.zze);
    }
}
