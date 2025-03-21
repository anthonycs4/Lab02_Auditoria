package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzi {
    public static X509Certificate[][] zza(String str) throws zzf, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> zza = zzj.zza(randomAccessFile);
            if (zza != null) {
                ByteBuffer byteBuffer = (ByteBuffer) zza.first;
                long longValue = ((Long) zza.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long zzb = zzj.zzb(byteBuffer);
                if (zzb >= longValue) {
                    StringBuilder sb = new StringBuilder(122);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(zzb);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new zzf(sb.toString());
                } else if (zzj.zzd(byteBuffer) + zzb == longValue) {
                    if (zzb >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(zzb - allocate.capacity());
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i = 8;
                        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                            throw new zzf("No APK Signing Block before ZIP Central Directory");
                        }
                        int i2 = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < allocate.capacity() || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new zzf(sb2.toString());
                        }
                        int i3 = (int) (8 + j2);
                        long j3 = zzb - i3;
                        if (j3 < 0) {
                            StringBuilder sb3 = new StringBuilder(59);
                            sb3.append("APK Signing Block offset out of range: ");
                            sb3.append(j3);
                            throw new zzf(sb3.toString());
                        }
                        ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j4 = allocate2.getLong(0);
                        if (j4 != j2) {
                            StringBuilder sb4 = new StringBuilder(103);
                            sb4.append("APK Signing Block sizes in header and footer do not match: ");
                            sb4.append(j4);
                            sb4.append(" vs ");
                            sb4.append(j2);
                            throw new zzf(sb4.toString());
                        }
                        Pair create = Pair.create(allocate2, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                        long longValue2 = ((Long) create.second).longValue();
                        if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                            int capacity = byteBuffer2.capacity() - 24;
                            if (capacity < 8) {
                                StringBuilder sb5 = new StringBuilder(38);
                                sb5.append("end < start: ");
                                sb5.append(capacity);
                                sb5.append(" < ");
                                sb5.append(8);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                            int capacity2 = byteBuffer2.capacity();
                            if (capacity > byteBuffer2.capacity()) {
                                StringBuilder sb6 = new StringBuilder(41);
                                sb6.append("end > capacity: ");
                                sb6.append(capacity);
                                sb6.append(" > ");
                                sb6.append(capacity2);
                                throw new IllegalArgumentException(sb6.toString());
                            }
                            int limit = byteBuffer2.limit();
                            int position = byteBuffer2.position();
                            byteBuffer2.position(0);
                            byteBuffer2.limit(capacity);
                            byteBuffer2.position(8);
                            ByteBuffer slice = byteBuffer2.slice();
                            slice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(limit);
                            byteBuffer2.position(position);
                            while (slice.hasRemaining()) {
                                i2++;
                                if (slice.remaining() >= i) {
                                    long j5 = slice.getLong();
                                    if (j5 >= 4 && j5 <= 2147483647L) {
                                        int i4 = (int) j5;
                                        int position2 = slice.position() + i4;
                                        if (i4 <= slice.remaining()) {
                                            if (slice.getInt() != 1896449818) {
                                                slice.position(position2);
                                                i = 8;
                                            } else {
                                                X509Certificate[][] zzb2 = zzb(randomAccessFile.getChannel(), new zze(zzi(slice, i4 - 4), longValue2, zzb, longValue, byteBuffer, null));
                                                randomAccessFile.close();
                                                return zzb2;
                                            }
                                        } else {
                                            int remaining = slice.remaining();
                                            StringBuilder sb7 = new StringBuilder(91);
                                            sb7.append("APK Signing Block entry #");
                                            sb7.append(i2);
                                            sb7.append(" size out of range: ");
                                            sb7.append(i4);
                                            sb7.append(", available: ");
                                            sb7.append(remaining);
                                            throw new zzf(sb7.toString());
                                        }
                                    } else {
                                        StringBuilder sb8 = new StringBuilder(76);
                                        sb8.append("APK Signing Block entry #");
                                        sb8.append(i2);
                                        sb8.append(" size out of range: ");
                                        sb8.append(j5);
                                        throw new zzf(sb8.toString());
                                    }
                                } else {
                                    StringBuilder sb9 = new StringBuilder(70);
                                    sb9.append("Insufficient data to read size of APK Signing Block entry #");
                                    sb9.append(i2);
                                    throw new zzf(sb9.toString());
                                }
                            }
                            throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                        }
                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                    }
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(zzb);
                    throw new zzf(sb10.toString());
                } else {
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
            }
            long length = randomAccessFile.length();
            StringBuilder sb11 = new StringBuilder(102);
            sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb11.append(length);
            sb11.append(" bytes");
            throw new zzf(sb11.toString());
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zze zzeVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zza;
                ByteBuffer zzj = zzj(byteBuffer);
                int i = 0;
                while (zzj.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzc(zzj(zzj), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    j = zzeVar.zzb;
                    j2 = zzeVar.zzc;
                    j3 = zzeVar.zzd;
                    byteBuffer2 = zzeVar.zze;
                    zzd(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzf(r5);
        r12 = zzf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] zzc(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzi.zzc(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static void zzd(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzd zzdVar = new zzd(fileChannel, 0L, j);
        zzd zzdVar2 = new zzd(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzj.zzc(duplicate, j);
        zzb zzbVar = new zzb(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] zze = zze(iArr, new zzc[]{zzdVar, zzdVar2, zzbVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i3)), zze[i2])) {
                    throw new SecurityException(zzg(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[][] zze(int[] iArr, zzc[] zzcVarArr) throws DigestException {
        long j;
        int i;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzcVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            int i4 = (int) j3;
            byte[][] bArr = new byte[iArr.length];
            int i5 = 0;
            while (true) {
                length = iArr.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[(zzh(iArr[i5]) * i4) + 5];
                bArr2[0] = 90;
                zzl(i4, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                String zzg = zzg(iArr[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(zzg);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzg.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i7 < i; i = 3) {
                zzc zzcVar = zzcVarArr[i7];
                long j4 = j2;
                long zza = zzcVar.zza();
                while (zza > j2) {
                    int min = (int) Math.min(zza, j);
                    zzl(min, bArr3, 1);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        zzcVar.zzb(messageDigestArr, j5, min);
                        byte[] bArr4 = bArr3;
                        int i10 = 0;
                        while (i10 < iArr.length) {
                            int i11 = iArr[i10];
                            zzc zzcVar2 = zzcVar;
                            byte[] bArr5 = bArr[i10];
                            int zzh = zzh(i11);
                            int i12 = length;
                            MessageDigest messageDigest = messageDigestArr[i10];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * zzh) + 5, zzh);
                            if (digest != zzh) {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                            i10++;
                            zzcVar = zzcVar2;
                            length = i12;
                            messageDigestArr = messageDigestArr2;
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j6 = min;
                        long j7 = j5 + j6;
                        zza -= j6;
                        i8++;
                        bArr3 = bArr4;
                        j2 = 0;
                        j4 = j7;
                        messageDigestArr = messageDigestArr3;
                        j = 1048576;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i8);
                        sb2.append(" of section #");
                        sb2.append(i2);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                i2++;
                i7++;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                byte[] bArr7 = bArr[i13];
                String zzg2 = zzg(i14);
                try {
                    bArr6[i13] = MessageDigest.getInstance(zzg2).digest(bArr7);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzg2.concat(" digest not supported"), e3);
                }
            }
            return bArr6;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    private static int zzf(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzg(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return "SHA-256";
    }

    private static int zzh(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 32;
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(101);
            sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
            sb2.append(i);
            sb2.append(", remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
        return zzi(byteBuffer, i);
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    private static void zzl(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }
}
