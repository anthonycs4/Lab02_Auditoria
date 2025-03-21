package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzew {
    protected volatile Boolean zzb;
    private final zzfy zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfdh zza = null;
    private static volatile Random zze = null;

    public zzew(zzfy zzfyVar) {
        this.zzc = zzfyVar;
        zzfyVar.zzd().execute(new zzev(this));
    }

    public static final int zzd() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return zze().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zze == null) {
            synchronized (zzew.class) {
                if (zze == null) {
                    zze = new Random();
                }
            }
        }
        return zze;
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzbv zza2 = zzcb.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j);
            if (str != null) {
                zza2.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzfwq.zzc(exc, new PrintWriter(stringWriter));
                zza2.zzc(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfdg zza3 = zza.zza(zza2.zzah().zzao());
            zza3.zzc(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zza();
        } catch (Exception unused) {
        }
    }
}
