package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdrm implements zzfko<String> {
    final /* synthetic */ zzdro zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrm(zzdro zzdroVar) {
        this.zza = zzdroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        long j;
        zzcde zzcdeVar;
        synchronized (this) {
            zzdro.zzl(this.zza, true);
            zzdro zzdroVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
            j = this.zza.zzd;
            zzdroVar.zzu("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzcdeVar = this.zza.zze;
            zzcdeVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(@Nullable String str) {
        long j;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            zzdro.zzl(this.zza, true);
            zzdro zzdroVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
            j = this.zza.zzd;
            zzdroVar.zzu("com.google.android.gms.ads.MobileAds", true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzdrl
                private final zzdrm zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdrm zzdrmVar = this.zza;
                    zzdro.zzq(zzdrmVar.zza, this.zzb);
                }
            });
        }
    }
}
