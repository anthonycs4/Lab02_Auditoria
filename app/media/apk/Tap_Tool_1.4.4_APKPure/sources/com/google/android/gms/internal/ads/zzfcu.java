package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfcu {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzhj zzd;

    public zzfcu(Context context, zzhj zzhjVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfcv.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfcv.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzhjVar;
    }

    static String zzb(zzhp zzhpVar) {
        return Hex.bytesToStringLowercase(zzhpVar.zzan().zzz());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzg() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzhm r8, com.google.android.gms.internal.ads.zzfda r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcu.zza(com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzfda):boolean");
    }

    public final zzfct zzc(int i) {
        zzhp zzd = zzd(1);
        if (zzd == null) {
            return null;
        }
        String zza = zzd.zza();
        File zza2 = zzfcv.zza(zza, "pcam.jar", zze());
        if (!zza2.exists()) {
            zza2 = zzfcv.zza(zza, "pcam", zze());
        }
        return new zzfct(zzd, zza2, zzfcv.zza(zza, "pcbc", zze()), zzfcv.zza(zza, "pcopt", zze()));
    }

    final zzhp zzd(int i) {
        String string;
        if (i == 1) {
            string = this.zzc.getString(zzg(), null);
        } else {
            string = this.zzc.getString(zzf(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                zzhp zzg = zzhp.zzg(zzfxj.zzt(Hex.stringToBytes(string)));
                String zza = zzg.zza();
                File zza2 = zzfcv.zza(zza, "pcam.jar", zze());
                if (!zza2.exists()) {
                    zza2 = zzfcv.zza(zza, "pcam", zze());
                }
                File zza3 = zzfcv.zza(zza, "pcbc", zze());
                if (zza2.exists()) {
                    if (zza3.exists()) {
                        return zzg;
                    }
                }
            } catch (zzfyy unused) {
            }
        }
        return null;
    }
}
