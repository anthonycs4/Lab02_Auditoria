package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzqf implements zzps {
    private final zzps zza;

    public zzqf(zzps zzpsVar) {
        this.zza = zzpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        return this.zza.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final boolean zzb(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzb(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        ((zzpo) this.zza).zzb(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final int zzd(int i) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zzf(int i) throws IOException {
        ((zzpo) this.zza).zze(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final int zzg(byte[] bArr, int i, int i2) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final boolean zzh(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzh(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zzi(byte[] bArr, int i, int i2) throws IOException {
        ((zzpo) this.zza).zzh(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zzk(int i) throws IOException {
        ((zzpo) this.zza).zzj(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public long zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public long zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public long zzo() {
        return this.zza.zzo();
    }
}
