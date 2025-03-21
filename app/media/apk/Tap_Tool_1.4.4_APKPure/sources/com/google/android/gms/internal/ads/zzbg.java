package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbg extends ByteArrayOutputStream {
    private final zzat zza;

    public zzbg(zzat zzatVar, int i) {
        this.zza = zzatVar;
        this.buf = zzatVar.zza(Math.max(i, 256));
    }

    private final void zza(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        zzat zzatVar = this.zza;
        int i2 = this.count + i;
        byte[] zza = zzatVar.zza(i2 + i2);
        System.arraycopy(this.buf, 0, zza, 0, this.count);
        this.zza.zzb(this.buf);
        this.buf = zza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
