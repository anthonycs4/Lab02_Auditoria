package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaev extends zzady {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzaev() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws zzaeu {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzaht.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.zzc -= read;
                zzi(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzaeu(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws zzaeu {
        try {
            Uri uri = zzaejVar.zza;
            this.zzb = uri;
            zzg(zzaejVar);
            try {
                String path = uri.getPath();
                Objects.requireNonNull(path);
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.zza = randomAccessFile;
                randomAccessFile.seek(zzaejVar.zzf);
                long j = zzaejVar.zzg;
                if (j == -1) {
                    j = this.zza.length() - zzaejVar.zzf;
                }
                this.zzc = j;
                if (j >= 0) {
                    this.zzd = true;
                    zzh(zzaejVar);
                    return this.zzc;
                }
                throw new zzaeg(0);
            } catch (FileNotFoundException e) {
                if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                    throw new zzaeu(e);
                }
                throw new zzaeu(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
            }
        } catch (IOException e2) {
            throw new zzaeu(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws zzaeu {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzj();
                }
            } catch (IOException e) {
                throw new zzaeu(e);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzj();
            }
            throw th;
        }
    }
}
