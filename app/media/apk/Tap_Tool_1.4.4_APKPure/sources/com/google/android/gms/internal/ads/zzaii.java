package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaii extends zzwz {
    private static final int[] zzc = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzd;
    private static boolean zze;
    private long zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private float zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private float zzK;
    private boolean zzL;
    private int zzM;
    private zzaij zzN;
    zzaih zzb;
    private final Context zzf;
    private final zzaim zzg;
    private final zzaix zzh;
    private final boolean zzi;
    private zzaig zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private Surface zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzaii(Context context, zzwu zzwuVar, zzxb zzxbVar, long j, boolean z, Handler handler, zzaiy zzaiyVar, int i) {
        super(2, zzwuVar, zzxbVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zzf = applicationContext;
        this.zzg = new zzaim(applicationContext);
        this.zzh = new zzaix(handler, zzaiyVar);
        this.zzi = "NVIDIA".equals(zzaht.zzc);
        this.zzu = -9223372036854775807L;
        this.zzD = -1;
        this.zzE = -1;
        this.zzG = -1.0f;
        this.zzp = 1;
        this.zzM = 0;
        zzaL();
    }

    protected static int zzaA(zzwx zzwxVar, zzjq zzjqVar) {
        if (zzjqVar.zzm != -1) {
            int size = zzjqVar.zzn.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzjqVar.zzn.get(i2).length;
            }
            return zzjqVar.zzm + i;
        }
        return zzaP(zzwxVar, zzjqVar.zzl, zzjqVar.zzq, zzjqVar.zzr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0355, code lost:
        if (r1.equals("602LV") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0751, code lost:
        if (r7 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzaG(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 2780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaii.zzaG(java.lang.String):boolean");
    }

    private static List<zzwx> zzaH(zzxb zzxbVar, zzjq zzjqVar, boolean z, boolean z2) throws zzxi {
        Pair<Integer, Integer> zzf;
        String str = zzjqVar.zzl;
        if (str == null) {
            return Collections.emptyList();
        }
        List<zzwx> zzd2 = zzxn.zzd(zzxn.zzc(str, z, z2), zzjqVar);
        if ("video/dolby-vision".equals(str) && (zzf = zzxn.zzf(zzjqVar)) != null) {
            int intValue = ((Integer) zzf.first).intValue();
            if (intValue == 16 || intValue == 256) {
                zzd2.addAll(zzxn.zzc("video/hevc", z, z2));
            } else if (intValue == 512) {
                zzd2.addAll(zzxn.zzc("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(zzd2);
    }

    private final void zzaI(long j, long j2, zzjq zzjqVar) {
        zzaij zzaijVar = this.zzN;
        if (zzaijVar != null) {
            zzaijVar.zza();
        }
    }

    private final boolean zzaJ(zzwx zzwxVar) {
        return zzaht.zza >= 23 && !this.zzL && !zzaG(zzwxVar.zza) && (!zzwxVar.zzf || zzaib.zza(this.zzf));
    }

    private final void zzaK() {
        zzxr zzay;
        this.zzq = false;
        if (zzaht.zza < 23 || !this.zzL || (zzay = zzay()) == null) {
            return;
        }
        this.zzb = new zzaih(this, zzay, null);
    }

    private final void zzaL() {
        this.zzH = -1;
        this.zzI = -1;
        this.zzK = -1.0f;
        this.zzJ = -1;
    }

    private final void zzaM() {
        int i = this.zzD;
        if (i == -1) {
            if (this.zzE == -1) {
                return;
            }
            i = -1;
        }
        if (this.zzH == i && this.zzI == this.zzE && this.zzJ == this.zzF && this.zzK == this.zzG) {
            return;
        }
        this.zzh.zzf(i, this.zzE, this.zzF, this.zzG);
        this.zzH = this.zzD;
        this.zzI = this.zzE;
        this.zzJ = this.zzF;
        this.zzK = this.zzG;
    }

    private final void zzaN() {
        int i = this.zzH;
        if (i == -1) {
            if (this.zzI == -1) {
                return;
            }
            i = -1;
        }
        this.zzh.zzf(i, this.zzI, this.zzJ, this.zzK);
    }

    private static boolean zzaO(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzaP(zzwx zzwxVar, String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 4:
                i3 = i * i2;
                i4 = 2;
                break;
            case 2:
            case 3:
                if (!"BRAVIA 4K 2015".equals(zzaht.zzd) && (!"Amazon".equals(zzaht.zzc) || (!"KFSOWI".equals(zzaht.zzd) && (!"AFTS".equals(zzaht.zzd) || !zzwxVar.zzf)))) {
                    i3 = zzaht.zzx(i, 16) * zzaht.zzx(i2, 16) * 256;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
                break;
            case 5:
            case 6:
                i3 = i * i2;
                break;
            default:
                return -1;
        }
        return (i3 * 3) / (i4 + i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzA() {
        try {
            super.zzA();
        } finally {
            Surface surface = this.zzn;
            if (surface != null) {
                if (this.zzm == surface) {
                    this.zzm = null;
                }
                surface.release();
                this.zzn = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv, com.google.android.gms.internal.ads.zzlg
    public final void zzI(float f, float f2) throws zzid {
        super.zzI(f, f2);
        this.zzg.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzlg, com.google.android.gms.internal.ads.zzlh
    public final String zzJ() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzlg
    public final boolean zzL() {
        Surface surface;
        if (!super.zzL() || (!this.zzq && (((surface = this.zzn) == null || this.zzm != surface) && zzay() != null && !this.zzL))) {
            if (this.zzu == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.zzu) {
                return true;
            }
            this.zzu = -9223372036854775807L;
            return false;
        }
        this.zzu = -9223372036854775807L;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final int zzO(zzxb zzxbVar, zzjq zzjqVar) throws zzxi {
        int i = 0;
        if (zzags.zzb(zzjqVar.zzl)) {
            boolean z = zzjqVar.zzo != null;
            List<zzwx> zzaH = zzaH(zzxbVar, zzjqVar, z, false);
            if (z && zzaH.isEmpty()) {
                zzaH = zzaH(zzxbVar, zzjqVar, false, false);
            }
            if (zzaH.isEmpty()) {
                return 1;
            }
            if (zzax(zzjqVar)) {
                zzwx zzwxVar = zzaH.get(0);
                boolean zzc2 = zzwxVar.zzc(zzjqVar);
                int i2 = true != zzwxVar.zzd(zzjqVar) ? 8 : 16;
                if (zzc2) {
                    List<zzwx> zzaH2 = zzaH(zzxbVar, zzjqVar, z, true);
                    if (!zzaH2.isEmpty()) {
                        zzwx zzwxVar2 = zzaH2.get(0);
                        if (zzwxVar2.zzc(zzjqVar) && zzwxVar2.zzd(zzjqVar)) {
                            i = 32;
                        }
                    }
                }
                return (true != zzc2 ? 3 : 4) | i2 | i;
            }
            return 2;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final List<zzwx> zzP(zzxb zzxbVar, zzjq zzjqVar, boolean z) throws zzxi {
        return zzaH(zzxbVar, zzjqVar, false, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final zzom zzR(zzwx zzwxVar, zzjq zzjqVar, zzjq zzjqVar2) {
        int i;
        int i2;
        zzom zze2 = zzwxVar.zze(zzjqVar, zzjqVar2);
        int i3 = zze2.zze;
        int i4 = zzjqVar2.zzq;
        zzaig zzaigVar = this.zzj;
        if (i4 > zzaigVar.zza || zzjqVar2.zzr > zzaigVar.zzb) {
            i3 |= 256;
        }
        if (zzaA(zzwxVar, zzjqVar2) > this.zzj.zzc) {
            i3 |= 64;
        }
        String str = zzwxVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zze2.zzd;
            i2 = 0;
        }
        return new zzom(str, zzjqVar, zzjqVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final float zzS(float f, zzjq zzjqVar, zzjq[] zzjqVarArr) {
        float f2 = -1.0f;
        for (zzjq zzjqVar2 : zzjqVarArr) {
            float f3 = zzjqVar2.zzs;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzT(String str, long j, long j2) {
        this.zzh.zzb(str, j, j2);
        this.zzk = zzaG(str);
        zzwx zzal = zzal();
        Objects.requireNonNull(zzal);
        boolean z = false;
        if (zzaht.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb = zzal.zzb();
            int length = zzb.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzb[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzl = z;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzU(String str) {
        this.zzh.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzV(Exception exc) {
        zzagm.zzb("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzh.zzj(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz
    public final zzom zzW(zzjr zzjrVar) throws zzid {
        zzom zzW = super.zzW(zzjrVar);
        this.zzh.zzc(zzjrVar.zza, zzW);
        return zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzX(zzjq zzjqVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zzxr zzay = zzay();
        if (zzay != null) {
            zzay.zzq(this.zzp);
        }
        if (!this.zzL) {
            Objects.requireNonNull(mediaFormat);
            boolean z = false;
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.zzD = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.zzE = integer2;
        } else {
            this.zzD = zzjqVar.zzq;
            this.zzE = zzjqVar.zzr;
        }
        this.zzG = zzjqVar.zzu;
        if (zzaht.zza >= 21) {
            int i = zzjqVar.zzt;
            if (i == 90 || i == 270) {
                int i2 = this.zzD;
                this.zzD = this.zzE;
                this.zzE = i2;
                this.zzG = 1.0f / this.zzG;
            }
        } else {
            this.zzF = zzjqVar.zzt;
        }
        this.zzg.zzf(zzjqVar.zzs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzY(long j) throws zzid {
        zzak(j);
        zzaM();
        this.zza.zze++;
        zzaz();
        zzat(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzZ(zzol zzolVar) throws zzid {
        if (!this.zzL) {
            this.zzy++;
        }
        if (zzaht.zza >= 23 || !this.zzL) {
            return;
        }
        zzY(zzolVar.zzd);
    }

    protected final void zzaD(zzxr zzxrVar, int i, long j) {
        zzahr.zza("skipVideoBuffer");
        zzxrVar.zzj(i, false);
        zzahr.zzb();
        this.zza.zzf++;
    }

    protected final void zzaE(zzxr zzxrVar, int i, long j) {
        zzaM();
        zzahr.zza("releaseOutputBuffer");
        zzxrVar.zzj(i, true);
        zzahr.zzb();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzx = 0;
        zzaz();
    }

    protected final void zzaF(zzxr zzxrVar, int i, long j, long j2) {
        zzaM();
        zzahr.zza("releaseOutputBuffer");
        zzxrVar.zzk(i, j2);
        zzahr.zzb();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzx = 0;
        zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzaa() {
        zzaK();
    }

    protected final void zzac(int i) {
        zzoi zzoiVar = this.zza;
        zzoiVar.zzg += i;
        this.zzw += i;
        int i2 = this.zzx + i;
        this.zzx = i2;
        zzoiVar.zzh = Math.max(i2, zzoiVar.zzh);
    }

    protected final void zzad(long j) {
        zzoi zzoiVar = this.zza;
        zzoiVar.zzj += j;
        zzoiVar.zzk++;
        this.zzB += j;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzae(zzwx zzwxVar, zzxr zzxrVar, zzjq zzjqVar, MediaCrypto mediaCrypto, float f) {
        String str;
        zzaig zzaigVar;
        String str2;
        String str3;
        Point point;
        boolean z;
        Pair<Integer, Integer> zzf;
        int zzaP;
        String str4 = zzwxVar.zzc;
        zzjq[] zzC = zzC();
        int i = zzjqVar.zzq;
        int i2 = zzjqVar.zzr;
        int zzaA = zzaA(zzwxVar, zzjqVar);
        int length = zzC.length;
        if (length != 1) {
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                zzjq zzjqVar2 = zzC[i3];
                if (zzjqVar.zzx != null && zzjqVar2.zzx == null) {
                    zzjp zza = zzjqVar2.zza();
                    zza.zzv(zzjqVar.zzx);
                    zzjqVar2 = zza.zzD();
                }
                if (zzwxVar.zze(zzjqVar, zzjqVar2).zzd != 0) {
                    int i4 = zzjqVar2.zzq;
                    z2 |= i4 == -1 || zzjqVar2.zzr == -1;
                    i = Math.max(i, i4);
                    i2 = Math.max(i2, zzjqVar2.zzr);
                    zzaA = Math.max(zzaA, zzaA(zzwxVar, zzjqVar2));
                }
            }
            if (z2) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                String str5 = "x";
                sb.append("x");
                sb.append(i2);
                String str6 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i5 = zzjqVar.zzr;
                int i6 = zzjqVar.zzq;
                int i7 = i5 > i6 ? i5 : i6;
                int i8 = i5 <= i6 ? i5 : i6;
                float f2 = i8 / i7;
                int[] iArr = zzc;
                str = str4;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (i10 * f2);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    int i12 = i7;
                    int i13 = i8;
                    if (zzaht.zza >= 21) {
                        int i14 = i5 <= i6 ? i10 : i11;
                        if (i5 <= i6) {
                            i10 = i11;
                        }
                        point = zzwxVar.zzg(i14, i10);
                        str2 = str5;
                        str3 = str6;
                        if (zzwxVar.zzf(point.x, point.y, zzjqVar.zzs)) {
                            break;
                        }
                        i9++;
                        iArr = iArr2;
                        i7 = i12;
                        i8 = i13;
                        str5 = str2;
                        str6 = str3;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        try {
                            int zzx = zzaht.zzx(i10, 16) * 16;
                            int zzx2 = zzaht.zzx(i11, 16) * 16;
                            if (zzx * zzx2 <= zzxn.zze()) {
                                int i15 = i5 <= i6 ? zzx : zzx2;
                                if (i5 <= i6) {
                                    zzx = zzx2;
                                }
                                point = new Point(i15, zzx);
                            } else {
                                i9++;
                                iArr = iArr2;
                                i7 = i12;
                                i8 = i13;
                                str5 = str2;
                                str6 = str3;
                            }
                        } catch (zzxi unused) {
                        }
                    }
                }
                str2 = str5;
                str3 = str6;
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzaA = Math.max(zzaA, zzaP(zzwxVar, zzjqVar.zzl, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append(str2);
                    sb2.append(i2);
                    Log.w(str3, sb2.toString());
                }
            } else {
                str = str4;
            }
            zzaigVar = new zzaig(i, i2, zzaA);
        } else {
            if (zzaA != -1 && (zzaP = zzaP(zzwxVar, zzjqVar.zzl, zzjqVar.zzq, zzjqVar.zzr)) != -1) {
                zzaA = Math.min((int) (zzaA * 1.5f), zzaP);
            }
            zzaigVar = new zzaig(i, i2, zzaA);
            str = str4;
        }
        this.zzj = zzaigVar;
        boolean z3 = this.zzi;
        int i16 = this.zzL ? this.zzM : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzjqVar.zzq);
        mediaFormat.setInteger("height", zzjqVar.zzr);
        zzagp.zza(mediaFormat, zzjqVar.zzn);
        float f3 = zzjqVar.zzs;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        zzagp.zzb(mediaFormat, "rotation-degrees", zzjqVar.zzt);
        zzahx zzahxVar = zzjqVar.zzx;
        if (zzahxVar != null) {
            zzagp.zzb(mediaFormat, "color-transfer", zzahxVar.zzc);
            zzagp.zzb(mediaFormat, "color-standard", zzahxVar.zza);
            zzagp.zzb(mediaFormat, "color-range", zzahxVar.zzb);
            byte[] bArr = zzahxVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzjqVar.zzl) && (zzf = zzxn.zzf(zzjqVar)) != null) {
            zzagp.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zzf.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzaigVar.zza);
        mediaFormat.setInteger("max-height", zzaigVar.zzb);
        zzagp.zzb(mediaFormat, "max-input-size", zzaigVar.zzc);
        if (zzaht.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.zzm == null) {
            if (zzaJ(zzwxVar)) {
                if (this.zzn == null) {
                    this.zzn = zzaib.zzb(this.zzf, zzwxVar.zzf);
                }
                this.zzm = this.zzn;
            } else {
                throw new IllegalStateException();
            }
        }
        zzxrVar.zza(mediaFormat, this.zzm, null, 0);
        if (zzaht.zza < 23 || !this.zzL) {
            return;
        }
        this.zzb = new zzaih(this, zzxrVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final boolean zzah(zzwx zzwxVar) {
        return this.zzm != null || zzaJ(zzwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final boolean zzai() {
        return this.zzL && zzaht.zza < 23;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzap() {
        super.zzap();
        this.zzy = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final zzww zzar(Throwable th, zzwx zzwxVar) {
        return new zzaif(th, zzwxVar, this.zzm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzat(long j) {
        super.zzat(j);
        if (this.zzL) {
            return;
        }
        this.zzy--;
    }

    final void zzaz() {
        this.zzs = true;
        if (this.zzq) {
            return;
        }
        this.zzq = true;
        this.zzh.zzg(this.zzm);
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhv, com.google.android.gms.internal.ads.zzlc
    public final void zzt(int i, Object obj) throws zzid {
        int intValue;
        if (i != 1) {
            if (i == 4) {
                this.zzp = ((Integer) obj).intValue();
                zzxr zzay = zzay();
                if (zzay != null) {
                    zzay.zzq(this.zzp);
                    return;
                }
                return;
            } else if (i == 6) {
                this.zzN = (zzaij) obj;
                return;
            } else if (i == 102 && this.zzM != (intValue = ((Integer) obj).intValue())) {
                this.zzM = intValue;
                if (this.zzL) {
                    zzam();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.zzn;
            if (surface2 != null) {
                surface = surface2;
            } else {
                zzwx zzal = zzal();
                if (zzal != null && zzaJ(zzal)) {
                    surface = zzaib.zzb(this.zzf, zzal.zzf);
                    this.zzn = surface;
                }
            }
        }
        if (this.zzm != surface) {
            this.zzm = surface;
            this.zzg.zzc(surface);
            this.zzo = false;
            int zze2 = zze();
            zzxr zzay2 = zzay();
            if (zzay2 != null) {
                if (zzaht.zza < 23 || surface == null || this.zzk) {
                    zzam();
                    zzag();
                } else {
                    zzay2.zzo(surface);
                }
            }
            if (surface == null || surface == this.zzn) {
                zzaL();
                zzaK();
                return;
            }
            zzaN();
            zzaK();
            if (zze2 == 2) {
                this.zzu = -9223372036854775807L;
            }
        } else if (surface == null || surface == this.zzn) {
        } else {
            zzaN();
            if (this.zzo) {
                this.zzh.zzg(this.zzm);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzu(boolean z, boolean z2) throws zzid {
        super.zzu(z, z2);
        boolean z3 = zzD().zzb;
        boolean z4 = true;
        if (z3 && this.zzM == 0) {
            z4 = false;
        }
        zzafs.zzd(z4);
        if (this.zzL != z3) {
            this.zzL = z3;
            zzam();
        }
        this.zzh.zza(this.zza);
        this.zzg.zza();
        this.zzr = z2;
        this.zzs = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzw(long j, boolean z) throws zzid {
        super.zzw(j, z);
        zzaK();
        this.zzg.zzd();
        this.zzz = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzx = 0;
        this.zzu = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    protected final void zzx() {
        this.zzw = 0;
        this.zzv = SystemClock.elapsedRealtime();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zzB = 0L;
        this.zzC = 0;
        this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    protected final void zzy() {
        this.zzu = -9223372036854775807L;
        if (this.zzw > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzh.zzd(this.zzw, elapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = elapsedRealtime;
        }
        int i = this.zzC;
        if (i != 0) {
            this.zzh.zze(this.zzB, i);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzg.zzh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzz() {
        zzaL();
        zzaK();
        this.zzo = false;
        this.zzg.zzi();
        this.zzb = null;
        try {
            super.zzz();
        } finally {
            this.zzh.zzi(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzas(zzol zzolVar) throws zzid {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzolVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzxr zzay = zzay();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzay.zzp(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final boolean zzaf(long j, long j2, zzxr zzxrVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzjq zzjqVar) throws zzid {
        boolean z3;
        int zzG;
        Objects.requireNonNull(zzxrVar);
        if (this.zzt == -9223372036854775807L) {
            this.zzt = j;
        }
        if (j3 != this.zzz) {
            this.zzg.zzg(j3);
            this.zzz = j3;
        }
        long zzaw = zzaw();
        long j4 = j3 - zzaw;
        if (!z || z2) {
            float zzau = zzau();
            int zze2 = zze();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j5 = (long) ((j3 - j) / zzau);
            if (zze2 == 2) {
                j5 -= elapsedRealtime - j2;
            }
            if (this.zzm == this.zzn) {
                if (zzaO(j5)) {
                    zzaD(zzxrVar, i, j4);
                    zzad(j5);
                    return true;
                }
                return false;
            }
            long j6 = elapsedRealtime - this.zzA;
            boolean z4 = this.zzs ? !this.zzq : zze2 == 2 || this.zzr;
            if (this.zzu == -9223372036854775807L && j >= zzaw && (z4 || (zze2 == 2 && zzaO(j5) && j6 > 100000))) {
                long nanoTime = System.nanoTime();
                zzaI(j4, nanoTime, zzjqVar);
                if (zzaht.zza >= 21) {
                    zzaF(zzxrVar, i, j4, nanoTime);
                } else {
                    zzaE(zzxrVar, i, j4);
                }
                zzad(j5);
                return true;
            } else if (zze2 != 2 || j == this.zzt) {
                return false;
            } else {
                long nanoTime2 = System.nanoTime();
                long zzj = this.zzg.zzj((j5 * 1000) + nanoTime2);
                long j7 = (zzj - nanoTime2) / 1000;
                long j8 = this.zzu;
                if (j7 >= -500000 || z2 || (zzG = zzG(j)) == 0) {
                    if (!zzaO(j7) || z2) {
                        if (zzaht.zza >= 21) {
                            if (j7 < 50000) {
                                zzaI(j4, zzj, zzjqVar);
                                zzaF(zzxrVar, i, j4, zzj);
                                zzad(j7);
                                return true;
                            }
                            return false;
                        } else if (j7 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            if (j7 > 11000) {
                                try {
                                    Thread.sleep(((-10000) + j7) / 1000);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    return false;
                                }
                            }
                            zzaI(j4, zzj, zzjqVar);
                            zzaE(zzxrVar, i, j4);
                            zzad(j7);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if (j8 == -9223372036854775807L) {
                        zzahr.zza("dropVideoBuffer");
                        zzxrVar.zzj(i, false);
                        zzahr.zzb();
                        z3 = true;
                        zzac(1);
                    } else {
                        zzaD(zzxrVar, i, j4);
                        z3 = true;
                    }
                    zzad(j7);
                    return z3;
                }
                zzoi zzoiVar = this.zza;
                zzoiVar.zzi++;
                int i4 = this.zzy + zzG;
                if (j8 != -9223372036854775807L) {
                    zzoiVar.zzf += i4;
                } else {
                    zzac(i4);
                }
                zzan();
                return false;
            }
        }
        zzaD(zzxrVar, i, j4);
        return true;
    }
}
