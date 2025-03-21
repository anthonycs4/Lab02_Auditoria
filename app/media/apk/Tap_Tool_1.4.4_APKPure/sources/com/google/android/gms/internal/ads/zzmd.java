package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzmd {
    public static final zzmd zza = new zzmd(0, 0, 1, 1, null);
    public static final zzhw<zzmd> zzc = zzmb.zza;
    public final int zzb = 1;
    private AudioAttributes zzd;

    /* synthetic */ zzmd(int i, int i2, int i3, int i4, zzmc zzmcVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzmd zzmdVar = (zzmd) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }

    public final AudioAttributes zza() {
        if (this.zzd == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (zzaht.zza >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.zzd = usage.build();
        }
        return this.zzd;
    }
}
