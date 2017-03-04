package su.snx.kotlin.jsbindings.recaptcha

import org.w3c.dom.Element

external val grecaptcha: ReCaptcha

external interface ReCaptcha {
    fun render(container: Element, parameters: ReCaptchaParameters): Element
    fun reset(renderedCaptcha: Element)
}