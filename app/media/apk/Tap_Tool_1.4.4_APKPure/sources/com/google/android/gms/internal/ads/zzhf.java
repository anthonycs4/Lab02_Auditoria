package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhf {
    protected static final String zza = "zzhf";
    private final zzfy zzb;
    private final String zzc;
    private final String zzd;
    private final Class<?>[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzhf(zzfy zzfyVar, String str, String str2, Class<?>... clsArr) {
        this.zzb = zzfyVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzfyVar.zzd().submit(new zzhe(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzhf zzhfVar) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            loadClass = zzhfVar.zzb.zze().loadClass(zzhfVar.zzc(zzhfVar.zzb.zzg(), zzhfVar.zzc));
        } catch (zzfd | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzhfVar.zzg;
        } catch (Throwable th) {
            zzhfVar.zzg.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = zzhfVar.zzg;
        } else {
            zzhfVar.zze = loadClass.getMethod(zzhfVar.zzc(zzhfVar.zzb.zzg(), zzhfVar.zzd), zzhfVar.zzf);
            if (zzhfVar.zze == null) {
                countDownLatch = zzhfVar.zzg;
            }
            countDownLatch = zzhfVar.zzg;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzfd, UnsupportedEncodingException {
        return new String(this.zzb.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
