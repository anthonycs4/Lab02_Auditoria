package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeko implements zzeld<zzekp> {
    private final zzcaw zza;
    private final zzflb zzb;
    private final Context zzc;

    public zzeko(zzcaw zzcawVar, zzflb zzflbVar, Context context) {
        this.zza = zzcawVar;
        this.zzb = zzflbVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzekp> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzekn
            private final zzeko zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzekp zzb() throws Exception {
        if (!this.zza.zzb(this.zzc)) {
            return new zzekp(null, null, null, null, null);
        }
        String zzj = this.zza.zzj(this.zzc);
        String str = zzj == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzj;
        String zzk = this.zza.zzk(this.zzc);
        String str2 = zzk == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzk;
        String zzl = this.zza.zzl(this.zzc);
        String str3 = zzl == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl;
        String zzm = this.zza.zzm(this.zzc);
        return new zzekp(str, str2, str3, zzm == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzm, "TIME_OUT".equals(str2) ? (Long) zzbba.zzc().zzb(zzbfq.zzaa) : null);
    }
}
