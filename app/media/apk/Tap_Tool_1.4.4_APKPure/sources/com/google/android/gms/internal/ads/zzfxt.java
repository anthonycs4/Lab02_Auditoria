package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfxt extends zzfwz {
    private static final Logger zzb = Logger.getLogger(zzfxt.class.getName());
    private static final boolean zzc = zzgbi.zza();
    zzfxu zza;

    private zzfxt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfxt(zzfxq zzfxqVar) {
    }

    public static int zzA(zzfxj zzfxjVar) {
        int zzc2 = zzfxjVar.zzc();
        return zzw(zzc2) + zzc2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzB(zzfzu zzfzuVar, zzgak zzgakVar) {
        zzfwt zzfwtVar = (zzfwt) zzfzuVar;
        int zzap = zzfwtVar.zzap();
        if (zzap == -1) {
            zzap = zzgakVar.zze(zzfwtVar);
            zzfwtVar.zzaq(zzap);
        }
        return zzw(zzap) + zzap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzE(int i, zzfzu zzfzuVar, zzgak zzgakVar) {
        int zzw = zzw(i << 3);
        int i2 = zzw + zzw;
        zzfwt zzfwtVar = (zzfwt) zzfzuVar;
        int zzap = zzfwtVar.zzap();
        if (zzap == -1) {
            zzap = zzgakVar.zze(zzfwtVar);
            zzfwtVar.zzaq(zzap);
        }
        return i2 + zzap;
    }

    public static zzfxt zzt(byte[] bArr) {
        return new zzfxr(bArr, 0, bArr.length);
    }

    public static int zzu(int i) {
        return zzw(i << 3);
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzw(i);
        }
        return 10;
    }

    public static int zzw(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzx(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzgbn.zzd(str);
        } catch (zzgbm unused) {
            length = str.getBytes(zzfyw.zza).length;
        }
        return zzw(length) + length;
    }

    public static int zzz(zzfzc zzfzcVar) {
        int zza = zzfzcVar.zza();
        return zzw(zza) + zza;
    }

    public final void zzC() {
        if (zzs() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzD(String str, zzgbm zzgbmVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgbmVar);
        byte[] bytes = str.getBytes(zzfyw.zza);
        try {
            int length = bytes.length;
            zzl(length);
            zzq(bytes, 0, length);
        } catch (zzfxs e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzfxs(e2);
        }
    }

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract void zze(int i, long j) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzg(int i, boolean z) throws IOException;

    public abstract void zzh(int i, String str) throws IOException;

    public abstract void zzi(int i, zzfxj zzfxjVar) throws IOException;

    public abstract void zzj(byte b) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(long j) throws IOException;

    public abstract void zzo(long j) throws IOException;

    public abstract void zzq(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzs();
}
