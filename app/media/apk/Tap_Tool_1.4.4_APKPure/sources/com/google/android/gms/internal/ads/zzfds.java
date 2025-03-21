package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfds extends zzfdl {
    private zzffb<Integer> zza;
    private zzffb<Integer> zzb;
    private zzfdr zzc;
    private HttpURLConnection zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfds() {
        zzffb<Integer> zzffbVar = zzfdn.zza;
        zzffb<Integer> zzffbVar2 = zzfdo.zza;
        this.zza = zzffbVar;
        this.zzb = zzffbVar2;
        this.zzc = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.zzd;
        zzfdm.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final HttpURLConnection zzb(zzfdr zzfdrVar, int i, int i2) throws IOException {
        this.zza = new zzffb(265) { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzffb
            public final Object zza() {
                return 265;
            }
        };
        this.zzb = new zzffb(-1) { // from class: com.google.android.gms.internal.ads.zzfdq
            @Override // com.google.android.gms.internal.ads.zzffb
            public final Object zza() {
                return -1;
            }
        };
        this.zzc = zzfdrVar;
        zzfdm.zza(this.zza.zza().intValue(), this.zzb.zza().intValue());
        zzfdr zzfdrVar2 = this.zzc;
        Objects.requireNonNull(zzfdrVar2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfdrVar2.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }
}
