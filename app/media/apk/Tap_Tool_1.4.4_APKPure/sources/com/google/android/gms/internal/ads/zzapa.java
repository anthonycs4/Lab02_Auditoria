package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapa implements zzaow {
    private final zzaow[] zza;
    private final ArrayList<zzaow> zzb;
    private zzaov zzd;
    private zzake zze;
    private zzaoz zzg;
    private final zzakd zzc = new zzakd();
    private int zzf = -1;

    public zzapa(zzaow... zzaowVarArr) {
        this.zza = zzaowVarArr;
        this.zzb = new ArrayList<>(Arrays.asList(zzaowVarArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzapa zzapaVar, int i, zzake zzakeVar, Object obj) {
        zzaoz zzaozVar;
        if (zzapaVar.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzakeVar.zzg(i2, zzapaVar.zzc, false);
            }
            int i3 = zzapaVar.zzf;
            if (i3 == -1) {
                zzapaVar.zzf = 1;
            } else if (i3 != 1) {
                zzaozVar = new zzaoz(1);
                zzapaVar.zzg = zzaozVar;
            }
            zzaozVar = null;
            zzapaVar.zzg = zzaozVar;
        }
        if (zzapaVar.zzg != null) {
            return;
        }
        zzapaVar.zzb.remove(zzapaVar.zza[i]);
        if (i == 0) {
            zzapaVar.zze = zzakeVar;
        }
        if (zzapaVar.zzb.isEmpty()) {
            zzapaVar.zzd.zzi(zzapaVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zza(zzajj zzajjVar, boolean z, zzaov zzaovVar) {
        this.zzd = zzaovVar;
        int i = 0;
        while (true) {
            zzaow[] zzaowVarArr = this.zza;
            if (i >= zzaowVarArr.length) {
                return;
            }
            zzaowVarArr[i].zza(zzajjVar, false, new zzaoy(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zzb() throws IOException {
        zzaoz zzaozVar = this.zzg;
        if (zzaozVar == null) {
            for (zzaow zzaowVar : this.zza) {
                zzaowVar.zzb();
            }
            return;
        }
        throw zzaozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zzc(zzaou zzaouVar) {
        zzaox zzaoxVar = (zzaox) zzaouVar;
        int i = 0;
        while (true) {
            zzaow[] zzaowVarArr = this.zza;
            if (i >= zzaowVarArr.length) {
                return;
            }
            zzaowVarArr[i].zzc(zzaoxVar.zza[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zzd() {
        for (zzaow zzaowVar : this.zza) {
            zzaowVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final zzaou zze(int i, zzaqh zzaqhVar) {
        int length = this.zza.length;
        zzaou[] zzaouVarArr = new zzaou[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaouVarArr[i2] = this.zza[i2].zze(i, zzaqhVar);
        }
        return new zzaox(zzaouVarArr);
    }
}
