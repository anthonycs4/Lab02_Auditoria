package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcev {
    private final Context zza;
    private final String zzb;
    private final zzcct zzc;
    private final zzbgc zzd;
    private final zzbgf zze;
    private final com.google.android.gms.ads.internal.util.zzbh zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzceb zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcev(Context context, zzcct zzcctVar, String str, zzbgf zzbgfVar, zzbgc zzbgcVar) {
        com.google.android.gms.ads.internal.util.zzbg zzbgVar = new com.google.android.gms.ads.internal.util.zzbg();
        zzbgVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbgVar.zza("1_5", 1.0d, 5.0d);
        zzbgVar.zza("5_10", 5.0d, 10.0d);
        zzbgVar.zza("10_20", 10.0d, 20.0d);
        zzbgVar.zza("20_30", 20.0d, 30.0d);
        zzbgVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbgVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzcctVar;
        this.zzb = str;
        this.zze = zzbgfVar;
        this.zzd = zzbgcVar;
        String str2 = (String) zzbba.zzc().zzb(zzbfq.zzv);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzg[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Unable to parse frame hash target time number.", e);
                this.zzg[i] = -1;
            }
        }
    }

    public final void zza(zzceb zzcebVar) {
        zzbfx.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcebVar.zza());
        this.zzn = zzcebVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbfx.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        if (!zzbho.zza.zze().booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zza());
        for (com.google.android.gms.ads.internal.util.zzbf zzbfVar : this.zzf.zzb()) {
            String valueOf = String.valueOf(zzbfVar.zza);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(zzbfVar.zze));
            String valueOf2 = String.valueOf(zzbfVar.zza);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(zzbfVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzs.zzc().zzj(this.zza, this.zzc.zza, "gmob-apps", bundle, true);
                this.zzo = true;
                return;
            }
            String str = this.zzh[i];
            if (str != null) {
                String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                sb.append("fh_");
                sb.append(valueOf3);
                bundle.putString(sb.toString(), str);
            }
            i++;
        }
    }

    public final void zzd(zzceb zzcebVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbfx.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzs.zzj().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zza(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) zzbba.zzc().zzb(zzbfq.zzw)).longValue();
        long zzh = zzcebVar.zzh();
        int i = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(zzh - this.zzg[i])) {
                String[] strArr2 = this.zzh;
                int i2 = 8;
                Bitmap bitmap = zzcebVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }

    public final void zze() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbfx.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzf() {
        this.zzm = false;
    }
}
