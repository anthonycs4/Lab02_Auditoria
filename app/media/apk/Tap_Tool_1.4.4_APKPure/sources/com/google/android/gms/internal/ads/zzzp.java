package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzzp implements zzaah, zzaag {
    public final zzaah zza;
    final long zzb;
    private zzaag zzc;
    private zzzo[] zzd = new zzzo[0];
    private long zze = 0;

    public zzzp(zzaah zzaahVar, boolean z, long j, long j2) {
        this.zza = zzaahVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zza(zzaag zzaagVar, long j) {
        this.zzc = zzaagVar;
        this.zza.zza(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb() throws IOException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzach zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzd(long j, boolean z) {
        this.zza.zzd(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final void zze(long j) {
        this.zza.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzf() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzf = zzf();
            return zzf != -9223372036854775807L ? zzf : j;
        }
        long zzf2 = this.zza.zzf();
        if (zzf2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        zzafs.zzd(zzf2 >= 0);
        long j2 = this.zzb;
        zzafs.zzd((j2 == Long.MIN_VALUE || zzf2 <= j2) ? true : true);
        return zzf2;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzg() {
        long zzg = this.zza.zzg();
        if (zzg != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzg < j) {
                return zzg;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzaah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzzo[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zza()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zzaah r0 = r7.zza
            long r0 = r0.zzh(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.zzb
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.android.gms.internal.ads.zzafs.zzd(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzh(long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzi(long j, zzlj zzljVar) {
        if (j != 0) {
            long zzz = zzaht.zzz(zzljVar.zzf, 0L, j);
            long j2 = zzljVar.zzg;
            long j3 = this.zzb;
            long zzz2 = zzaht.zzz(j2, 0L, j3 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j3 - j);
            if (zzz != zzljVar.zzf || zzz2 != zzljVar.zzg) {
                zzljVar = new zzlj(zzz, zzz2);
            }
            return this.zza.zzi(j, zzljVar);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzk() {
        long zzk = this.zza.zzk();
        if (zzk != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzk < j) {
                return zzk;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzl(long j) {
        return this.zza.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final /* bridge */ /* synthetic */ void zzm(zzaah zzaahVar) {
        zzaag zzaagVar = this.zzc;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzn() {
        return this.zza.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r4 > r7) goto L19;
     */
    @Override // com.google.android.gms.internal.ads.zzaah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzp(com.google.android.gms.internal.ads.zzacs[] r14, boolean[] r15, com.google.android.gms.internal.ads.zzabx[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r16
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzzo[] r3 = new com.google.android.gms.internal.ads.zzzo[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzabx[] r2 = new com.google.android.gms.internal.ads.zzabx[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzzo[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzzo r6 = (com.google.android.gms.internal.ads.zzzo) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zzabx r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzaah r4 = r0.zza
            r5 = r14
            r6 = r15
            r7 = r2
            r8 = r17
            r9 = r18
            long r4 = r4.zzp(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r6
            r6 = 1
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 == 0) goto L4e
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L4d
            long r7 = r0.zzb
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L4e
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L4d
            goto L4e
        L4d:
            r6 = 0
        L4e:
            com.google.android.gms.internal.ads.zzafs.zzd(r6)
        L51:
            int r6 = r1.length
            if (r3 >= r6) goto L77
            r6 = r2[r3]
            if (r6 != 0) goto L5d
            com.google.android.gms.internal.ads.zzzo[] r6 = r0.zzd
            r6[r3] = r11
            goto L6e
        L5d:
            com.google.android.gms.internal.ads.zzzo[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L67
            com.google.android.gms.internal.ads.zzabx r8 = r8.zza
            if (r8 == r6) goto L6e
        L67:
            com.google.android.gms.internal.ads.zzzo r8 = new com.google.android.gms.internal.ads.zzzo
            r8.<init>(r13, r6)
            r7[r3] = r8
        L6e:
            com.google.android.gms.internal.ads.zzzo[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L51
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzp(com.google.android.gms.internal.ads.zzacs[], boolean[], com.google.android.gms.internal.ads.zzabx[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void zzj(zzaah zzaahVar) {
        zzaag zzaagVar = this.zzc;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzj(this);
    }
}
