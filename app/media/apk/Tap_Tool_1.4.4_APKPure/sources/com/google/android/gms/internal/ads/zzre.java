package com.google.android.gms.internal.ads;

import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzre extends zzrj {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzre(zzqq zzqqVar) {
        super(zzqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final boolean zza(zzahd zzahdVar) throws zzri {
        if (!this.zzc) {
            int zzn = zzahdVar.zzn();
            int i = zzn >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzn >> 2) & 3];
                zzjp zzjpVar = new zzjp();
                zzjpVar.zzj("audio/mpeg");
                zzjpVar.zzw(1);
                zzjpVar.zzx(i2);
                this.zza.zza(zzjpVar.zzD());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzjp zzjpVar2 = new zzjp();
                zzjpVar2.zzj(str);
                zzjpVar2.zzw(1);
                zzjpVar2.zzx(8000);
                this.zza.zza(zzjpVar2.zzD());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzri(sb.toString());
            }
            this.zzc = true;
        } else {
            zzahdVar.zzk(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final boolean zzb(zzahd zzahdVar, long j) throws zzkr {
        if (this.zze == 2) {
            int zzd = zzahdVar.zzd();
            this.zza.zzf(zzahdVar, zzd);
            this.zza.zzd(j, 1, zzd, 0, null);
            return true;
        }
        int zzn = zzahdVar.zzn();
        if (zzn != 0 || this.zzd) {
            if (this.zze != 10 || zzn == 1) {
                int zzd2 = zzahdVar.zzd();
                this.zza.zzf(zzahdVar, zzd2);
                this.zza.zzd(j, 1, zzd2, 0, null);
                return true;
            }
            return false;
        }
        int zzd3 = zzahdVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzahdVar.zzm(bArr, 0, zzd3);
        zzlt zza = zzlu.zza(bArr);
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzj("audio/mp4a-latm");
        zzjpVar.zzh(zza.zzc);
        zzjpVar.zzw(zza.zzb);
        zzjpVar.zzx(zza.zza);
        zzjpVar.zzl(Collections.singletonList(bArr));
        this.zza.zza(zzjpVar.zzD());
        this.zzd = true;
        return false;
    }
}
