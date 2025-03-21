package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzasy {
    int zza;
    private final Object zzb = new Object();
    private final List<zzasx> zzc = new LinkedList();

    public final zzasx zza(boolean z) {
        synchronized (this.zzb) {
            zzasx zzasxVar = null;
            if (this.zzc.size() == 0) {
                com.google.android.gms.ads.internal.util.zze.zzd("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzasx zzasxVar2 : this.zzc) {
                    int zzm = zzasxVar2.zzm();
                    if (zzm > i2) {
                        i = i3;
                    }
                    int i4 = zzm > i2 ? zzm : i2;
                    if (zzm > i2) {
                        zzasxVar = zzasxVar2;
                    }
                    i3++;
                    i2 = i4;
                }
                this.zzc.remove(i);
                return zzasxVar;
            }
            zzasx zzasxVar3 = this.zzc.get(0);
            if (z) {
                this.zzc.remove(0);
            } else {
                zzasxVar3.zze();
            }
            return zzasxVar3;
        }
    }

    public final boolean zzb(zzasx zzasxVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzasxVar);
        }
    }

    public final boolean zzc(zzasx zzasxVar) {
        synchronized (this.zzb) {
            Iterator<zzasx> it = this.zzc.iterator();
            while (it.hasNext()) {
                zzasx next = it.next();
                if (!com.google.android.gms.ads.internal.zzs.zzg().zzl().zzd()) {
                    if (zzasxVar != next && next.zzb().equals(zzasxVar.zzb())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzs.zzg().zzl().zzh() && zzasxVar != next && next.zzd().equals(zzasxVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzd(zzasx zzasxVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzasxVar.zzn(i);
            zzasxVar.zzj();
            this.zzc.add(zzasxVar);
        }
    }
}
