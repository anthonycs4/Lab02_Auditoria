package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebn implements zzfko {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzess zzc;
    final /* synthetic */ zzesv zzd;
    final /* synthetic */ zzebo zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebn(zzebo zzeboVar, long j, String str, zzess zzessVar, zzesv zzesvVar) {
        this.zze = zzeboVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzessVar;
        this.zzd = zzesvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        Clock clock;
        int i;
        boolean z;
        zzazm zzazmVar;
        zzdyf zzdyfVar;
        zzebp zzebpVar;
        clock = this.zze.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzebd) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzetp) {
            i = 5;
        } else {
            i = ((th instanceof zzdsp) && zzeuf.zza(th).zza == 3) ? 1 : 6;
        }
        zzebo.zzd(this.zze, this.zzb, i, elapsedRealtime, this.zzc.zzaa);
        z = this.zze.zzd;
        if (z) {
            zzebpVar = this.zze.zzb;
            zzebpVar.zza(this.zzd, this.zzc, i, th instanceof zzdye ? (zzdye) th : null, elapsedRealtime);
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfC)).booleanValue()) {
            zzazm zza = zzeuf.zza(th);
            int i2 = zza.zza;
            if ((i2 == 3 || i2 == 0) && (zzazmVar = zza.zzd) != null && !zzazmVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zza = zzeuf.zza(new zzdye(13, zza.zzd));
            }
            zzdyfVar = this.zze.zze;
            zzdyfVar.zzc(this.zzc, elapsedRealtime, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzdyf zzdyfVar;
        zzebp zzebpVar;
        clock = this.zze.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzebo.zzd(this.zze, this.zzb, 0, elapsedRealtime, this.zzc.zzaa);
        z = this.zze.zzd;
        if (z) {
            zzebpVar = this.zze.zzb;
            zzebpVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfC)).booleanValue()) {
            zzdyfVar = this.zze.zze;
            zzdyfVar.zzc(this.zzc, elapsedRealtime, null);
        }
    }
}
