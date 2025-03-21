package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzegj implements zzfjz {
    static final zzfjz zza = new zzegj();

    private zzegj() {
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfla zza(Object obj) {
        final String str = (String) obj;
        return zzfks.zza(new zzelc(str) { // from class: com.google.android.gms.internal.ads.zzegk
            private final String zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzelc
            public final void zzd(Object obj2) {
                ((Bundle) obj2).putString("ms", this.zza);
            }
        });
    }
}
