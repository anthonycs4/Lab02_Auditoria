package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzjb extends zzhu implements zzif {
    private zzaca zzA;
    final zzadq zzb;
    final zzkx zzc;
    private final zzlg[] zzd;
    private final zzadp zze;
    private final zzagf zzf;
    private final zzjj zzg;
    private final zzjl zzh;
    private final zzagl<zzky> zzi;
    private final CopyOnWriteArraySet<zzie> zzj;
    private final zzln zzk;
    private final List<zzja> zzl;
    private final boolean zzm;
    private final zzaau zzn;
    private final Looper zzo;
    private final zzadx zzp;
    private final zzaft zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private int zzu;
    private zzlj zzv;
    private zzkx zzw;
    private zzks zzx;
    private int zzy;
    private long zzz;

    public zzjb(zzlg[] zzlgVarArr, zzadp zzadpVar, zzaau zzaauVar, zzchd zzchdVar, zzadx zzadxVar, zzlr zzlrVar, boolean z, zzlj zzljVar, zzhz zzhzVar, long j, boolean z2, zzaft zzaftVar, Looper looper, zzla zzlaVar, zzkx zzkxVar, byte[] bArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzaht.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.13.2] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.zzd = zzlgVarArr;
        Objects.requireNonNull(zzadpVar);
        this.zze = zzadpVar;
        this.zzn = zzaauVar;
        this.zzp = zzadxVar;
        this.zzm = true;
        this.zzv = zzljVar;
        this.zzo = looper;
        this.zzq = zzaftVar;
        this.zzi = new zzagl<>(looper, zzaftVar, new zzagj(this) { // from class: com.google.android.gms.internal.ads.zzih
            private final zzla zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }
        });
        this.zzj = new CopyOnWriteArraySet<>();
        this.zzl = new ArrayList();
        this.zzA = new zzaca(0);
        zzadq zzadqVar = new zzadq(new zzli[2], new zzacs[2], null, null);
        this.zzb = zzadqVar;
        this.zzk = new zzln();
        zzkw zzkwVar = new zzkw();
        zzkwVar.zzc(1, 2, 8, 9, 10, 11, 12, 13, 14);
        zzkwVar.zzd(zzkxVar);
        zzkx zze = zzkwVar.zze();
        this.zzc = zze;
        zzkw zzkwVar2 = new zzkw();
        zzkwVar2.zzd(zze);
        zzkwVar2.zza(3);
        zzkwVar2.zza(7);
        this.zzw = zzkwVar2.zze();
        this.zzy = -1;
        this.zzf = zzaftVar.zza(looper, null);
        zzjj zzjjVar = new zzjj(this) { // from class: com.google.android.gms.internal.ads.zzis
            private final zzjb zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzjj
            public final void zza(zzji zzjiVar) {
                this.zza.zzr(zzjiVar);
            }
        };
        this.zzg = zzjjVar;
        this.zzx = zzks.zza(zzadqVar);
        this.zzh = new zzjl(zzlgVarArr, zzadpVar, zzadqVar, zzchdVar, zzadxVar, 0, false, null, zzljVar, zzhzVar, 500L, false, looper, zzaftVar, zzjjVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzA(zzks zzksVar) {
        return zzksVar.zze == 3 && zzksVar.zzl && zzksVar.zzm == 0;
    }

    private final int zzt() {
        if (this.zzx.zza.zzt()) {
            return this.zzy;
        }
        zzks zzksVar = this.zzx;
        return zzksVar.zza.zzf(zzksVar.zzb.zza, this.zzk).zzc;
    }

    private final long zzu(zzks zzksVar) {
        if (zzksVar.zza.zzt()) {
            return zzhx.zzb(this.zzz);
        }
        if (zzksVar.zzb.zzb()) {
            return zzksVar.zzs;
        }
        zzlq zzlqVar = zzksVar.zza;
        zzaaj zzaajVar = zzksVar.zzb;
        long j = zzksVar.zzs;
        zzz(zzlqVar, zzaajVar, j);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzv(final com.google.android.gms.internal.ads.zzks r39, final int r40, final int r41, boolean r42, boolean r43, final int r44, long r45, int r47) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjb.zzv(com.google.android.gms.internal.ads.zzks, int, int, boolean, boolean, int, long, int):void");
    }

    private static long zzw(zzks zzksVar) {
        zzlp zzlpVar = new zzlp();
        zzln zzlnVar = new zzln();
        zzksVar.zza.zzf(zzksVar.zzb.zza, zzlnVar);
        long j = zzksVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzksVar.zza.zze(zzlnVar.zzc, zzlpVar, 0L).zzm;
            return 0L;
        }
        return j;
    }

    private final zzks zzx(zzks zzksVar, zzlq zzlqVar, Pair<Object, Long> pair) {
        long zzn;
        zzaaj zzaajVar;
        zzadq zzadqVar;
        int i;
        zzks zzc;
        long j;
        zzafs.zza(zzlqVar.zzt() || pair != null);
        zzlq zzlqVar2 = zzksVar.zza;
        zzks zzd = zzksVar.zzd(zzlqVar);
        if (zzlqVar.zzt()) {
            zzaaj zzb = zzks.zzb();
            long zzb2 = zzhx.zzb(this.zzz);
            zzks zzg = zzd.zzc(zzb, zzb2, zzb2, zzb2, 0L, zzach.zza, this.zzb, zzfgz.zzi()).zzg(zzb);
            zzg.zzq = zzg.zzs;
            return zzg;
        }
        Object obj = zzd.zzb.zza;
        int i2 = zzaht.zza;
        boolean z = !obj.equals(pair.first);
        zzaaj zzaajVar2 = z ? new zzaaj(pair.first) : zzd.zzb;
        long longValue = ((Long) pair.second).longValue();
        if (zzp()) {
            zzks zzksVar2 = this.zzx;
            zzksVar2.zza.zzf(zzksVar2.zzb.zza, this.zzk);
            zzks zzksVar3 = this.zzx;
            if (zzksVar3.zzc == -9223372036854775807L) {
                long j2 = zzksVar3.zza.zze(zzl(), this.zza, 0L).zzm;
                zzn = zzhx.zza(0L);
            } else {
                zzn = zzhx.zza(0L) + zzhx.zza(this.zzx.zzc);
            }
        } else {
            zzn = zzn();
        }
        long zzb3 = zzhx.zzb(zzn);
        if (!zzlqVar2.zzt()) {
            zzlqVar2.zzf(obj, this.zzk);
        }
        if (z || longValue < zzb3) {
            zzafs.zzd(!zzaajVar2.zzb());
            zzach zzachVar = z ? zzach.zza : zzd.zzh;
            if (z) {
                zzaajVar = zzaajVar2;
                zzadqVar = this.zzb;
            } else {
                zzaajVar = zzaajVar2;
                zzadqVar = zzd.zzi;
            }
            zzks zzg2 = zzd.zzc(zzaajVar, longValue, longValue, longValue, 0L, zzachVar, zzadqVar, z ? zzfgz.zzi() : zzd.zzj).zzg(zzaajVar);
            zzg2.zzq = longValue;
            return zzg2;
        }
        if (i == 0) {
            int zzh = zzlqVar.zzh(zzd.zzk.zza);
            if (zzh != -1 && zzlqVar.zzg(zzh, this.zzk, false).zzc == zzlqVar.zzf(zzaajVar2.zza, this.zzk).zzc) {
                return zzd;
            }
            zzlqVar.zzf(zzaajVar2.zza, this.zzk);
            if (zzaajVar2.zzb()) {
                this.zzk.zzg(zzaajVar2.zzb, zzaajVar2.zzc);
                j = -9223372036854775807L;
            } else {
                j = this.zzk.zzd;
            }
            zzc = zzd.zzc(zzaajVar2, zzd.zzs, zzd.zzs, zzd.zzd, j - zzd.zzs, zzd.zzh, zzd.zzi, zzd.zzj).zzg(zzaajVar2);
            zzc.zzq = j;
        } else {
            zzafs.zzd(!zzaajVar2.zzb());
            long max = Math.max(0L, zzd.zzr - (longValue - zzb3));
            long j3 = zzd.zzq;
            if (zzd.zzk.equals(zzd.zzb)) {
                j3 = longValue + max;
            }
            zzc = zzd.zzc(zzaajVar2, longValue, longValue, longValue, max, zzd.zzh, zzd.zzi, zzd.zzj);
            zzc.zzq = j3;
        }
        return zzc;
    }

    private final Pair<Object, Long> zzy(zzlq zzlqVar, int i, long j) {
        if (zzlqVar.zzt()) {
            this.zzy = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzz = j;
            return null;
        }
        if (i == -1 || i >= zzlqVar.zzr()) {
            i = zzlqVar.zzd(false);
            long j2 = zzlqVar.zze(i, this.zza, 0L).zzm;
            j = zzhx.zza(0L);
        }
        return zzlqVar.zzv(this.zza, this.zzk, i, zzhx.zzb(j));
    }

    private final long zzz(zzlq zzlqVar, zzaaj zzaajVar, long j) {
        zzlqVar.zzf(zzaajVar.zza, this.zzk);
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    public final int zza() {
        int length = this.zzd.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    @Deprecated
    public final void zzb(zzaal zzaalVar) {
        List singletonList = Collections.singletonList(zzaalVar);
        zzt();
        zzn();
        this.zzr++;
        if (!this.zzl.isEmpty()) {
            int size = this.zzl.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzl.remove(i);
            }
            this.zzA = this.zzA.zzg(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzko zzkoVar = new zzko((zzaal) singletonList.get(i2), this.zzm);
            arrayList.add(zzkoVar);
            this.zzl.add(i2, new zzja(zzkoVar.zzb, zzkoVar.zza.zzx()));
        }
        this.zzA = this.zzA.zzf(0, arrayList.size());
        zzle zzleVar = new zzle(this.zzl, this.zzA, null);
        if (zzleVar.zzt() || zzleVar.zzr() >= 0) {
            int zzd = zzleVar.zzd(false);
            zzks zzx = zzx(this.zzx, zzleVar, zzy(zzleVar, zzd, -9223372036854775807L));
            int i3 = zzx.zze;
            if (zzd != -1 && i3 != 1) {
                i3 = (zzleVar.zzt() || zzd >= zzleVar.zzr()) ? 4 : 2;
            }
            zzks zze = zzx.zze(i3);
            this.zzh.zzq(arrayList, zzd, zzhx.zzb(-9223372036854775807L), this.zzA);
            zzv(zze, 0, 1, false, (this.zzx.zzb.zza.equals(zze.zzb.zza) || this.zzx.zza.zzt()) ? false : true, 4, zzu(zze), -1);
            zzks zzksVar = this.zzx;
            if (zzksVar.zze != 1) {
                return;
            }
            zzks zzf = zzksVar.zzf(null);
            zzks zze2 = zzf.zze(true == zzf.zza.zzt() ? 4 : 2);
            this.zzr++;
            this.zzh.zzb();
            zzv(zze2, 1, 1, false, false, 5, -9223372036854775807L, -1);
            return;
        }
        throw new zzjs(zzleVar, -1, -9223372036854775807L);
    }

    @Override // com.google.android.gms.internal.ads.zzif
    public final zzld zzc(zzlc zzlcVar) {
        return new zzld(this.zzh, zzlcVar, this.zzx.zza, zzl(), this.zzq, this.zzh.zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzd(zzky zzkyVar) {
        this.zzi.zza(zzkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zze(zzky zzkyVar) {
        this.zzi.zzb(zzkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final int zzf() {
        return this.zzx.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzg(boolean z) {
        zzks zzksVar = this.zzx;
        if (zzksVar.zzl == z && zzksVar.zzm == 0) {
            return;
        }
        this.zzr++;
        zzks zzh = zzksVar.zzh(z, 0);
        this.zzh.zzc(z, 0);
        zzv(zzh, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final boolean zzh() {
        return this.zzx.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzi(int i, long j) {
        zzlq zzlqVar = this.zzx.zza;
        if (i >= 0 && (zzlqVar.zzt() || i < zzlqVar.zzr())) {
            this.zzr++;
            if (!zzp()) {
                int i2 = this.zzx.zze != 1 ? 2 : 1;
                int zzl = zzl();
                zzks zzx = zzx(this.zzx.zze(i2), zzlqVar, zzy(zzlqVar, i, j));
                this.zzh.zzd(zzlqVar, i, zzhx.zzb(j));
                zzv(zzx, 0, 1, true, true, 1, zzu(zzx), zzl);
                return;
            }
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzji zzjiVar = new zzji(this.zzx);
            zzjiVar.zza(1);
            this.zzg.zza(zzjiVar);
            return;
        }
        throw new zzjs(zzlqVar, i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzj(boolean z) {
        zzks zzksVar = this.zzx;
        zzks zzg = zzksVar.zzg(zzksVar.zzb);
        zzg.zzq = zzg.zzs;
        zzg.zzr = 0L;
        zzks zze = zzg.zze(1);
        this.zzr++;
        this.zzh.zze();
        zzv(zze, 0, 1, false, zze.zza.zzt() && !this.zzx.zza.zzt(), 4, zzu(zze), -1);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzk() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzaht.zze;
        String zza = zzjm.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(zza).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.13.2] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.zzh.zzg()) {
            zzagl<zzky> zzaglVar = this.zzi;
            zzaglVar.zzc(11, zziu.zza);
            zzaglVar.zzd();
        }
        this.zzi.zze();
        this.zzf.zzi(null);
        zzks zze = this.zzx.zze(1);
        this.zzx = zze;
        zzks zzg = zze.zzg(zze.zzb);
        this.zzx = zzg;
        zzg.zzq = zzg.zzs;
        this.zzx.zzr = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final int zzl() {
        int zzt = zzt();
        if (zzt == -1) {
            return 0;
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final long zzm() {
        if (!zzp()) {
            zzlq zzlqVar = this.zzx.zza;
            if (zzlqVar.zzt()) {
                return -9223372036854775807L;
            }
            return zzhx.zza(zzlqVar.zze(zzl(), this.zza, 0L).zzn);
        }
        zzks zzksVar = this.zzx;
        zzaaj zzaajVar = zzksVar.zzb;
        zzksVar.zza.zzf(zzaajVar.zza, this.zzk);
        this.zzk.zzg(zzaajVar.zzb, zzaajVar.zzc);
        return zzhx.zza(-9223372036854775807L);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final long zzn() {
        return zzhx.zza(zzu(this.zzx));
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final long zzo() {
        if (!zzp()) {
            if (this.zzx.zza.zzt()) {
                return this.zzz;
            }
            zzks zzksVar = this.zzx;
            if (zzksVar.zzk.zzd != zzksVar.zzb.zzd) {
                return zzhx.zza(zzksVar.zza.zze(zzl(), this.zza, 0L).zzn);
            }
            long j = zzksVar.zzq;
            if (this.zzx.zzk.zzb()) {
                zzks zzksVar2 = this.zzx;
                zzln zzf = zzksVar2.zza.zzf(zzksVar2.zzk.zza, this.zzk);
                long zzb = zzf.zzb(this.zzx.zzk.zzb);
                j = zzb == Long.MIN_VALUE ? zzf.zzd : zzb;
            }
            zzks zzksVar3 = this.zzx;
            zzz(zzksVar3.zza, zzksVar3.zzk, j);
            return zzhx.zza(j);
        }
        zzks zzksVar4 = this.zzx;
        if (zzksVar4.zzk.equals(zzksVar4.zzb)) {
            return zzhx.zza(this.zzx.zzq);
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final boolean zzp() {
        return this.zzx.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(final zzji zzjiVar) {
        this.zzf.zzj(new Runnable(this, zzjiVar) { // from class: com.google.android.gms.internal.ads.zzit
            private final zzjb zza;
            private final zzji zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzjiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs(this.zzb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzs(zzji zzjiVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzr - zzjiVar.zzb;
        this.zzr = i;
        boolean z2 = true;
        if (zzjiVar.zzc) {
            this.zzs = zzjiVar.zzd;
            this.zzt = true;
        }
        if (zzjiVar.zze) {
            this.zzu = zzjiVar.zzf;
        }
        if (i == 0) {
            zzlq zzlqVar = zzjiVar.zza.zza;
            if (!this.zzx.zza.zzt() && zzlqVar.zzt()) {
                this.zzy = -1;
                this.zzz = 0L;
            }
            if (!zzlqVar.zzt()) {
                List<zzlq> zzq = ((zzle) zzlqVar).zzq();
                zzafs.zzd(zzq.size() == this.zzl.size());
                for (int i2 = 0; i2 < zzq.size(); i2++) {
                    this.zzl.get(i2).zzb = zzq.get(i2);
                }
            }
            if (this.zzt) {
                if (zzjiVar.zza.zzb.equals(this.zzx.zzb) && zzjiVar.zza.zzd == this.zzx.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzlqVar.zzt() || zzjiVar.zza.zzb.zzb()) {
                        j2 = zzjiVar.zza.zzd;
                    } else {
                        zzks zzksVar = zzjiVar.zza;
                        zzaaj zzaajVar = zzksVar.zzb;
                        j2 = zzksVar.zzd;
                        zzz(zzlqVar, zzaajVar, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzt = false;
            zzv(zzjiVar.zza, 1, this.zzu, false, z, this.zzs, j, -1);
        }
    }
}
