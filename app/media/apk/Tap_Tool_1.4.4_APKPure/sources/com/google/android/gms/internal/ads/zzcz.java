package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcz extends zzfym<zzcz, zzcy> implements zzfzv {
    private static final zzcz zzz;
    private int zzb;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzcz zzczVar = new zzcz();
        zzz = zzczVar;
        zzfym.zzay(zzcz.class, zzczVar);
    }

    private zzcz() {
    }

    public static zzcy zza() {
        return zzz.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzcz zzczVar, long j) {
        zzczVar.zzb |= 1;
        zzczVar.zze = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzcz zzczVar, long j) {
        zzczVar.zzb |= 2;
        zzczVar.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzcz zzczVar, long j) {
        zzczVar.zzb |= 4;
        zzczVar.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzcz zzczVar, long j) {
        zzczVar.zzb |= 8;
        zzczVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzcz zzczVar) {
        zzczVar.zzb &= -9;
        zzczVar.zzh = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzcz zzczVar, long j) {
        zzczVar.zzb |= 16;
        zzczVar.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzcz zzczVar, long j) {
        zzczVar.zzb |= 32;
        zzczVar.zzj = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzcz zzczVar, zzdm zzdmVar) {
        zzczVar.zzk = zzdmVar.zza();
        zzczVar.zzb |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzcz zzczVar, long j) {
        zzczVar.zzb |= 128;
        zzczVar.zzl = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzcz zzczVar, long j) {
        zzczVar.zzb |= 256;
        zzczVar.zzm = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzcz zzczVar, long j) {
        zzczVar.zzb |= 512;
        zzczVar.zzn = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzcz zzczVar, zzdm zzdmVar) {
        zzczVar.zzo = zzdmVar.zza();
        zzczVar.zzb |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzcz zzczVar, long j) {
        zzczVar.zzb |= 2048;
        zzczVar.zzp = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzcz zzczVar, long j) {
        zzczVar.zzb |= 4096;
        zzczVar.zzq = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzcz zzczVar, long j) {
        zzczVar.zzb |= 8192;
        zzczVar.zzr = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzcz zzczVar, long j) {
        zzczVar.zzb |= 16384;
        zzczVar.zzs = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzcz zzczVar, long j) {
        zzczVar.zzb |= 32768;
        zzczVar.zzt = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzcz zzczVar, long j) {
        zzczVar.zzb |= 65536;
        zzczVar.zzu = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzcz zzczVar, long j) {
        zzczVar.zzb |= 131072;
        zzczVar.zzv = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzcz zzczVar, long j) {
        zzczVar.zzb |= 262144;
        zzczVar.zzw = j;
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
                        return zzz;
                    }
                    return new zzcy(null);
                }
                return new zzcz();
            }
            return zzaz(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzdm.zzc(), "zzl", "zzm", "zzn", "zzo", zzdm.zzc(), "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        return (byte) 1;
    }
}
