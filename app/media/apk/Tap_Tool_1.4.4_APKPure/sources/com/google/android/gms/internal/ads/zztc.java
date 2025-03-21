package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztc {
    public final zzqq zza;
    public zztp zzd;
    public zzsy zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzto zzb = new zzto();
    public final zzahd zzc = new zzahd();
    private final zzahd zzj = new zzahd(1);
    private final zzahd zzk = new zzahd();

    public zztc(zzqq zzqqVar, zztp zztpVar, zzsy zzsyVar) {
        this.zza = zzqqVar;
        this.zzd = zztpVar;
        this.zze = zzsyVar;
        zza(zztpVar, zzsyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzj(zztc zztcVar, boolean z) {
        zztcVar.zzl = true;
        return true;
    }

    public final void zza(zztp zztpVar, zzsy zzsyVar) {
        this.zzd = zztpVar;
        this.zze = zzsyVar;
        this.zza.zza(zztpVar.zza.zzf);
        zzb();
    }

    public final void zzb() {
        zzto zztoVar = this.zzb;
        zztoVar.zzd = 0;
        zztoVar.zzq = 0L;
        zztoVar.zzr = false;
        zztoVar.zzl = false;
        zztoVar.zzp = false;
        zztoVar.zzn = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final long zzc() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        return this.zzb.zzb(this.zzf);
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final int zze() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzf() {
        int i;
        if (!this.zzl) {
            i = this.zzd.zzg[this.zzf];
        } else {
            i = this.zzb.zzk[this.zzf] ? 1 : 0;
        }
        return zzi() != null ? i | BasicMeasure.EXACTLY : i;
    }

    public final boolean zzg() {
        this.zzf++;
        if (this.zzl) {
            int i = this.zzg + 1;
            this.zzg = i;
            int[] iArr = this.zzb.zzg;
            int i2 = this.zzh;
            if (i == iArr[i2]) {
                this.zzh = i2 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzh(int i, int i2) {
        zzahd zzahdVar;
        zztn zzi = zzi();
        if (zzi == null) {
            return 0;
        }
        int i3 = zzi.zzd;
        if (i3 != 0) {
            zzahdVar = this.zzb.zzo;
        } else {
            byte[] bArr = (byte[]) zzaht.zzd(zzi.zze);
            zzahd zzahdVar2 = this.zzk;
            int length = bArr.length;
            zzahdVar2.zzb(bArr, length);
            zzahdVar = this.zzk;
            i3 = length;
        }
        boolean zzc = this.zzb.zzc(this.zzf);
        boolean z = zzc || i2 != 0;
        this.zzj.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        this.zzj.zzh(0);
        this.zza.zzc(this.zzj, 1, 1);
        this.zza.zzc(zzahdVar, i3, 1);
        if (z) {
            if (!zzc) {
                this.zzc.zza(8);
                byte[] zzi2 = this.zzc.zzi();
                zzi2[0] = 0;
                zzi2[1] = 1;
                zzi2[2] = 0;
                zzi2[3] = (byte) i2;
                zzi2[4] = (byte) ((i >> 24) & 255);
                zzi2[5] = (byte) ((i >> 16) & 255);
                zzi2[6] = (byte) ((i >> 8) & 255);
                zzi2[7] = (byte) (i & 255);
                this.zza.zzc(this.zzc, 8, 1);
                return i3 + 9;
            }
            zzahd zzahdVar3 = this.zzb.zzo;
            int zzo = zzahdVar3.zzo();
            zzahdVar3.zzk(-2);
            int i4 = (zzo * 6) + 2;
            if (i2 != 0) {
                this.zzc.zza(i4);
                byte[] zzi3 = this.zzc.zzi();
                zzahdVar3.zzm(zzi3, 0, i4);
                int i5 = (((zzi3[2] & UByte.MAX_VALUE) << 8) | (zzi3[3] & UByte.MAX_VALUE)) + i2;
                zzi3[2] = (byte) ((i5 >> 8) & 255);
                zzi3[3] = (byte) (i5 & 255);
                zzahdVar3 = this.zzc;
            }
            this.zza.zzc(zzahdVar3, i4, 1);
            return i3 + 1 + i4;
        }
        return i3 + 1;
    }

    public final zztn zzi() {
        if (this.zzl) {
            zzto zztoVar = this.zzb;
            zzsy zzsyVar = zztoVar.zza;
            int i = zzaht.zza;
            int i2 = zzsyVar.zza;
            zztn zztnVar = zztoVar.zzn;
            if (zztnVar == null) {
                zztnVar = this.zzd.zza.zza(i2);
            }
            if (zztnVar == null || !zztnVar.zza) {
                return null;
            }
            return zztnVar;
        }
        return null;
    }
}
