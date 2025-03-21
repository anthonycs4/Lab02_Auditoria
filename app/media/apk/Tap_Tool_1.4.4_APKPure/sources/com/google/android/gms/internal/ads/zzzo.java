package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzzo implements zzabx {
    public final zzabx zza;
    final /* synthetic */ zzzp zzb;
    private boolean zzc;

    public zzzo(zzzp zzzpVar, zzabx zzabxVar) {
        this.zzb = zzzpVar;
        this.zza = zzabxVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final int zzd(zzjr zzjrVar, zzol zzolVar, int i) {
        if (this.zzb.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzolVar.zzf(4);
            return -4;
        }
        int zzd = this.zza.zzd(zzjrVar, zzolVar, i);
        if (zzd == -5) {
            zzjq zzjqVar = zzjrVar.zza;
            Objects.requireNonNull(zzjqVar);
            int i2 = zzjqVar.zzB;
            if (i2 == 0) {
                if (zzjqVar.zzC != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzjqVar.zzC : 0;
            zzjp zza = zzjqVar.zza();
            zza.zzz(i2);
            zza.zzA(i3);
            zzjrVar.zza = zza.zzD();
            return -5;
        }
        zzzp zzzpVar = this.zzb;
        long j = zzzpVar.zzb;
        if (j == Long.MIN_VALUE || ((zzd != -4 || zzolVar.zzd < j) && !(zzd == -3 && zzzpVar.zzg() == Long.MIN_VALUE && !zzolVar.zzc))) {
            return zzd;
        }
        zzolVar.zza();
        zzolVar.zzf(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
