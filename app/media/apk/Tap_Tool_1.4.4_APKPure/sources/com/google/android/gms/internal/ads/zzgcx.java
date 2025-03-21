package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzgcx implements zzbp {
    private static final zzgdi zza = zzgdi.zzb(zzgcx.class);
    protected final String zzb;
    long zze;
    zzgdc zzg;
    private zzbq zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgcx(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgdi zzgdiVar = zza;
            String str = this.zzb;
            zzgdiVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zze(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbq zzbqVar) {
        this.zzh = zzbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzc(zzgdc zzgdcVar, ByteBuffer byteBuffer, long j, zzbm zzbmVar) throws IOException {
        this.zze = zzgdcVar.zzc();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgdcVar;
        zzgdcVar.zzd(zzgdcVar.zzc() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgdi zzgdiVar = zza;
        String str = this.zzb;
        zzgdiVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
