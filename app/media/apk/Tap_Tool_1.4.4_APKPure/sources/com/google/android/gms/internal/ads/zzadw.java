package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadw {
    private final CopyOnWriteArrayList<zzadv> zza = new CopyOnWriteArrayList<>();

    public final void zza(final int i, final long j, final long j2) {
        Iterator<zzadv> it = this.zza.iterator();
        while (it.hasNext()) {
            final zzadv next = it.next();
            zzadv.zza(next);
            zzadv.zzb(next).post(new Runnable(next, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzadu
                private final zzadv zza;
                private final int zzb;
                private final long zzc;
                private final long zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = next;
                    this.zzb = i;
                    this.zzc = j;
                    this.zzd = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzadv zzadvVar = this.zza;
                    int i2 = this.zzb;
                    long j3 = this.zzc;
                    long j4 = this.zzd;
                    zzadv.zzc(zzadvVar);
                    zzlr.zzm(i2, j3, j4);
                }
            });
        }
    }
}
