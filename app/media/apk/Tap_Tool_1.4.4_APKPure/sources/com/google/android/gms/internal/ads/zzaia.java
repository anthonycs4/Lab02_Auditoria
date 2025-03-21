package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaia extends HandlerThread implements Handler.Callback {
    private zzaga zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaib zze;

    public zzaia() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzaga zzagaVar = this.zza;
                    Objects.requireNonNull(zzagaVar);
                    zzagaVar.zzb();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                zzaga zzagaVar2 = this.zza;
                Objects.requireNonNull(zzagaVar2);
                zzagaVar2.zza(i2);
                this.zze = new zzaib(this, this.zza.zzc(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                zzagm.zzb("DummySurface", "Failed to initialize dummy surface", e);
                this.zzc = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                zzagm.zzb("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzd = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzaib zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzaga(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzaib zzaibVar = this.zze;
                Objects.requireNonNull(zzaibVar);
                return zzaibVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
