package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaxt extends zzfym<zzaxt, zzaxs> implements zzfzv {
    private static final zzfys<Integer, zzawg> zzj = new zzaxr();
    private static final zzaxt zzr;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzfyr zzi = zzaB();
    private zzaxo zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;

    static {
        zzaxt zzaxtVar = new zzaxt();
        zzr = zzaxtVar;
        zzfym.zzay(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzaxt zzaxtVar, zzawy zzawyVar) {
        zzaxtVar.zzp = zzawyVar.zza();
        zzaxtVar.zzb |= 512;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzB(zzaxt zzaxtVar, zzaxx zzaxxVar) {
        zzaxtVar.zzq = zzaxxVar.zza();
        zzaxtVar.zzb |= 1024;
    }

    public static zzaxt zzn(byte[] bArr) throws zzfyy {
        return (zzaxt) zzfym.zzaJ(zzr, bArr);
    }

    public static zzaxs zzo() {
        return zzr.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzaxt zzaxtVar, long j) {
        zzaxtVar.zzb |= 1;
        zzaxtVar.zze = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzaxt zzaxtVar, zzawy zzawyVar) {
        zzaxtVar.zzf = zzawyVar.zza();
        zzaxtVar.zzb |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzaxt zzaxtVar, long j) {
        zzaxtVar.zzb |= 4;
        zzaxtVar.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzaxt zzaxtVar, long j) {
        zzaxtVar.zzb |= 8;
        zzaxtVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzaxt zzaxtVar, Iterable iterable) {
        zzfyr zzfyrVar = zzaxtVar.zzi;
        if (!zzfyrVar.zza()) {
            zzaxtVar.zzi = zzfym.zzaC(zzfyrVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzaxtVar.zzi.zzh(((zzawg) it.next()).zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzaxt zzaxtVar, zzaxo zzaxoVar) {
        zzaxoVar.getClass();
        zzaxtVar.zzk = zzaxoVar;
        zzaxtVar.zzb |= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzaxt zzaxtVar, zzawy zzawyVar) {
        zzaxtVar.zzl = zzawyVar.zza();
        zzaxtVar.zzb |= 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzx(zzaxt zzaxtVar, zzawy zzawyVar) {
        zzaxtVar.zzm = zzawyVar.zza();
        zzaxtVar.zzb |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzaxt zzaxtVar, zzawy zzawyVar) {
        zzaxtVar.zzn = zzawyVar.zza();
        zzaxtVar.zzb |= 128;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzaxt zzaxtVar, int i) {
        zzaxtVar.zzb |= 256;
        zzaxtVar.zzo = i;
    }

    public final long zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzr;
                    }
                    return new zzaxs(null);
                }
                return new zzaxt();
            }
            return zzaz(zzr, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzb", "zze", "zzf", zzawy.zzc(), "zzg", "zzh", "zzi", zzawg.zzc(), "zzk", "zzl", zzawy.zzc(), "zzm", zzawy.zzc(), "zzn", zzawy.zzc(), "zzo", "zzp", zzawy.zzc(), "zzq", zzaxx.zzc()});
        }
        return (byte) 1;
    }

    public final zzawy zzc() {
        zzawy zzb = zzawy.zzb(this.zzf);
        return zzb == null ? zzawy.ENUM_FALSE : zzb;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final long zze() {
        return this.zzh;
    }

    public final List<zzawg> zzf() {
        return new zzfyt(this.zzi, zzj);
    }

    public final zzaxo zzg() {
        zzaxo zzaxoVar = this.zzk;
        return zzaxoVar == null ? zzaxo.zzg() : zzaxoVar;
    }

    public final zzawy zzh() {
        zzawy zzb = zzawy.zzb(this.zzl);
        return zzb == null ? zzawy.ENUM_FALSE : zzb;
    }

    public final zzawy zzi() {
        zzawy zzb = zzawy.zzb(this.zzm);
        return zzb == null ? zzawy.ENUM_FALSE : zzb;
    }

    public final zzawy zzj() {
        zzawy zzb = zzawy.zzb(this.zzn);
        return zzb == null ? zzawy.ENUM_FALSE : zzb;
    }

    public final int zzk() {
        return this.zzo;
    }

    public final zzawy zzl() {
        zzawy zzb = zzawy.zzb(this.zzp);
        return zzb == null ? zzawy.ENUM_FALSE : zzb;
    }

    public final zzaxx zzm() {
        zzaxx zzb = zzaxx.zzb(this.zzq);
        return zzb == null ? zzaxx.UNSPECIFIED : zzb;
    }
}
