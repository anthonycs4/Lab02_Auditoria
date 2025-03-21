package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehw implements zzeld<zzelc<Bundle>> {
    private final zzepr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehw(zzepr zzeprVar) {
        this.zza = zzeprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelc<Bundle>> zza() {
        zzepr zzeprVar = this.zza;
        zzelc zzelcVar = null;
        if (zzeprVar != null && zzeprVar.zza() != null && !this.zza.zza().isEmpty()) {
            zzelcVar = new zzelc(this) { // from class: com.google.android.gms.internal.ads.zzehv
                private final zzehw zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzelc
                public final void zzd(Object obj) {
                    this.zza.zzb((Bundle) obj);
                }
            };
        }
        return zzfks.zza(zzelcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
