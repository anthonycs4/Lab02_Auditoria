package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaxa extends zzfym<zzaxa, zzawz> implements zzfzv {
    private static final zzaxa zzr;
    private int zzb;
    private int zze;
    private int zzg;
    private zzayk zzi;
    private zzawq zzk;
    private zzawv zzl;
    private zzaxo zzm;
    private zzavs zzn;
    private zzaxy zzo;
    private zzazh zzp;
    private zzawd zzq;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzh = 1000;
    private zzfyu zzj = zzaD();

    static {
        zzaxa zzaxaVar = new zzaxa();
        zzr = zzaxaVar;
        zzfym.zzay(zzaxa.class, zzaxaVar);
    }

    private zzaxa() {
    }

    public static zzawz zze() {
        return zzr.zzas();
    }

    public static /* synthetic */ void zzg(zzaxa zzaxaVar, String str) {
        str.getClass();
        zzaxaVar.zzb |= 2;
        zzaxaVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzaxa zzaxaVar, Iterable iterable) {
        zzfyu zzfyuVar = zzaxaVar.zzj;
        if (!zzfyuVar.zza()) {
            int size = zzfyuVar.size();
            zzaxaVar.zzj = zzfyuVar.zzc(size == 0 ? 10 : size + size);
        }
        zzfwt.zzar(iterable, zzaxaVar.zzj);
    }

    public static /* synthetic */ void zzj(zzaxa zzaxaVar, zzawq zzawqVar) {
        zzawqVar.getClass();
        zzaxaVar.zzk = zzawqVar;
        zzaxaVar.zzb |= 32;
    }

    public static /* synthetic */ void zzk(zzaxa zzaxaVar, zzavs zzavsVar) {
        zzavsVar.getClass();
        zzaxaVar.zzn = zzavsVar;
        zzaxaVar.zzb |= 256;
    }

    public static /* synthetic */ void zzl(zzaxa zzaxaVar, zzaxy zzaxyVar) {
        zzaxyVar.getClass();
        zzaxaVar.zzo = zzaxyVar;
        zzaxaVar.zzb |= 512;
    }

    public static /* synthetic */ void zzm(zzaxa zzaxaVar, zzazh zzazhVar) {
        zzazhVar.getClass();
        zzaxaVar.zzp = zzazhVar;
        zzaxaVar.zzb |= 1024;
    }

    public static /* synthetic */ void zzn(zzaxa zzaxaVar, zzawd zzawdVar) {
        zzawdVar.getClass();
        zzaxaVar.zzq = zzawdVar;
        zzaxaVar.zzb |= 2048;
    }

    public final String zza() {
        return this.zzf;
    }

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
                    return new zzawz(null);
                }
                return new zzaxa();
            }
            return zzaz(zzr, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzawy.zzc(), "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final zzawq zzc() {
        zzawq zzawqVar = this.zzk;
        return zzawqVar == null ? zzawq.zza() : zzawqVar;
    }

    public final zzavs zzd() {
        zzavs zzavsVar = this.zzn;
        return zzavsVar == null ? zzavs.zzc() : zzavsVar;
    }
}
