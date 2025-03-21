package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeuf {
    public static zzazm zza(Throwable th) {
        if (th instanceof zzdye) {
            zzdye zzdyeVar = (zzdye) th;
            return zzc(zzdyeVar.zza(), zzdyeVar.zzb());
        } else if (th instanceof zzdsp) {
            if (th.getMessage() == null) {
                return zzd(((zzdsp) th).zza(), null, null);
            }
            return zzd(((zzdsp) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzba) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) th;
            return new zzazm(zzbaVar.zza(), zzffa.zza(zzbaVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static zzazm zzb(Throwable th, zzdyf zzdyfVar) {
        zzazm zzazmVar;
        zzazm zza = zza(th);
        int i = zza.zza;
        if ((i == 3 || i == 0) && (zzazmVar = zza.zzd) != null && !zzazmVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfC)).booleanValue() && zzdyfVar != null) {
            zza.zze = zzdyfVar.zzd();
        }
        return zza;
    }

    public static zzazm zzc(int i, zzazm zzazmVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) zzbba.zzc().zzb(zzbfq.zzfz)).intValue() > 0) {
                return zzazmVar;
            }
            i = 8;
        }
        return zzd(i, null, zzazmVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzazm zzd(int r8, java.lang.String r9, com.google.android.gms.internal.ads.zzazm r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuf.zzd(int, java.lang.String, com.google.android.gms.internal.ads.zzazm):com.google.android.gms.internal.ads.zzazm");
    }
}
