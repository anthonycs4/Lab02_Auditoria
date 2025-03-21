package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzabf implements zzafh, zzzy {
    final /* synthetic */ zzabk zza;
    private final Uri zzc;
    private final zzafo zzd;
    private final zzabb zze;
    private final zzpu zzf;
    private final zzafv zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzqq zzn;
    private boolean zzo;
    private final zzqj zzh = new zzqj();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzaaa.zza();
    private zzaej zzl = zzj(0);

    public zzabf(zzabk zzabkVar, Uri uri, zzaef zzaefVar, zzabb zzabbVar, zzpu zzpuVar, zzafv zzafvVar) {
        this.zza = zzabkVar;
        this.zzc = uri;
        this.zzd = new zzafo(zzaefVar);
        this.zze = zzabbVar;
        this.zzf = zzpuVar;
        this.zzg = zzafvVar;
    }

    public static /* synthetic */ zzafo zzd(zzabf zzabfVar) {
        return zzabfVar.zzd;
    }

    public static /* synthetic */ long zze(zzabf zzabfVar) {
        return zzabfVar.zzb;
    }

    public static /* synthetic */ zzaej zzf(zzabf zzabfVar) {
        return zzabfVar.zzl;
    }

    public static /* synthetic */ long zzg(zzabf zzabfVar) {
        return zzabfVar.zzk;
    }

    public static /* synthetic */ long zzh(zzabf zzabfVar) {
        return zzabfVar.zzm;
    }

    public static /* synthetic */ void zzi(zzabf zzabfVar, long j, long j2) {
        zzabfVar.zzh.zza = j;
        zzabfVar.zzk = j2;
        zzabfVar.zzj = true;
        zzabfVar.zzo = false;
    }

    private final zzaej zzj(long j) {
        Map<String, String> map;
        zzaei zzaeiVar = new zzaei();
        zzaeiVar.zza(this.zzc);
        zzaeiVar.zzc(j);
        zzaeiVar.zzd(6);
        map = zzabk.zzb;
        zzaeiVar.zzb(map);
        return zzaeiVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0095 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ab A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00c1 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00d7 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f3 A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0139 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x014c A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0194 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019d A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #6 {all -> 0x020f, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x008a, B:168:0x0095, B:170:0x00a1, B:172:0x00ab, B:174:0x00b7, B:176:0x00c1, B:178:0x00cd, B:180:0x00d7, B:182:0x00e9, B:184:0x00f3, B:185:0x00f9, B:203:0x0139, B:204:0x013f, B:206:0x014c, B:208:0x0156, B:209:0x0174, B:211:0x0194, B:212:0x0199, B:214:0x019d, B:188:0x0101, B:190:0x010b, B:192:0x0115, B:191:0x0110, B:196:0x011d, B:198:0x0127, B:200:0x0131, B:199:0x012c, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:259:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x022e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01ed A[EDGE_INSN: B:263:0x01ed->B:228:0x01ed ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabf.zzc():void");
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zza(zzahd zzahdVar) {
        long zzS;
        long max;
        if (this.zzo) {
            zzS = this.zza.zzS();
            max = Math.max(zzS, this.zzk);
        } else {
            max = this.zzk;
        }
        int zzd = zzahdVar.zzd();
        zzqq zzqqVar = this.zzn;
        Objects.requireNonNull(zzqqVar);
        zzqo.zzb(zzqqVar, zzahdVar, zzd);
        zzqqVar.zzd(max, 1, zzd, 0, null);
        this.zzo = true;
    }
}
