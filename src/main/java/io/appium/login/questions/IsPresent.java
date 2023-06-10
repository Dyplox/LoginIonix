package io.appium.login.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

@Subject("the text obtained from the #target - ")
public class IsPresent implements Question<String> {
    private Target target;

    public IsPresent(Target target) {
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(target, isVisible()).forNoMoreThan(3).seconds());
        return actor.asksFor(Text.of(target).asString());
    }

    public static IsPresent theTarget(Target target) {
        return Instrumented.instanceOf(IsPresent.class).withProperties(target);
    }
}