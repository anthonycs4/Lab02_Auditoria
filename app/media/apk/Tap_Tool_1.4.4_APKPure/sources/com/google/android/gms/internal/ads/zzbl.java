package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbl implements zzbm {
    private static final Logger zzb = Logger.getLogger(zzbl.class.getName());
    final ThreadLocal<ByteBuffer> zza = new zzbk(this);

    public abstract zzbp zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzbm
    public final zzbp zzb(zzgdc zzgdcVar, zzbq zzbqVar) throws IOException {
        int zza;
        long zzb2;
        long zzc = zzgdcVar.zzc();
        this.zza.get().rewind().limit(8);
        do {
            zza = zzgdcVar.zza(this.zza.get());
            if (zza == 8) {
                this.zza.get().rewind();
                long zza2 = zzbo.zza(this.zza.get());
                byte[] bArr = null;
                if (zza2 >= 8 || zza2 <= 1) {
                    byte[] bArr2 = new byte[4];
                    this.zza.get().get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (zza2 == 1) {
                            this.zza.get().limit(16);
                            zzgdcVar.zza(this.zza.get());
                            this.zza.get().position(8);
                            zzb2 = zzbo.zzd(this.zza.get()) - 16;
                        } else {
                            zzb2 = zza2 == 0 ? zzgdcVar.zzb() - zzgdcVar.zzc() : zza2 - 8;
                        }
                        if ("uuid".equals(str)) {
                            this.zza.get().limit(this.zza.get().limit() + 16);
                            zzgdcVar.zza(this.zza.get());
                            bArr = new byte[16];
                            for (int position = this.zza.get().position() - 16; position < this.zza.get().position(); position++) {
                                bArr[position - (this.zza.get().position() - 16)] = this.zza.get().get(position);
                            }
                            zzb2 -= 16;
                        }
                        long j = zzb2;
                        zzbp zza3 = zza(str, bArr, zzbqVar instanceof zzbp ? ((zzbp) zzbqVar).zzb() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        zza3.zza(zzbqVar);
                        this.zza.get().rewind();
                        zza3.zzc(zzgdcVar, this.zza.get(), j, this);
                        return zza3;
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
                Logger logger = zzb;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(zza2);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (zza >= 0);
        zzgdcVar.zzd(zzc);
        throw new EOFException();
    }
}
