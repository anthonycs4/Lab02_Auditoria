package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzvd {
    private final zzqq zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzvd(zzqq zzqqVar) {
        this.zza = zzqqVar;
    }

    private final void zze(int i) {
        boolean z = this.zzm;
        long j = this.zzb;
        long j2 = this.zzk;
        this.zza.zzd(this.zzl, z ? 1 : 0, (int) (j - j2), i, null);
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j2;
        this.zzd = 0;
        this.zzb = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.zzi && !this.zzj) {
                if (z) {
                    zze(i);
                }
                this.zzi = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.zzc = z3;
        this.zzf = (z3 || i2 <= 9) ? true : true;
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        if (this.zzf) {
            int i3 = this.zzd;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.zzd = i3 + (i2 - i);
                return;
            }
            this.zzg = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
            this.zzf = false;
        }
    }

    public final void zzd(long j, int i, boolean z) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z && this.zzi) {
                zze(i + ((int) (j - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
