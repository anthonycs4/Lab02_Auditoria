package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfch {
    public static boolean zza(zzhj zzhjVar) {
        zzhj zzhjVar2 = zzhj.UNSUPPORTED;
        int ordinal = zzhjVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4;
    }

    public static final zzhj zzb(Context context, zzfbb zzfbbVar) {
        zzhj zzhjVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            zzfbbVar.zzf(5017, "No lib/");
            zzhjVar = zzhj.UNKNOWN;
        } else {
            File[] listFiles = file.listFiles(new zzfje(Pattern.compile(".*\\.so$", 2)));
            if (listFiles == null || listFiles.length == 0) {
                zzfbbVar.zzf(5017, "No .so");
                zzhjVar = zzhj.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    bArr = new byte[20];
                } catch (IOException e) {
                    zzc(null, e.toString(), context, zzfbbVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfbbVar);
                        zzhjVar = zzhj.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzhjVar = zzhj.X86;
                        } else if (s == 40) {
                            zzhjVar = zzhj.ARM7;
                        } else if (s == 62) {
                            zzhjVar = zzhj.X86_64;
                        } else if (s == 183) {
                            zzhjVar = zzhj.ARM64;
                        } else {
                            zzc(bArr, null, context, zzfbbVar);
                            zzhjVar = zzhj.UNSUPPORTED;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzhjVar = zzhj.UNSUPPORTED;
                }
            }
        }
        if (zzhjVar == zzhj.UNKNOWN) {
            String zzd = zzd(context, zzfbbVar);
            if (TextUtils.isEmpty(zzd)) {
                zzc(null, "Empty dev arch", context, zzfbbVar);
                zzhjVar = zzhj.UNSUPPORTED;
            } else if (zzd.equalsIgnoreCase("i686") || zzd.equalsIgnoreCase("x86")) {
                zzhjVar = zzhj.X86;
            } else if (zzd.equalsIgnoreCase("x86_64")) {
                zzhjVar = zzhj.X86_64;
            } else if (zzd.equalsIgnoreCase("arm64-v8a")) {
                zzhjVar = zzhj.ARM64;
            } else if (zzd.equalsIgnoreCase("armeabi-v7a") || zzd.equalsIgnoreCase("armv71")) {
                zzhjVar = zzhj.ARM7;
            } else {
                zzc(null, zzd, context, zzfbbVar);
                zzhjVar = zzhj.UNSUPPORTED;
            }
        }
        zzfbbVar.zzf(5018, zzhjVar.name());
        return zzhjVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfbb zzfbbVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzfez.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfbbVar.zzf(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfbb zzfbbVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfez.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e) {
                zzfbbVar.zzd(2024, 0L, e);
            } catch (NoSuchFieldException e2) {
                zzfbbVar.zzd(2024, 0L, e2);
            }
            return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
        }
        return zza;
    }
}
