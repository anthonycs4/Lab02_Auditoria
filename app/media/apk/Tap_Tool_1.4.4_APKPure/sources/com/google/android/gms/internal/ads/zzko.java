package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzko implements zzkk {
    public final zzaae zza;
    public int zzd;
    public boolean zze;
    public final List<zzaaj> zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzko(zzaal zzaalVar, boolean z) {
        this.zza = new zzaae(zzaalVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzlq zzb() {
        return this.zza.zzx();
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
