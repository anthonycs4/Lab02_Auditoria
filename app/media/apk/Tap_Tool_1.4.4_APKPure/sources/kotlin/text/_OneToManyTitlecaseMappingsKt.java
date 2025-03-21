package kotlin.text;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: _OneToManyTitlecaseMappings.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class _OneToManyTitlecaseMappingsKt {
    public static final String titlecaseImpl(char c) {
        String valueOf = String.valueOf(c);
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            return String.valueOf(charAt) + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
