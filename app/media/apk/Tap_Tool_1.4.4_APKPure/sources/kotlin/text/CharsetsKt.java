package kotlin.text;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Charsets.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"charset", "Ljava/nio/charset/Charset;", "charsetName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CharsetsKt {
    private static final Charset charset(String str) {
        Charset forName = Charset.forName(str);
        Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
        return forName;
    }
}
