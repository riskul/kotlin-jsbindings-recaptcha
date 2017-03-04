package su.snx.kotlin.jsbindings.recaptcha

import org.w3c.dom.Element

external private val grecaptcha: RawReCaptcha

external private interface RawReCaptcha {
    fun render(container: Element, parameters: ReCaptchaParameters): Int
    fun reset(captchaIds: Int)
}

class ReCaptcha(container: Element, parameters: ReCaptchaParameters) {
    val captchaId : Int = grecaptcha.render(container, parameters)

    fun reset() {
        grecaptcha.reset(captchaId)
    }
}
