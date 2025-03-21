package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzsb implements zzpr {
    public static final zzpx zza = zzrw.zza;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzaht.zzr("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID zze = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map<String, Integer> zzf;
    private boolean zzA;
    private int zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private zzagn zzH;
    private zzagn zzI;
    private boolean zzJ;
    private boolean zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private int[] zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private boolean zzab;
    private int zzac;
    private byte zzad;
    private boolean zzae;
    private zzpu zzaf;
    private final zzru zzag;
    private final zzsd zzg;
    private final SparseArray<zzrz> zzh;
    private final boolean zzi;
    private final zzahd zzj;
    private final zzahd zzk;
    private final zzahd zzl;
    private final zzahd zzm;
    private final zzahd zzn;
    private final zzahd zzo;
    private final zzahd zzp;
    private final zzahd zzq;
    private final zzahd zzr;
    private final zzahd zzs;
    private ByteBuffer zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private zzrz zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    public zzsb() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int zzn(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean zzo(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzp(int i) throws zzkr {
        if (this.zzz != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw new zzkr(sb.toString());
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzkr {
        if (this.zzH == null || this.zzI == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw new zzkr(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[EDGE_INSN: B:52:0x00b9->B:41:0x00b9 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzr(com.google.android.gms.internal.ads.zzrz r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsb.zzr(com.google.android.gms.internal.ads.zzrz, long, int, int, int):void");
    }

    private final void zzs(zzps zzpsVar, int i) throws IOException {
        if (this.zzl.zze() >= i) {
            return;
        }
        if (this.zzl.zzj() < i) {
            zzahd zzahdVar = this.zzl;
            int zzj = zzahdVar.zzj();
            zzahdVar.zzc(Math.max(zzj + zzj, i));
        }
        ((zzpo) zzpsVar).zzb(this.zzl.zzi(), this.zzl.zze(), i - this.zzl.zze(), false);
        this.zzl.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzt(zzps zzpsVar, zzrz zzrzVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzrzVar.zzb)) {
            zzv(zzpsVar, zzb, i);
            int i3 = this.zzX;
            zzu();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzrzVar.zzb)) {
            zzv(zzpsVar, zzd, i);
            int i4 = this.zzX;
            zzu();
            return i4;
        } else {
            zzqq zzqqVar = zzrzVar.zzV;
            if (!this.zzZ) {
                if (zzrzVar.zzg) {
                    this.zzT &= -1073741825;
                    if (!this.zzaa) {
                        ((zzpo) zzpsVar).zzb(this.zzl.zzi(), 0, 1, false);
                        this.zzW++;
                        if ((this.zzl.zzi()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                            throw new zzkr("Extension bit is set in signal byte");
                        }
                        this.zzad = this.zzl.zzi()[0];
                        this.zzaa = true;
                    }
                    byte b = this.zzad;
                    if ((b & 1) == 1) {
                        int i5 = b & 2;
                        this.zzT |= BasicMeasure.EXACTLY;
                        if (!this.zzae) {
                            ((zzpo) zzpsVar).zzb(this.zzq.zzi(), 0, 8, false);
                            this.zzW += 8;
                            this.zzae = true;
                            this.zzl.zzi()[0] = (byte) ((i5 != 2 ? 0 : 128) | 8);
                            this.zzl.zzh(0);
                            zzqqVar.zzc(this.zzl, 1, 1);
                            this.zzX++;
                            this.zzq.zzh(0);
                            zzqqVar.zzc(this.zzq, 8, 1);
                            this.zzX += 8;
                        }
                        if (i5 == 2) {
                            if (!this.zzab) {
                                ((zzpo) zzpsVar).zzb(this.zzl.zzi(), 0, 1, false);
                                this.zzW++;
                                this.zzl.zzh(0);
                                this.zzac = this.zzl.zzn();
                                this.zzab = true;
                            }
                            int i6 = this.zzac * 4;
                            this.zzl.zza(i6);
                            ((zzpo) zzpsVar).zzb(this.zzl.zzi(), 0, i6, false);
                            this.zzW += i6;
                            int i7 = (this.zzac >> 1) + 1;
                            int i8 = (i7 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzt;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.zzt = ByteBuffer.allocate(i8);
                            }
                            this.zzt.position(0);
                            this.zzt.putShort((short) i7);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i2 = this.zzac;
                                if (i9 >= i2) {
                                    break;
                                }
                                int zzB = this.zzl.zzB();
                                if (i9 % 2 == 0) {
                                    this.zzt.putShort((short) (zzB - i10));
                                } else {
                                    this.zzt.putInt(zzB - i10);
                                }
                                i9++;
                                i10 = zzB;
                            }
                            int i11 = (i - this.zzW) - i10;
                            if ((i2 & 1) == 1) {
                                this.zzt.putInt(i11);
                            } else {
                                this.zzt.putShort((short) i11);
                                this.zzt.putInt(0);
                            }
                            this.zzr.zzb(this.zzt.array(), i8);
                            zzqqVar.zzc(this.zzr, i8, 1);
                            this.zzX += i8;
                        }
                    }
                } else {
                    byte[] bArr = zzrzVar.zzh;
                    if (bArr != null) {
                        this.zzo.zzb(bArr, bArr.length);
                    }
                }
                if (zzrzVar.zzf > 0) {
                    this.zzT |= 268435456;
                    this.zzs.zza(0);
                    this.zzl.zza(4);
                    this.zzl.zzi()[0] = (byte) ((i >> 24) & 255);
                    this.zzl.zzi()[1] = (byte) ((i >> 16) & 255);
                    this.zzl.zzi()[2] = (byte) ((i >> 8) & 255);
                    this.zzl.zzi()[3] = (byte) (i & 255);
                    zzqqVar.zzc(this.zzl, 4, 2);
                    this.zzX += 4;
                }
                this.zzZ = true;
            }
            int zze2 = i + this.zzo.zze();
            if ("V_MPEG4/ISO/AVC".equals(zzrzVar.zzb) || "V_MPEGH/ISO/HEVC".equals(zzrzVar.zzb)) {
                byte[] zzi = this.zzk.zzi();
                zzi[0] = 0;
                zzi[1] = 0;
                zzi[2] = 0;
                int i12 = zzrzVar.zzW;
                int i13 = 4 - i12;
                while (this.zzW < zze2) {
                    int i14 = this.zzY;
                    if (i14 == 0) {
                        int min = Math.min(i12, this.zzo.zzd());
                        ((zzpo) zzpsVar).zzb(zzi, i13 + min, i12 - min, false);
                        if (min > 0) {
                            this.zzo.zzm(zzi, i13, min);
                        }
                        this.zzW += i12;
                        this.zzk.zzh(0);
                        this.zzY = this.zzk.zzB();
                        this.zzj.zzh(0);
                        zzqo.zzb(zzqqVar, this.zzj, 4);
                        this.zzX += 4;
                    } else {
                        int zzx = zzx(zzpsVar, zzqqVar, i14);
                        this.zzW += zzx;
                        this.zzX += zzx;
                        this.zzY -= zzx;
                    }
                }
            } else {
                if (zzrzVar.zzS != null) {
                    zzafs.zzd(this.zzo.zze() == 0);
                    zzrzVar.zzS.zzb(zzpsVar);
                }
                while (true) {
                    int i15 = this.zzW;
                    if (i15 >= zze2) {
                        break;
                    }
                    int zzx2 = zzx(zzpsVar, zzqqVar, zze2 - i15);
                    this.zzW += zzx2;
                    this.zzX += zzx2;
                }
            }
            if ("A_VORBIS".equals(zzrzVar.zzb)) {
                this.zzm.zzh(0);
                zzqo.zzb(zzqqVar, this.zzm, 4);
                this.zzX += 4;
            }
            int i16 = this.zzX;
            zzu();
            return i16;
        }
    }

    private final void zzu() {
        this.zzW = 0;
        this.zzX = 0;
        this.zzY = 0;
        this.zzZ = false;
        this.zzaa = false;
        this.zzab = false;
        this.zzac = 0;
        this.zzad = (byte) 0;
        this.zzae = false;
        this.zzo.zza(0);
    }

    private final void zzv(zzps zzpsVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzp.zzj() < i2) {
            zzahd zzahdVar = this.zzp;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzahdVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzp.zzi(), 0, length);
        }
        ((zzpo) zzpsVar).zzb(this.zzp.zzi(), length, i, false);
        this.zzp.zzh(0);
        this.zzp.zzf(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzafs.zza(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return zzaht.zzr(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private final int zzx(zzps zzpsVar, zzqq zzqqVar, int i) throws IOException {
        int zzd2 = this.zzo.zzd();
        if (zzd2 > 0) {
            int min = Math.min(i, zzd2);
            zzqo.zzb(zzqqVar, this.zzo, min);
            return min;
        }
        return zzqo.zza(zzqqVar, zzpsVar, i, false);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i, long j, long j2) throws zzkr {
        zzafs.zzf(this.zzaf);
        if (i == 160) {
            this.zzV = false;
        } else if (i == 174) {
            this.zzz = new zzrz(null);
        } else if (i == 187) {
            this.zzJ = false;
        } else if (i == 19899) {
            this.zzB = -1;
            this.zzC = -1L;
        } else if (i == 20533) {
            zzp(i);
            this.zzz.zzg = true;
        } else if (i == 21968) {
            zzp(i);
            this.zzz.zzw = true;
        } else if (i == 408125543) {
            long j3 = this.zzv;
            if (j3 != -1 && j3 != j) {
                throw new zzkr("Multiple Segment elements not supported");
            }
            this.zzv = j;
            this.zzu = j2;
        } else if (i != 475249515) {
            if (i == 524531317 && !this.zzA) {
                if (this.zzi && this.zzE != -1) {
                    this.zzD = true;
                    return;
                }
                this.zzaf.zzbk(new zzql(this.zzy, 0L));
                this.zzA = true;
            }
        } else {
            this.zzH = new zzagn(32);
            this.zzI = new zzagn(32);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0252, code lost:
        if (r3.equals("V_AV1") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r22) throws com.google.android.gms.internal.ads.zzkr {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsb.zzb(int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        return new zzsc().zza(zzpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzaf = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        this.zzK = false;
        while (!this.zzK) {
            if (!this.zzag.zzc(zzpsVar)) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    zzrz valueAt = this.zzh.valueAt(i);
                    zzrz.zzb(valueAt);
                    zzsa zzsaVar = valueAt.zzS;
                    if (zzsaVar != null) {
                        zzsaVar.zzd(valueAt);
                    }
                }
                return -1;
            }
            long zzn = zzpsVar.zzn();
            if (this.zzD) {
                this.zzF = zzn;
                zzqjVar.zza = this.zzE;
                this.zzD = false;
                return 1;
            } else if (this.zzA) {
                long j = this.zzF;
                if (j != -1) {
                    zzqjVar.zza = j;
                    this.zzF = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        this.zzG = -9223372036854775807L;
        this.zzL = 0;
        this.zzag.zzb();
        this.zzg.zza();
        zzu();
        for (int i = 0; i < this.zzh.size(); i++) {
            zzsa zzsaVar = this.zzh.valueAt(i).zzS;
            if (zzsaVar != null) {
                zzsaVar.zza();
            }
        }
    }

    public zzsb(int i) {
        zzru zzruVar = new zzru();
        this.zzv = -1L;
        this.zzw = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzE = -1L;
        this.zzF = -1L;
        this.zzG = -9223372036854775807L;
        this.zzag = zzruVar;
        zzruVar.zza(new zzry(this, null));
        this.zzi = true;
        this.zzg = new zzsd();
        this.zzh = new SparseArray<>();
        this.zzl = new zzahd(4);
        this.zzm = new zzahd(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzn = new zzahd(4);
        this.zzj = new zzahd(zzagv.zza);
        this.zzk = new zzahd(4);
        this.zzo = new zzahd();
        this.zzp = new zzahd();
        this.zzq = new zzahd(8);
        this.zzr = new zzahd();
        this.zzs = new zzahd();
        this.zzQ = new int[1];
    }

    private final long zzy(long j) throws zzkr {
        long j2 = this.zzw;
        if (j2 == -9223372036854775807L) {
            throw new zzkr("Can't scale timecode prior to timecodeScale being set.");
        }
        return zzaht.zzG(j, j2, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(int i, String str) throws zzkr {
        if (i == 134) {
            zzp(i);
            this.zzz.zzb = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzkr(sb.toString());
        } else if (i == 21358) {
            zzp(i);
            this.zzz.zza = str;
        } else if (i != 2274716) {
        } else {
            zzp(i);
            zzrz.zzd(this.zzz, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x028b, code lost:
        throw new com.google.android.gms.internal.ads.zzkr("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(int r19, int r20, com.google.android.gms.internal.ads.zzps r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsb.zzj(int, int, com.google.android.gms.internal.ads.zzps):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(int i, long j) throws zzkr {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new zzkr(sb.toString());
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new zzkr(sb2.toString());
        } else {
            switch (i) {
                case 131:
                    zzp(i);
                    this.zzz.zzd = (int) j;
                    return;
                case 136:
                    zzp(i);
                    this.zzz.zzU = j == 1;
                    return;
                case 155:
                    this.zzN = zzy(j);
                    return;
                case 159:
                    zzp(i);
                    this.zzz.zzN = (int) j;
                    return;
                case 176:
                    zzp(i);
                    this.zzz.zzl = (int) j;
                    return;
                case 179:
                    zzq(i);
                    this.zzH.zza(zzy(j));
                    return;
                case 186:
                    zzp(i);
                    this.zzz.zzm = (int) j;
                    return;
                case 215:
                    zzp(i);
                    this.zzz.zzc = (int) j;
                    return;
                case 231:
                    this.zzG = zzy(j);
                    return;
                case 238:
                    this.zzU = (int) j;
                    return;
                case 241:
                    if (this.zzJ) {
                        return;
                    }
                    zzq(i);
                    this.zzI.zza(j);
                    this.zzJ = true;
                    return;
                case 251:
                    this.zzV = true;
                    return;
                case 16871:
                    zzp(i);
                    zzrz.zzc(this.zzz, (int) j);
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzkr(sb3.toString());
                case 17029:
                    if (j < 1 || j > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j);
                        sb4.append(" not supported");
                        throw new zzkr(sb4.toString());
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzkr(sb5.toString());
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzkr(sb6.toString());
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzkr(sb7.toString());
                case 21420:
                    this.zzC = j + this.zzv;
                    return;
                case 21432:
                    zzp(i);
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzz.zzv = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzz.zzv = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzz.zzv = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzz.zzv = 3;
                        return;
                    }
                case 21680:
                    zzp(i);
                    this.zzz.zzn = (int) j;
                    return;
                case 21682:
                    zzp(i);
                    this.zzz.zzp = (int) j;
                    return;
                case 21690:
                    zzp(i);
                    this.zzz.zzo = (int) j;
                    return;
                case 21930:
                    zzp(i);
                    this.zzz.zzT = j == 1;
                    return;
                case 21998:
                    zzp(i);
                    this.zzz.zzf = (int) j;
                    return;
                case 22186:
                    zzp(i);
                    this.zzz.zzQ = j;
                    return;
                case 22203:
                    zzp(i);
                    this.zzz.zzR = j;
                    return;
                case 25188:
                    zzp(i);
                    this.zzz.zzO = (int) j;
                    return;
                case 30321:
                    zzp(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.zzz.zzq = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzz.zzq = 1;
                        return;
                    } else if (i3 == 2) {
                        this.zzz.zzq = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.zzz.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzp(i);
                    this.zzz.zze = (int) j;
                    return;
                case 2807729:
                    this.zzw = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            zzp(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.zzz.zzz = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzz.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzp(i);
                            int i5 = (int) j;
                            if (i5 != 1) {
                                if (i5 == 16) {
                                    this.zzz.zzy = 6;
                                    return;
                                } else if (i5 == 18) {
                                    this.zzz.zzy = 7;
                                    return;
                                } else if (i5 != 6 && i5 != 7) {
                                    return;
                                }
                            }
                            this.zzz.zzy = 3;
                            return;
                        case 21947:
                            zzp(i);
                            zzrz zzrzVar = this.zzz;
                            zzrzVar.zzw = true;
                            int i6 = (int) j;
                            if (i6 == 1) {
                                zzrzVar.zzx = 1;
                                return;
                            } else if (i6 == 9) {
                                zzrzVar.zzx = 6;
                                return;
                            } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                zzrzVar.zzx = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            zzp(i);
                            this.zzz.zzA = (int) j;
                            return;
                        case 21949:
                            zzp(i);
                            this.zzz.zzB = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(int i, double d) throws zzkr {
        if (i == 181) {
            zzp(i);
            this.zzz.zzP = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzp(i);
                    this.zzz.zzC = (float) d;
                    return;
                case 21970:
                    zzp(i);
                    this.zzz.zzD = (float) d;
                    return;
                case 21971:
                    zzp(i);
                    this.zzz.zzE = (float) d;
                    return;
                case 21972:
                    zzp(i);
                    this.zzz.zzF = (float) d;
                    return;
                case 21973:
                    zzp(i);
                    this.zzz.zzG = (float) d;
                    return;
                case 21974:
                    zzp(i);
                    this.zzz.zzH = (float) d;
                    return;
                case 21975:
                    zzp(i);
                    this.zzz.zzI = (float) d;
                    return;
                case 21976:
                    zzp(i);
                    this.zzz.zzJ = (float) d;
                    return;
                case 21977:
                    zzp(i);
                    this.zzz.zzK = (float) d;
                    return;
                case 21978:
                    zzp(i);
                    this.zzz.zzL = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzp(i);
                            this.zzz.zzr = (float) d;
                            return;
                        case 30324:
                            zzp(i);
                            this.zzz.zzs = (float) d;
                            return;
                        case 30325:
                            zzp(i);
                            this.zzz.zzt = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzx = (long) d;
        }
    }
}
