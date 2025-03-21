package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfym;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfyi<MessageType extends zzfym<MessageType, BuilderType>, BuilderType extends zzfyi<MessageType, BuilderType>> extends zzfws<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfyi(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (MessageType) messagetype.zzb(4, null, null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzgac.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfws
    protected final /* bridge */ /* synthetic */ zzfws zzac(zzfwt zzfwtVar) {
        zzai((zzfym) zzfwtVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzae() {
        MessageType messagetype = (MessageType) this.zza.zzb(4, null, null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    /* renamed from: zzaf */
    public final BuilderType zzab() {
        BuilderType buildertype = (BuilderType) this.zzc.zzb(5, null, null);
        buildertype.zzai(zzak());
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    /* renamed from: zzag */
    public MessageType zzak() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzgac.zza().zzb(messagetype.getClass()).zzj(messagetype);
        this.zzb = true;
        return this.zza;
    }

    public final MessageType zzah() {
        MessageType zzak = zzak();
        if (zzak.zzat()) {
            return zzak;
        }
        throw new zzgax(zzak);
    }

    public final BuilderType zzai(MessageType messagetype) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    public final BuilderType zzaj(byte[] bArr, int i, int i2, zzfxy zzfxyVar) throws zzfyy {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        try {
            zzgac.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzfww(zzfxyVar));
            return this;
        } catch (zzfyy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzfyy.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final /* bridge */ /* synthetic */ zzfzu zzbe() {
        return this.zzc;
    }
}
