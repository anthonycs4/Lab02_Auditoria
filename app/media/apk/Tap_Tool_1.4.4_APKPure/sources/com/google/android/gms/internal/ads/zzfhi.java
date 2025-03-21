package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfhi<E> extends zzfgs<E> {
    @NullableDecl
    Object[] zzd;
    private int zze;

    public zzfhi() {
        super(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfgs, com.google.android.gms.internal.ads.zzfgt
    public final /* bridge */ /* synthetic */ zzfgt zzc(Object obj) {
        zze((zzfhi<E>) obj);
        return this;
    }

    public final zzfhi<E> zzf(Iterable<? extends E> iterable) {
        if (this.zzd != null) {
            for (E e : iterable) {
                zze((zzfhi<E>) e);
            }
        } else {
            super.zzb(iterable);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhi(int i) {
        super(i);
        this.zzd = new Object[zzfhj.zzj(i)];
    }

    public final zzfhj<E> zzg() {
        zzfhj<E> zzp;
        boolean zzq;
        int i = this.zzb;
        if (i != 0) {
            if (i == 1) {
                return new zzfix(this.zza[0]);
            }
            if (this.zzd == null || zzfhj.zzj(i) != this.zzd.length) {
                zzp = zzfhj.zzp(this.zzb, this.zza);
                this.zzb = zzp.size();
            } else {
                zzq = zzfhj.zzq(this.zzb, this.zza.length);
                Object[] copyOf = zzq ? Arrays.copyOf(this.zza, this.zzb) : this.zza;
                int i2 = this.zze;
                Object[] objArr = this.zzd;
                zzp = new zzfis<>(copyOf, i2, objArr, objArr.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzp;
        }
        return zzfis.zza;
    }

    public final zzfhi<E> zze(E e) {
        Objects.requireNonNull(e);
        if (this.zzd != null) {
            int zzj = zzfhj.zzj(this.zzb);
            int length = this.zzd.length;
            if (zzj <= length) {
                int i = length - 1;
                int hashCode = e.hashCode();
                int zza = zzfgr.zza(hashCode);
                while (true) {
                    int i2 = zza & i;
                    Object[] objArr = this.zzd;
                    Object obj = objArr[i2];
                    if (obj != null) {
                        if (obj.equals(e)) {
                            break;
                        }
                        zza = i2 + 1;
                    } else {
                        objArr[i2] = e;
                        this.zze += hashCode;
                        super.zza(e);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(e);
        return this;
    }
}
