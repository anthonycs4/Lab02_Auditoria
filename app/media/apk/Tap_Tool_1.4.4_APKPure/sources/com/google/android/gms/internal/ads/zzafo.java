package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzafo implements zzaef {
    private final zzaef zza;
    private long zzb;
    private Uri zzc;
    private Map<String, List<String>> zzd;

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza = this.zza.zza(bArr, i, i2);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws IOException {
        this.zzc = zzaejVar.zza;
        this.zzd = Collections.emptyMap();
        long zzc = this.zza.zzc(zzaejVar);
        Uri zzd = zzd();
        Objects.requireNonNull(zzd);
        this.zzc = zzd;
        this.zzd = zze();
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Map<String, List<String>> zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws IOException {
        this.zza.zzf();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map<String, List<String>> zzi() {
        return this.zzd;
    }

    public zzafo(zzaef zzaefVar) {
        Objects.requireNonNull(zzaefVar);
        this.zza = zzaefVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb(zzafp zzafpVar) {
        Objects.requireNonNull(zzafpVar);
        this.zza.zzb(zzafpVar);
    }
}
