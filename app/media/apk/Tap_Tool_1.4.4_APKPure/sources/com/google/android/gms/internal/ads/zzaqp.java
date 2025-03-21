package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzaqq;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaqp<T extends zzaqq> extends Handler implements Runnable {
    public final int zza;
    final /* synthetic */ zzaqs zzb;
    private final T zzc;
    private final zzaqo<T> zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaqp(zzaqs zzaqsVar, Looper looper, T t, zzaqo<T> zzaqoVar, int i, long j) {
        super(looper);
        this.zzb = zzaqsVar;
        this.zzc = t;
        this.zzd = zzaqoVar;
        this.zza = i;
        this.zze = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzaqp zzaqpVar;
        this.zzf = null;
        executorService = this.zzb.zza;
        zzaqpVar = this.zzb.zzb;
        executorService.execute(zzaqpVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
        } else if (message.what != 4) {
            this.zzb.zzb = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.zze;
            if (this.zzc.zzc()) {
                this.zzd.zzr(this.zzc, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.zzd.zzr(this.zzc, elapsedRealtime, j, false);
            } else if (i == 2) {
                this.zzd.zzs(this.zzc, elapsedRealtime, j);
            } else if (i != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzf = iOException;
                int zzq = this.zzd.zzq(this.zzc, elapsedRealtime, j, iOException);
                if (zzq == 3) {
                    this.zzb.zzc = this.zzf;
                } else if (zzq != 2) {
                    int i2 = zzq != 1 ? 1 + this.zzg : 1;
                    this.zzg = i2;
                    zzb(Math.min((i2 - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zzc()) {
                String valueOf = String.valueOf(this.zzc.getClass().getSimpleName());
                zzarh.zza(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.zzc.zzd();
                    zzarh.zzb();
                } catch (Throwable th) {
                    zzarh.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaqr(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaqr(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzi) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzaqu.zzd(this.zzc.zzc());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzaqp zzaqpVar;
        zzaqpVar = this.zzb.zzb;
        zzaqu.zzd(zzaqpVar == null);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzr(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }
}
