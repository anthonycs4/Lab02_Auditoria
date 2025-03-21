package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzwz extends zzhv {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private ArrayDeque<zzwx> zzA;
    private zzwy zzB;
    private zzwx zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzwt zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzoi zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private zzid zzal;
    private long zzam;
    private long zzan;
    private int zzao;
    private zzxr zzap;
    private zzpa zzaq;
    private zzpa zzar;
    private final zzwu zzc;
    private final zzxb zzd;
    private final float zze;
    private final zzol zzf;
    private final zzol zzg;
    private final zzol zzh;
    private final zzws zzi;
    private final zzahp<zzjq> zzj;
    private final ArrayList<Long> zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzjq zzp;
    private zzjq zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzjq zzw;
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzwz(int i, zzwu zzwuVar, zzxb zzxbVar, boolean z, float f) {
        super(i);
        this.zzc = zzwuVar;
        Objects.requireNonNull(zzxbVar);
        this.zzd = zzxbVar;
        this.zze = f;
        this.zzf = new zzol(0, 0);
        this.zzg = new zzol(0, 0);
        this.zzh = new zzol(2, 0);
        zzws zzwsVar = new zzws();
        this.zzi = zzwsVar;
        this.zzj = new zzahp<>(10);
        this.zzk = new ArrayList<>();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzam = -9223372036854775807L;
        this.zzan = -9223372036854775807L;
        zzwsVar.zzi(0);
        zzwsVar.zzb.order(ByteOrder.nativeOrder());
        zzaq();
    }

    private final void zzY() {
        this.zzX = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzW = false;
        this.zzV = false;
    }

    private final boolean zzaA() {
        return this.zzR >= 0;
    }

    private final void zzaB() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaC() {
        this.zzR = -1;
        this.zzS = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaD() throws zzid {
        zzxr zzxrVar = this.zzap;
        boolean z = 0;
        if (zzxrVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zzc = zzxrVar.zzc();
            this.zzQ = zzc;
            if (zzc < 0) {
                return false;
            }
            this.zzg.zzb = this.zzap.zzf(zzc);
            this.zzg.zza();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzap.zzh(this.zzQ, 0, 0, 0L, 4);
                zzaB();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzap.zzh(this.zzQ, 0, 38, 0L, 0);
            zzaB();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzw.zzn.size(); i++) {
                    this.zzg.zzb.put(this.zzw.zzn.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzjr zzB = zzB();
            try {
                int zzF = zzF(zzB, this.zzg, 0);
                if (zzj()) {
                    this.zzag = this.zzaf;
                }
                if (zzF == -3) {
                    return false;
                }
                if (zzF == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zza();
                        this.zzZ = 1;
                    }
                    zzW(zzB);
                    return true;
                } else if (!this.zzg.zzc()) {
                    if (this.zzac || this.zzg.zzd()) {
                        boolean zzj = this.zzg.zzj();
                        if (zzj) {
                            this.zzg.zza.zzc(position);
                        }
                        if (this.zzE && !zzj) {
                            ByteBuffer byteBuffer = this.zzg.zzb;
                            byte[] bArr = zzagv.zza;
                            int position2 = byteBuffer.position();
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                int i4 = i2 + 1;
                                if (i4 < position2) {
                                    int i5 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                                    if (i3 == 3) {
                                        if (i5 == 1) {
                                            if ((byteBuffer.get(i4) & 31) == 7) {
                                                ByteBuffer duplicate = byteBuffer.duplicate();
                                                duplicate.position(i2 - 3);
                                                duplicate.limit(position2);
                                                byteBuffer.position(0);
                                                byteBuffer.put(duplicate);
                                                break;
                                            }
                                            i5 = 1;
                                        }
                                    } else if (i5 == 0) {
                                        i3++;
                                    }
                                    if (i5 != 0) {
                                        i3 = 0;
                                    }
                                    i2 = i4;
                                } else {
                                    byteBuffer.clear();
                                    break;
                                }
                            }
                            if (this.zzg.zzb.position() == 0) {
                                return true;
                            }
                            this.zzE = false;
                        }
                        zzol zzolVar = this.zzg;
                        long j = zzolVar.zzd;
                        zzwt zzwtVar = this.zzO;
                        if (zzwtVar != null) {
                            j = zzwtVar.zzb(this.zzp, zzolVar);
                        }
                        long j2 = j;
                        if (this.zzg.zzb()) {
                            this.zzk.add(Long.valueOf(j2));
                        }
                        if (this.zzaj) {
                            this.zzj.zza(j2, this.zzp);
                            this.zzaj = false;
                        }
                        if (this.zzO != null) {
                            this.zzaf = Math.max(this.zzaf, this.zzg.zzd);
                        } else {
                            this.zzaf = Math.max(this.zzaf, j2);
                        }
                        this.zzg.zzk();
                        if (this.zzg.zze()) {
                            zzas(this.zzg);
                        }
                        zzZ(this.zzg);
                        try {
                            if (zzj) {
                                this.zzap.zzi(this.zzQ, 0, this.zzg.zza, j2, 0);
                            } else {
                                this.zzap.zzh(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                            }
                            zzaB();
                            this.zzac = true;
                            this.zzZ = 0;
                            zzoi zzoiVar = this.zza;
                            z = zzoiVar.zzc + 1;
                            zzoiVar.zzc = z;
                            return true;
                        } catch (MediaCodec.CryptoException e) {
                            throw zzE(e, this.zzp, z);
                        }
                    } else {
                        this.zzg.zza();
                        if (this.zzZ == 2) {
                            this.zzZ = 1;
                        }
                        return true;
                    }
                } else {
                    if (this.zzZ == 2) {
                        this.zzg.zza();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzaH();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzap.zzh(this.zzQ, 0, 0, 0L, 4);
                            zzaB();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw zzE(e2, this.zzp, false);
                    }
                }
            } catch (zzok e3) {
                zzV(e3);
                throw zzE(zzar(e3, this.zzC), this.zzp, false);
            }
        }
    }

    private final boolean zzaE(zzjq zzjqVar) throws zzid {
        if (zzaht.zza >= 23 && this.zzap != null && this.zzab != 3 && zze() != 0) {
            float zzS = zzS(this.zzv, zzjqVar, zzC());
            float f = this.zzz;
            if (f == zzS) {
                return true;
            }
            if (zzS == -1.0f) {
                zzaG();
                return false;
            } else if (f == -1.0f && zzS <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzS);
                this.zzap.zzp(bundle);
                this.zzz = zzS;
            }
        }
        return true;
    }

    private final boolean zzaF() throws zzid {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzF || this.zzH) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaI();
        }
        return true;
    }

    private final void zzaG() throws zzid {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzam();
        zzag();
    }

    private final void zzaI() throws zzid {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzE(e, this.zzp, false);
        }
    }

    private final void zzac() {
        try {
            this.zzap.zzl();
        } finally {
            zzap();
        }
    }

    private final boolean zzad(int i) throws zzid {
        zzjr zzB = zzB();
        this.zzf.zza();
        int zzF = zzF(zzB, this.zzf, i | 4);
        if (zzF == -5) {
            zzW(zzB);
            return true;
        } else if (zzF == -4 && this.zzf.zzc()) {
            this.zzah = true;
            zzaH();
            return false;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzax(zzjq zzjqVar) {
        Class cls = zzjqVar.zzE;
        return cls == null || zzpb.class.equals(cls);
    }

    private final boolean zzaz(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhv
    public void zzA() {
        try {
            zzY();
            zzam();
        } finally {
            this.zzar = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhv, com.google.android.gms.internal.ads.zzlg
    public void zzI(float f, float f2) throws zzid {
        this.zzu = f;
        this.zzv = f2;
        zzaE(this.zzw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0327 A[LOOP:0: B:84:0x0162->B:184:0x0327, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0337 A[Catch: IllegalStateException -> 0x0368, TryCatch #9 {IllegalStateException -> 0x0368, blocks: (B:181:0x0320, B:186:0x0331, B:188:0x0337, B:190:0x033d, B:177:0x0308, B:179:0x031a, B:197:0x034e), top: B:251:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // com.google.android.gms.internal.ads.zzlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzK(long r24, long r26) throws com.google.android.gms.internal.ads.zzid {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwz.zzK(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public boolean zzL() {
        if (this.zzp != null) {
            if (zzH() || zzaA()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final int zzN(zzjq zzjqVar) throws zzid {
        try {
            return zzO(this.zzd, zzjqVar);
        } catch (zzxi e) {
            throw zzE(e, zzjqVar, false);
        }
    }

    protected abstract int zzO(zzxb zzxbVar, zzjq zzjqVar) throws zzxi;

    protected abstract List<zzwx> zzP(zzxb zzxbVar, zzjq zzjqVar, boolean z) throws zzxi;

    protected boolean zzQ(zzjq zzjqVar) {
        return false;
    }

    protected zzom zzR(zzwx zzwxVar, zzjq zzjqVar, zzjq zzjqVar2) {
        throw null;
    }

    protected float zzS(float f, zzjq zzjqVar, zzjq[] zzjqVarArr) {
        throw null;
    }

    protected void zzT(String str, long j, long j2) {
        throw null;
    }

    protected void zzU(String str) {
        throw null;
    }

    protected void zzV(Exception exc) {
        throw null;
    }

    protected void zzX(zzjq zzjqVar, MediaFormat mediaFormat) throws zzid {
        throw null;
    }

    protected void zzZ(zzol zzolVar) throws zzid {
        throw null;
    }

    protected void zzaa() {
    }

    protected void zzab() throws zzid {
    }

    protected abstract void zzae(zzwx zzwxVar, zzxr zzxrVar, zzjq zzjqVar, MediaCrypto mediaCrypto, float f);

    protected abstract boolean zzaf(long j, long j2, zzxr zzxrVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzjq zzjqVar) throws zzid;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0226 A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0261 A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0272 A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cb A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e2 A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f3 A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x033c A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034a A[Catch: Exception -> 0x0373, TryCatch #5 {Exception -> 0x0373, blocks: (B:48:0x00bc, B:52:0x00d5, B:66:0x012f, B:69:0x0141, B:71:0x0147, B:73:0x0151, B:75:0x015b, B:77:0x0165, B:96:0x01b2, B:98:0x01bc, B:100:0x01c4, B:104:0x01cf, B:106:0x01d9, B:108:0x01dd, B:110:0x01e5, B:112:0x01ed, B:114:0x01f1, B:116:0x01fb, B:118:0x0203, B:123:0x020d, B:125:0x0215, B:129:0x0220, B:131:0x0226, B:147:0x025b, B:149:0x0261, B:153:0x026c, B:155:0x0272, B:157:0x027a, B:159:0x0284, B:161:0x028e, B:163:0x0298, B:165:0x02a2, B:167:0x02ac, B:169:0x02b6, B:173:0x02c3, B:175:0x02cb, B:177:0x02cf, B:181:0x02da, B:183:0x02e2, B:208:0x0330, B:210:0x033c, B:211:0x0343, B:213:0x034a, B:214:0x0353, B:187:0x02ed, B:189:0x02f3, B:191:0x02fb, B:193:0x02ff, B:195:0x0307, B:197:0x030f, B:199:0x0319, B:201:0x0323, B:204:0x0328, B:135:0x0231, B:137:0x0235, B:139:0x023f, B:141:0x0249, B:143:0x0251, B:80:0x0171, B:82:0x0177, B:84:0x017f, B:86:0x0187, B:88:0x0191, B:90:0x019b, B:92:0x01a5, B:223:0x036f, B:224:0x0372, B:51:0x00c9), top: B:252:0x00bc, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzag() throws com.google.android.gms.internal.ads.zzid {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwz.zzag():void");
    }

    protected boolean zzah(zzwx zzwxVar) {
        return true;
    }

    protected boolean zzai() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaj(zzid zzidVar) {
        this.zzal = zzidVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzak(long j) throws zzid {
        zzjq zze = this.zzj.zze(j);
        if (zze == null && this.zzy) {
            zze = this.zzj.zzd();
        }
        if (zze != null) {
            this.zzq = zze;
        } else if (!this.zzy || this.zzq == null) {
            return;
        }
        zzX(this.zzq, this.zzx);
        this.zzy = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzwx zzal() {
        return this.zzC;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzxr, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzpa] */
    public final void zzam() {
        try {
            zzxr zzxrVar = this.zzap;
            if (zzxrVar != null) {
                zzxrVar.zzm();
                this.zza.zzb++;
                zzU(this.zzC.zza);
            }
        } finally {
            this.zzap = null;
            this.zzr = null;
            this.zzaq = null;
            zzaq();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzan() throws zzid {
        boolean zzao = zzao();
        if (zzao) {
            zzag();
        }
        return zzao;
    }

    protected final boolean zzao() {
        if (this.zzap == null) {
            return false;
        }
        if (this.zzab != 3 && !this.zzF && ((!this.zzG || this.zzae) && (!this.zzH || !this.zzad))) {
            zzac();
            return false;
        }
        zzam();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzap() {
        zzaB();
        zzaC();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzwt zzwtVar = this.zzO;
        if (zzwtVar != null) {
            zzwtVar.zza();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    protected final void zzaq() {
        zzap();
        this.zzal = null;
        this.zzO = null;
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzae = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    protected zzww zzar(Throwable th, zzwx zzwxVar) {
        return new zzww(th, zzwxVar);
    }

    protected void zzas(zzol zzolVar) throws zzid {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzat(long j) {
        while (true) {
            int i = this.zzao;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzam = jArr[0];
            this.zzan = this.zzn[0];
            int i2 = i - 1;
            this.zzao = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzao);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzao);
            zzaa();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float zzau() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzav() {
        this.zzak = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzaw() {
        return this.zzan;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzxr zzay() {
        return this.zzap;
    }

    @Override // com.google.android.gms.internal.ads.zzhv, com.google.android.gms.internal.ads.zzlh
    public final int zzs() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhv
    public void zzu(boolean z, boolean z2) throws zzid {
        this.zza = new zzoi();
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    protected final void zzv(zzjq[] zzjqVarArr, long j, long j2) throws zzid {
        if (this.zzan == -9223372036854775807L) {
            zzafs.zzd(this.zzam == -9223372036854775807L);
            this.zzam = j;
            this.zzan = j2;
            return;
        }
        int i = this.zzao;
        if (i == 10) {
            long j3 = this.zzn[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.zzao = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzao - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhv
    public void zzw(long j, boolean z) throws zzid {
        this.zzah = false;
        this.zzai = false;
        this.zzak = false;
        if (this.zzV) {
            this.zzi.zza();
            this.zzh.zza();
            this.zzW = false;
        } else {
            zzan();
        }
        if (this.zzj.zzc() > 0) {
            this.zzaj = true;
        }
        this.zzj.zzb();
        int i = this.zzao;
        if (i != 0) {
            int i2 = i - 1;
            this.zzan = this.zzn[i2];
            this.zzam = this.zzm[i2];
            this.zzao = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhv
    public void zzz() {
        this.zzp = null;
        this.zzam = -9223372036854775807L;
        this.zzan = -9223372036854775807L;
        this.zzao = 0;
        if (this.zzar != null || this.zzaq != null) {
            zzA();
        } else {
            zzao();
        }
    }

    private final void zzaH() throws zzid {
        int i = this.zzab;
        if (i == 1) {
            zzac();
        } else if (i == 2) {
            zzac();
            zzaI();
        } else if (i == 3) {
            zzam();
            zzag();
        } else {
            this.zzai = true;
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (zzaF() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (zzaF() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (zzaF() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzom zzW(com.google.android.gms.internal.ads.zzjr r13) throws com.google.android.gms.internal.ads.zzid {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwz.zzW(com.google.android.gms.internal.ads.zzjr):com.google.android.gms.internal.ads.zzom");
    }
}
