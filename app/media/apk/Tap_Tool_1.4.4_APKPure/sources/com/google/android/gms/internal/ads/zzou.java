package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzou {
    public final int zza;
    public final zzaaj zzb;
    private final CopyOnWriteArrayList<zzot> zzc;

    public zzou() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzou(CopyOnWriteArrayList<zzot> copyOnWriteArrayList, int i, zzaaj zzaajVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzaajVar;
    }

    public final zzou zza(int i, zzaaj zzaajVar) {
        return new zzou(this.zzc, i, zzaajVar);
    }

    public final void zzb(Handler handler, zzov zzovVar) {
        this.zzc.add(new zzot(handler, zzovVar));
    }
}
