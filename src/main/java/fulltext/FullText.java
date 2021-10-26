package fulltext;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link FullTextMapper} refers to this annotation to mapping the object to the full text.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FullText {

    /**
     * Means the total length of one line in full text.
     */
    int length();

    /**
     * Set how to encode full text. The default is UTF-8.
     */
    Charset encoding() default Charset.UTF_8;

    /**
     * Sets the padding character to be used in full text. The default is a space character(" ").
     */
    PadCharacter padChar() default PadCharacter.SPACE;

}
