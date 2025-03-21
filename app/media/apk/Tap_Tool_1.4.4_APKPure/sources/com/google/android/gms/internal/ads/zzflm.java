package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzflm<V> extends zzfki<V> {
    @NullableDecl
    private zzfla<V> zza;
    @NullableDecl
    private ScheduledFuture<?> zzb;

    private zzflm(zzfla<V> zzflaVar) {
        Objects.requireNonNull(zzflaVar);
        this.zza = zzflaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzfla<V> zza(zzfla<V> zzflaVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzflm zzflmVar = new zzflm(zzflaVar);
        zzflk zzflkVar = new zzflk(zzflmVar);
        zzflmVar.zzb = scheduledExecutorService.schedule(zzflkVar, j, timeUnit);
        zzflaVar.zze(zzflkVar, zzfkg.INSTANCE);
        return zzflmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ScheduledFuture zzy(zzflm zzflmVar, ScheduledFuture scheduledFuture) {
        zzflmVar.zzb = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfjl
    public final String zzc() {
        zzfla<V> zzflaVar = this.zza;
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (zzflaVar != null) {
            String valueOf = String.valueOf(zzflaVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                    sb3.append(valueOf2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    protected final void zzd() {
        zzl(this.zza);
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
