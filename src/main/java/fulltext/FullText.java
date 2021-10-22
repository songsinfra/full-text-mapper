package fulltext;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link FullTextMapper}는 이 어노테이션을 참조하여 전문과 객체를 매핑합니다.
 * <p>
 * {@link FullTextMapper} references this annotation to map full text and objects.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FullText {

    /**
     * 전문에서 필드가 점유하는 길이를 정의합니다.
     * <p>
     * Defines the length occupied by the field in the full text.
     */
    int length() default 0;

    /**
     * 해당 필드가 오로지 패딩만을 위한 필드인지를 나타냅니다.
     * <p>
     * Indicates whether the field is for padding only.
     */
    boolean paddingOnly() default false;

}
