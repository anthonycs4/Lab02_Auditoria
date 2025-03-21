package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzabn implements zzaau {
    private final zzaee zza;
    private final zzaba zzb;
    private int zzc;
    private final zzaet zzd;
    private final zzon zze;

    public zzabn(zzaee zzaeeVar, final zzpx zzpxVar) {
        zzaba zzabaVar = new zzaba(zzpxVar) { // from class: com.google.android.gms.internal.ads.zzabm
            private final zzpx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzpxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaba
            public final zzabb zza() {
                return new zzzn(this.zza);
            }
        };
        this.zza = zzaeeVar;
        this.zzb = zzabaVar;
        this.zze = new zzon();
        this.zzd = new zzaet(-1);
        this.zzc = 1048576;
    }

    public final zzabn zza(int i) {
        this.zzc = i;
        return this;
    }

    public final zzabo zzb(zzkd zzkdVar) {
        Objects.requireNonNull(zzkdVar.zzb);
        return new zzabo(zzkdVar, this.zza, this.zzb, zzoz.zza, this.zzd, this.zzc, null);
    }
}
