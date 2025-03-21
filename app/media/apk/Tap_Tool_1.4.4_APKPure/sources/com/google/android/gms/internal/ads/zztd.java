package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zztd implements zzpr {
    public static final zzpx zza = zzta.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzjq zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzpu zzD;
    private zzqq[] zzE;
    private zzqq[] zzF;
    private boolean zzG;
    private final List<zzjq> zzd;
    private final SparseArray<zztc> zze;
    private final zzahd zzf;
    private final zzahd zzg;
    private final zzahd zzh;
    private final byte[] zzi;
    private final zzahd zzj;
    private final zzxy zzk;
    private final zzahd zzl;
    private final ArrayDeque<zzso> zzm;
    private final ArrayDeque<zztb> zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzahd zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zztc zzy;
    private int zzz;

    static {
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzj("application/x-emsg");
        zzc = zzjpVar.zzD();
    }

    public zztd() {
        this(0, null);
    }

    private final void zza() {
        this.zzo = 0;
        this.zzr = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(long r47) throws com.google.android.gms.internal.ads.zzkr {
        /*
            Method dump skipped, instructions count: 1807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzb(long):void");
    }

    private static int zzc(int i) throws zzkr {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw new zzkr(sb.toString());
    }

    private static void zzh(zzahd zzahdVar, int i, zzto zztoVar) throws zzkr {
        zzahdVar.zzh(i + 8);
        int zzv = zzahdVar.zzv() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zzv & 1) != 0) {
            throw new zzkr("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzv & 2) != 0;
        int zzB = zzahdVar.zzB();
        if (zzB == 0) {
            Arrays.fill(zztoVar.zzm, 0, zztoVar.zze, false);
            return;
        }
        int i2 = zztoVar.zze;
        if (zzB != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(zzB);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw new zzkr(sb.toString());
        }
        Arrays.fill(zztoVar.zzm, 0, zzB, z);
        zztoVar.zza(zzahdVar.zzd());
        zzahdVar.zzm(zztoVar.zzo.zzi(), 0, zztoVar.zzo.zze());
        zztoVar.zzo.zzh(0);
        zztoVar.zzp = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzor zzi(java.util.List<com.google.android.gms.internal.ads.zzsp> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lbb
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzsp r5 = (com.google.android.gms.internal.ads.zzsp) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb7
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzahd r5 = r5.zza
            byte[] r5 = r5.zzi()
            com.google.android.gms.internal.ads.zzahd r6 = new com.google.android.gms.internal.ads.zzahd
            r6.<init>(r5)
            int r8 = r6.zze()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L9b
        L33:
            r6.zzh(r1)
            int r8 = r6.zzv()
            int r9 = r6.zzd()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.zzv()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.zzv()
            int r7 = com.google.android.gms.internal.ads.zzsq.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L6e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L31
        L6e:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzx()
            long r12 = r6.zzx()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L86
            int r8 = r6.zzB()
            int r8 = r8 * 16
            r6.zzk(r8)
        L86:
            int r8 = r6.zzB()
            int r10 = r6.zzd()
            if (r8 == r10) goto L91
            goto L31
        L91:
            byte[] r10 = new byte[r8]
            r6.zzm(r10, r1, r8)
            com.google.android.gms.internal.ads.zztj r6 = new com.google.android.gms.internal.ads.zztj
            r6.<init>(r9, r7, r10)
        L9b:
            if (r6 != 0) goto L9f
            r6 = r2
            goto La3
        L9f:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zztj.zza(r6)
        La3:
            if (r6 != 0) goto Lad
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb7
        Lad:
            com.google.android.gms.internal.ads.zzoq r7 = new com.google.android.gms.internal.ads.zzoq
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb7:
            int r3 = r3 + 1
            goto L8
        Lbb:
            if (r4 != 0) goto Lbe
            return r2
        Lbe:
            com.google.android.gms.internal.ads.zzor r14 = new com.google.android.gms.internal.ads.zzor
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzi(java.util.List):com.google.android.gms.internal.ads.zzor");
    }

    private static final zzsy zzj(SparseArray<zzsy> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        zzsy zzsyVar = sparseArray.get(i);
        Objects.requireNonNull(zzsyVar);
        return zzsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        return zztl.zza(zzpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzD = zzpuVar;
        zza();
        zzqq[] zzqqVarArr = new zzqq[2];
        this.zzE = zzqqVarArr;
        int i = 0;
        zzqq[] zzqqVarArr2 = (zzqq[]) zzaht.zzf(zzqqVarArr, 0);
        this.zzE = zzqqVarArr2;
        for (zzqq zzqqVar : zzqqVarArr2) {
            zzqqVar.zza(zzc);
        }
        this.zzF = new zzqq[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzqq zzbi = this.zzD.zzbi(i2, 3);
            zzbi.zza(this.zzd.get(i));
            this.zzF[i] = zzbi;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024b, code lost:
        r5.zzd(r10, r20, r0.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025e, code lost:
        if (r0.zzn.isEmpty() != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0260, code lost:
        r1 = r0.zzn.removeFirst();
        r0.zzu -= r1.zzb;
        r3 = r1.zza + r10;
        r5 = r0.zzE;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0276, code lost:
        if (r7 >= r6) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0278, code lost:
        r5[r7].zzd(r3, 1, r1.zzb, r0.zzu, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0290, code lost:
        if (r2.zzg() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0292, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0295, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0298, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r0.zzo != 3) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
        r3 = r2.zze();
        r0.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (r2.zzf >= r2.zzi) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        ((com.google.android.gms.internal.ads.zzpo) r1).zze(r3, false);
        r1 = r2.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r1 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
        r3 = r2.zzb.zzo;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
        if (r1 == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        r3.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
        if (r2.zzb.zzc(r2.zzf) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r3.zzk(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
        if (r2.zzg() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
        if (r2.zzd.zza.zzg != 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
        r0.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzpo) r1).zze(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzl) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
        r0.zzA = r2.zzh(r0.zzz, 7);
        com.google.android.gms.internal.ads.zzma.zzb(r0.zzz, r0.zzj);
        com.google.android.gms.internal.ads.zzqo.zzb(r2.zza, r0.zzj, 7);
        r3 = r0.zzA + 7;
        r0.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
        r3 = r2.zzh(r0.zzz, 0);
        r0.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        r0.zzz += r3;
        r0.zzo = 4;
        r0.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
        if (r3.zzj != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
        r3 = r0.zzA;
        r4 = r0.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
        if (r3 >= r4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0148, code lost:
        r0.zzA += com.google.android.gms.internal.ads.zzqo.zza(r5, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
        r7 = r0.zzg.zzi();
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r13 = r3.zzj;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016b, code lost:
        if (r0.zzA >= r0.zzz) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016d, code lost:
        r12 = r0.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:
        if (r12 != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0173, code lost:
        ((com.google.android.gms.internal.ads.zzpo) r1).zzb(r7, r13, r14, false);
        r0.zzg.zzh(0);
        r12 = r0.zzg.zzv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0184, code lost:
        if (r12 <= 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0186, code lost:
        r0.zzB = r12 - 1;
        r0.zzf.zzh(0);
        com.google.android.gms.internal.ads.zzqo.zzb(r5, r0.zzf, 4);
        com.google.android.gms.internal.ads.zzqo.zzb(r5, r0.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
        if (r0.zzF.length <= 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
        r12 = r3.zzf.zzl;
        r17 = r7[4];
        r6 = com.google.android.gms.internal.ads.zzagv.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ad, code lost:
        if ("video/avc".equals(r12) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b1, code lost:
        if ((r17 & 31) == r4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b4, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ba, code lost:
        if ("video/hevc".equals(r12) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
        if (((r17 & 126) >> r8) != 39) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c4, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r0.zzC = r6;
        r0.zzA += 5;
        r0.zzz += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01db, code lost:
        throw new com.google.android.gms.internal.ads.zzkr("Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01de, code lost:
        if (r0.zzC == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
        r0.zzh.zza(r12);
        ((com.google.android.gms.internal.ads.zzpo) r1).zzb(r0.zzh.zzi(), 0, r0.zzB, false);
        com.google.android.gms.internal.ads.zzqo.zzb(r5, r0.zzh, r0.zzB);
        r4 = r0.zzB;
        r6 = com.google.android.gms.internal.ads.zzagv.zza(r0.zzh.zzi(), r0.zzh.zze());
        r0.zzh.zzh("video/hevc".equals(r3.zzf.zzl) ? 1 : 0);
        r0.zzh.zzf(r6);
        com.google.android.gms.internal.ads.zzpl.zza(r10, r0.zzh, r0.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0226, code lost:
        r4 = com.google.android.gms.internal.ads.zzqo.zza(r5, r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022a, code lost:
        r0.zzA += r4;
        r0.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
        r20 = r2.zzf();
        r1 = r2.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0249, code lost:
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r29, com.google.android.gms.internal.ads.zzqj r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            this.zze.valueAt(i).zzb();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zza();
    }

    public zztd(int i, zzahq zzahqVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzxy();
        this.zzl = new zzahd(16);
        this.zzf = new zzahd(zzagv.zza);
        this.zzg = new zzahd(5);
        this.zzh = new zzahd();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzahd(bArr);
        this.zzm = new ArrayDeque<>();
        this.zzn = new ArrayDeque<>();
        this.zze = new SparseArray<>();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzpu.zza;
        this.zzE = new zzqq[0];
        this.zzF = new zzqq[0];
    }
}
