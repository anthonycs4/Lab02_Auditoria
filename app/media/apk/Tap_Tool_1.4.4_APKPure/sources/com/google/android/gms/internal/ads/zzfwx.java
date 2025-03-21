package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfwx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzfww zzfwwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzfwwVar.zza = b;
            return i2;
        }
        return zzb(b, bArr, i2, zzfwwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, byte[] bArr, int i2, zzfww zzfwwVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzfwwVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzfwwVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzfwwVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzfwwVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzfwwVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzfww zzfwwVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzfwwVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & ByteCompanionObject.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzfwwVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zze(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i, zzfww zzfwwVar) throws zzfyy {
        int zza = zza(bArr, i, zzfwwVar);
        int i2 = zzfwwVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzfwwVar.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                return zza;
            }
            zzfwwVar.zzc = new String(bArr, zza, i2, zzfyw.zza);
            return zza + i2;
        }
        throw zzfyy.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i, zzfww zzfwwVar) throws zzfyy {
        int zza = zza(bArr, i, zzfwwVar);
        int i2 = zzfwwVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzfwwVar.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                return zza;
            }
            zzfwwVar.zzc = zzgbn.zzg(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfyy.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i, zzfww zzfwwVar) throws zzfyy {
        int zza = zza(bArr, i, zzfwwVar);
        int i2 = zzfwwVar.zza;
        if (i2 < 0) {
            throw zzfyy.zze();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzfwwVar.zzc = zzfxj.zzb;
                return zza;
            }
            zzfwwVar.zzc = zzfxj.zzs(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfyy.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(zzgak zzgakVar, byte[] bArr, int i, int i2, zzfww zzfwwVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzfwwVar);
            i4 = zzfwwVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzfyy.zzd();
        }
        Object zza = zzgakVar.zza();
        int i6 = i4 + i5;
        zzgakVar.zzi(zza, bArr, i5, i6, zzfwwVar);
        zzgakVar.zzj(zza);
        zzfwwVar.zzc = zza;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(zzgak zzgakVar, byte[] bArr, int i, int i2, int i3, zzfww zzfwwVar) throws IOException {
        zzfzx zzfzxVar = (zzfzx) zzgakVar;
        Object zza = zzfzxVar.zza();
        int zzh = zzfzxVar.zzh(zza, bArr, i, i2, i3, zzfwwVar);
        zzfzxVar.zzj(zza);
        zzfwwVar.zzc = zza;
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i, byte[] bArr, int i2, int i3, zzfyv<?> zzfyvVar, zzfww zzfwwVar) {
        zzfyn zzfynVar = (zzfyn) zzfyvVar;
        int zza = zza(bArr, i2, zzfwwVar);
        zzfynVar.zzh(zzfwwVar.zza);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzfwwVar);
            if (i != zzfwwVar.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzfwwVar);
            zzfynVar.zzh(zzfwwVar.zza);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(byte[] bArr, int i, zzfyv<?> zzfyvVar, zzfww zzfwwVar) throws IOException {
        zzfyn zzfynVar = (zzfyn) zzfyvVar;
        int zza = zza(bArr, i, zzfwwVar);
        int i2 = zzfwwVar.zza + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzfwwVar);
            zzfynVar.zzh(zzfwwVar.zza);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzfyy.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(zzgak<?> zzgakVar, int i, byte[] bArr, int i2, int i3, zzfyv<?> zzfyvVar, zzfww zzfwwVar) throws IOException {
        int zzi = zzi(zzgakVar, bArr, i2, i3, zzfwwVar);
        zzfyvVar.add(zzfwwVar.zzc);
        while (zzi < i3) {
            int zza = zza(bArr, zzi, zzfwwVar);
            if (i != zzfwwVar.zza) {
                break;
            }
            zzi = zzi(zzgakVar, bArr, zza, i3, zzfwwVar);
            zzfyvVar.add(zzfwwVar.zzc);
        }
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(int i, byte[] bArr, int i2, int i3, zzgaz zzgazVar, zzfww zzfwwVar) throws zzfyy {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzc = zzc(bArr, i2, zzfwwVar);
                zzgazVar.zzh(i, Long.valueOf(zzfwwVar.zzb));
                return zzc;
            } else if (i4 == 1) {
                zzgazVar.zzh(i, Long.valueOf(zze(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzfwwVar);
                int i5 = zzfwwVar.zza;
                if (i5 < 0) {
                    throw zzfyy.zze();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzgazVar.zzh(i, zzfxj.zzb);
                    } else {
                        zzgazVar.zzh(i, zzfxj.zzs(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzfyy.zzd();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzgazVar.zzh(i, Integer.valueOf(zzd(bArr, i2)));
                    return i2 + 4;
                }
                throw zzfyy.zzg();
            } else {
                int i6 = (i & (-8)) | 4;
                zzgaz zzb = zzgaz.zzb();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzfwwVar);
                    int i8 = zzfwwVar.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zza2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzn(i8, bArr, zza2, i3, zzb, zzfwwVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzfyy.zzk();
                }
                zzgazVar.zzh(i, zzb);
                return i2;
            }
        }
        throw zzfyy.zzg();
    }
}
