package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdbh {
    private final Set<zzdcx<zzazi>> zza;
    private final Set<zzdcx<zzcwh>> zzb;
    private final Set<zzdcx<zzcwz>> zzc;
    private final Set<zzdcx<zzcye>> zzd;
    private final Set<zzdcx<zzcxt>> zze;
    private final Set<zzdcx<zzcxx>> zzf;
    private final Set<zzdcx<zzcwk>> zzg;
    private final Set<zzdcx<zzcwv>> zzh;
    private final Set<zzdcx<zzfaw>> zzi;
    private final Set<zzdcx<zzajc>> zzj;
    private final Set<zzdcx<zzcyp>> zzk;
    private final Set<zzdcx<com.google.android.gms.ads.internal.overlay.zzo>> zzl;
    private final Set<zzdcx<zzcyy>> zzm;
    private final zzeqg zzn;
    private zzcwj zzo;
    private zzebo zzp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdbh(zzdbg zzdbgVar, zzdbf zzdbfVar) {
        Set<zzdcx<zzazi>> set;
        Set<zzdcx<zzcwz>> set2;
        Set<zzdcx<zzcye>> set3;
        Set<zzdcx<zzcwh>> set4;
        Set<zzdcx<zzcxt>> set5;
        Set<zzdcx<zzcxx>> set6;
        Set<zzdcx<zzcwk>> set7;
        Set<zzdcx<zzcwv>> set8;
        Set<zzdcx<zzfaw>> set9;
        Set<zzdcx<zzajc>> set10;
        Set<zzdcx<zzcyp>> set11;
        zzeqg zzeqgVar;
        Set<zzdcx<com.google.android.gms.ads.internal.overlay.zzo>> set12;
        Set<zzdcx<zzcyy>> set13;
        set = zzdbgVar.zzc;
        this.zza = set;
        set2 = zzdbgVar.zze;
        this.zzc = set2;
        set3 = zzdbgVar.zzf;
        this.zzd = set3;
        set4 = zzdbgVar.zzd;
        this.zzb = set4;
        set5 = zzdbgVar.zzg;
        this.zze = set5;
        set6 = zzdbgVar.zza;
        this.zzf = set6;
        set7 = zzdbgVar.zzh;
        this.zzg = set7;
        set8 = zzdbgVar.zzk;
        this.zzh = set8;
        set9 = zzdbgVar.zzi;
        this.zzi = set9;
        set10 = zzdbgVar.zzj;
        this.zzj = set10;
        set11 = zzdbgVar.zzl;
        this.zzk = set11;
        zzeqgVar = zzdbgVar.zzn;
        this.zzn = zzeqgVar;
        set12 = zzdbgVar.zzm;
        this.zzl = set12;
        set13 = zzdbgVar.zzb;
        this.zzm = set13;
    }

    public final Set<zzdcx<zzcwh>> zza() {
        return this.zzb;
    }

    public final Set<zzdcx<zzcxt>> zzb() {
        return this.zze;
    }

    public final Set<zzdcx<zzcwk>> zzc() {
        return this.zzg;
    }

    public final Set<zzdcx<zzcwv>> zzd() {
        return this.zzh;
    }

    public final Set<zzdcx<zzfaw>> zze() {
        return this.zzi;
    }

    public final Set<zzdcx<zzajc>> zzf() {
        return this.zzj;
    }

    public final Set<zzdcx<zzazi>> zzg() {
        return this.zza;
    }

    public final Set<zzdcx<zzcwz>> zzh() {
        return this.zzc;
    }

    public final Set<zzdcx<zzcye>> zzi() {
        return this.zzd;
    }

    public final Set<zzdcx<zzcyp>> zzj() {
        return this.zzk;
    }

    public final Set<zzdcx<zzcyy>> zzk() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<zzdcx<zzcxx>> zzl() {
        return this.zzf;
    }

    public final Set<zzdcx<com.google.android.gms.ads.internal.overlay.zzo>> zzm() {
        return this.zzl;
    }

    public final zzeqg zzn() {
        return this.zzn;
    }

    public final zzcwj zzo(Set<zzdcx<zzcwk>> set) {
        if (this.zzo == null) {
            this.zzo = new zzcwj(set);
        }
        return this.zzo;
    }

    public final zzebo zzp(Clock clock, zzebp zzebpVar, zzdyf zzdyfVar) {
        if (this.zzp == null) {
            this.zzp = new zzebo(clock, zzebpVar, zzdyfVar);
        }
        return this.zzp;
    }
}
