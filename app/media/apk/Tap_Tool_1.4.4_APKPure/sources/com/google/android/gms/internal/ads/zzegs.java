package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzegs implements zzeld<zzelc<Bundle>> {
    private final Set<String> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegs(Set<String> set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelc<Bundle>> zza() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzfks.zza(new zzelc(arrayList) { // from class: com.google.android.gms.internal.ads.zzegr
            private final ArrayList zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzelc
            public final void zzd(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zza);
            }
        });
    }
}
