package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzezr {
    private static zzezr zza;
    private float zzb = 0.0f;
    private final zzezj zzc;
    private final zzezh zzd;
    private zzezi zze;
    private zzezk zzf;

    public zzezr(zzezj zzezjVar, zzezh zzezhVar) {
        this.zzc = zzezjVar;
        this.zzd = zzezhVar;
    }

    public static zzezr zza() {
        if (zza == null) {
            zza = new zzezr(new zzezj(), new zzezh());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zze = new zzezi(new Handler(), context, new zzezg(), this, null);
    }

    public final void zzc() {
        zzezm.zza().zzg(this);
        zzezm.zza().zzc();
        if (zzezm.zza().zze()) {
            zzfan.zzb().zzc();
        }
        this.zze.zza();
    }

    public final void zzd() {
        zzfan.zzb().zzd();
        zzezm.zza().zzd();
        this.zze.zzb();
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzezk.zza();
        }
        for (zzeyz zzeyzVar : this.zzf.zzf()) {
            zzeyzVar.zzh().zzj(f);
        }
    }

    public final float zzf() {
        return this.zzb;
    }
}
