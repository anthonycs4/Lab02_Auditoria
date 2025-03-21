package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadt extends zzady {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzadt(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws zzads {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzads(e);
                }
            }
            InputStream inputStream = this.zzc;
            int i3 = zzaht.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zzd;
            if (j2 != -1) {
                this.zzd = j2 - read;
            }
            zzi(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws zzads {
        try {
            Uri uri = zzaejVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzg(zzaejVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzaejVar.zzf) < zzaejVar.zzf) {
                throw new zzaeg(0);
            }
            long j = zzaejVar.zzg;
            if (j != -1) {
                this.zzd = j;
            } else {
                long available = this.zzc.available();
                this.zzd = available;
                if (available == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzh(zzaejVar);
            return this.zzd;
        } catch (IOException e) {
            throw new zzads(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws zzads {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzj();
                }
            } catch (IOException e) {
                throw new zzads(e);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzj();
            }
            throw th;
        }
    }
}
