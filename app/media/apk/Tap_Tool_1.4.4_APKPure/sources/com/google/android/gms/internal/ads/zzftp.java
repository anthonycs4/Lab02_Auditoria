package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzftp extends zzfym<zzftp, zzftm> implements zzfzv {
    private static final zzftp zzf;
    private int zzb;
    private zzfyv<zzfto> zze = zzaE();

    static {
        zzftp zzftpVar = new zzftp();
        zzf = zzftpVar;
        zzfym.zzay(zzftp.class, zzftpVar);
    }

    private zzftp() {
    }

    public static zzftp zze(byte[] bArr, zzfxy zzfxyVar) throws zzfyy {
        return (zzftp) zzfym.zzaK(zzf, bArr, zzfxyVar);
    }

    public final int zza() {
        return this.zzb;
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
                        return zzf;
                    }
                    return new zzftm(null);
                }
                return new zzftp();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", zzfto.class});
        }
        return (byte) 1;
    }

    public final List<zzfto> zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }
}
