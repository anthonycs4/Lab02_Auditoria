package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfjw extends zzfju {
    private zzfjw() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfjw(zzfjt zzfjtVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfju
    public final void zza(zzfjx zzfjxVar, Set<Throwable> set, Set<Throwable> set2) {
        Set set3;
        synchronized (zzfjxVar) {
            set3 = zzfjxVar.seenExceptions;
            if (set3 == null) {
                zzfjxVar.seenExceptions = set2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfju
    public final int zzb(zzfjx zzfjxVar) {
        int zzH;
        synchronized (zzfjxVar) {
            zzH = zzfjx.zzH(zzfjxVar);
        }
        return zzH;
    }
}
