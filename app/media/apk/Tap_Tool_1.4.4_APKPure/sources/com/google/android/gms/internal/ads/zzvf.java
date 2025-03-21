package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvf implements zzut {
    private final zzahd zza = new zzahd(10);
    private zzqq zzb;
    private boolean zzc;
    private long zzd;
    private int zze;
    private int zzf;

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 5);
        this.zzb = zzbi;
        zzjp zzjpVar = new zzjp();
        zzjpVar.zza(zzwfVar.zzc());
        zzjpVar.zzj("application/id3");
        zzbi.zza(zzjpVar.zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzd(zzahd zzahdVar) {
        zzafs.zzf(this.zzb);
        if (this.zzc) {
            int zzd = zzahdVar.zzd();
            int i = this.zzf;
            if (i < 10) {
                int min = Math.min(zzd, 10 - i);
                System.arraycopy(zzahdVar.zzi(), zzahdVar.zzg(), this.zza.zzi(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzh(0);
                    if (this.zza.zzn() != 73 || this.zza.zzn() != 68 || this.zza.zzn() != 51) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                    this.zza.zzk(3);
                    this.zze = this.zza.zzA() + 10;
                }
            }
            int min2 = Math.min(zzd, this.zze - this.zzf);
            zzqo.zzb(this.zzb, zzahdVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
        int i;
        zzafs.zzf(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            this.zzb.zzd(this.zzd, 1, i, 0, null);
            this.zzc = false;
        }
    }
}
