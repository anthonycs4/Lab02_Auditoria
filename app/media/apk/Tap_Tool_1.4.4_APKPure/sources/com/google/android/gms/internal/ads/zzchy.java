package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzchy implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;
    final /* synthetic */ EditText zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchy(JsPromptResult jsPromptResult, EditText editText) {
        this.zza = jsPromptResult;
        this.zzb = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.confirm(this.zzb.getText().toString());
    }
}
