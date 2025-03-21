package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.LongCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaih implements Handler.Callback, zzwv {
    final /* synthetic */ zzaii zza;
    private final Handler zzb;

    public zzaih(zzaii zzaiiVar, zzxr zzxrVar, byte[] bArr) {
        this.zza = zzaiiVar;
        Handler zzh = zzaht.zzh(this);
        this.zzb = zzh;
        zzxrVar.zzn(this, zzh);
    }

    private final void zzb(long j) {
        zzaii zzaiiVar = this.zza;
        if (this != zzaiiVar.zzb) {
            return;
        }
        if (j != LongCompanionObject.MAX_VALUE) {
            try {
                zzaiiVar.zzY(j);
                return;
            } catch (zzid e) {
                this.zza.zzaj(e);
                return;
            }
        }
        zzaiiVar.zzav();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        zzb(zzaht.zzK(message.arg1, message.arg2));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zza(zzxr zzxrVar, long j, long j2) {
        if (zzaht.zza < 30) {
            this.zzb.sendMessageAtFrontOfQueue(Message.obtain(this.zzb, 0, (int) (j >> 32), (int) j));
            return;
        }
        zzb(j);
    }
}
