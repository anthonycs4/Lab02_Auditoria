package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzehg implements zzfei {
    static final zzfei zza = new zzehg();

    private zzehg() {
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzelc(arrayList) { // from class: com.google.android.gms.internal.ads.zzehh
            private final ArrayList zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzelc
            public final void zzd(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.zza);
            }
        };
    }
}
