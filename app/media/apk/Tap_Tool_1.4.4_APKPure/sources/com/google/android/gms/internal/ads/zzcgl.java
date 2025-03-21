package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgl implements Iterable<zzcgk> {
    private final List<zzcgk> zza = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzcgk zzc(zzceu zzceuVar) {
        Iterator<zzcgk> it = com.google.android.gms.ads.internal.zzs.zzy().iterator();
        while (it.hasNext()) {
            zzcgk next = it.next();
            if (next.zza == zzceuVar) {
                return next;
            }
        }
        return null;
    }

    public static final boolean zzd(zzceu zzceuVar) {
        zzcgk zzc = zzc(zzceuVar);
        if (zzc != null) {
            zzc.zzb.zzg();
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzcgk> iterator() {
        return this.zza.iterator();
    }

    public final void zza(zzcgk zzcgkVar) {
        this.zza.add(zzcgkVar);
    }

    public final void zzb(zzcgk zzcgkVar) {
        this.zza.remove(zzcgkVar);
    }
}
