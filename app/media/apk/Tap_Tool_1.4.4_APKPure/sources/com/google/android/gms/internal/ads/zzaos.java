package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaos implements zzaow, zzaov {
    private final Uri zza;
    private final zzaqd zzb;
    private final zzalw zzc;
    private final int zzd;
    private final Handler zze;
    private final zzaor zzf;
    private final zzakc zzg = new zzakc();
    private final int zzh;
    private zzaov zzi;
    private zzake zzj;
    private boolean zzk;

    public zzaos(Uri uri, zzaqd zzaqdVar, zzalw zzalwVar, int i, Handler handler, zzaor zzaorVar, String str, int i2) {
        this.zza = uri;
        this.zzb = zzaqdVar;
        this.zzc = zzalwVar;
        this.zzd = i;
        this.zze = handler;
        this.zzf = zzaorVar;
        this.zzh = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zza(zzajj zzajjVar, boolean z, zzaov zzaovVar) {
        this.zzi = zzaovVar;
        zzapj zzapjVar = new zzapj(-9223372036854775807L, false);
        this.zzj = zzapjVar;
        zzaovVar.zzi(zzapjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zzb() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zzc(zzaou zzaouVar) {
        ((zzaoq) zzaouVar).zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final void zzd() {
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final zzaou zze(int i, zzaqh zzaqhVar) {
        zzaqu.zza(i == 0);
        return new zzaoq(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzaqhVar, null, this.zzh, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void zzi(zzake zzakeVar, Object obj) {
        zzakc zzakcVar = this.zzg;
        zzakeVar.zzd(0, zzakcVar, false);
        boolean z = zzakcVar.zzc != -9223372036854775807L;
        if (!this.zzk || z) {
            this.zzj = zzakeVar;
            this.zzk = z;
            this.zzi.zzi(zzakeVar, null);
        }
    }
}
