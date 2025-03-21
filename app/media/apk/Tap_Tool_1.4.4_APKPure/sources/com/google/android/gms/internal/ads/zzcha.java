package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcha extends zzcgs implements zzcek {
    public static final /* synthetic */ int zzd = 0;
    private zzcel zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;

    public zzcha(zzceu zzceuVar, zzcet zzcetVar) {
        super(zzceuVar);
        zzcel zzcgbVar;
        Context context = zzceuVar.getContext();
        if (zzcetVar.zzm) {
            zzcgbVar = new zzchr(context, zzcetVar, this.zzc.get());
        } else {
            zzcgbVar = new zzcgb(context, zzcetVar, this.zzc.get());
        }
        this.zze = zzcgbVar;
        zzcgbVar.zzr(this);
    }

    protected static final String zzk(String str) {
        String valueOf = String.valueOf(zzccg.zzd(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcel zzcelVar = this.zze;
        if (zzcelVar != null) {
            zzcelVar.zzr(null);
            this.zze.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzC() {
        com.google.android.gms.ads.internal.util.zze.zzi("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final boolean zza(String str) {
        return zzb(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcgs] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzcgs
    public final boolean zzb(String str, String[] strArr) {
        String str2;
        String str3;
        zzcha zzchaVar;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        long j7;
        zzcha zzchaVar2 = this;
        String str5 = str;
        zzchaVar2.zzf = str5;
        String zzk = zzk(str);
        String str6 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzchaVar2.zze.zzp(uriArr, zzchaVar2.zzb);
            zzceu zzceuVar = zzchaVar2.zzc.get();
            if (zzceuVar != null) {
                zzceuVar.zzu(zzk, zzchaVar2);
            }
            Clock zzj = com.google.android.gms.ads.internal.zzs.zzj();
            long currentTimeMillis = zzj.currentTimeMillis();
            long longValue = ((Long) zzbba.zzc().zzb(zzbfq.zzt)).longValue();
            long longValue2 = ((Long) zzbba.zzc().zzb(zzbfq.zzs)).longValue() * 1000;
            long intValue = ((Integer) zzbba.zzc().zzb(zzbfq.zzr)).intValue();
            boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue();
            long j8 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzj.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!zzchaVar2.zzg) {
                                if (zzchaVar2.zzh) {
                                    break;
                                } else if (zzchaVar2.zze.zzA()) {
                                    long zzH = zzchaVar2.zze.zzH();
                                    if (zzH > 0) {
                                        long zzN = zzchaVar2.zze.zzN();
                                        if (zzN != j8) {
                                            try {
                                                j = intValue;
                                                j7 = zzH;
                                                j2 = longValue2;
                                                j4 = longValue;
                                                str4 = zzk;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzchaVar = this;
                                                str2 = str;
                                                str3 = zzk;
                                            }
                                            try {
                                                zzh(str, zzk, zzN, j7, zzN > 0, booleanValue ? zzchaVar2.zze.zzI() : -1L, booleanValue ? zzchaVar2.zze.zzJ() : -1L, booleanValue ? zzchaVar2.zze.zzK() : -1L, zzcel.zzP(), zzcel.zzQ());
                                                j6 = zzN;
                                                j5 = zzH;
                                                str2 = j7;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                zzchaVar = this;
                                                str2 = str;
                                                str3 = str4;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    String str7 = str6;
                                                    String message = e.getMessage();
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                                    sb.append("Failed to preload url ");
                                                    sb.append(str2);
                                                    sb.append(" Exception: ");
                                                    sb.append(message);
                                                    com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                                                    release();
                                                    String canonicalName = e.getClass().getCanonicalName();
                                                    String message2 = e.getMessage();
                                                    StringBuilder sb2 = new StringBuilder(str7.length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message2).length());
                                                    sb2.append(str7);
                                                    sb2.append("/");
                                                    sb2.append(canonicalName);
                                                    sb2.append(":");
                                                    sb2.append(message2);
                                                    zzchaVar.zzn(str2, str3, str7, sb2.toString());
                                                    return false;
                                                }
                                            }
                                        } else {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = zzk;
                                            j5 = zzH;
                                            j6 = j8;
                                            str2 = intValue;
                                        }
                                        zzchaVar = (zzN > j5 ? 1 : (zzN == j5 ? 0 : -1));
                                        if (zzchaVar < 0) {
                                            try {
                                                zzcha zzchaVar3 = this;
                                                str2 = str;
                                                str3 = str4;
                                                if (zzchaVar3.zze.zzO() < j || zzN <= 0) {
                                                    j3 = j4;
                                                    r1 = j6;
                                                    zzchaVar = zzchaVar3;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        } else {
                                            zzm(str, str4, j5);
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        str2 = str5;
                                        str3 = zzk;
                                        zzchaVar = zzchaVar2;
                                        j3 = longValue;
                                        r1 = j8;
                                    }
                                    try {
                                        try {
                                            zzchaVar.wait(j3);
                                        } catch (InterruptedException unused) {
                                            throw new IOException("Wait interrupted.");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = r1;
                                        throw th;
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            long j9 = longValue2;
                            StringBuilder sb3 = new StringBuilder(47);
                            sb3.append("Timeout reached. Limit: ");
                            sb3.append(j9);
                            sb3.append(" ms");
                            throw new IOException(sb3.toString());
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzk;
                        zzchaVar = zzchaVar2;
                    }
                }
                longValue = j3;
                zzchaVar2 = zzchaVar;
                str5 = str2;
                zzk = str3;
                intValue = j;
                longValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = zzk;
            zzchaVar = zzchaVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzc(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzd(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zze(int i) {
        this.zze.zzx(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzf(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzg() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzn(this.zzf, zzk(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final zzcel zzj() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzr(null);
        zzcel zzcelVar = this.zze;
        this.zze = null;
        return zzcelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzr(final boolean z, final long j) {
        final zzceu zzceuVar = this.zzc.get();
        if (zzceuVar != null) {
            zzccz.zze.execute(new Runnable(zzceuVar, z, j) { // from class: com.google.android.gms.internal.ads.zzcgz
                private final zzceu zza;
                private final boolean zzb;
                private final long zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzceuVar;
                    this.zzb = z;
                    this.zzc = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzceu zzceuVar2 = this.zza;
                    boolean z2 = this.zzb;
                    long j2 = this.zzc;
                    int i = zzcha.zzd;
                    zzceuVar2.zzv(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzu(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache error", exc);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzv(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache exception", exc);
    }
}
