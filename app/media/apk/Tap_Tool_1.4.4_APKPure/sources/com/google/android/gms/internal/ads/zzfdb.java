package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdb {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfci zzd;
    private boolean zze;

    public zzfdb(Context context, zzhj zzhjVar, zzfci zzfciVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzhjVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfciVar;
        this.zze = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        String valueOf = String.valueOf(this.zzc);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    private final String zzg() {
        String valueOf = String.valueOf(this.zzc);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    private static String zzh(zzhm zzhmVar) {
        zzho zzi = zzhp.zzi();
        zzi.zza(zzhmVar.zza().zza());
        zzi.zzb(zzhmVar.zza().zzc());
        zzi.zzd(zzhmVar.zza().zze());
        zzi.zze(zzhmVar.zza().zzf());
        zzi.zzc(zzhmVar.zza().zzd());
        return Hex.bytesToStringLowercase(zzi.zzah().zzan().zzz());
    }

    private final void zzi(int i, long j) {
        zzfci zzfciVar = this.zzd;
        if (zzfciVar != null) {
            zzfciVar.zza(i, j);
        }
    }

    private final void zzj(int i, long j, String str) {
        zzfci zzfciVar = this.zzd;
        if (zzfciVar != null) {
            zzfciVar.zzb(i, j, str);
        }
    }

    private final zzhp zzk(int i) {
        String string;
        zzfxy zzb;
        if (i == 1) {
            string = this.zzb.getString(zzg(), null);
        } else {
            string = this.zzb.getString(zzf(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzfxj zzt = zzfxj.zzt(Hex.stringToBytes(string));
            if (!this.zze) {
                zzb = zzfxy.zzb();
            } else {
                zzb = zzfxy.zza();
            }
            return zzhp.zzh(zzt, zzb);
        } catch (zzfyy unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzhm zzhmVar, zzfda zzfdaVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzhp zzk = zzk(1);
            String zza = zzhmVar.zza().zza();
            if (zzk == null || !zzk.zza().equals(zza)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zza);
                if (zze.exists()) {
                    String str = true != zze.isDirectory() ? "0" : "1";
                    String str2 = true != zze.isFile() ? "0" : "1";
                    StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    zzj(4023, currentTimeMillis2, sb.toString());
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    String str3 = true != zze.canWrite() ? "0" : "1";
                    zzj(4024, currentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zza);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzfcv.zzb(file, zzhmVar.zzc().zzz())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                } else if (!zzfcv.zzb(file2, zzhmVar.zzd().zzz())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                } else if (zzfdaVar == null || zzfdaVar.zza(file)) {
                    String zzh = zzh(zzhmVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.zzb.getString(zzg(), null);
                    SharedPreferences.Editor edit = this.zzb.edit();
                    edit.putString(zzg(), zzh);
                    if (string != null) {
                        edit.putString(zzf(), string);
                    }
                    if (edit.commit()) {
                        HashSet hashSet = new HashSet();
                        zzhp zzk2 = zzk(1);
                        if (zzk2 != null) {
                            hashSet.add(zzk2.zza());
                        }
                        zzhp zzk3 = zzk(2);
                        if (zzk3 != null) {
                            hashSet.add(zzk3.zza());
                        }
                        for (File file3 : new File(this.zza.getDir("pccache", 0), this.zzc).listFiles()) {
                            if (!hashSet.contains(file3.getName())) {
                                zzfcv.zze(file3);
                            }
                        }
                        zzi(5014, currentTimeMillis);
                        return true;
                    }
                    zzi(4019, currentTimeMillis3);
                    return false;
                } else {
                    zzi(4018, currentTimeMillis);
                    zzfcv.zze(zze2);
                    return false;
                }
            }
            zzi(4014, currentTimeMillis);
            return false;
        }
    }

    public final boolean zzb(zzhm zzhmVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfcv.zzb(new File(zze(zzhmVar.zza().zza()), "pcbc"), zzhmVar.zzd().zzz())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzh = zzh(zzhmVar);
            SharedPreferences.Editor edit = this.zzb.edit();
            edit.putString(zzg(), zzh);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final zzfct zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzhp zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zza());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfct(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzhp zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zza());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
