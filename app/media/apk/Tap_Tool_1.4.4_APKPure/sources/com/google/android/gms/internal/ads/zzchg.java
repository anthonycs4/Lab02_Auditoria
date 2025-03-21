package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzchg extends zzady {
    private final Context zza;
    private final zzaef zzb;
    private final zzchf zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzaus zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private zzfla<Long> zzp;
    private final AtomicLong zzq;

    public zzchg(Context context, zzaef zzaefVar, String str, int i, zzafp zzafpVar, zzchf zzchfVar) {
        super(false);
        this.zza = context;
        this.zzb = zzaefVar;
        this.zzc = zzchfVar;
        this.zzd = str;
        this.zze = i;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue();
        zzb(zzafpVar);
    }

    private final boolean zzr() {
        if (this.zzf) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzcC)).booleanValue() || this.zzm) {
                return ((Boolean) zzbba.zzc().zzb(zzbfq.zzcD)).booleanValue() && !this.zzn;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza;
        if (this.zzh) {
            InputStream inputStream = this.zzg;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i, i2);
            } else {
                zza = this.zzb.zza(bArr, i, i2);
            }
            if (!this.zzf || this.zzg != null) {
                zzi(zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzaef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzc(com.google.android.gms.internal.ads.zzaej r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchg.zzc(com.google.android.gms.internal.ads.zzaej):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws IOException {
        if (this.zzh) {
            boolean z = false;
            this.zzh = false;
            this.zzi = null;
            z = (this.zzf && this.zzg == null) ? true : true;
            InputStream inputStream = this.zzg;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzg = null;
            } else {
                this.zzb.zzf();
            }
            if (z) {
                zzj();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj == null) {
            return -1L;
        }
        if (this.zzq.get() != -1) {
            return this.zzq.get();
        }
        synchronized (this) {
            if (this.zzp == null) {
                this.zzp = zzccz.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzche
                    private final zzchg zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzq();
                    }
                });
            }
        }
        if (this.zzp.isDone()) {
            try {
                this.zzq.compareAndSet(-1L, this.zzp.get().longValue());
                return this.zzq.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Long zzq() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzs.zzi().zzd(this.zzj));
    }
}
