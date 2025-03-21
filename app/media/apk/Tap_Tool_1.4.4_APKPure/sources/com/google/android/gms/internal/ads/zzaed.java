package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaed extends zzady {
    private zzaej zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzaed() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(zzaht.zzd(this.zzb), this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzi(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws IOException {
        zzg(zzaejVar);
        this.zza = zzaejVar;
        Uri uri = zzaejVar.zza;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new zzkr(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        }
        String[] zzs = zzaht.zzs(uri.getSchemeSpecificPart(), ",");
        if (zzs.length != 2) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(valueOf2);
            throw new zzkr(sb.toString());
        }
        String str = zzs[1];
        if (zzs[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String valueOf3 = String.valueOf(str);
                throw new zzkr(valueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.zzb = zzaht.zzr(URLDecoder.decode(str, zzfeg.zza.name()));
        }
        long j = zzaejVar.zzf;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzaeg(0);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzaejVar.zzg;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzh(zzaejVar);
        long j3 = zzaejVar.zzg;
        return j3 != -1 ? j3 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        zzaej zzaejVar = this.zza;
        if (zzaejVar != null) {
            return zzaejVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() {
        if (this.zzb != null) {
            this.zzb = null;
            zzj();
        }
        this.zza = null;
    }
}
