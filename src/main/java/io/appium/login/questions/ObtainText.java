package io.appium.login.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

@Subject("the text obtained from the #target - ")
public class ObtainText implements Question<String> {

    private Target target;

    public ObtainText(Target target) {
        this.target = target;
    }

    public static ObtainText element(Target target) {
        return Instrumented.instanceOf(ObtainText.class).withProperties(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(target, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        return actor.asksFor(Text.of(target).asString());
    }
}
