package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdnu implements zzgdq<zzavg> {
    private final zzgeb<Context> zza;
    private final zzgeb<String> zzb;
    private final zzgeb<zzcct> zzc;
    private final zzgeb<zzavq> zzd;
    private final zzgeb<String> zze;

    public zzdnu(zzgeb<Context> zzgebVar, zzgeb<String> zzgebVar2, zzgeb<zzcct> zzgebVar3, zzgeb<zzavq> zzgebVar4, zzgeb<String> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcke) this.zza).zza();
        final String zzb = ((zzdth) this.zzb).zzb();
        zzcct zza2 = ((zzckn) this.zzc).zza();
        final zzavq zzb2 = this.zzd.zzb();
        final String zzb3 = this.zze.zzb();
        zzavg zzavgVar = new zzavg(new zzavm(zza));
        zzayj zza3 = zzayk.zza();
        zza3.zza(zza2.zzb);
        zza3.zzb(zza2.zzc);
        zza3.zzc(true != zza2.zzd ? 2 : 0);
        final zzayk zzah = zza3.zzah();
        zzavgVar.zzc(new zzavf(zzb2, zzb, zzah, zzb3) { // from class: com.google.android.gms.internal.ads.zzdnt
            private final zzavq zza;
            private final String zzb;
            private final zzayk zzc;
            private final String zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb2;
                this.zzb = zzb;
                this.zzc = zzah;
                this.zzd = zzb3;
            }

            @Override // com.google.android.gms.internal.ads.zzavf
            public final void zza(zzawz zzawzVar) {
                zzavq zzavqVar = this.zza;
                String str = this.zzb;
                zzayk zzaykVar = this.zzc;
                String str2 = this.zzd;
                zzavr zzau = zzawzVar.zzg().zzau();
                zzau.zza(zzavqVar);
                zzawzVar.zzh(zzau);
                zzawp zzau2 = zzawzVar.zze().zzau();
                zzau2.zza(str);
                zzau2.zzb(zzaykVar);
                zzawzVar.zzf(zzau2);
                zzawzVar.zzb(str2);
            }
        });
        return zzavgVar;
    }
}
