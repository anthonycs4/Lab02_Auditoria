package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejs implements zzeld<zzejt> {
    private final zzflb zza;
    private final Context zzb;
    private final Set<String> zzc;

    public zzejs(zzflb zzflbVar, Context context, Set<String> set) {
        this.zza = zzflbVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzejt> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzejr
            private final zzejs zza;

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
    public final /* synthetic */ zzejt zzb() throws Exception {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue()) {
            Set<String> set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                return new zzejt(com.google.android.gms.ads.internal.zzs.zzr().zzc(this.zzb));
            }
        }
        return new zzejt(null);
    }
}
