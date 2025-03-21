package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzazt {
    private Bundle zza = new Bundle();
    private List<String> zzb = new ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final Bundle zze = new Bundle();
    private final Bundle zzf = new Bundle();
    private final List<String> zzg = new ArrayList();
    private int zzh = -1;
    private String zzi = null;
    private final List<String> zzj = new ArrayList();
    private int zzk = 60000;

    public final zzazs zza() {
        return new zzazs(8, -1L, this.zza, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, this.zze, this.zzf, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null);
    }

    public final zzazt zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzazt zzc(List<String> list) {
        this.zzb = list;
        return this;
    }

    public final zzazt zzd(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzazt zze(int i) {
        this.zzd = i;
        return this;
    }

    public final zzazt zzf(int i) {
        this.zzh = i;
        return this;
    }

    public final zzazt zzg(String str) {
        this.zzi = str;
        return this;
    }

    public final zzazt zzh(int i) {
        this.zzk = i;
        return this;
    }
}
