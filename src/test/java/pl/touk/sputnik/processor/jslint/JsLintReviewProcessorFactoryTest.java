package pl.touk.sputnik.processor.jslint;

import org.junit.jupiter.api.Test;
import pl.touk.sputnik.configuration.Configuration;
import pl.touk.sputnik.configuration.GeneralOption;
import pl.touk.sputnik.processor.ReviewProcessorFactory;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static pl.touk.sputnik.SputnikAssertions.assertThat;

class JsLintReviewProcessorFactoryTest {

    @Test
    void testIsEnabled() {
        Configuration configuration = mock(Configuration.class);
        when(configuration.getProperty(eq(GeneralOption.JSLINT_ENABLED))).thenReturn("true");

        ReviewProcessorFactory factory = new JsLintReviewProcessorFactory();
        assertThat(factory.isEnabled(configuration)).isTrue();
    }

    @Test
    void testCreate() {
        Configuration configuration = mock(Configuration.class);
        when(configuration.getProperty(eq(GeneralOption.JSLINT_ENABLED))).thenReturn("true");

        ReviewProcessorFactory factory = new JsLintReviewProcessorFactory();
        assertThat(factory.create(configuration)).isNotNull();
    }
}