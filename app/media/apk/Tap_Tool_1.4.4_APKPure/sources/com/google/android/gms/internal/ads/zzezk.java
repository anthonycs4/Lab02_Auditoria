package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzezk {
    private static final zzezk zza = new zzezk();
    private final ArrayList<zzeyz> zzb = new ArrayList<>();
    private final ArrayList<zzeyz> zzc = new ArrayList<>();

    private zzezk() {
    }

    public static zzezk zza() {
        return zza;
    }

    public final void zzb(zzeyz zzeyzVar) {
        this.zzb.add(zzeyzVar);
    }

    public final void zzc(zzeyz zzeyzVar) {
        boolean zzg = zzg();
        this.zzc.add(zzeyzVar);
        if (zzg) {
            return;
        }
        zzezr.zza().zzc();
    }

    public final void zzd(zzeyz zzeyzVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzeyzVar);
        this.zzc.remove(zzeyzVar);
        if (!zzg || zzg()) {
            return;
        }
        zzezr.zza().zzd();
    }

    public final Collection<zzeyz> zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection<zzeyz> zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
