package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzay implements zzm {
    private final zzax zzc;
    private final Map<String, zzav> zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzay(zzax zzaxVar, int i) {
        this.zzc = zzaxVar;
    }

    static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((255 & zzp(inputStream)) << 56);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzm(zzaw zzawVar) throws IOException {
        return new String(zzg(zzawVar, zzk(zzawVar)), "UTF-8");
    }

    private final void zzn(String str, zzav zzavVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzavVar.zza - this.zza.get(str).zza;
        } else {
            this.zzb += zzavVar.zza;
        }
        this.zza.put(str, zzavVar);
    }

    private final void zzo(String str) {
        zzav remove = this.zza.remove(str);
        if (remove != null) {
            this.zzb -= remove.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final synchronized zzl zza(String str) {
        zzav zzavVar = this.zza.get(str);
        if (zzavVar == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzaw zzawVar = new zzaw(new BufferedInputStream(new FileInputStream(zzf)), zzf.length());
            try {
                zzav zza = zzav.zza(zzawVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzao.zzb("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, zza.zzb);
                    zzo(str);
                    return null;
                }
                byte[] zzg = zzg(zzawVar, zzawVar.zza());
                zzl zzlVar = new zzl();
                zzlVar.zza = zzg;
                zzlVar.zzb = zzavVar.zzc;
                zzlVar.zzc = zzavVar.zzd;
                zzlVar.zzd = zzavVar.zze;
                zzlVar.zze = zzavVar.zzf;
                zzlVar.zzf = zzavVar.zzg;
                List<zzu> list = zzavVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzu zzuVar : list) {
                    treeMap.put(zzuVar.zza(), zzuVar.zzb());
                }
                zzlVar.zzg = treeMap;
                zzlVar.zzh = Collections.unmodifiableList(zzavVar.zzh);
                return zzlVar;
            } finally {
                zzawVar.close();
            }
        } catch (IOException e) {
            zzao.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final synchronized void zzb(String str, zzl zzlVar) {
        long j;
        long j2 = this.zzb;
        int length = zzlVar.zza.length;
        int i = this.zzd;
        if (j2 + length <= i || length <= i * 0.9f) {
            File zzf = zzf(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzf));
                zzav zzavVar = new zzav(str, zzlVar);
                try {
                    zzh(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzavVar.zzb);
                    String str2 = zzavVar.zzc;
                    if (str2 == null) {
                        str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    zzl(bufferedOutputStream, str2);
                    zzj(bufferedOutputStream, zzavVar.zzd);
                    zzj(bufferedOutputStream, zzavVar.zze);
                    zzj(bufferedOutputStream, zzavVar.zzf);
                    zzj(bufferedOutputStream, zzavVar.zzg);
                    List<zzu> list = zzavVar.zzh;
                    if (list != null) {
                        zzh(bufferedOutputStream, list.size());
                        for (zzu zzuVar : list) {
                            zzl(bufferedOutputStream, zzuVar.zza());
                            zzl(bufferedOutputStream, zzuVar.zzb());
                        }
                    } else {
                        zzh(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzlVar.zza);
                    bufferedOutputStream.close();
                    zzavVar.zza = zzf.length();
                    zzn(str, zzavVar);
                    if (this.zzb >= this.zzd) {
                        if (zzao.zzb) {
                            zzao.zza("Pruning old cache entries.", new Object[0]);
                        }
                        long j3 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator<Map.Entry<String, zzav>> it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = elapsedRealtime;
                                break;
                            }
                            zzav value = it.next().getValue();
                            if (zzf(value.zzb).delete()) {
                                j = elapsedRealtime;
                                this.zzb -= value.zza;
                            } else {
                                j = elapsedRealtime;
                                String str3 = value.zzb;
                                zzao.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                            elapsedRealtime = j;
                        }
                        if (zzao.zzb) {
                            zzao.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j3), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (IOException e) {
                    zzao.zzb("%s", e.toString());
                    bufferedOutputStream.close();
                    zzao.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzf.delete()) {
                    zzao.zzb("Could not clean up file %s", zzf.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzao.zzb("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzc();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final synchronized void zzc() {
        long length;
        zzaw zzawVar;
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            zzao.zzc("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                zzawVar = new zzaw(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                zzav zza2 = zzav.zza(zzawVar);
                zza2.zza = length;
                zzn(zza2.zzb, zza2);
                zzawVar.close();
            } catch (Throwable th) {
                zzawVar.close();
                throw th;
                break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final synchronized void zzd(String str, boolean z) {
        zzl zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzb(str, zza);
        }
    }

    public final synchronized void zze(String str) {
        boolean delete = zzf(str).delete();
        zzo(str);
        if (delete) {
            return;
        }
        zzao.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzay(File file, int i) {
        this.zzc = new zzau(this, file);
    }

    static byte[] zzg(zzaw zzawVar, long j) throws IOException {
        long zza = zzawVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzawVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zza);
        throw new IOException(sb.toString());
    }
}
