package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzefh implements zzcyp {
    private final AtomicReference<zzbdd> zza = new AtomicReference<>();

    public final void zza(zzbdd zzbddVar) {
        this.zza.set(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzk(final zzazz zzazzVar) {
        zzepy.zza(this.zza, new zzepx(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzefg
            private final zzazz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbdd) obj).zze(this.zza);
            }
        });
    }
}
