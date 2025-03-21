package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfjp<I, O, F, T> extends zzfki<O> implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @NullableDecl
    zzfla<? extends I> zza;
    @NullableDecl
    F zzb;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzfla<? extends I> zzflaVar = this.zza;
        F f = this.zzb;
        if ((isCancelled() | (zzflaVar == null)) || (f == null)) {
            return;
        }
        this.zza = null;
        if (zzflaVar.isCancelled()) {
            zzj(zzflaVar);
            return;
        }
        try {
            try {
                Object zzb = zzb(f, zzfks.zzq(zzflaVar));
                this.zzb = null;
                zza((zzfjp<I, O, F, T>) zzb);
            } catch (Throwable th) {
                try {
                    zzi(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzi(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zzi(e2);
        } catch (ExecutionException e3) {
            zzi(e3.getCause());
        }
    }

    abstract void zza(@NullableDecl T t);

    @NullableDecl
    abstract T zzb(F f, @NullableDecl I i) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfjl
    public final String zzc() {
        String str;
        zzfla<? extends I> zzflaVar = this.zza;
        F f = this.zzb;
        String zzc2 = super.zzc();
        if (zzflaVar != null) {
            String valueOf = String.valueOf(zzflaVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (f == null) {
            if (zzc2 != null) {
                String valueOf2 = String.valueOf(str);
                return zzc2.length() != 0 ? valueOf2.concat(zzc2) : new String(valueOf2);
            }
            return null;
        }
        String valueOf3 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf3).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    protected final void zzd() {
        zzl(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjp(zzfla<? extends I> zzflaVar, F f) {
        Objects.requireNonNull(zzflaVar);
        this.zza = zzflaVar;
        Objects.requireNonNull(f);
        this.zzb = f;
    }
}
