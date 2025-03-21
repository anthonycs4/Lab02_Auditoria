package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfoz implements zzfvg {
    private final String zza;
    private final int zzb;
    private zzfqv zzc;
    private zzfpx zzd;
    private int zze;
    private zzfrh zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoz(zzfth zzfthVar) throws GeneralSecurityException {
        String zza = zzfthVar.zza();
        this.zza = zza;
        if (zza.equals(zzfmz.zzb)) {
            try {
                zzfqy zzc = zzfqy.zzc(zzfthVar.zzc(), zzfxy.zza());
                this.zzc = (zzfqv) zzfmx.zzh(zzfthVar);
                this.zzb = zzc.zza();
            } catch (zzfyy e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (zza.equals(zzfmz.zza)) {
            try {
                zzfqa zzd = zzfqa.zzd(zzfthVar.zzc(), zzfxy.zza());
                this.zzd = (zzfpx) zzfmx.zzh(zzfthVar);
                this.zze = zzd.zza().zzc();
                this.zzb = this.zze + zzd.zzc().zzc();
            } catch (zzfyy e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (zza.equals(zzfok.zza)) {
            try {
                zzfrk zzc2 = zzfrk.zzc(zzfthVar.zzc(), zzfxy.zza());
                this.zzf = (zzfrh) zzfmx.zzh(zzfthVar);
                this.zzb = zzc2.zza();
            } catch (zzfyy e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(zza);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvg
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvg
    public final zzfpa zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzfmz.zzb)) {
            zzfqu zze = zzfqv.zze();
            zze.zzai(this.zzc);
            zze.zzb(zzfxj.zzs(bArr, 0, this.zzb));
            return new zzfpa((zzflu) zzfmx.zzi(this.zza, zze.zzah(), zzflu.class));
        } else if (this.zza.equals(zzfmz.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzfqc zzf = zzfqd.zzf();
            zzf.zzai(this.zzd.zzc());
            zzf.zzc(zzfxj.zzt(copyOfRange));
            zzfsq zzf2 = zzfsr.zzf();
            zzf2.zzai(this.zzd.zzd());
            zzf2.zzc(zzfxj.zzt(copyOfRange2));
            zzfpw zzf3 = zzfpx.zzf();
            zzf3.zza(this.zzd.zza());
            zzf3.zzb(zzf.zzah());
            zzf3.zzc(zzf2.zzah());
            return new zzfpa((zzflu) zzfmx.zzi(this.zza, zzf3.zzah(), zzflu.class));
        } else if (this.zza.equals(zzfok.zza)) {
            zzfrg zze2 = zzfrh.zze();
            zze2.zzai(this.zzf);
            zze2.zzb(zzfxj.zzs(bArr, 0, this.zzb));
            return new zzfpa((zzflx) zzfmx.zzi(this.zza, zze2.zzah(), zzflx.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
