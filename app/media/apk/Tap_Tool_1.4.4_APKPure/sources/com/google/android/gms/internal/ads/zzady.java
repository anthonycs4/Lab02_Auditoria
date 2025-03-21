package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzady implements zzaef {
    private final boolean zza;
    private final ArrayList<zzafp> zzb = new ArrayList<>(1);
    private int zzc;
    private zzaej zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzady(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public Map zze() {
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(zzaej zzaejVar) {
        for (int i = 0; i < this.zzc; i++) {
            this.zzb.get(i).zzb(this, zzaejVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(zzaej zzaejVar) {
        this.zzd = zzaejVar;
        for (int i = 0; i < this.zzc; i++) {
            this.zzb.get(i).zzc(this, zzaejVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(int i) {
        zzaej zzaejVar = this.zzd;
        int i2 = zzaht.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            this.zzb.get(i3).zzd(this, zzaejVar, this.zza, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj() {
        zzaej zzaejVar = this.zzd;
        int i = zzaht.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            this.zzb.get(i2).zze(this, zzaejVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb(zzafp zzafpVar) {
        Objects.requireNonNull(zzafpVar);
        if (this.zzb.contains(zzafpVar)) {
            return;
        }
        this.zzb.add(zzafpVar);
        this.zzc++;
    }
}
