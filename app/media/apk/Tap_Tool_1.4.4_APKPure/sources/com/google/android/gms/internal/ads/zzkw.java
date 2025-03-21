package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkw {
    private final zzagc zza = new zzagc();

    public final zzkw zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzkw zzb(int i, boolean z) {
        zzagc zzagcVar = this.zza;
        if (z) {
            zzagcVar.zza(i);
        }
        return this;
    }

    public final zzkw zzc(int... iArr) {
        zzagc zzagcVar = this.zza;
        for (int i : iArr) {
            zzagcVar.zza(i);
        }
        return this;
    }

    public final zzkw zzd(zzkx zzkxVar) {
        zzagd zzagdVar;
        zzagc zzagcVar = this.zza;
        zzagdVar = zzkxVar.zzb;
        for (int i = 0; i < zzagdVar.zza(); i++) {
            zzagcVar.zza(zzagdVar.zzb(i));
        }
        return this;
    }

    public final zzkx zze() {
        return new zzkx(this.zza.zzb(), null);
    }
}
