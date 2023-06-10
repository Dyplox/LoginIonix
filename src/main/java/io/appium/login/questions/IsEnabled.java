package io.appium.login.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

@Subject("the #target is enabled - ")
public class IsEnabled implements Question<Boolean> {

    private Target target;

    public IsEnabled(Target target) {
        this.target = target;
    }

    public static IsEnabled theTarget(Target target) {
        return Instrumented.instanceOf(IsEnabled.class).withProperties(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(target, WebElementStateMatchers.isEnabled()).forNoMoreThan(3).seconds());
        return target.resolveFor(actor).isCurrentlyEnabled();
    }

}
