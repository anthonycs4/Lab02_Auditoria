package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzfeu extends zzfex {
    final /* synthetic */ zzfev zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfeu(zzfev zzfevVar, zzfey zzfeyVar, CharSequence charSequence) {
        super(zzfeyVar, charSequence);
        this.zza = zzfevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfex
    final int zzc(int i) {
        zzfef zzfefVar = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfes.zzf(i, length, "index");
        while (i < length) {
            if (zzfefVar.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfex
    final int zzd(int i) {
        return i + 1;
    }
}
