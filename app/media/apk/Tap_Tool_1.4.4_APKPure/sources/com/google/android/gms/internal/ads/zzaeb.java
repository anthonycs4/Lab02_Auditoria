package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaeb extends zzady {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzaeb(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws zzaea {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzaea(e);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i3 = zzaht.zza;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - read;
            }
            zzi(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws zzaea {
        long j;
        try {
            Uri uri = zzaejVar.zza;
            this.zzb = uri;
            zzg(zzaejVar);
            AssetFileDescriptor openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
            this.zzc = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(valueOf);
                throw new FileNotFoundException(sb.toString());
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.zzd = fileInputStream;
            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i != 0 && zzaejVar.zzf > length) {
                throw new zzaeg(0);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(zzaejVar.zzf + startOffset) - startOffset;
            if (skip != zzaejVar.zzf) {
                throw new zzaeg(0);
            }
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.zze = -1L;
                    j = -1;
                } else {
                    j = size - channel.position();
                    this.zze = j;
                    if (j < 0) {
                        throw new zzaeg(0);
                    }
                }
            } else {
                j = length - skip;
                this.zze = j;
                if (j < 0) {
                    throw new zzaeg(0);
                }
            }
            long j2 = zzaejVar.zzg;
            if (j2 != -1) {
                if (j != -1) {
                    j2 = Math.min(j, j2);
                }
                this.zze = j2;
            }
            this.zzf = true;
            zzh(zzaejVar);
            long j3 = zzaejVar.zzg;
            return j3 != -1 ? j3 : this.zze;
        } catch (IOException e) {
            throw new zzaea(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws zzaea {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzj();
                        }
                    }
                } catch (IOException e) {
                    throw new zzaea(e);
                }
            } catch (IOException e2) {
                throw new zzaea(e2);
            }
        } catch (Throwable th) {
            this.zzd = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzj();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzaea(e3);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzj();
                }
                throw th2;
            }
        }
    }
}
